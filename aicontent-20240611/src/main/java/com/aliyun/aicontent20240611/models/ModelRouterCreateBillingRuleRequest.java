// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateBillingRuleRequest extends TeaModel {
    /**
     * <p>The billing type: configurable.</p>
     * 
     * <strong>example:</strong>
     * <p>configurable</p>
     */
    @NameInMap("billingType")
    public String billingType;

    /**
     * <p>The effective period in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("effectiveTime")
    public String effectiveTime;

    /**
     * <p>The expiration time in RFC 3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01T00:00:00Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>The model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <p>The pricingConfig field is a JSON object whose internal field structure varies depending on the billing type.</p>
     * <ol>
     * <li><p>Token tiered billing
     * Applicable to Chat models. Pricing is tiered based on the number of input tokens, supporting three pricing dimensions: standard mode, thinking mode, and cache hit. JSON format:
     * json
     * {
     *   &quot;tiers&quot;: [
     *  {
     *    &quot;min_tokens&quot;: 0,
     *    &quot;max_tokens&quot;: 32000,
     *    &quot;input_price&quot;: 2.5,
     *    &quot;output_price&quot;: 10,
     *    &quot;thinking_input_price&quot;: 2.5,
     *    &quot;thinking_output_price&quot;: 10,
     *    &quot;cached_input_price&quot;: 2.5
     *  },
     *  {
     *    &quot;min_tokens&quot;: 32000,
     *    &quot;max_tokens&quot;: 128000,
     *    &quot;input_price&quot;: 4,
     *    &quot;output_price&quot;: 16,
     *    &quot;thinking_input_price&quot;: 4,
     *    &quot;thinking_output_price&quot;: 16,
     *    &quot;cached_input_price&quot;: 4
     *  }
     *   ]
     * }
     * Field description:
     * Field	Type	Required	Description	Unit
     * tiers	array	Yes	Tiered pricing array. At least one element is required.	-
     * tiers[].min_tokens	integer	Yes	Lower bound (inclusive) of the token count for the current tier.	Token
     * tiers[].max_tokens	integer	Yes	Upper bound (exclusive) of the token count for the current tier. A value of 0 indicates no limit.	Token
     * tiers[].input_price	number	Yes	Unit price for input tokens in standard mode.	CNY / million tokens
     * tiers[].output_price	number	Yes	Unit price for output tokens in standard mode.	CNY / million tokens
     * tiers[].thinking_input_price	number	No	Unit price for input tokens in thinking mode.	CNY / million tokens
     * tiers[].thinking_output_price	number	No	Unit price for output tokens in thinking mode.	CNY / million tokens
     * tiers[].cached_input_price	number	No	Unit price for input tokens on cache hit.	CNY / million tokens
     * Constraints:
     * The min_tokens of the first tier must be 0.
     * For all tiers except the last, max_tokens must be greater than min_tokens.
     * Adjacent tiers must be contiguous (the max_tokens of the preceding tier must equal the min_tokens of the following tier). Overlaps or gaps are not allowed.</p>
     * </li>
     * <li><p>Per-image billing
     * Applicable to ImageGeneration and ImageEdit models. Pricing is based on the number of images generated or processed. JSON format:
     * json
     * {
     *   &quot;price_per_image&quot;: 0.2
     * }
     * Field description:
     * Field	Type	Required	Description	Unit
     * price_per_image	number	Yes	Unit price per image.	CNY / image</p>
     * </li>
     * <li><p>Video matrix billing
     * Applicable to VideoGeneration and VideoImageGeneration models. Pricing is based on a combination of video resolution and whether audio is included.
     * Note: The matrix field is used for frontend interactions, but the tiers field must be used when calling the API to save data (the matrix field is automatically converted on the server side). The following shows the standard API format.
     * JSON format:
     * json
     * {
     *   &quot;tiers&quot;: [
     *  {
     *    &quot;resolution&quot;: 480,
     *    &quot;has_audio&quot;: 0,
     *    &quot;price_per_second&quot;: 0.24
     *  },
     *  {
     *    &quot;resolution&quot;: 480,
     *    &quot;has_audio&quot;: 1,
     *    &quot;price_per_second&quot;: 0.24
     *  },
     *  {
     *    &quot;resolution&quot;: 720,
     *    &quot;has_audio&quot;: 0,
     *    &quot;price_per_second&quot;: 0.24
     *  },
     *  {
     *    &quot;resolution&quot;: 720,
     *    &quot;has_audio&quot;: 1,
     *    &quot;price_per_second&quot;: 0.24
     *  }
     *   ],
     *   &quot;default_price_per_second&quot;: 0.24
     * }
     * Field description:
     * Field	Type	Required	Description	Unit
     * tiers	array	Yes	Video matrix pricing array.	-
     * tiers[].resolution	integer	Yes	Video resolution. Valid values: 480, 720, and 1080.	Pixel height (p)
     * tiers[].has_audio	integer	Yes	Specifies whether audio is included. Valid values: 0 (no audio) and 1 (with audio).	-
     * tiers[].price_per_second	number	Yes	Unit price per second for this combination.	CNY / second
     * default_price_per_second	number	No	Default unit price per second when no matrix entry is matched.	CNY / second
     * Constraints:
     * Only 480p, 720p, and 1080p resolutions are supported.
     * The combination of resolution and has_audio must be unique.</p>
     * </li>
     * <li><p>Per-duration billing
     * Applicable to ASR (speech recognition) models. Pricing is based on audio duration. JSON format:
     * json
     * {
     *   &quot;price_per_unit&quot;: 0.00022
     * }
     * Field description:
     * Field	Type	Required	Description	Unit
     * price_per_unit	number	Yes	Unit price per second of audio.	CNY / second</p>
     * </li>
     * <li><p>Per-character billing
     * Applicable to TTS (speech synthesis) models. Pricing is based on the number of characters in the synthesized text. JSON format:
     * json
     * {
     *   &quot;price_per_unit&quot;: 0.8
     * }
     * Field description:
     * Field	Type	Required	Description	Unit
     * price_per_unit	number	Yes	Unit price per 10,000 characters.	CNY / 10,000 characters</p>
     * </li>
     * <li><p>Token flat-rate billing
     * Applicable to Embedding, Rerank, MultimodalEmbedding, and MultimodalRerank models. A uniform unit price is applied without tiers. JSON format:
     * json
     * {
     *   &quot;input_price&quot;: 0.5,
     *   &quot;multimodal_input_price&quot;: 0.5
     * }
     * Field description:
     * Field	Type	Required	Description	Unit
     * input_price	number	Yes	Unit price for text-only input tokens.	CNY / million tokens
     * multimodal_input_price	number	No	Unit price for multimodal input tokens.	CNY / million tokens</p>
     * </li>
     * <li><p>Omni-modal multi-dimension billing
     * Applicable to ChatFullmodal omni-modal models (such as qwen3.5-omni-plus). Input and output of different modalities including text, audio, image, and video are priced separately. JSON format:
     * json
     * {
     *   &quot;text_input_price&quot;: 7,
     *   &quot;audio_input_price&quot;: 53,
     *   &quot;image_input_price&quot;: 7,
     *   &quot;video_input_price&quot;: 7,
     *   &quot;text_output_price&quot;: 40,
     *   &quot;audio_output_price&quot;: 213,
     *   &quot;multi_text_output_price&quot;: 0
     * }
     * Field description:
     * Field	Type	Required	Description	Unit
     * text_input_price	number	Yes	Unit price for text input tokens.	CNY / million tokens
     * audio_input_price	number	Yes	Unit price for audio input tokens.	CNY / million tokens
     * image_input_price	number	No	Unit price for image input tokens.	CNY / million tokens
     * video_input_price	number	No	Unit price for video input tokens.	CNY / million tokens
     * text_output_price	number	Yes	Unit price for text output tokens.	CNY / million tokens
     * audio_output_price	number	No	Unit price for audio output tokens.	CNY / million tokens
     * multi_text_output_price	number	No	Unit price for text output tokens after multimodal input (separate pricing for text output when the input contains images, audio, or video).	CNY / million tokens</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>{
     *                 &quot;tiers&quot;:[
     *                     {
     *                         &quot;input_price&quot;:2.5,
     *                         &quot;cached_input_price&quot;:2.5,
     *                         &quot;max_tokens&quot;:32000,
     *                         &quot;output_price&quot;:10,
     *                         &quot;thinking_output_price&quot;:10,
     *                         &quot;thinking_input_price&quot;:2.5,
     *                         &quot;min_tokens&quot;:0
     *                     },
     *                     {
     *                         &quot;input_price&quot;:4,
     *                         &quot;cached_input_price&quot;:4,
     *                         &quot;max_tokens&quot;:128000,
     *                         &quot;output_price&quot;:16,
     *                         &quot;thinking_output_price&quot;:16,
     *                         &quot;thinking_input_price&quot;:4,
     *                         &quot;min_tokens&quot;:32000
     *                     },
     *                     {
     *                         &quot;input_price&quot;:7,
     *                         &quot;cached_input_price&quot;:7,
     *                         &quot;max_tokens&quot;:252000,
     *                         &quot;output_price&quot;:28,
     *                         &quot;thinking_output_price&quot;:28,
     *                         &quot;thinking_input_price&quot;:7,
     *                         &quot;min_tokens&quot;:128000
     *                     }
     *                 ]
     *             }</p>
     */
    @NameInMap("pricingConfig")
    public Object pricingConfig;

    /**
     * <p>The billing rule version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Integer version;

    public static ModelRouterCreateBillingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateBillingRuleRequest self = new ModelRouterCreateBillingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateBillingRuleRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public ModelRouterCreateBillingRuleRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModelRouterCreateBillingRuleRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ModelRouterCreateBillingRuleRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public ModelRouterCreateBillingRuleRequest setPricingConfig(Object pricingConfig) {
        this.pricingConfig = pricingConfig;
        return this;
    }
    public Object getPricingConfig() {
        return this.pricingConfig;
    }

    public ModelRouterCreateBillingRuleRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
