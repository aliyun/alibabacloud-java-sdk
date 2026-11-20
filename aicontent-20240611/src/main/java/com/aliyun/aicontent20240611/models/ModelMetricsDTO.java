// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelMetricsDTO extends TeaModel {
    /**
     * <p>The average response time (ms).</p>
     * 
     * <strong>example:</strong>
     * <p>200.5</p>
     */
    @NameInMap("avgResponseTime")
    public Double avgResponseTime;

    /**
     * <p>The total number of input tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>500000</p>
     */
    @NameInMap("inputTokens")
    public Long inputTokens;

    /**
     * <p>The total number of output tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>300000</p>
     */
    @NameInMap("outputTokens")
    public Long outputTokens;

    /**
     * <p>The success rate (%).</p>
     * 
     * <strong>example:</strong>
     * <p>99.5</p>
     */
    @NameInMap("successRate")
    public Double successRate;

    /**
     * <p>The total number of calls.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("totalCalls")
    public Long totalCalls;

    public static ModelMetricsDTO build(java.util.Map<String, ?> map) throws Exception {
        ModelMetricsDTO self = new ModelMetricsDTO();
        return TeaModel.build(map, self);
    }

    public ModelMetricsDTO setAvgResponseTime(Double avgResponseTime) {
        this.avgResponseTime = avgResponseTime;
        return this;
    }
    public Double getAvgResponseTime() {
        return this.avgResponseTime;
    }

    public ModelMetricsDTO setInputTokens(Long inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public Long getInputTokens() {
        return this.inputTokens;
    }

    public ModelMetricsDTO setOutputTokens(Long outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public Long getOutputTokens() {
        return this.outputTokens;
    }

    public ModelMetricsDTO setSuccessRate(Double successRate) {
        this.successRate = successRate;
        return this;
    }
    public Double getSuccessRate() {
        return this.successRate;
    }

    public ModelMetricsDTO setTotalCalls(Long totalCalls) {
        this.totalCalls = totalCalls;
        return this;
    }
    public Long getTotalCalls() {
        return this.totalCalls;
    }

}
