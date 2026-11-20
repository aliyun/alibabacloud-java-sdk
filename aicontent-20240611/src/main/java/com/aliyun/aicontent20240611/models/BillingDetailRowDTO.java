// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BillingDetailRowDTO extends TeaModel {
    /**
     * <p>The actual amount paid after discounts, rounded to eight decimal places.</p>
     * 
     * <strong>example:</strong>
     * <p>0.00012800</p>
     */
    @NameInMap("amount")
    public Double amount;

    /**
     * <p>API Key ID</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <p>The name of the API key.</p>
     * 
     * <strong>example:</strong>
     * <p>Default key</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The number of cache creation tokens for explicit cache writes.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("cacheCreationTokens")
    public Double cacheCreationTokens;

    /**
     * <p>The number of cache hit tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("cachedTokens")
    public Double cachedTokens;

    /**
     * <p>The department ID. A value of 0 indicates that the request does not belong to any department.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>The department name.</p>
     * 
     * <strong>example:</strong>
     * <p>R&amp;D Department</p>
     */
    @NameInMap("clientName")
    public String clientName;

    /**
     * <p>The discount factor. A value of 1.0 indicates no discount.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("discount")
    public Double discount;

    /**
     * <p>The number of input tokens, including cached tokens and cache creation tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("inputTokens")
    public Double inputTokens;

    /**
     * <p>The user ID of the member. For department rows, the value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>30001</p>
     */
    @NameInMap("memberUserId")
    public Long memberUserId;

    /**
     * <p>The name of the member. For department rows, the value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>John Doe</p>
     */
    @NameInMap("memberUserName")
    public String memberUserName;

    /**
     * <p>The JSON containing other metering field mappings, such as video duration and number of images. Fields with a value of 0 are not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("metrics")
    public String metrics;

    /**
     * <p>The model identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelCode")
    public String modelCode;

    /**
     * <p>The model ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen-Plus</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <p>The model symbol, which is the vendor identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("modelSymbol")
    public String modelSymbol;

    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The model version number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelVersion")
    public Integer modelVersion;

    /**
     * <p>The number of output tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("outputTokens")
    public Double outputTokens;

    /**
     * <p>The number of reasoning tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("reasoningTokens")
    public Double reasoningTokens;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>chatcmpl-abc123def456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The request time as a UNIX timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("requestTime")
    public Long requestTime;

    /**
     * <p>The total number of tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>1536</p>
     */
    @NameInMap("totalTokens")
    public Double totalTokens;

    /**
     * <p>The raw JSON of usage details.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;input_tokens&quot;: 1024, &quot;output_tokens&quot;: 512}</p>
     */
    @NameInMap("usageDetail")
    public String usageDetail;

    public static BillingDetailRowDTO build(java.util.Map<String, ?> map) throws Exception {
        BillingDetailRowDTO self = new BillingDetailRowDTO();
        return TeaModel.build(map, self);
    }

    public BillingDetailRowDTO setAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    public Double getAmount() {
        return this.amount;
    }

    public BillingDetailRowDTO setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public BillingDetailRowDTO setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public BillingDetailRowDTO setCacheCreationTokens(Double cacheCreationTokens) {
        this.cacheCreationTokens = cacheCreationTokens;
        return this;
    }
    public Double getCacheCreationTokens() {
        return this.cacheCreationTokens;
    }

    public BillingDetailRowDTO setCachedTokens(Double cachedTokens) {
        this.cachedTokens = cachedTokens;
        return this;
    }
    public Double getCachedTokens() {
        return this.cachedTokens;
    }

    public BillingDetailRowDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public BillingDetailRowDTO setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public BillingDetailRowDTO setDiscount(Double discount) {
        this.discount = discount;
        return this;
    }
    public Double getDiscount() {
        return this.discount;
    }

    public BillingDetailRowDTO setInputTokens(Double inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public Double getInputTokens() {
        return this.inputTokens;
    }

    public BillingDetailRowDTO setMemberUserId(Long memberUserId) {
        this.memberUserId = memberUserId;
        return this;
    }
    public Long getMemberUserId() {
        return this.memberUserId;
    }

    public BillingDetailRowDTO setMemberUserName(String memberUserName) {
        this.memberUserName = memberUserName;
        return this;
    }
    public String getMemberUserName() {
        return this.memberUserName;
    }

    public BillingDetailRowDTO setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public BillingDetailRowDTO setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public BillingDetailRowDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public BillingDetailRowDTO setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public BillingDetailRowDTO setModelSymbol(String modelSymbol) {
        this.modelSymbol = modelSymbol;
        return this;
    }
    public String getModelSymbol() {
        return this.modelSymbol;
    }

    public BillingDetailRowDTO setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public BillingDetailRowDTO setModelVersion(Integer modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public Integer getModelVersion() {
        return this.modelVersion;
    }

    public BillingDetailRowDTO setOutputTokens(Double outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public Double getOutputTokens() {
        return this.outputTokens;
    }

    public BillingDetailRowDTO setReasoningTokens(Double reasoningTokens) {
        this.reasoningTokens = reasoningTokens;
        return this;
    }
    public Double getReasoningTokens() {
        return this.reasoningTokens;
    }

    public BillingDetailRowDTO setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BillingDetailRowDTO setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public Long getRequestTime() {
        return this.requestTime;
    }

    public BillingDetailRowDTO setTotalTokens(Double totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Double getTotalTokens() {
        return this.totalTokens;
    }

    public BillingDetailRowDTO setUsageDetail(String usageDetail) {
        this.usageDetail = usageDetail;
        return this;
    }
    public String getUsageDetail() {
        return this.usageDetail;
    }

}
