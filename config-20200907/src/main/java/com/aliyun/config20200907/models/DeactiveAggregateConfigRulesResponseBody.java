// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeactiveAggregateConfigRulesResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the operation is successful. Valid values:</p>
     * <br>
     * <p>*   true: The operation is successful.</p>
     * <p>*   false: The operation fails.</p>
     */
    @NameInMap("OperateRuleResult")
    public DeactiveAggregateConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The error code returned.</p>
     * <br>
     * <p>*   If the rule is disabled, no error code is returned.</p>
     * <p>*   If the rule fails to be disabled, an error code is returned. For more information about error codes, visit the [API Error Center](https://error-center.alibabacloud.com/status/product/Config).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeactiveAggregateConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeactiveAggregateConfigRulesResponseBody self = new DeactiveAggregateConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeactiveAggregateConfigRulesResponseBody setOperateRuleResult(DeactiveAggregateConfigRulesResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public DeactiveAggregateConfigRulesResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public DeactiveAggregateConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeactiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Success")
        public Boolean success;

        public static DeactiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            DeactiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList self = new DeactiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public DeactiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DeactiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeactiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeactiveAggregateConfigRulesResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<DeactiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static DeactiveAggregateConfigRulesResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            DeactiveAggregateConfigRulesResponseBodyOperateRuleResult self = new DeactiveAggregateConfigRulesResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public DeactiveAggregateConfigRulesResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<DeactiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<DeactiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
