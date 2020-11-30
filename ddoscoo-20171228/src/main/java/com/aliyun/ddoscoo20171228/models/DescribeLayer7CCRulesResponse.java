// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer7CCRulesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("Layer7CCRules")
    @Validation(required = true)
    public java.util.List<DescribeLayer7CCRulesResponseLayer7CCRules> layer7CCRules;

    public static DescribeLayer7CCRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer7CCRulesResponse self = new DescribeLayer7CCRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLayer7CCRulesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLayer7CCRulesResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeLayer7CCRulesResponse setLayer7CCRules(java.util.List<DescribeLayer7CCRulesResponseLayer7CCRules> layer7CCRules) {
        this.layer7CCRules = layer7CCRules;
        return this;
    }
    public java.util.List<DescribeLayer7CCRulesResponseLayer7CCRules> getLayer7CCRules() {
        return this.layer7CCRules;
    }

    public static class DescribeLayer7CCRulesResponseLayer7CCRules extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Act")
        @Validation(required = true)
        public String act;

        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("Interval")
        @Validation(required = true)
        public Integer interval;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        @NameInMap("Ttl")
        @Validation(required = true)
        public Integer ttl;

        @NameInMap("Uri")
        @Validation(required = true)
        public String uri;

        public static DescribeLayer7CCRulesResponseLayer7CCRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer7CCRulesResponseLayer7CCRules self = new DescribeLayer7CCRulesResponseLayer7CCRules();
            return TeaModel.build(map, self);
        }

        public DescribeLayer7CCRulesResponseLayer7CCRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLayer7CCRulesResponseLayer7CCRules setAct(String act) {
            this.act = act;
            return this;
        }
        public String getAct() {
            return this.act;
        }

        public DescribeLayer7CCRulesResponseLayer7CCRules setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeLayer7CCRulesResponseLayer7CCRules setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeLayer7CCRulesResponseLayer7CCRules setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribeLayer7CCRulesResponseLayer7CCRules setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public DescribeLayer7CCRulesResponseLayer7CCRules setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

}
