// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StopConfigRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OperateRuleResult")
    public StopConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    public static StopConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopConfigRulesResponseBody self = new StopConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public StopConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopConfigRulesResponseBody setOperateRuleResult(StopConfigRulesResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public StopConfigRulesResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public static class StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("ConfigRuleId")
        public String configRuleId;

        public static StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList self = new StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

    }

    public static class StopConfigRulesResponseBodyOperateRuleResult extends TeaModel {
        @NameInMap("OperateRuleItemList")
        public java.util.List<StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static StopConfigRulesResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            StopConfigRulesResponseBodyOperateRuleResult self = new StopConfigRulesResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public StopConfigRulesResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<StopConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
