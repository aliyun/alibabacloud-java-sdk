// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class AttachConfigRuleToCompliancePackResponseBody extends TeaModel {
    /**
     * <p>The results of the operations to add one or more rules.</p>
     */
    @NameInMap("OperateRuleResult")
    public AttachConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AttachConfigRuleToCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachConfigRuleToCompliancePackResponseBody self = new AttachConfigRuleToCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachConfigRuleToCompliancePackResponseBody setOperateRuleResult(AttachConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public AttachConfigRuleToCompliancePackResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public AttachConfigRuleToCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AttachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code returned.</p>
         * <br>
         * <p>*   This parameter is empty if the rule is added to the compliance package.</p>
         * <p>*   An error code is returned if the rule fails to be added to the compliance package. For more information about error codes, see [Error codes](https://error-center.alibabacloud.com/status/product/Config).</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <br>
         * <p>*   true: The request was successful.</p>
         * <p>*   false: The request failed.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static AttachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            AttachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList self = new AttachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public AttachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public AttachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AttachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class AttachConfigRuleToCompliancePackResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>The result of the operation to add the rule.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<AttachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static AttachConfigRuleToCompliancePackResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            AttachConfigRuleToCompliancePackResponseBodyOperateRuleResult self = new AttachConfigRuleToCompliancePackResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public AttachConfigRuleToCompliancePackResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<AttachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<AttachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
