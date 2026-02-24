// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class AttachAggregateConfigRuleToCompliancePackResponseBody extends TeaModel {
    @NameInMap("OperateRuleResult")
    public AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult;

    @NameInMap("RequestId")
    public String requestId;

    public static AttachAggregateConfigRuleToCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachAggregateConfigRuleToCompliancePackResponseBody self = new AttachAggregateConfigRuleToCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachAggregateConfigRuleToCompliancePackResponseBody setOperateRuleResult(AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public AttachAggregateConfigRuleToCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Success")
        public Boolean success;

        public static AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList self = new AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult extends TeaModel {
        @NameInMap("OperateRuleItemList")
        public java.util.List<AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult self = new AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
