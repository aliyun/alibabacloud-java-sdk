// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ActiveConfigRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OperateRuleResult")
    public ActiveConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    public static ActiveConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveConfigRulesResponseBody self = new ActiveConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActiveConfigRulesResponseBody setOperateRuleResult(ActiveConfigRulesResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public ActiveConfigRulesResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public static class ActiveConfigRulesResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ErrorCode")
        public String errorCode;

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
