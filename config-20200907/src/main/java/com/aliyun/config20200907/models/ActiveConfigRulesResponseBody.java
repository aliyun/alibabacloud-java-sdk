// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ActiveConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The result information about the operation.</p>
     */
    @NameInMap("OperateRuleResult")
    public ActiveConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ActiveConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveConfigRulesResponseBody self = new ActiveConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveConfigRulesResponseBody setOperateRuleResult(ActiveConfigRulesResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public ActiveConfigRulesResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public ActiveConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        /**
         * <p>The rule ID.</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code returned if the request failed.</p>
         * <br>
         * <p>*   If the rule is enabled, no error code is returned.</p>
         * <p>*   If the rule fails to be enabled, an error code is returned. For more information about error codes, see [Error codes](https://next.api.aliyun.com/document/Config/2020-09-07/errorCode).</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the rule is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList self = new ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ActiveConfigRulesResponseBodyOperateRuleResult extends TeaModel {
        /**
         * <p>The result information about the operation.</p>
         */
        @NameInMap("OperateRuleItemList")
        public java.util.List<ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static ActiveConfigRulesResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            ActiveConfigRulesResponseBodyOperateRuleResult self = new ActiveConfigRulesResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public ActiveConfigRulesResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
