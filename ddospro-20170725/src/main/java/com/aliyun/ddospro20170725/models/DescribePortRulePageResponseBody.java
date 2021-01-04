// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribePortRulePageResponseBody extends TeaModel {
    @NameInMap("RuleList")
    public java.util.List<DescribePortRulePageResponseBodyRuleList> ruleList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Count")
    public Integer count;

    public static DescribePortRulePageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortRulePageResponseBody self = new DescribePortRulePageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortRulePageResponseBody setRuleList(java.util.List<DescribePortRulePageResponseBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public java.util.List<DescribePortRulePageResponseBodyRuleList> getRuleList() {
        return this.ruleList;
    }

    public DescribePortRulePageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortRulePageResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public static class DescribePortRulePageResponseBodyRuleList extends TeaModel {
        @NameInMap("BackProtocol")
        public String backProtocol;

        @NameInMap("BackPort")
        public Integer backPort;

        @NameInMap("LbId")
        public String lbId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("LvsType")
        public String lvsType;

        @NameInMap("RealServer")
        public String realServer;

        @NameInMap("FrontPort")
        public Integer frontPort;

        @NameInMap("FrontProtocol")
        public String frontProtocol;

        public static DescribePortRulePageResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribePortRulePageResponseBodyRuleList self = new DescribePortRulePageResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public DescribePortRulePageResponseBodyRuleList setBackProtocol(String backProtocol) {
            this.backProtocol = backProtocol;
            return this;
        }
        public String getBackProtocol() {
            return this.backProtocol;
        }

        public DescribePortRulePageResponseBodyRuleList setBackPort(Integer backPort) {
            this.backPort = backPort;
            return this;
        }
        public Integer getBackPort() {
            return this.backPort;
        }

        public DescribePortRulePageResponseBodyRuleList setLbId(String lbId) {
            this.lbId = lbId;
            return this;
        }
        public String getLbId() {
            return this.lbId;
        }

        public DescribePortRulePageResponseBodyRuleList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePortRulePageResponseBodyRuleList setLvsType(String lvsType) {
            this.lvsType = lvsType;
            return this;
        }
        public String getLvsType() {
            return this.lvsType;
        }

        public DescribePortRulePageResponseBodyRuleList setRealServer(String realServer) {
            this.realServer = realServer;
            return this;
        }
        public String getRealServer() {
            return this.realServer;
        }

        public DescribePortRulePageResponseBodyRuleList setFrontPort(Integer frontPort) {
            this.frontPort = frontPort;
            return this;
        }
        public Integer getFrontPort() {
            return this.frontPort;
        }

        public DescribePortRulePageResponseBodyRuleList setFrontProtocol(String frontProtocol) {
            this.frontProtocol = frontProtocol;
            return this;
        }
        public String getFrontProtocol() {
            return this.frontProtocol;
        }

    }

}
