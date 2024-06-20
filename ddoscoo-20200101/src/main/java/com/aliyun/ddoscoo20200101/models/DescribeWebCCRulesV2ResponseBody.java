// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCCRulesV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

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
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
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
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>action</p>
         */
        @NameInMap("SubKey")
        public String subKey;

        /**
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Threshold")
        public Integer threshold;

        /**
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
         * <strong>example:</strong>
         * <p>uri</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("HeaderName")
        public String headerName;

        /**
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
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CountThreshold")
        public Integer countThreshold;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RatioThreshold")
        public Integer ratioThreshold;

        /**
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
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("Condition")
        public java.util.List<DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailCondition> condition;

        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>ccauto14</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RateLimit")
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailRateLimit rateLimit;

        @NameInMap("Statistics")
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatistics statistics;

        @NameInMap("StatusCode")
        public DescribeWebCCRulesV2ResponseBodyWebCCRulesRuleDetailStatusCode statusCode;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Expires")
        public Long expires;

        /**
         * <strong>example:</strong>
         * <p>wq</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("Owner")
        public String owner;

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
