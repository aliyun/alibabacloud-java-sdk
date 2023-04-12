// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeactiveConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The results of the operations to disable the specified rules.</p>
     */
    @NameInMap("OperateRuleResult")
    public DeactiveConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeactiveConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeactiveConfigRulesResponseBody self = new DeactiveConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeactiveConfigRulesResponseBody setOperateRuleResult(DeactiveConfigRulesResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public DeactiveConfigRulesResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public DeactiveConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeactiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code.</p>
         * <br>
         * <p>*   If the rule is disabled, no error code is returned.</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>*   If the rule fails to be disabled, an error code is returned. For more information about error codes, visit the [API Error Center](https://error-center.alibabacloud.com/status/product/Config).</p>
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

        public static DeactiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            DeactiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList self = new DeactiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public DeactiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DeactiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeactiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeactiveConfigRulesResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>The result of the operation to disable the rule.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<DeactiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static DeactiveConfigRulesResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            DeactiveConfigRulesResponseBodyOperateRuleResult self = new DeactiveConfigRulesResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public DeactiveConfigRulesResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<DeactiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<DeactiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
