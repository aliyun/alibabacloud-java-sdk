// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCCRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EAED912D-909E-45F0-AF74-AC0CCDCAE314</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned custom frequency control rules.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>An array that consists of the details of the custom frequency control rule.</p>
     */
    @NameInMap("WebCCRules")
    public java.util.List<DescribeWebCCRulesResponseBodyWebCCRules> webCCRules;

    public static DescribeWebCCRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCCRulesResponseBody self = new DescribeWebCCRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebCCRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebCCRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebCCRulesResponseBody setWebCCRules(java.util.List<DescribeWebCCRulesResponseBodyWebCCRules> webCCRules) {
        this.webCCRules = webCCRules;
        return this;
    }
    public java.util.List<DescribeWebCCRulesResponseBodyWebCCRules> getWebCCRules() {
        return this.webCCRules;
    }

    public static class DescribeWebCCRulesResponseBodyWebCCRules extends TeaModel {
        /**
         * <p>The blocking type. Valid values:</p>
         * <ul>
         * <li><strong>close</strong>: blocks requests.</li>
         * <li><strong>captcha</strong>: enables Completely Automated Public Turing test to tell Computers and Humans Apart (CAPTCHA) verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>close</p>
         */
        @NameInMap("Act")
        public String act;

        /**
         * <p>The number of requests that are allowed from an individual IP address. Valid values: <strong>2</strong> to <strong>2000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The check intervals. Valid values: <strong>5</strong> to <strong>10800</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The match mode. Valid values:</p>
         * <ul>
         * <li><strong>prefix</strong>: prefix match</li>
         * <li><strong>match</strong>: exact match</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>prefix</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>wq</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The blocking duration. Valid values: <strong>1</strong> to <strong>1440</strong>. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The check path.</p>
         * 
         * <strong>example:</strong>
         * <p>/hello</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static DescribeWebCCRulesResponseBodyWebCCRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCCRulesResponseBodyWebCCRules self = new DescribeWebCCRulesResponseBodyWebCCRules();
            return TeaModel.build(map, self);
        }

        public DescribeWebCCRulesResponseBodyWebCCRules setAct(String act) {
            this.act = act;
            return this;
        }
        public String getAct() {
            return this.act;
        }

        public DescribeWebCCRulesResponseBodyWebCCRules setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeWebCCRulesResponseBodyWebCCRules setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeWebCCRulesResponseBodyWebCCRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeWebCCRulesResponseBodyWebCCRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWebCCRulesResponseBodyWebCCRules setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeWebCCRulesResponseBodyWebCCRules setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
