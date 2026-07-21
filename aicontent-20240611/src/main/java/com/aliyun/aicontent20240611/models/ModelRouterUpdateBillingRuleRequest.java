// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateBillingRuleRequest extends TeaModel {
    /**
     * <p>The billing type. Must be <code>configurable</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>configurable</p>
     */
    @NameInMap("billingType")
    public String billingType;

    /**
     * <p>The effective time, in RFC3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("effectiveTime")
    public String effectiveTime;

    /**
     * <p>The expiration time, in RFC3339 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01T00:00:00Z</p>
     */
    @NameInMap("expireTime")
    public String expireTime;

    /**
     * <p>The billing configuration, specified as a JSON object.</p>
     * <ol>
     * <li><p><strong>Token-based tiered pricing (<code>token_tiered</code>)</strong><br>Applies to <code>Chat</code> models. Billing is tiered based on the token count, with separate rates for standard mode, thinking mode, and cache hits. The JSON format is as follows:<br>
     * json
     * {
     * &quot;tiers&quot;: [
     * {
     * &quot;min_tokens&quot;: 0,
     * &quot;max_tokens&quot;: 32000,
     * &quot;input_price&quot;: 2.5,
     * &quot;output_price&quot;: 10,
     * &quot;thinking_input_price&quot;: 2.5,
     * &quot;thinking_output_price&quot;: 10,
     * &quot;cached_input_price&quot;: 2.5
     * },
     * {
     * &quot;min_tokens&quot;: 32000,
     * &quot;max_tokens&quot;: 128000,
     * &quot;input_price&quot;: 4,
     * &quot;output_price&quot;: 16,
     * &quot;thinking_input_price&quot;: 4,
     * &quot;thinking_output_price&quot;: 16,
     * &quot;cached_input_price&quot;: 4
     * }
     * ]
     * }
     * <strong>Field descriptions:</strong><br>
     * Field | Type | Required | Description | Unit<br>
     * \---|---|---|---|---<br>
     * <code>tiers</code> | array | Yes | A required array of tiered pricing objects. | -<br>
     * <code>tiers[].min_tokens</code> | integer | Yes | The lower bound (inclusive) of the token count for the current tier. | token<br>
     * <code>tiers[].max_tokens</code> | integer | Yes | The upper bound (exclusive) of the token count for the current tier. A value of 0 indicates no upper limit. | token<br>
     * <code>tiers[].input_price</code> | number | Yes | The unit price for input tokens in standard mode. | CNY / million tokens<br>
     * <code>tiers[].output_price</code> | number | Yes | The unit price for output tokens in standard mode. | CNY / million tokens<br>
     * <code>tiers[].thinking_input_price</code> | number | No | The unit price for input tokens in thinking mode. | CNY / million tokens<br>
     * <code>tiers[].thinking_output_price</code> | number | No | The unit price for output tokens in thinking mode. | CNY / million tokens<br>
     * <code>tiers[].cached_input_price</code> | number | No | The unit price for input tokens on a cache hit. | CNY / million tokens<br>
     * <code>thinking_mode_tiers</code> | array | No | Dedicated tiers for thinking mode. The structure is the same as <code>tiers</code>. If a request includes a <code>reasoning_tokens</code> field and this array is not empty, this array overrides the default <code>tiers</code>. | -<br>
     * <strong>Constraints:</strong><br><br><br><br><br><br><br><br><br><br><br><br><br><br></p>
     * </li>
     * <li><p><strong>Per-image billing (<code>per_image</code>)</strong><br>Applies to <code>ImageGeneration</code> and <code>ImageEdit</code> models. Billing is based on the number of images generated or processed. The JSON format is as follows:<br>
     * json
     * {
     * &quot;price_per_image&quot;: 0.2
     * }
     * <strong>Field descriptions:</strong><br>
     * Field | Type | Required | Description | Unit<br>
     * \---|---|---|---|---<br>
     * <code>price_per_image</code> | number | Yes | The unit price per image. | CNY / image<br><br><br><br><br></p>
     * </li>
     * <li><p><strong>Video matrix billing (<code>video_matrix</code>)</strong><br>Applies to <code>VideoGeneration</code> and <code>VideoImageGeneration</code> models. Pricing is based on a combination of video resolution and the presence of audio.<br>
     * <strong>Note:</strong> The server automatically converts the <code>matrix</code> field, used by the frontend UI, to the <code>tiers</code> field required by the API.<br>
     * The JSON format is as follows:<br>
     * json
     * {
     * &quot;tiers&quot;: [
     * {
     * &quot;resolution&quot;: 480,
     * &quot;has_audio&quot;: 0,
     * &quot;price_per_second&quot;: 0.24
     * },
     * {
     * &quot;resolution&quot;: 480,
     * &quot;has_audio&quot;: 1,
     * &quot;price_per_second&quot;: 0.24
     * },
     * {
     * &quot;resolution&quot;: 720,
     * &quot;has_audio&quot;: 0,
     * &quot;price_per_second&quot;: 0.24
     * },
     * {
     * &quot;resolution&quot;: 720,
     * &quot;has_audio&quot;: 1,
     * &quot;price_per_second&quot;: 0.24
     * }
     * ],
     * &quot;default_price_per_second&quot;: 0.24
     * }
     * <strong>Field descriptions:</strong><br>
     * Field | Type | Required | Description | Unit<br>
     * \---|---|---|---|---<br>
     * <code>tiers</code> | array | Yes | An array of video matrix pricing objects. | -<br>
     * <code>tiers[].resolution</code> | integer | Yes | The video resolution. Valid values: 480, 720, and 1080. | Pixel height (p)<br>
     * <code>tiers[].has_audio</code> | integer | Yes | Indicates whether audio is included. Valid values: 0 (no audio) and 1 (with audio). | -<br>
     * <code>tiers[].price_per_second</code> | number | Yes | The unit price per second for this combination. | CNY / second<br>
     * <code>default_price_per_second</code> | number | No | The default unit price per second, applied if the request\&quot;s parameters do not match any item in the <code>tiers</code> array. | CNY / second<br>
     * <strong>Constraints:</strong><br><br><br><br><br><br><br><br><br><br><br><br></p>
     * </li>
     * <li><p><strong>Per-duration billing (<code>per_duration</code>)</strong><br>Applies to speech recognition (ASR) models. Billing is based on the duration of the audio. The JSON format is as follows:<br>
     * json
     * {
     * &quot;price_per_unit&quot;: 0.00022
     * }
     * <strong>Field descriptions:</strong><br>
     * Field | Type | Required | Description | Unit<br>
     * \---|---|---|---|---<br>
     * <code>price_per_unit</code> | number | Yes | The unit price per second of audio. | CNY / second<br><br><br><br><br></p>
     * </li>
     * <li><p><strong>Per-character billing (<code>per_character</code>)</strong><br>Applies to speech synthesis (TTS) models. Billing is based on the number of characters in the synthesized text. The JSON format is as follows:<br>
     * json
     * {
     * &quot;price_per_unit&quot;: 0.8
     * }
     * <strong>Field descriptions:</strong><br>
     * Field | Type | Required | Description | Unit<br>
     * \---|---|---|---|---<br>
     * <code>price_per_unit</code> | number | Yes | The unit price per 10,000 characters. | CNY / 10,000 characters<br><br><br><br><br></p>
     * </li>
     * <li><p><strong>Flat-rate token billing (<code>token_flat</code>)</strong><br>Applies to <code>Embedding</code>, <code>Rerank</code>, <code>MultimodalEmbedding</code>, and <code>MultimodalRerank</code> models. This method uses a single unit price without tiers. The JSON format is as follows:<br>
     * json
     * {
     * &quot;input_price&quot;: 0.5,
     * &quot;multimodal_input_price&quot;: 0.5
     * }
     * <strong>Field descriptions:</strong><br>
     * Field | Type | Required | Description | Unit<br>
     * \---|---|---|---|---<br>
     * <code>input_price</code> | number | Yes | The unit price for text-only input tokens. | CNY / million tokens<br>
     * <code>multimodal_input_price</code> | number | No | The unit price for multimodal input tokens. | CNY / million tokens<br><br><br><br><br><br></p>
     * </li>
     * <li><p><strong>Omni-modal multi-dimension billing (<code>omni_multimodal</code>)</strong><br>Applies to omni-modal models, such as <code>ChatFullmodal</code> (for example, <code>qwen3.5-omni-plus</code>). Prices are set separately for different input and output modalities, such as text, audio, images, and videos. The JSON format is as follows:<br>
     * json
     * {
     * &quot;text_input_price&quot;: 7,
     * &quot;audio_input_price&quot;: 53,
     * &quot;image_input_price&quot;: 7,
     * &quot;video_input_price&quot;: 7,
     * &quot;text_output_price&quot;: 40,
     * &quot;audio_output_price&quot;: 213,
     * &quot;multi_text_output_price&quot;: 0
     * }
     * <strong>Field descriptions:</strong><br>
     * Field | Type | Required | Description | Unit<br>
     * \---|---|---|---|---<br>
     * <code>text_input_price</code> | number | Yes | The unit price for text input tokens. | CNY / million tokens<br>
     * <code>audio_input_price</code> | number | Yes | The unit price for audio input tokens. | CNY / million tokens<br>
     * <code>image_input_price</code> | number | No | The unit price for image input tokens. | CNY / million tokens<br>
     * <code>video_input_price</code> | number | No | The unit price for video input tokens. | CNY / million tokens<br>
     * <code>text_output_price</code> | number | Yes | The unit price for text output tokens. | CNY / million tokens<br>
     * <code>audio_output_price</code> | number | No | The unit price for audio output tokens. | CNY / million tokens<br>
     * <code>multi_text_output_price</code> | number | No | The unit price for text output tokens when the input is multimodal (contains images, audio, or video). | CNY / million tokens<br><br>
     * <strong>Automatic billing type mapping</strong><br>
     * Model type (<code>model_type</code>) | Auto-detected billing type | Key identifying field in <code>pricingConfig</code><br>
     * \---|---|---<br>
     * <code>Chat</code> | <code>token_tiered</code> | The <code>tiers</code> field is present.<br>
     * <code>ChatFullmodal</code> | <code>omni_multimodal</code> | The <code>text_input_price</code> or <code>audio_input_price</code> field is present.<br>
     * <code>ImageGeneration</code> / <code>ImageEdit</code> | <code>per_image</code> | The <code>price_per_image</code> field is present.<br>
     * <code>VideoGeneration</code> / <code>VideoImageGeneration</code> | <code>video_matrix</code> | The <code>tiers</code> field is present, and its elements contain <code>resolution</code>.<br>
     * <code>ASR</code> | <code>per_duration</code> | The <code>price_per_unit</code> field is present (ASR scenario).<br>
     * <code>TTS</code> | <code>per_character</code> | The <code>price_per_unit</code> field is present (TTS scenario).<br>
     * <code>Embedding</code> / <code>Rerank</code> / <code>MultimodalEmbedding</code> / <code>MultimodalRerank</code> | <code>token_flat</code> | The <code>input_price</code> field is present.<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br></p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;tiers&quot;: [
     *     {
     *       &quot;min_tokens&quot;: 0,
     *       &quot;max_tokens&quot;: 32000,
     *       &quot;input_price&quot;: 2.5,
     *       &quot;output_price&quot;: 2.5,
     *       &quot;thinking_output_price&quot;: 10,
     *       &quot;cached_input_price&quot;: 1.25
     *     },
     *     {
     *       &quot;min_tokens&quot;: 32000,
     *       &quot;max_tokens&quot;: 0,
     *       &quot;input_price&quot;: 1.25,
     *       &quot;output_price&quot;: 1.25,
     *       &quot;thinking_output_price&quot;: 5,
     *       &quot;cached_input_price&quot;: 0.625
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("pricingConfig")
    public Object pricingConfig;

    /**
     * <p>The status of the billing rule. Use this field to enable or disable the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>The version number of the billing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Integer version;

    public static ModelRouterUpdateBillingRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateBillingRuleRequest self = new ModelRouterUpdateBillingRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateBillingRuleRequest setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public ModelRouterUpdateBillingRuleRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModelRouterUpdateBillingRuleRequest setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public ModelRouterUpdateBillingRuleRequest setPricingConfig(Object pricingConfig) {
        this.pricingConfig = pricingConfig;
        return this;
    }
    public Object getPricingConfig() {
        return this.pricingConfig;
    }

    public ModelRouterUpdateBillingRuleRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ModelRouterUpdateBillingRuleRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
