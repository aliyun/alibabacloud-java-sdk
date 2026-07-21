// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateBillingRuleRequest extends TeaModel {
    /**
     * <p>The billing type. The value must be <code>configurable</code>.</p>
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
     * <p>The model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <p>The <code>pricingConfig</code> is a JSON object whose internal field structure varies depending on the billing type.</p>
     * <ol>
     * <li><p><strong>Tiered token billing</strong><br>Applicable to chat models. This type uses tiered pricing based on the number of input tokens and supports different rates for standard mode, thinking mode, and cache hits.<br>JSON format:<br><br><br></p>
     * <p>Field descriptions:Constraints:</p>
     * </li>
     * <li><p><strong>Per-image billing</strong><br>Applicable to <code>ImageGeneration</code> and <code>ImageEdit</code> models. Billing is based on the number of images generated or processed.<br>JSON format:<br><br><br></p>
     * <p>Field descriptions:</p>
     * </li>
     * <li><p><strong>Video matrix billing</strong><br>Applicable to <code>VideoGeneration</code> and <code>VideoImageGeneration</code> models. Pricing is based on a combination of video resolution and the presence of an audio track.<br>Note: While the frontend UI may use a <code>matrix</code> field, API calls must use the <code>tiers</code> field to save the configuration. The <code>matrix</code> field is automatically converted to <code>tiers</code> on the server side. The format below is the standard API format.<br>JSON format:<br><br><br><br></p>
     * <p>Field descriptions:Constraints:</p>
     * </li>
     * <li><p><strong>Billing by duration</strong><br>Applicable to automatic speech recognition (ASR) models. Billing is based on the audio duration.<br>JSON format:<br><br><br></p>
     * <p>Field descriptions:</p>
     * </li>
     * <li><p><strong>Per-character billing</strong><br>Applicable to text-to-speech (TTS) models. Billing is based on the number of characters in the synthesized text.<br>JSON format:<br><br><br></p>
     * <p>Field descriptions:</p>
     * </li>
     * <li><p><strong>Flat-rate token billing</strong><br>Applicable to models such as <code>Embedding</code>, <code>Rerank</code>, <code>MultimodalEmbedding</code>, and <code>MultimodalRerank</code>. This type uses a flat-rate pricing model without tiers.<br>JSON format:<br><br><br></p>
     * <p>Field descriptions:</p>
     * </li>
     * <li><p><strong>Full-modal multi-dimensional billing</strong><br>Applicable to full-modal models such as <code>ChatFullmodal</code> (e.g., <code>qwen3.5-omni-plus</code>). It sets separate prices for the input and output of different modalities, such as text, audio, images, and video.<br>JSON format:<br><br><br></p>
     * <p>Field descriptions:</p>
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
