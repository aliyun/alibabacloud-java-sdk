// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DetachConfigRuleToCompliancePackResponseBody extends TeaModel {
    /**
     * <p>The results of the operations to remove one or more rules.</p>
     */
    @NameInMap("OperateRuleResult")
    public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetachConfigRuleToCompliancePackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachConfigRuleToCompliancePackResponseBody self = new DetachConfigRuleToCompliancePackResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachConfigRuleToCompliancePackResponseBody setOperateRuleResult(DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public DetachConfigRuleToCompliancePackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        /**
         * <p>The ID of the rule that is removed from the compliance package.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code.</p>
         * <br>
         * <p>*   This parameter is empty if the rule is removed from the compliance package.</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>*   An error code is returned if the rule fails to be removed from the compliance package. For more information about error codes, visit the [API Error Center](https://error-center.alibabacloud.com/status/product/Config).</p>
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

        public static DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList self = new DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>The result of the operation to remove the rule.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult self = new DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public DetachConfigRuleToCompliancePackResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<DetachConfigRuleToCompliancePackResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
