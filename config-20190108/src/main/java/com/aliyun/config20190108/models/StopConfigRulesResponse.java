// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StopConfigRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OperateRuleResult")
    @Validation(required = true)
    public StopConfigRulesResponseOperateRuleResult operateRuleResult;

    public static StopConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopConfigRulesResponse self = new StopConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public StopConfigRulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopConfigRulesResponse setOperateRuleResult(StopConfigRulesResponseOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public StopConfigRulesResponseOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public static class StopConfigRulesResponseOperateRuleResultOperateRuleItemList extends TeaModel {
        @NameInMap("ConfigRuleId")
        @Validation(required = true)
        public String configRuleId;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static StopConfigRulesResponseOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            StopConfigRulesResponseOperateRuleResultOperateRuleItemList self = new StopConfigRulesResponseOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public StopConfigRulesResponseOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public StopConfigRulesResponseOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public StopConfigRulesResponseOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class StopConfigRulesResponseOperateRuleResult extends TeaModel {
        @NameInMap("OperateRuleItemList")
        @Validation(required = true)
        public java.util.List<StopConfigRulesResponseOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static StopConfigRulesResponseOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            StopConfigRulesResponseOperateRuleResult self = new StopConfigRulesResponseOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public StopConfigRulesResponseOperateRuleResult setOperateRuleItemList(java.util.List<StopConfigRulesResponseOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<StopConfigRulesResponseOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
