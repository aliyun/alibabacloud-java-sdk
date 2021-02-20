// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebPreciseAccessRuleResponseBody extends TeaModel {
    @NameInMap("PreciseAccessConfigList")
    public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList> preciseAccessConfigList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWebPreciseAccessRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebPreciseAccessRuleResponseBody self = new DescribeWebPreciseAccessRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebPreciseAccessRuleResponseBody setPreciseAccessConfigList(java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList> preciseAccessConfigList) {
        this.preciseAccessConfigList = preciseAccessConfigList;
        return this;
    }
    public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList> getPreciseAccessConfigList() {
        return this.preciseAccessConfigList;
    }

    public DescribeWebPreciseAccessRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList extends TeaModel {
        @NameInMap("MatchMethod")
        public String matchMethod;

        @NameInMap("Field")
        public String field;

        @NameInMap("Content")
        public String content;

        @NameInMap("HeaderName")
        public String headerName;

        public static DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList self = new DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList();
            return TeaModel.build(map, self);
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList setMatchMethod(String matchMethod) {
            this.matchMethod = matchMethod;
            return this;
        }
        public String getMatchMethod() {
            return this.matchMethod;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

    }

    public static class DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Expires")
        public Long expires;

        @NameInMap("Name")
        public String name;

        @NameInMap("ConditionList")
        public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList> conditionList;

        public static DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList self = new DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList setExpires(Long expires) {
            this.expires = expires;
            return this;
        }
        public Long getExpires() {
            return this.expires;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList setConditionList(java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList> conditionList) {
            this.conditionList = conditionList;
            return this;
        }
        public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList> getConditionList() {
            return this.conditionList;
        }

    }

    public static class DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("RuleList")
        public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList> ruleList;

        public static DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList self = new DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList setRuleList(java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList> getRuleList() {
            return this.ruleList;
        }

    }

}
