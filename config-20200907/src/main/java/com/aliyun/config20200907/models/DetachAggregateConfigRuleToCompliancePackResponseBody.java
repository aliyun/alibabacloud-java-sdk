// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DetachAggregateConfigRuleToCompliancePackResponseBody extends TeaModel {
    @NameInMap("OperateRuleResult")
    public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult;

    @NameInMap("RequestId")
    public String requestId;

    public static DetachAggregateConfigRuleToCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachAggregateConfigRuleToCompliancePackResponseBody self = new DetachAggregateConfigRuleToCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachAggregateConfigRuleToCompliancePackResponseBody setOperateRuleResult(DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public DetachAggregateConfigRuleToCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Success")
        public Boolean success;

        public static DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList self = new DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult extends TeaModel {
        @NameInMap("OperateRuleItemList")
        public java.util.List<DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult self = new DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<DetachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
