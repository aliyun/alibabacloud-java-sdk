// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class RequestLogDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <strong>example:</strong>
     * <p>mt_xxxxxMYTX9</p>
     */
    @NameInMap("clientUuid")
    public String clientUuid;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("completionTokens")
    public Integer completionTokens;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deleteTag")
    public Integer deleteTag;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>qwen3-max</p>
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
     * <p>通义千问</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("promptTokens")
    public Integer promptTokens;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("requestBody")
    public String requestBody;

    /**
     * <strong>example:</strong>
     * <p>req-xxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("requestTime")
    public String requestTime;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("responseBody")
    public String responseBody;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("responseTimeMs")
    public Integer responseTimeMs;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("statusCode")
    public Integer statusCode;

    /**
     * <strong>example:</strong>
     * <p>qwen</p>
     */
    @NameInMap("symbol")
    public String symbol;

    /**
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("totalTokens")
    public Integer totalTokens;

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

}
