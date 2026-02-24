// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleSummaryByRiskLevelResponseBody extends TeaModel {
    @NameInMap("ConfigRuleSummaries")
    public java.util.List<GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> configRuleSummaries;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateConfigRuleSummaryByRiskLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleSummaryByRiskLevelResponseBody self = new GetAggregateConfigRuleSummaryByRiskLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleSummaryByRiskLevelResponseBody setConfigRuleSummaries(java.util.List<GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> configRuleSummaries) {
        this.configRuleSummaries = configRuleSummaries;
        return this;
    }
    public java.util.List<GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries> getConfigRuleSummaries() {
        return this.configRuleSummaries;
    }

    public GetAggregateConfigRuleSummaryByRiskLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries extends TeaModel {
        @NameInMap("CompliantCount")
        public Integer compliantCount;

        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        @NameInMap("RiskLevel")
        public Integer riskLevel;

        public static GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries self = new GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setCompliantCount(Integer compliantCount) {
            this.compliantCount = compliantCount;
            return this;
        }
        public Integer getCompliantCount() {
            return this.compliantCount;
        }

        public GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetAggregateConfigRuleSummaryByRiskLevelResponseBodyConfigRuleSummaries setRiskLevel(Integer riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

    }

}
