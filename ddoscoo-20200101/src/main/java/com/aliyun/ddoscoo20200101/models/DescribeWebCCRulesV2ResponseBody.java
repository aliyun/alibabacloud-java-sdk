// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCCRulesV2ResponseBody extends TeaModel {
    /**
     * <p>The domain name of the website.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned custom frequency control rules.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The custom frequency control rules.</p>
     */
    @NameInMap("WebCCRules")
    public java.util.List<DescribeWebCCRulesV2ResponseBodyWebCCRules> webCCRules;

    public static DescribeWebCCRulesV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCCRulesV2ResponseBody self = new DescribeWebCCRulesV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebCCRulesV2ResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeWebCCRulesV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebCCRulesV2ResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebCCRulesV2ResponseBody setWebCCRules(java.util.List<DescribeWebCCRulesV2ResponseBodyWebCCRules> webCCRules) {
        this.webCCRules = webCCRules;
        return this;
    }
    public java.util.List<DescribeWebCCRulesV2ResponseBodyWebCCRules> getWebCCRules() {
        return this.webCCRules;
    }

    public static class DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition extends TeaModel {
        /**
         * <p>The match content.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("Content")
        public String content;

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
         * <p>The match method.</p>
         * 
         * <strong>example:</strong>
         * <p>belong</p>
         */
        @NameInMap("MatchMethod")
        public String matchMethod;

        public static DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition self = new DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition();
            return TeaModel.build(map, self);
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition setMatchMethod(String matchMethod) {
            this.matchMethod = matchMethod;
            return this;
        }
        public String getMatchMethod() {
            return this.matchMethod;
        }

    }

    public static class DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit extends TeaModel {
        /**
         * <p>The statistical period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The name of the field. This parameter is required only when the Target parameter is set to header.</p>
         * 
         * <strong>example:</strong>
         * <p>action</p>
         */
        @NameInMap("SubKey")
        public String subKey;

        /**
         * <p>The statistical method. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong></li>
         * <li><strong>header</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The trigger threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        /**
         * <p>The blocking duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit self = new DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit();
            return TeaModel.build(map, self);
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit setSubKey(String subKey) {
            this.subKey = subKey;
            return this;
        }
        public String getSubKey() {
            return this.subKey;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit setThreshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }
        public Integer getThreshold() {
            return this.threshold;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

    public static class DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics extends TeaModel {
        /**
         * <p>The statistical method. Valid values:</p>
         * <ul>
         * <li><strong>ip</strong></li>
         * <li><strong>header</strong></li>
         * <li><strong>uri</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uri</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The name of the header. This parameter is required only when the Field parameter is set to header.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
         * <p>Indicates whether the system collects statistics after deduplication. Valid values:</p>
         * <ul>
         * <li><strong>count</strong>: The system collects statistics before deduplication.</li>
         * <li><strong>distinct</strong>: The system collects statistics after deduplication.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>count</p>
         */
        @NameInMap("Mode")
        public String mode;

        public static DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics self = new DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics();
            return TeaModel.build(map, self);
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode extends TeaModel {
        /**
         * <p>The status code. Valid values: <strong>100</strong> to <strong>599</strong>.</p>
         * <ul>
         * <li><strong>200</strong>: The request was successful.</li>
         * <li>Other codes: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>If a ratio is not used, the handling action is triggered only when the number of requests of the corresponding status code reaches the value of <strong>CountThreshold</strong>. Valid values: <strong>2</strong> to <strong>50000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CountThreshold")
        public Integer countThreshold;

        /**
         * <p>Indicates whether the status code is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>If a ratio is used, the handling action is triggered only when the number of requests of the corresponding status code reaches the value of <strong>RatioThreshold</strong>. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RatioThreshold")
        public Integer ratioThreshold;

        /**
         * <p>Indicates whether to use a ratio.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseRatio")
        public Boolean useRatio;

        public static DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode self = new DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode();
            return TeaModel.build(map, self);
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode setCountThreshold(Integer countThreshold) {
            this.countThreshold = countThreshold;
            return this;
        }
        public Integer getCountThreshold() {
            return this.countThreshold;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode setRatioThreshold(Integer ratioThreshold) {
            this.ratioThreshold = ratioThreshold;
            return this;
        }
        public Integer getRatioThreshold() {
            return this.ratioThreshold;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode setUseRatio(Boolean useRatio) {
            this.useRatio = useRatio;
            return this;
        }
        public Boolean getUseRatio() {
            return this.useRatio;
        }

    }

    public static class DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail extends TeaModel {
        /**
         * <p>The action triggered if the rule is matched. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: The requests that match the rule are allowed.</li>
         * <li><strong>block</strong>: The requests that match the rule are blocked.</li>
         * <li><strong>challenge</strong>: Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification for the requests that match the rule is implemented.</li>
         * <li><strong>watch</strong>: The requests that match the rule are recorded in logs and allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The match conditions.</p>
         */
        @NameInMap("Condition")
        public java.util.List<DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition> condition;

        /**
         * <p>The parameter is deprecated.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The parameter is deprecated.</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ccauto14</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The frequency statistics.</p>
         */
        @NameInMap("RateLimit")
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit rateLimit;

        /**
         * <p>The statistics after deduplication. By default, the system collects statistics before deduplication.</p>
         */
        @NameInMap("Statistics")
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics statistics;

        /**
         * <p>The status codes.</p>
         */
        @NameInMap("StatusCode")
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode statusCode;

        /**
         * <p>The parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>/p3shijihao</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail self = new DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail();
            return TeaModel.build(map, self);
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setCondition(java.util.List<DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition> condition) {
            this.condition = condition;
            return this;
        }
        public java.util.List<DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition> getCondition() {
            return this.condition;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setRateLimit(DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit getRateLimit() {
            return this.rateLimit;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setStatistics(DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics statistics) {
            this.statistics = statistics;
            return this;
        }
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics getStatistics() {
            return this.statistics;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setStatusCode(DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode getStatusCode() {
            return this.statusCode;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DescribeWebCCRulesV2ResponseBodyWebCCRules extends TeaModel {
        /**
         * <p>The validity period of the rule. Unit: seconds. If the Action parameter is set to block, the system blocks the requests that match the rule within the validity period of the rule. The value 0 indicates that the rule is permanently valid.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Expires")
        public Long expires;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>wq</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The method used to create the rule. Valid values:</p>
         * <ul>
         * <li><strong>manual</strong> (default): manually created.</li>
         * <li><strong>clover</strong>: automatically created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The details of the rule.</p>
         */
        @NameInMap("RuleDetail")
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail ruleDetail;

        public static DescribeWebCCRulesV2ResponseBodyWebCCRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCCRulesV2ResponseBodyWebCCRules self = new DescribeWebCCRulesV2ResponseBodyWebCCRules();
            return TeaModel.build(map, self);
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRules setExpires(Long expires) {
            this.expires = expires;
            return this;
        }
        public Long getExpires() {
            return this.expires;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRules setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeWebCCRulesV2ResponseBodyWebCCRules setRuleDetail(DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail ruleDetail) {
            this.ruleDetail = ruleDetail;
            return this;
        }
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetail getRuleDetail() {
            return this.ruleDetail;
        }

    }

}
