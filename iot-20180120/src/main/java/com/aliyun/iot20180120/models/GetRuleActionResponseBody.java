// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleActionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RuleActionInfo")
    public GetRuleActionResponseBodyRuleActionInfo ruleActionInfo;

    public static GetRuleActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleActionResponseBody self = new GetRuleActionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetRuleActionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleActionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRuleActionResponseBody setRuleActionInfo(GetRuleActionResponseBodyRuleActionInfo ruleActionInfo) {
        this.ruleActionInfo = ruleActionInfo;
        return this;
    }
    public GetRuleActionResponseBodyRuleActionInfo getRuleActionInfo() {
        return this.ruleActionInfo;
    }

    public static class GetRuleActionResponseBodyRuleActionInfo extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("ErrorActionFlag")
        public Boolean errorActionFlag;

        public static GetRuleActionResponseBodyRuleActionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleActionResponseBodyRuleActionInfo self = new GetRuleActionResponseBodyRuleActionInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleActionResponseBodyRuleActionInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRuleActionResponseBodyRuleActionInfo setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetRuleActionResponseBodyRuleActionInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetRuleActionResponseBodyRuleActionInfo setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetRuleActionResponseBodyRuleActionInfo setErrorActionFlag(Boolean errorActionFlag) {
            this.errorActionFlag = errorActionFlag;
            return this;
        }
        public Boolean getErrorActionFlag() {
            return this.errorActionFlag;
        }

    }

}
