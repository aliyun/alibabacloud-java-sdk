// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListInterveneRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListInterveneRulesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListInterveneRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterveneRulesResponseBody self = new ListInterveneRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterveneRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInterveneRulesResponseBody setData(ListInterveneRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInterveneRulesResponseBodyData getData() {
        return this.data;
    }

    public ListInterveneRulesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInterveneRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInterveneRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInterveneRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInterveneRulesResponseBodyDataInterveneRuleListAnswerConfig extends TeaModel {
        @NameInMap("AnswerType")
        public Integer answerType;

        @NameInMap("Message")
        public String message;

        @NameInMap("Namespace")
        public String namespace;

        public static ListInterveneRulesResponseBodyDataInterveneRuleListAnswerConfig build(java.util.Map<String, ?> map) throws Exception {
            ListInterveneRulesResponseBodyDataInterveneRuleListAnswerConfig self = new ListInterveneRulesResponseBodyDataInterveneRuleListAnswerConfig();
            return TeaModel.build(map, self);
        }

        public ListInterveneRulesResponseBodyDataInterveneRuleListAnswerConfig setAnswerType(Integer answerType) {
            this.answerType = answerType;
            return this;
        }
        public Integer getAnswerType() {
            return this.answerType;
        }

        public ListInterveneRulesResponseBodyDataInterveneRuleListAnswerConfig setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListInterveneRulesResponseBodyDataInterveneRuleListAnswerConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

    public static class ListInterveneRulesResponseBodyDataInterveneRuleList extends TeaModel {
        @NameInMap("AnswerConfig")
        public java.util.List<ListInterveneRulesResponseBodyDataInterveneRuleListAnswerConfig> answerConfig;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EffectTime")
        public String effectTime;

        @NameInMap("InterveneType")
        public Integer interveneType;

        @NameInMap("NamespaceList")
        public java.util.List<String> namespaceList;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("RuleName")
        public String ruleName;

        public static ListInterveneRulesResponseBodyDataInterveneRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListInterveneRulesResponseBodyDataInterveneRuleList self = new ListInterveneRulesResponseBodyDataInterveneRuleList();
            return TeaModel.build(map, self);
        }

        public ListInterveneRulesResponseBodyDataInterveneRuleList setAnswerConfig(java.util.List<ListInterveneRulesResponseBodyDataInterveneRuleListAnswerConfig> answerConfig) {
            this.answerConfig = answerConfig;
            return this;
        }
        public java.util.List<ListInterveneRulesResponseBodyDataInterveneRuleListAnswerConfig> getAnswerConfig() {
            return this.answerConfig;
        }

        public ListInterveneRulesResponseBodyDataInterveneRuleList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInterveneRulesResponseBodyDataInterveneRuleList setEffectTime(String effectTime) {
            this.effectTime = effectTime;
            return this;
        }
        public String getEffectTime() {
            return this.effectTime;
        }

        public ListInterveneRulesResponseBodyDataInterveneRuleList setInterveneType(Integer interveneType) {
            this.interveneType = interveneType;
            return this;
        }
        public Integer getInterveneType() {
            return this.interveneType;
        }

        public ListInterveneRulesResponseBodyDataInterveneRuleList setNamespaceList(java.util.List<String> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }
        public java.util.List<String> getNamespaceList() {
            return this.namespaceList;
        }

        public ListInterveneRulesResponseBodyDataInterveneRuleList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public ListInterveneRulesResponseBodyDataInterveneRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class ListInterveneRulesResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("InterveneRuleList")
        public java.util.List<ListInterveneRulesResponseBodyDataInterveneRuleList> interveneRuleList;

        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListInterveneRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInterveneRulesResponseBodyData self = new ListInterveneRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInterveneRulesResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListInterveneRulesResponseBodyData setInterveneRuleList(java.util.List<ListInterveneRulesResponseBodyDataInterveneRuleList> interveneRuleList) {
            this.interveneRuleList = interveneRuleList;
            return this;
        }
        public java.util.List<ListInterveneRulesResponseBodyDataInterveneRuleList> getInterveneRuleList() {
            return this.interveneRuleList;
        }

        public ListInterveneRulesResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListInterveneRulesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
