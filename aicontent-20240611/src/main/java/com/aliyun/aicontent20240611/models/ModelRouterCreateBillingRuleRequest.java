// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateBillingRuleRequest extends TeaModel {
    /**
     * <p>The billing type. Valid values: token_tiered, per_image, per_duration, per_character, video_matrix, token_flat, and omni_multimodal.</p>
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
     * <p>The pricingConfig is a JSON object whose internal field structure varies depending on the billing type.</p>
     * <ol>
     * <li>Token tiered billing</li>
     * </ol>
     * <p>Applicable to Chat models. Pricing is tiered based on the number of input tokens, supporting three price dimensions: standard mode, thinking mode, and cache hit. JSON format:</p>
     * <p>json
     * {
     *   &quot;tiers&quot;: [
     *     {
     *       &quot;min_tokens&quot;: 0,
     *       &quot;max_tokens&quot;: 32000,
     *       &quot;input_price&quot;: 2.5,
     *       &quot;output_price&quot;: 10,
     *       &quot;thinking_input_price&quot;: 2.5,
     *       &quot;thinking_output_price&quot;: 10,
     *       &quot;cached_input_price&quot;: 2.5
     *     },
     *     {
     *       &quot;min_tokens&quot;: 32000,
     *       &quot;max_tokens&quot;: 128000,
     *       &quot;input_price&quot;: 4,
     *       &quot;output_price&quot;: 16,
     *       &quot;thinking_input_price&quot;: 4,
     *       &quot;thinking_output_price&quot;: 16,
     *       &quot;cached_input_price&quot;: 4
     *     }
     *   ]
     * }</p>
     * <p>Field description:</p>
     * <p>Field	Type	Required	Description	Unit
     * tiers	array	Yes	Tiered pricing array with at least one element	-
     * tiers[].min_tokens	integer	Yes	Lower bound (inclusive) of the token count for the current tier	Token
     * tiers[].max_tokens	integer	Yes	Upper bound (exclusive) of the token count for the current tier. 0 indicates no limit.	Token
     * tiers[].input_price	number	Yes	Unit price for input tokens in standard mode	CNY / million tokens
     * tiers[].output_price	number	Yes	Unit price for output tokens in standard mode	CNY / million tokens
     * tiers[].thinking_input_price	number	No	Unit price for input tokens in thinking mode	CNY / million tokens
     * tiers[].thinking_output_price	number	No	Unit price for output tokens in thinking mode	CNY / million tokens
     * tiers[].cached_input_price	number	No	Unit price for input tokens on cache hit	CNY / million tokens</p>
     * <p>Constraints:</p>
     * <ul>
     * <li>The min_tokens of the first tier must be 0.</li>
     * <li>The max_tokens of non-last tiers must be greater than min_tokens.</li>
     * <li>Adjacent tiers must be contiguous (the max_tokens of the previous tier equals the min_tokens of the next tier). Overlaps or gaps are not allowed.</li>
     * </ul>
     * <ol start="2">
     * <li>Per-image billing</li>
     * </ol>
     * <p>Applicable to ImageGeneration and ImageEdit models. Pricing is based on the number of images generated or processed. JSON format:</p>
     * <p>json
     * {
     *   &quot;price_per_image&quot;: 0.2
     * }</p>
     * <p>Field description:</p>
     * <p>Field	Type	Required	Description	Unit
     * price_per_image	number	Yes	Unit price per image	CNY / image</p>
     * <ol start="3">
     * <li>Video matrix billing</li>
     * </ol>
     * <p>Applicable to VideoGeneration and VideoImageGeneration models. Pricing is based on a combination of video resolution and whether audio is included.</p>
     * <p>Note: The matrix field is used for frontend interaction, but the tiers field must be used when calling the API to save data (matrix is automatically converted on the server side). The following is the standard API format.</p>
     * <p>JSON format:</p>
     * <p>json
     * {
     *   &quot;tiers&quot;: [
     *     {
     *       &quot;resolution&quot;: 480,
     *       &quot;has_audio&quot;: 0,
     *       &quot;price_per_second&quot;: 0.24
     *     },
     *     {
     *       &quot;resolution&quot;: 480,
     *       &quot;has_audio&quot;: 1,
     *       &quot;price_per_second&quot;: 0.24
     *     },
     *     {
     *       &quot;resolution&quot;: 720,
     *       &quot;has_audio&quot;: 0,
     *       &quot;price_per_second&quot;: 0.24
     *     },
     *     {
     *       &quot;resolution&quot;: 720,
     *       &quot;has_audio&quot;: 1,
     *       &quot;price_per_second&quot;: 0.24
     *     }
     *   ],
     *   &quot;default_price_per_second&quot;: 0.24
     * }</p>
     * <p>Field description:</p>
     * <p>Field	Type	Required	Description	Unit
     * tiers	array	Yes	Video matrix pricing array	-
     * tiers[].resolution	integer	Yes	Video resolution. Valid values: 480, 720, and 1080.	Pixel height (p)
     * tiers[].has_audio	integer	Yes	Specifies whether audio is included. Valid values: 0 (no audio) and 1 (with audio).	-
     * tiers[].price_per_second	number	Yes	Unit price per second for this combination	CNY / second
     * default_price_per_second	number	No	Default unit price per second when no matrix entry is matched	CNY / second</p>
     * <p>Constraints:</p>
     * <ul>
     * <li>resolution only supports 480p, 720p, and 1080p.</li>
     * <li>The combination of resolution and has_audio must be unique.</li>
     * </ul>
     * <ol start="4">
     * <li>Per-duration billing</li>
     * </ol>
     * <p>Applicable to ASR (speech recognition) models. Pricing is based on audio duration. JSON format:</p>
     * <p>json
     * {
     *   &quot;price_per_unit&quot;: 0.00022
     * }</p>
     * <p>Field description:</p>
     * <p>Field	Type	Required	Description	Unit
     * price_per_unit	number	Yes	Unit price per second of audio	CNY / second</p>
     * <ol start="5">
     * <li>Per-character billing</li>
     * </ol>
     * <p>Applicable to TTS (speech synthesis) models. Pricing is based on the number of characters in the synthesized text. JSON format:</p>
     * <p>json
     * {
     *   &quot;price_per_unit&quot;: 0.8
     * }</p>
     * <p>Field description:</p>
     * <p>Field	Type	Required	Description	Unit
     * price_per_unit	number	Yes	Unit price per 10,000 characters	CNY / 10,000 characters</p>
     * <ol start="6">
     * <li>Token flat billing</li>
     * </ol>
     * <p>Applicable to Embedding, Rerank, MultimodalEmbedding, and MultimodalRerank models. A uniform unit price is applied without tiers. JSON format:</p>
     * <p>json
     * {
     *   &quot;input_price&quot;: 0.5,
     *   &quot;multimodal_input_price&quot;: 0.5
     * }</p>
     * <p>Field description:</p>
     * <p>Field	Type	Required	Description	Unit
     * input_price	number	Yes	Unit price for text-only input tokens	CNY / million tokens
     * multimodal_input_price	number	No	Unit price for multimodal input tokens	CNY / million tokens</p>
     * <ol start="7">
     * <li>Omni-multimodal billing</li>
     * </ol>
     * <p>Applicable to ChatFullmodal omni-modal models (such as qwen3.5-omni-plus). Input and output of different modalities including text, audio, image, and video are priced separately. JSON format:</p>
     * <p>json
     * {
     *   &quot;text_input_price&quot;: 7,
     *   &quot;audio_input_price&quot;: 53,
     *   &quot;image_input_price&quot;: 7,
     *   &quot;video_input_price&quot;: 7,
     *   &quot;text_output_price&quot;: 40,
     *   &quot;audio_output_price&quot;: 213,
     *   &quot;multi_text_output_price&quot;: 0
     * }</p>
     * <p>Field description:</p>
     * <p>Field	Type	Required	Description	Unit
     * text_input_price	number	Yes	Unit price for text input tokens	CNY / million tokens
     * audio_input_price	number	Yes	Unit price for audio input tokens	CNY / million tokens
     * image_input_price	number	No	Unit price for image input tokens	CNY / million tokens
     * video_input_price	number	No	Unit price for video input tokens	CNY / million tokens
     * text_output_price	number	Yes	Unit price for text output tokens	CNY / million tokens
     * audio_output_price	number	No	Unit price for audio output tokens	CNY / million tokens
     * multi_text_output_price	number	No	Unit price for text output tokens when the input contains images, audio, or video (separate pricing for text output after multimodal input)	CNY / million tokens</p>
     * <ol start="8">
     * <li>Tool calling billing</li>
     * </ol>
     * <p>Applicable to Chat models that support built-in tools. Currently only the responses protocol is supported. Tool calling fees coexist with the billing types described above: tool_call_prices is at the top level of pricingConfig, at the same level as tiers and other fields. It does not participate in tier matching. The fee is calculated separately as (number of calls / 1000 × unit price) and added to the total cost of the call. JSON format:</p>
     * <p>{
     *   &quot;tiers&quot;: [
     *     { &quot;min_tokens&quot;: 0, &quot;max_tokens&quot;: 256000, &quot;input_price&quot;: 2, &quot;output_price&quot;: 8 }
     *   ],
     *   &quot;tool_call_prices&quot;: {
     *     &quot;web_search&quot;: 4,
     *     &quot;code_interpreter&quot;: 0,
     *     &quot;web_extractor&quot;: 0,
     *     &quot;web_search_image&quot;: 24,
     *     &quot;image_search&quot;: 48
     *   }
     * }</p>
     * <p>Field description:</p>
     * <p>Field	Type	Required	Description	Unit
     * tool_call_prices	object	No	Tool calling price table. The key is the tool name and the value is the unit price per call for that tool.	-
     * tool_call_prices.web_search	number	No	Unit price for web search	CNY / 1,000 calls
     * tool_call_prices.code_interpreter	number	No	Unit price for code interpreter	CNY / 1,000 calls
     * tool_call_prices.web_extractor	number	No	Unit price for web extractor	CNY / 1,000 calls
     * tool_call_prices.web_search_image	number	No	Unit price for text-to-image search	CNY / 1,000 calls
     * tool_call_prices.image_search	number	No	Unit price for image-to-image search	CNY / 1,000 calls</p>
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
