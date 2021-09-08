// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleActionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("RuleActionInfo")
    @Validation(required = true)
    public GetRuleActionResponseRuleActionInfo ruleActionInfo;

    public static GetRuleActionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleActionResponse self = new GetRuleActionResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleActionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleActionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetRuleActionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleActionResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRuleActionResponse setRuleActionInfo(GetRuleActionResponseRuleActionInfo ruleActionInfo) {
        this.ruleActionInfo = ruleActionInfo;
        return this;
    }
    public GetRuleActionResponseRuleActionInfo getRuleActionInfo() {
        return this.ruleActionInfo;
    }

    public static class GetRuleActionResponseRuleActionInfo extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("RuleId")
        @Validation(required = true)
        public Long ruleId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Configuration")
        @Validation(required = true)
        public String configuration;

        @NameInMap("ErrorActionFlag")
        @Validation(required = true)
        public Boolean errorActionFlag;

        public static GetRuleActionResponseRuleActionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleActionResponseRuleActionInfo self = new GetRuleActionResponseRuleActionInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleActionResponseRuleActionInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRuleActionResponseRuleActionInfo setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetRuleActionResponseRuleActionInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRuleActionResponseRuleActionInfo setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetRuleActionResponseRuleActionInfo setErrorActionFlag(Boolean errorActionFlag) {
            this.errorActionFlag = errorActionFlag;
            return this;
        }
        public Boolean getErrorActionFlag() {
            return this.errorActionFlag;
        }

    }

}
