// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSceneRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public GetSceneRuleResponseData data;

    public static GetSceneRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSceneRuleResponse self = new GetSceneRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetSceneRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSceneRuleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSceneRuleResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSceneRuleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSceneRuleResponse setData(GetSceneRuleResponseData data) {
        this.data = data;
        return this;
    }
    public GetSceneRuleResponseData getData() {
        return this.data;
    }

    public static class GetSceneRuleResponseData extends TeaModel {
        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("RuleName")
        @Validation(required = true)
        public String ruleName;

        @NameInMap("RuleContent")
        @Validation(required = true)
        public String ruleContent;

        @NameInMap("RuleDescription")
        @Validation(required = true)
        public String ruleDescription;

        @NameInMap("RuleStatus")
        @Validation(required = true)
        public Integer ruleStatus;

        public static GetSceneRuleResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetSceneRuleResponseData self = new GetSceneRuleResponseData();
            return TeaModel.build(map, self);
        }

        public GetSceneRuleResponseData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSceneRuleResponseData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetSceneRuleResponseData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetSceneRuleResponseData setRuleContent(String ruleContent) {
            this.ruleContent = ruleContent;
            return this;
        }
        public String getRuleContent() {
            return this.ruleContent;
        }

        public GetSceneRuleResponseData setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public GetSceneRuleResponseData setRuleStatus(Integer ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public Integer getRuleStatus() {
            return this.ruleStatus;
        }

    }

}
