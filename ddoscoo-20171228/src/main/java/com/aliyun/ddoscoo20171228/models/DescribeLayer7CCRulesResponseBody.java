// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer7CCRulesResponseBody extends TeaModel {
    @NameInMap("Layer7CCRules")
    public java.util.List<DescribeLayer7CCRulesResponseBodyLayer7CCRules> layer7CCRules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Long total;

    public static DescribeLayer7CCRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer7CCRulesResponseBody self = new DescribeLayer7CCRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLayer7CCRulesResponseBody setLayer7CCRules(java.util.List<DescribeLayer7CCRulesResponseBodyLayer7CCRules> layer7CCRules) {
        this.layer7CCRules = layer7CCRules;
        return this;
    }
    public java.util.List<DescribeLayer7CCRulesResponseBodyLayer7CCRules> getLayer7CCRules() {
        return this.layer7CCRules;
    }

    public DescribeLayer7CCRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLayer7CCRulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeLayer7CCRulesResponseBodyLayer7CCRules extends TeaModel {
        @NameInMap("Act")
        public String act;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("Name")
        public String name;

        @NameInMap("Ttl")
        public Integer ttl;

        @NameInMap("Uri")
        public String uri;

        public static DescribeLayer7CCRulesResponseBodyLayer7CCRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer7CCRulesResponseBodyLayer7CCRules self = new DescribeLayer7CCRulesResponseBodyLayer7CCRules();
            return TeaModel.build(map, self);
        }

        public DescribeLayer7CCRulesResponseBodyLayer7CCRules setAct(String act) {
            this.act = act;
            return this;
        }
        public String getAct() {
            return this.act;
        }

        public DescribeLayer7CCRulesResponseBodyLayer7CCRules setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeLayer7CCRulesResponseBodyLayer7CCRules setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeLayer7CCRulesResponseBodyLayer7CCRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeLayer7CCRulesResponseBodyLayer7CCRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLayer7CCRulesResponseBodyLayer7CCRules setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeLayer7CCRulesResponseBodyLayer7CCRules setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
