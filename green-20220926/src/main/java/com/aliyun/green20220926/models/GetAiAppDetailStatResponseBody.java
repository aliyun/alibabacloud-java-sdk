// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppDetailStatResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>id-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The average duration of model calls.</p>
     * 
     * <strong>example:</strong>
     * <p>2.55</p>
     */
    @NameInMap("AvgModelDuration")
    public Float avgModelDuration;

    /**
     * <p>The day-over-day change ratio of average model call duration.</p>
     * 
     * <strong>example:</strong>
     * <p>0.05</p>
     */
    @NameInMap("AvgModelDurationDau")
    public Float avgModelDurationDau;

    /**
     * <p>The number of model calls.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("ModelCount")
    public Long modelCount;

    /**
     * <p>The day-over-day change ratio of model call count.</p>
     * 
     * <strong>example:</strong>
     * <p>0.15</p>
     */
    @NameInMap("ModelCountDau")
    public Float modelCountDau;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of risk events.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskEventCount")
    public Long riskEventCount;

    /**
     * <p>The number of tokens consumed.</p>
     * 
     * <strong>example:</strong>
     * <p>11000</p>
     */
    @NameInMap("TokenCount")
    public Long tokenCount;

    /**
     * <p>The day-over-day change ratio of token consumption count.</p>
     * 
     * <strong>example:</strong>
     * <p>-0.15</p>
     */
    @NameInMap("TokenCountDau")
    public Float tokenCountDau;

    public static GetAiAppDetailStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppDetailStatResponseBody self = new GetAiAppDetailStatResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiAppDetailStatResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAiAppDetailStatResponseBody setAvgModelDuration(Float avgModelDuration) {
        this.avgModelDuration = avgModelDuration;
        return this;
    }
    public Float getAvgModelDuration() {
        return this.avgModelDuration;
    }

    public GetAiAppDetailStatResponseBody setAvgModelDurationDau(Float avgModelDurationDau) {
        this.avgModelDurationDau = avgModelDurationDau;
        return this;
    }
    public Float getAvgModelDurationDau() {
        return this.avgModelDurationDau;
    }

    public GetAiAppDetailStatResponseBody setModelCount(Long modelCount) {
        this.modelCount = modelCount;
        return this;
    }
    public Long getModelCount() {
        return this.modelCount;
    }

    public GetAiAppDetailStatResponseBody setModelCountDau(Float modelCountDau) {
        this.modelCountDau = modelCountDau;
        return this;
    }
    public Float getModelCountDau() {
        return this.modelCountDau;
    }

    public GetAiAppDetailStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiAppDetailStatResponseBody setRiskEventCount(Long riskEventCount) {
        this.riskEventCount = riskEventCount;
        return this;
    }
    public Long getRiskEventCount() {
        return this.riskEventCount;
    }

    public GetAiAppDetailStatResponseBody setTokenCount(Long tokenCount) {
        this.tokenCount = tokenCount;
        return this;
    }
    public Long getTokenCount() {
        return this.tokenCount;
    }

    public GetAiAppDetailStatResponseBody setTokenCountDau(Float tokenCountDau) {
        this.tokenCountDau = tokenCountDau;
        return this;
    }
    public Float getTokenCountDau() {
        return this.tokenCountDau;
    }

}
