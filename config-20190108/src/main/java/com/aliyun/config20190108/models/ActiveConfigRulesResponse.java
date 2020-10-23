// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class ActiveConfigRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OperateRuleResult")
    @Validation(required = true)
    public ActiveConfigRulesResponseOperateRuleResult operateRuleResult;

    public static ActiveConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveConfigRulesResponse self = new ActiveConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public ActiveConfigRulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActiveConfigRulesResponse setOperateRuleResult(ActiveConfigRulesResponseOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public ActiveConfigRulesResponseOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public static class ActiveConfigRulesResponseOperateRuleResultOperateRuleItemList extends TeaModel {
        @NameInMap("ConfigRuleId")
        @Validation(required = true)
        public String configRuleId;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static ActiveConfigRulesResponseOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            ActiveConfigRulesResponseOperateRuleResultOperateRuleItemList self = new ActiveConfigRulesResponseOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public ActiveConfigRulesResponseOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public ActiveConfigRulesResponseOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ActiveConfigRulesResponseOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ActiveConfigRulesResponseOperateRuleResult extends TeaModel {
        @NameInMap("OperateRuleItemList")
        @Validation(required = true)
        public java.util.List<ActiveConfigRulesResponseOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static ActiveConfigRulesResponseOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            ActiveConfigRulesResponseOperateRuleResult self = new ActiveConfigRulesResponseOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public ActiveConfigRulesResponseOperateRuleResult setOperateRuleItemList(java.util.List<ActiveConfigRulesResponseOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<ActiveConfigRulesResponseOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
