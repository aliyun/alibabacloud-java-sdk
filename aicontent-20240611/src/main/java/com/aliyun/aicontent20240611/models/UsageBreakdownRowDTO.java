// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class UsageBreakdownRowDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    @NameInMap("clientName")
    public String clientName;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;: &quot;total_calls&quot;, &quot;value&quot;: 100}]</p>
     */
    @NameInMap("metrics")
    public java.util.List<MetricKVPairDTO> metrics;

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

    @NameInMap("modelName")
    public String modelName;

    /**
     * <strong>example:</strong>
     * <p>llm</p>
     */
    @NameInMap("modelType")
    public String modelType;

    /**
     * <strong>example:</strong>
     * <p>1700000000</p>
     */
    @NameInMap("summaryTime")
    public Long summaryTime;

    public static UsageBreakdownRowDTO build(java.util.Map<String, ?> map) throws Exception {
        UsageBreakdownRowDTO self = new UsageBreakdownRowDTO();
        return TeaModel.build(map, self);
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
