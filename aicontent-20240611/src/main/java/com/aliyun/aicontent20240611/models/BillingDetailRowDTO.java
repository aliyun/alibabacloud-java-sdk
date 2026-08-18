// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BillingDetailRowDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.00012800</p>
     */
    @NameInMap("amount")
    public Double amount;

    /**
     * <strong>example:</strong>
     * <p>100</p>
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
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("cacheCreationTokens")
    public Double cacheCreationTokens;

    /**
     * <strong>example:</strong>
     * <p>256</p>
     */
    @NameInMap("cachedTokens")
    public Double cachedTokens;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <strong>example:</strong>
     * <p>研发部</p>
     */
    @NameInMap("clientName")
    public String clientName;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("discount")
    public Double discount;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("inputTokens")
    public Double inputTokens;

    /**
     * <strong>example:</strong>
     * <p>30001</p>
     */
    @NameInMap("memberUserId")
    public Long memberUserId;

    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("memberUserName")
    public String memberUserName;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("metrics")
    public String metrics;

    /**
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelCode")
    public String modelCode;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    /**
     * <strong>example:</strong>
     * <p>通义千问-Plus</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("modelSymbol")
    public String modelSymbol;

    /**
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelVersion")
    public Integer modelVersion;

    /**
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("outputTokens")
    public Double outputTokens;

    /**
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("reasoningTokens")
    public Double reasoningTokens;

    /**
     * <strong>example:</strong>
     * <p>chatcmpl-abc123def456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("requestTime")
    public Long requestTime;

    /**
     * <strong>example:</strong>
     * <p>1536</p>
     */
    @NameInMap("totalTokens")
    public Double totalTokens;

    /**
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
