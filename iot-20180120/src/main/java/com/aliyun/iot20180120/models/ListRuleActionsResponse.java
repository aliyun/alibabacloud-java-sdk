// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleActionsResponse extends TeaModel {
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

    @NameInMap("RuleActionList")
    @Validation(required = true)
    public ListRuleActionsResponseRuleActionList ruleActionList;

    public static ListRuleActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleActionsResponse self = new ListRuleActionsResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleActionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuleActionsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRuleActionsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRuleActionsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRuleActionsResponse setRuleActionList(ListRuleActionsResponseRuleActionList ruleActionList) {
        this.ruleActionList = ruleActionList;
        return this;
    }
    public ListRuleActionsResponseRuleActionList getRuleActionList() {
        return this.ruleActionList;
    }

    public static class ListRuleActionsResponseRuleActionListRuleActionInfo extends TeaModel {
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

        public static ListRuleActionsResponseRuleActionListRuleActionInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRuleActionsResponseRuleActionListRuleActionInfo self = new ListRuleActionsResponseRuleActionListRuleActionInfo();
            return TeaModel.build(map, self);
        }

        public ListRuleActionsResponseRuleActionListRuleActionInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRuleActionsResponseRuleActionListRuleActionInfo setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListRuleActionsResponseRuleActionListRuleActionInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRuleActionsResponseRuleActionListRuleActionInfo setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public ListRuleActionsResponseRuleActionListRuleActionInfo setErrorActionFlag(Boolean errorActionFlag) {
            this.errorActionFlag = errorActionFlag;
            return this;
        }
        public Boolean getErrorActionFlag() {
            return this.errorActionFlag;
        }

    }

    public static class ListRuleActionsResponseRuleActionList extends TeaModel {
        @NameInMap("RuleActionInfo")
        @Validation(required = true)
        public java.util.List<ListRuleActionsResponseRuleActionListRuleActionInfo> ruleActionInfo;

        public static ListRuleActionsResponseRuleActionList build(java.util.Map<String, ?> map) throws Exception {
            ListRuleActionsResponseRuleActionList self = new ListRuleActionsResponseRuleActionList();
            return TeaModel.build(map, self);
        }

        public ListRuleActionsResponseRuleActionList setRuleActionInfo(java.util.List<ListRuleActionsResponseRuleActionListRuleActionInfo> ruleActionInfo) {
            this.ruleActionInfo = ruleActionInfo;
            return this;
        }
        public java.util.List<ListRuleActionsResponseRuleActionListRuleActionInfo> getRuleActionInfo() {
            return this.ruleActionInfo;
        }

    }

}
