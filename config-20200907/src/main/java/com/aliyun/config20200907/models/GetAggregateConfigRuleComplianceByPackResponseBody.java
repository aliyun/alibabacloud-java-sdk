// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleComplianceByPackResponseBody extends TeaModel {
    @NameInMap("ConfigRuleComplianceResult")
    public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult configRuleComplianceResult;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateConfigRuleComplianceByPackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleComplianceByPackResponseBody self = new GetAggregateConfigRuleComplianceByPackResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleComplianceByPackResponseBody setConfigRuleComplianceResult(GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult configRuleComplianceResult) {
        this.configRuleComplianceResult = configRuleComplianceResult;
        return this;
    }
    public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult getConfigRuleComplianceResult() {
        return this.configRuleComplianceResult;
    }

    public GetAggregateConfigRuleComplianceByPackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances extends TeaModel {
        @NameInMap("ComplianceType")
        public String complianceType;

        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ConfigRuleName")
        public String configRuleName;

        public static GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances self = new GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances setConfigRuleName(String configRuleName) {
            this.configRuleName = configRuleName;
            return this;
        }
        public String getConfigRuleName() {
            return this.configRuleName;
        }

    }

    public static class GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult extends TeaModel {
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("ConfigRuleCompliances")
        public java.util.List<GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances;

        @NameInMap("NonCompliantCount")
        public Integer nonCompliantCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult self = new GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setConfigRuleCompliances(java.util.List<GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> configRuleCompliances) {
            this.configRuleCompliances = configRuleCompliances;
            return this;
        }
        public java.util.List<GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResultConfigRuleCompliances> getConfigRuleCompliances() {
            return this.configRuleCompliances;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setNonCompliantCount(Integer nonCompliantCount) {
            this.nonCompliantCount = nonCompliantCount;
            return this;
        }
        public Integer getNonCompliantCount() {
            return this.nonCompliantCount;
        }

        public GetAggregateConfigRuleComplianceByPackResponseBodyConfigRuleComplianceResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
