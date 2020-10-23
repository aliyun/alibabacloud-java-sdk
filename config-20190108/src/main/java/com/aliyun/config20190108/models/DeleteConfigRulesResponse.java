// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DeleteConfigRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("OperateRuleResult")
    @Validation(required = true)
    public DeleteConfigRulesResponseOperateRuleResult operateRuleResult;

    public static DeleteConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigRulesResponse self = new DeleteConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigRulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteConfigRulesResponse setOperateRuleResult(DeleteConfigRulesResponseOperateRuleResult operateRuleResult) {
        this.operateRuleResult = operateRuleResult;
        return this;
    }
    public DeleteConfigRulesResponseOperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    public static class DeleteConfigRulesResponseOperateRuleResultOperateRuleItemList extends TeaModel {
        @NameInMap("ConfigRuleId")
        @Validation(required = true)
        public String configRuleId;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        public static DeleteConfigRulesResponseOperateRuleResultOperateRuleItemList build(java.util.Map<String, ?> map) throws Exception {
            DeleteConfigRulesResponseOperateRuleResultOperateRuleItemList self = new DeleteConfigRulesResponseOperateRuleResultOperateRuleItemList();
            return TeaModel.build(map, self);
        }

        public DeleteConfigRulesResponseOperateRuleResultOperateRuleItemList setConfigRuleId(String configRuleId) {
            this.configRuleId = configRuleId;
            return this;
        }
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        public DeleteConfigRulesResponseOperateRuleResultOperateRuleItemList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteConfigRulesResponseOperateRuleResultOperateRuleItemList setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteConfigRulesResponseOperateRuleResult extends TeaModel {
        @NameInMap("OperateRuleItemList")
        @Validation(required = true)
        public java.util.List<DeleteConfigRulesResponseOperateRuleResultOperateRuleItemList> operateRuleItemList;

        public static DeleteConfigRulesResponseOperateRuleResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteConfigRulesResponseOperateRuleResult self = new DeleteConfigRulesResponseOperateRuleResult();
            return TeaModel.build(map, self);
        }

        public DeleteConfigRulesResponseOperateRuleResult setOperateRuleItemList(java.util.List<DeleteConfigRulesResponseOperateRuleResultOperateRuleItemList> operateRuleItemList) {
            this.operateRuleItemList = operateRuleItemList;
            return this;
        }
        public java.util.List<DeleteConfigRulesResponseOperateRuleResultOperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

    }

}
