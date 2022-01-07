// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleActionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleActionList")
    public ListRuleActionsResponseBodyRuleActionList ruleActionList;

    @NameInMap("Success")
    public Boolean success;

    public static ListRuleActionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuleActionsResponseBody self = new ListRuleActionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRuleActionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRuleActionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRuleActionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuleActionsResponseBody setRuleActionList(ListRuleActionsResponseBodyRuleActionList ruleActionList) {
        this.ruleActionList = ruleActionList;
        return this;
    }
    public ListRuleActionsResponseBodyRuleActionList getRuleActionList() {
        return this.ruleActionList;
    }

    public ListRuleActionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRuleActionsResponseBodyRuleActionListRuleActionInfo extends TeaModel {
        @NameInMap("Configuration")
        public String configuration;

        @NameInMap("ErrorActionFlag")
        public Boolean errorActionFlag;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Type")
        public String type;

        public static ListRuleActionsResponseBodyRuleActionListRuleActionInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRuleActionsResponseBodyRuleActionListRuleActionInfo self = new ListRuleActionsResponseBodyRuleActionListRuleActionInfo();
            return TeaModel.build(map, self);
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setErrorActionFlag(Boolean errorActionFlag) {
            this.errorActionFlag = errorActionFlag;
            return this;
        }
        public Boolean getErrorActionFlag() {
            return this.errorActionFlag;
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListRuleActionsResponseBodyRuleActionListRuleActionInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListRuleActionsResponseBodyRuleActionList extends TeaModel {
        @NameInMap("RuleActionInfo")
        public java.util.List<ListRuleActionsResponseBodyRuleActionListRuleActionInfo> ruleActionInfo;

        public static ListRuleActionsResponseBodyRuleActionList build(java.util.Map<String, ?> map) throws Exception {
            ListRuleActionsResponseBodyRuleActionList self = new ListRuleActionsResponseBodyRuleActionList();
            return TeaModel.build(map, self);
        }

        public ListRuleActionsResponseBodyRuleActionList setRuleActionInfo(java.util.List<ListRuleActionsResponseBodyRuleActionListRuleActionInfo> ruleActionInfo) {
            this.ruleActionInfo = ruleActionInfo;
            return this;
        }
        public java.util.List<ListRuleActionsResponseBodyRuleActionListRuleActionInfo> getRuleActionInfo() {
            return this.ruleActionInfo;
        }

    }

}
