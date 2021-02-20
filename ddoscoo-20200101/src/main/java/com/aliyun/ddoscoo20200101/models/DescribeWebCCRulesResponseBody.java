// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebCCRulesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WebCCRules")
    public java.util.List<DescribeWebCCRulesResponseBodyWebCCRules> webCCRules;

    public static DescribeWebCCRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCCRulesResponseBody self = new DescribeWebCCRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebCCRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeWebCCRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebCCRulesResponseBody setWebCCRules(java.util.List<DescribeWebCCRulesResponseBodyWebCCRules> webCCRules) {
        this.webCCRules = webCCRules;
        return this;
    }
    public java.util.List<DescribeWebCCRulesResponseBodyWebCCRules> getWebCCRules() {
        return this.webCCRules;
    }

    public static class DescribeWebCCRulesResponseBodyWebCCRules extends TeaModel {
        @NameInMap("Ttl")
        public Integer ttl;

        @NameInMap("Act")
        public String act;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Uri")
        public String uri;

        @NameInMap("Count")
        public Integer count;

        public static DescribeWebCCRulesResponseBodyWebCCRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebCCRulesResponseBodyWebCCRules self = new DescribeWebCCRulesResponseBodyWebCCRules();
            return TeaModel.build(map, self);
        }

        public DescribeWebCCRulesResponseBodyWebCCRules setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeWebCCRulesResponseBodyWebCCRules setAct(String act) {
            this.act = act;
            return this;
        }
        public String getAct() {
            return this.act;
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

        public DescribeWebCCRulesResponseBodyWebCCRules setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public DescribeWebCCRulesResponseBodyWebCCRules setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
