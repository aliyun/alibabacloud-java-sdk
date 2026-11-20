// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class RequestLogDTO extends TeaModel {
    /**
     * <p>API Key ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <p>The client ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <p>The unique identifier of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>mt_xxxxxMYTX9</p>
     */
    @NameInMap("clientUuid")
    public String clientUuid;

    /**
     * <p>The output tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("completionTokens")
    public Integer completionTokens;

    /**
     * <p>The deletion tag. A value of 0 indicates enabled, and a non-zero value indicates disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deleteTag")
    public Integer deleteTag;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <p>The model.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-max</p>
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
     * <p>Qwen</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <p>The model type.</p>
     * 
     * <strong>example:</strong>
     * <p>Chat</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The input tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("promptTokens")
    public Integer promptTokens;

    /**
     * <p>The request body.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("requestBody")
    public String requestBody;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>req-xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The request time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("requestTime")
    public String requestTime;

    /**
     * <p>The response body.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("responseBody")
    public String responseBody;

    /**
     * <p>The response time in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("responseTimeMs")
    public Integer responseTimeMs;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("statusCode")
    public Integer statusCode;

    /**
     * <p>The tag.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("symbol")
    public String symbol;

    /**
     * <p>The total tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("totalTokens")
    public Integer totalTokens;

    /**
     * <p>The usage statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;prompt_tokens&quot;:100,&quot;completion_tokens&quot;:50,&quot;total_tokens&quot;:150}</p>
     */
    @NameInMap("usage")
    public UsageInfoDTO usage;

    public static RequestLogDTO build(java.util.Map<String, ?> map) throws Exception {
        RequestLogDTO self = new RequestLogDTO();
        return TeaModel.build(map, self);
    }

    public RequestLogDTO setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public RequestLogDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public RequestLogDTO setClientUuid(String clientUuid) {
        this.clientUuid = clientUuid;
        return this;
    }
    public String getClientUuid() {
        return this.clientUuid;
    }

    public RequestLogDTO setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    public Integer getCompletionTokens() {
        return this.completionTokens;
    }

    public RequestLogDTO setDeleteTag(Integer deleteTag) {
        this.deleteTag = deleteTag;
        return this;
    }
    public Integer getDeleteTag() {
        return this.deleteTag;
    }

    public RequestLogDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public RequestLogDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public RequestLogDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RequestLogDTO setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public RequestLogDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public RequestLogDTO setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public RequestLogDTO setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public RequestLogDTO setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    public Integer getPromptTokens() {
        return this.promptTokens;
    }

    public RequestLogDTO setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public String getRequestBody() {
        return this.requestBody;
    }

    public RequestLogDTO setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestLogDTO setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public String getRequestTime() {
        return this.requestTime;
    }

    public RequestLogDTO setResponseBody(String responseBody) {
        this.responseBody = responseBody;
        return this;
    }
    public String getResponseBody() {
        return this.responseBody;
    }

    public RequestLogDTO setResponseTimeMs(Integer responseTimeMs) {
        this.responseTimeMs = responseTimeMs;
        return this;
    }
    public Integer getResponseTimeMs() {
        return this.responseTimeMs;
    }

    public RequestLogDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RequestLogDTO setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestLogDTO setSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public RequestLogDTO setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Integer getTotalTokens() {
        return this.totalTokens;
    }

    public RequestLogDTO setUsage(UsageInfoDTO usage) {
        this.usage = usage;
        return this;
    }
    public UsageInfoDTO getUsage() {
        return this.usage;
    }

}
