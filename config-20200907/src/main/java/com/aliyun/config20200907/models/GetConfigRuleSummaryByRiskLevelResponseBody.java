// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetConfigRuleSummaryByRiskLevelResponseBody extends TeaModel {
    @NameInMap("ConfigRuleSummaries")
    public java.util.List<GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> configRuleSummaries;

    @NameInMap("RequestId")
    public String requestId;

    public static GetConfigRuleSummaryByRiskLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRuleSummaryByRiskLevelResponseBody self = new GetConfigRuleSummaryByRiskLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigRuleSummaryByRiskLevelResponseBody setConfigRuleSummaries(java.util.List<GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> configRuleSummaries) {
        this.configRuleSummaries = configRuleSummaries;
        return this;
    }
    public java.util.List<GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> getConfigRuleSummaries() {
        return this.configRuleSummaries;
    }

    public GetConfigRuleSummaryByRiskLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries extends TeaModel {
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries build(java.util.Map<String, ?> map) throws Exception {
            GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries self = new GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries();
            return TeaModel.build(map, self);
        }

        public GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

}
