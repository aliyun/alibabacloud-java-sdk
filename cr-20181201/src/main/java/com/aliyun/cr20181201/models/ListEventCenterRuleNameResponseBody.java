// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListEventCenterRuleNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleNames")
    public java.util.List<ListEventCenterRuleNameResponseBodyRuleNames> ruleNames;

    public static ListEventCenterRuleNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventCenterRuleNameResponseBody self = new ListEventCenterRuleNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventCenterRuleNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventCenterRuleNameResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListEventCenterRuleNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventCenterRuleNameResponseBody setRuleNames(java.util.List<ListEventCenterRuleNameResponseBodyRuleNames> ruleNames) {
        this.ruleNames = ruleNames;
        return this;
    }
    public java.util.List<ListEventCenterRuleNameResponseBodyRuleNames> getRuleNames() {
        return this.ruleNames;
    }

    public static class ListEventCenterRuleNameResponseBodyRuleNames extends TeaModel {
        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static ListEventCenterRuleNameResponseBodyRuleNames build(java.util.Map<String, ?> map) throws Exception {
            ListEventCenterRuleNameResponseBodyRuleNames self = new ListEventCenterRuleNameResponseBodyRuleNames();
            return TeaModel.build(map, self);
        }

        public ListEventCenterRuleNameResponseBodyRuleNames setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public ListEventCenterRuleNameResponseBodyRuleNames setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
