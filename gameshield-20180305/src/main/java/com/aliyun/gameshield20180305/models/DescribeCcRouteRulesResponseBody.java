// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeCcRouteRulesResponseBody extends TeaModel {
    @NameInMap("RuleQueryResult")
    public DescribeCcRouteRulesResponseBodyRuleQueryResult ruleQueryResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    public static DescribeCcRouteRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCcRouteRulesResponseBody self = new DescribeCcRouteRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCcRouteRulesResponseBody setRuleQueryResult(DescribeCcRouteRulesResponseBodyRuleQueryResult ruleQueryResult) {
        this.ruleQueryResult = ruleQueryResult;
        return this;
    }
    public DescribeCcRouteRulesResponseBodyRuleQueryResult getRuleQueryResult() {
        return this.ruleQueryResult;
    }

    public DescribeCcRouteRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCcRouteRulesResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public static class DescribeCcRouteRulesResponseBodyRuleQueryResultRouteRules extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("Rservers")
        public java.util.List<String> rservers;

        @NameInMap("Id")
        public String id;

        public static DescribeCcRouteRulesResponseBodyRuleQueryResultRouteRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcRouteRulesResponseBodyRuleQueryResultRouteRules self = new DescribeCcRouteRulesResponseBodyRuleQueryResultRouteRules();
            return TeaModel.build(map, self);
        }

        public DescribeCcRouteRulesResponseBodyRuleQueryResultRouteRules setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeCcRouteRulesResponseBodyRuleQueryResultRouteRules setRservers(java.util.List<String> rservers) {
            this.rservers = rservers;
            return this;
        }
        public java.util.List<String> getRservers() {
            return this.rservers;
        }

        public DescribeCcRouteRulesResponseBodyRuleQueryResultRouteRules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeCcRouteRulesResponseBodyRuleQueryResult extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("RouteRules")
        public java.util.List<DescribeCcRouteRulesResponseBodyRuleQueryResultRouteRules> routeRules;

        @NameInMap("BizId")
        public String bizId;

        public static DescribeCcRouteRulesResponseBodyRuleQueryResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCcRouteRulesResponseBodyRuleQueryResult self = new DescribeCcRouteRulesResponseBodyRuleQueryResult();
            return TeaModel.build(map, self);
        }

        public DescribeCcRouteRulesResponseBodyRuleQueryResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeCcRouteRulesResponseBodyRuleQueryResult setRouteRules(java.util.List<DescribeCcRouteRulesResponseBodyRuleQueryResultRouteRules> routeRules) {
            this.routeRules = routeRules;
            return this;
        }
        public java.util.List<DescribeCcRouteRulesResponseBodyRuleQueryResultRouteRules> getRouteRules() {
            return this.routeRules;
        }

        public DescribeCcRouteRulesResponseBodyRuleQueryResult setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

}
