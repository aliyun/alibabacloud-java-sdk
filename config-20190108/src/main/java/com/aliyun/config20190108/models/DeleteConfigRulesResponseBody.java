// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DeleteConfigRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OperateRuleResult")
    public DeleteConfigRulesResponseBodyOperateRuleResult operateRuleResult;

    public static DeleteConfigRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigRulesResponseBody self = new DeleteConfigRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteConfigRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteConfigRulesResponseBody setOperateRuleResult(DeleteConfigRulesResponseBodyOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public DeleteConfigRulesResponseBodyOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public static class DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList extends TeaModel {
        @NameInMap("ConfigRuleId")
        public String configRuleId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList self = new DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteConfigRulesResponseBodyOperateRuleResult extends TeaModel {
        @NameInMap("OperateRuleItemList")
        public java.util.List<DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static DeleteConfigRulesResponseBodyOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteConfigRulesResponseBodyOperateRuleResult self = new DeleteConfigRulesResponseBodyOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public DeleteConfigRulesResponseBodyOperateRuleResult setOperateRuleItemList(java.util.List<DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<DeleteConfigRulesResponseBodyOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
