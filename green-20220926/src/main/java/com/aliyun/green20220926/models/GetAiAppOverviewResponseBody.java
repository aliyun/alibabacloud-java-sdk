// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppOverviewResponseBody extends TeaModel {
    /**
     * <p>The total number of agents.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AppTotal")
    public Long appTotal;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The distribution of risk events by level.</p>
     */
    @NameInMap("RiskEventLevelDistribution")
    public java.util.Map<String, ?> riskEventLevelDistribution;

    /**
     * <p>The total number of resolved risk events.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RiskEventResolvedTotal")
    public Long riskEventResolvedTotal;

    /**
     * <p>The total number of risk events.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RiskEventTotal")
    public Long riskEventTotal;

    /**
     * <p>The total number of unhandled risk events.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RiskEventUnhandledTotal")
    public Long riskEventUnhandledTotal;

    public static GetAiAppOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppOverviewResponseBody self = new GetAiAppOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiAppOverviewResponseBody setAppTotal(Long appTotal) {
        this.appTotal = appTotal;
        return this;
    }
    public Long getAppTotal() {
        return this.appTotal;
    }

    public GetAiAppOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiAppOverviewResponseBody setRiskEventLevelDistribution(java.util.Map<String, ?> riskEventLevelDistribution) {
        this.riskEventLevelDistribution = riskEventLevelDistribution;
        return this;
    }
    public java.util.Map<String, ?> getRiskEventLevelDistribution() {
        return this.riskEventLevelDistribution;
    }

    public GetAiAppOverviewResponseBody setRiskEventResolvedTotal(Long riskEventResolvedTotal) {
        this.riskEventResolvedTotal = riskEventResolvedTotal;
        return this;
    }
    public Long getRiskEventResolvedTotal() {
        return this.riskEventResolvedTotal;
    }

    public GetAiAppOverviewResponseBody setRiskEventTotal(Long riskEventTotal) {
        this.riskEventTotal = riskEventTotal;
        return this;
    }
    public Long getRiskEventTotal() {
        return this.riskEventTotal;
    }

    public GetAiAppOverviewResponseBody setRiskEventUnhandledTotal(Long riskEventUnhandledTotal) {
        this.riskEventUnhandledTotal = riskEventUnhandledTotal;
        return this;
    }
    public Long getRiskEventUnhandledTotal() {
        return this.riskEventUnhandledTotal;
    }

}
