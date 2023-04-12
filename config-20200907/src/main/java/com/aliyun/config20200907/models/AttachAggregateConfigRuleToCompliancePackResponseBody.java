// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class AttachAggregateConfigRuleToCompliancePackResponseBody extends TeaModel {
    /**
     * <p>The results of the operations to add one or more rules.</p>
     */
    @NameInMap("OperateRuleResult")
    public AttachAggregateConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the rule that is added to the compliance package.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code.</p>
         * <br>
         * <p>*   This parameter is empty if the rule is added to the compliance package.</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>*   An error code is returned if the rule fails to be added to the compliance package. For more information about error codes, visit the [API Error Center](https://error-center.alibabacloud.com/status/product/Config).</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <br>
         * <p>*   true: The operation is successful.</p>
         * <p>*   false: The operation fails.</p>
         */
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
        /**
         * <p>The result of the operation to add the rule.</p>
         */
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
