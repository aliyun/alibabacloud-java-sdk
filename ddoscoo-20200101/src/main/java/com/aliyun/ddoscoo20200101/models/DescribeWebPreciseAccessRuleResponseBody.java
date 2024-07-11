// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebPreciseAccessRuleResponseBody extends TeaModel {
    /**
     * <p>The configuration of the accurate access control rule that is created for the website.</p>
     */
    @NameInMap("PreciseAccessConfigList")
    public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigList> preciseAccessConfigList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>209EEFBF-B0C7-441E-8C28-D0945A57A638</p>
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
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentList")
        public java.util.List<String> contentList;

        /**
         * <p>The match field.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The custom HTTP request header.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>Field</strong> is set to <strong>header</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>The logical operator.</p>
         * 
         * <strong>example:</strong>
         * <p>belong</p>
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

        public DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList setContentList(java.util.List<String> contentList) {
            this.contentList = contentList;
            return this;
        }
        public java.util.List<String> getContentList() {
            return this.contentList;
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
         * <ul>
         * <li><strong>accept</strong>: The requests that match the rule are allowed.</li>
         * <li><strong>block</strong>: The requests that match the rule are blocked.</li>
         * <li><strong>challenge</strong>: Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification for the requests that match the rule is implemented.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The match conditions.</p>
         */
        @NameInMap("ConditionList")
        public java.util.List<DescribeWebPreciseAccessRuleResponseBodyPreciseAccessConfigListRuleListConditionList> conditionList;

        /**
         * <p>The validity period of the rule. Unit: seconds. This parameter takes effect only when <strong>action</strong> of a rule is <strong>block</strong>. Access requests that match the rule are blocked within the specified validity period of the rule. The value <strong>0</strong> indicates that the whitelist takes effect all the time.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Expires")
        public Long expires;

        /**
         * <p>The name of the scheduling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>testrule</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The source of the rule. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong> (default): manually created.</li>
         * <li><strong>auto</strong>: automatically generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
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
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The scheduling rules.</p>
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
