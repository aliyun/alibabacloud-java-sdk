// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class UsageBreakdownRowDTO extends TeaModel {
    /**
     * <p>The API key ID. A value of 0 indicates that historical data is not broken down by API key.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("apiKeyId")
    public Long apiKeyId;

    /**
     * <p>The API key name, corresponding to api_key_id.</p>
     * 
     * <strong>example:</strong>
     * <p>Default key</p>
     */
    @NameInMap("apiKeyName")
    public String apiKeyName;

    /**
     * <p>The department ID. A value of 0 indicates no affiliated department.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
     * <p>The member ID for a member row. The value is 0 for a department row.</p>
     * 
     * <strong>example:</strong>
     * <p>30001</p>
     */
    @NameInMap("memberUserId")
    public Long memberUserId;

    /**
     * <p>The member name for a member row. The value is empty for a department row.</p>
     * 
     * <strong>example:</strong>
     * <p>John Smith</p>
     */
    @NameInMap("memberUserName")
    public String memberUserName;

    /**
     * <p>The usage metric array. Only entries with non-zero values are included.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;: &quot;total_calls&quot;, &quot;value&quot;: 100}]</p>
     */
    @NameInMap("metrics")
    public java.util.List<MetricKVPairDTO> metrics;

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
     * <p>The statistical dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <p>The statistical time point, in UNIX timestamp (seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("summaryTime")
    public Long summaryTime;

    public static UsageBreakdownRowDTO build(java.util.Map<String, ?> map) throws Exception {
        UsageBreakdownRowDTO self = new UsageBreakdownRowDTO();
        return TeaModel.build(map, self);
    }

    public UsageBreakdownRowDTO setApiKeyId(Long apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    public UsageBreakdownRowDTO setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
        return this;
    }
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    public UsageBreakdownRowDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public UsageBreakdownRowDTO setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

    public UsageBreakdownRowDTO setMemberUserId(Long memberUserId) {
        this.memberUserId = memberUserId;
        return this;
    }
    public Long getMemberUserId() {
        return this.memberUserId;
    }

    public UsageBreakdownRowDTO setMemberUserName(String memberUserName) {
        this.memberUserName = memberUserName;
        return this;
    }
    public String getMemberUserName() {
        return this.memberUserName;
    }

    public UsageBreakdownRowDTO setMetrics(java.util.List<MetricKVPairDTO> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<MetricKVPairDTO> getMetrics() {
        return this.metrics;
    }

    public UsageBreakdownRowDTO setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public UsageBreakdownRowDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public UsageBreakdownRowDTO setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public UsageBreakdownRowDTO setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public UsageBreakdownRowDTO setSummaryTime(Long summaryTime) {
        this.summaryTime = summaryTime;
        return this;
    }
    public Long getSummaryTime() {
        return this.summaryTime;
    }

}
