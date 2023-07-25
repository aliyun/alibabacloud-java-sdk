// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ActiveAggregateConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("OperateRuleResult")
    public ActiveAggregateConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ActiveAggregateConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveAggregateConfigRulesResponseBody self = new ActiveAggregateConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveAggregateConfigRulesResponseBody setOperateRuleResult(ActiveAggregateConfigRulesResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public ActiveAggregateConfigRulesResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public ActiveAggregateConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ActiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code returned.</p>
         * <br>
         * <p>*   If the rule is enabled, no error code is returned.</p>
         * <p>*   If the rule fails to be enabled, an error code is returned. For more information about error codes, see [Error codes](https://error-center.alibabacloud.com/status/product/Config).</p>
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

        public static ActiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            ActiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList self = new ActiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public ActiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ActiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ActiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ActiveAggregateConfigRulesResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>The returned result.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<ActiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static ActiveAggregateConfigRulesResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            ActiveAggregateConfigRulesResponseBodyOperateRuleResult self = new ActiveAggregateConfigRulesResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public ActiveAggregateConfigRulesResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<ActiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<ActiveAggregateConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
