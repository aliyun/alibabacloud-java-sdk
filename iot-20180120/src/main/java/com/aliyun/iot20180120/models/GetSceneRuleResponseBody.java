// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSceneRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSceneRuleResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSceneRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSceneRuleResponseBody self = new GetSceneRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSceneRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSceneRuleResponseBody setData(GetSceneRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSceneRuleResponseBodyData getData() {
        return this.data;
    }

    public GetSceneRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSceneRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSceneRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSceneRuleResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("RuleContent")
        public String ruleContent;

        @NameInMap("RuleDescription")
        public String ruleDescription;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleStatus")
        public Integer ruleStatus;

        public static GetSceneRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSceneRuleResponseBodyData self = new GetSceneRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSceneRuleResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSceneRuleResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetSceneRuleResponseBodyData setRuleContent(String ruleContent) {
            this.ruleContent = ruleContent;
            return this;
        }
        public String getRuleContent() {
            return this.ruleContent;
        }

        public GetSceneRuleResponseBodyData setRuleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            return this;
        }
        public String getRuleDescription() {
            return this.ruleDescription;
        }

        public GetSceneRuleResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetSceneRuleResponseBodyData setRuleStatus(Integer ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public Integer getRuleStatus() {
            return this.ruleStatus;
        }

    }

}
