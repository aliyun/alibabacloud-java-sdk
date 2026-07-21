// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BillingCostBreakdownRowDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <strong>example:</strong>
     * <p>默认密钥</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>Billing type; currently fixed as total_amount</p>
     * 
     * <strong>example:</strong>
     * <p>total_amount</p>
     */
    @NameInMap("billingType")
    public String billingType;

    /**
     * <p>Department ID; 0 indicates no associated department</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>Department name</p>
     * 
     * <strong>example:</strong>
     * <p>研发部</p>
     */
    @NameInMap("clientName")
    public String clientName;

    /**
     * <strong>example:</strong>
     * <p>{&quot;billing_version&quot;: &quot;v1&quot;}</p>
     */
    @NameInMap("dimValues")
    public String dimValues;

    /**
     * <p>Model identifier</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelCode")
    public String modelCode;

    /**
     * <p>Model ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <p>Model name</p>
     * 
     * <strong>example:</strong>
     * <p>通义千问-Plus</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <p>Statistics category</p>
     * 
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>Payable amount, rounded to 8 decimal places</p>
     * 
     * <strong>example:</strong>
     * <p>0.00012800</p>
     */
    @NameInMap("payableAmount")
    public Float payableAmount;

    /**
     * <p>Statistics time point, Unix timestamp (seconds)</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("summaryTime")
    public Long summaryTime;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("tiers")
    public java.util.List<BillingBillTierDTO> tiers;

    /**
     * <strong>example:</strong>
     * <p>{&quot;input_tokens&quot;: 512000, &quot;output_tokens&quot;: 256000}</p>
     */
    @NameInMap("values")
    public String values;

    public static BillingCostBreakdownRowDTO build(java.util.Map<String, ?> map) throws Exception {
        BillingCostBreakdownRowDTO self = new BillingCostBreakdownRowDTO();
        return TeaModel.build(map, self);
    }

    public BillingCostBreakdownRowDTO setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public BillingCostBreakdownRowDTO setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public BillingCostBreakdownRowDTO setBillingType(String billingType) {
        this.billingType = billingType;
        return this;
    }
    public String getBillingType() {
        return this.billingType;
    }

    public BillingCostBreakdownRowDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public BillingCostBreakdownRowDTO setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public BillingCostBreakdownRowDTO setDimValues(String dimValues) {
        this.dimValues = dimValues;
        return this;
    }
    public String getDimValues() {
        return this.dimValues;
    }

    public BillingCostBreakdownRowDTO setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public BillingCostBreakdownRowDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public BillingCostBreakdownRowDTO setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public BillingCostBreakdownRowDTO setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public BillingCostBreakdownRowDTO setPayableAmount(Float payableAmount) {
        this.payableAmount = payableAmount;
        return this;
    }
    public Float getPayableAmount() {
        return this.payableAmount;
    }

    public BillingCostBreakdownRowDTO setSummaryTime(Long summaryTime) {
        this.summaryTime = summaryTime;
        return this;
    }
    public Long getSummaryTime() {
        return this.summaryTime;
    }

    public BillingCostBreakdownRowDTO setTiers(java.util.List<BillingBillTierDTO> tiers) {
        this.tiers = tiers;
        return this;
    }
    public java.util.List<BillingBillTierDTO> getTiers() {
        return this.tiers;
    }

    public BillingCostBreakdownRowDTO setValues(String values) {
        this.values = values;
        return this;
    }
    public String getValues() {
        return this.values;
    }

}
