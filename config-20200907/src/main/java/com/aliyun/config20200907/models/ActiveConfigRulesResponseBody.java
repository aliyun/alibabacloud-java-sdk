// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ActiveConfigRulesResponseBody extends TeaModel {
    /**
     * <p>The returned results.</p>
     */
    @NameInMap("OperateRuleResult")
    public ActiveConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>61C1A88F-D163-40DF-84A6-F200229F37B2</p>
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
         * 
         * <strong>example:</strong>
         * <p>cr-2da35180a8d1008e****</p>
         */
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        /**
         * <p>The error code.</p>
         * <ul>
         * <li>If the rule is enabled, no error code is returned.</li>
         * <li>If the rule fails to be enabled, an error code is returned. For more information about error codes, see <a href="https://next.api.aliyun.com/document/Config/2020-09-07/errorCode">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ConfigRuleStatusNotInActive</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the rule is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The returned results.</p>
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
