// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebPreciseAccessRuleResponseBody extends TeaModel {
    /**
     * <p>An array consisting of the configuration of the accurate access control rule that is created for the website.</p>
     */
    @NameInMap("PreciseAccessConfigList")
    public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList> preciseAccessConfigList;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The match content.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The match field.</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The custom HTTP header.</p>
         * <br>
         * <p>> This parameter takes effect only when **Field** is set to **header**.</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The logical operator.</p>
         */
        @NameInMap("MatchMethod")
        public String matchMethod;

        public static DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList self = new DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList();
            return TeaModel.build(map, self);
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList setMatchMethod(String matchMethod) {
            this.matchMethod = matchMethod;
            return this;
        }
        public String getMatchMethod() {
            return this.matchMethod;
        }

    }

    public static class DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList extends TeaModel {
        /**
         * <p>The action triggered if the rule is matched. Valid values:</p>
         * <br>
         * <p>*   **accept**: allows the requests that match the rule.</p>
         * <p>*   **block**: blocks the requests that match the rule.</p>
         * <p>*   **challenge**: implements Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification for the requests that match the rule.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The match conditions.</p>
         */
        @NameInMap("ConditionList")
        public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList> conditionList;

        /**
         * <p>The validity period of the rule. Unit: seconds. This parameter takes effect only when **action** of a rule is **block**. Access requests that match the rule are blocked within the specified validity period of the rule. **0** indicates that the rule takes effect all the time.</p>
         */
        @NameInMap("Expires")
        public Long expires;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The source of the rule. Valid values:</p>
         * <br>
         * <p>*   **manual**: manually created. This is the default value.</p>
         * <p>*   **auto**: automatically generated.</p>
         */
        @NameInMap("Owner")
        public String owner;

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

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList setConditionList(java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList> conditionList) {
            this.conditionList = conditionList;
            return this;
        }
        public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList> getConditionList() {
            return this.conditionList;
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

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

    }

    public static class DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList extends TeaModel {
        /**
         * <p>The domain name of the website.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>An array that consists of the rules.</p>
         */
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
