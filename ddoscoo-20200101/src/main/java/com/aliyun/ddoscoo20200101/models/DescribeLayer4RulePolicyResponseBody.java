// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulePolicyResponseBody extends TeaModel {
    @NameInMap("BackendPort")
    public Integer backendPort;

    @NameInMap("BakMode")
    public String bakMode;

    @NameInMap("CurrentIndex")
    public Integer currentIndex;

    @NameInMap("ForwardProtocol")
    public String forwardProtocol;

    @NameInMap("FrontendPort")
    public Integer frontendPort;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PriRealServers")
    public java.util.List<DescribeLayer4RulePolicyResponseBodyPriRealServers> priRealServers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecRealServers")
    public java.util.List<DescribeLayer4RulePolicyResponseBodySecRealServers> secRealServers;

    public static DescribeLayer4RulePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RulePolicyResponseBody self = new DescribeLayer4RulePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RulePolicyResponseBody setBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }
    public Integer getBackendPort() {
        return this.backendPort;
    }

    public DescribeLayer4RulePolicyResponseBody setBakMode(String bakMode) {
        this.bakMode = bakMode;
        return this;
    }
    public String getBakMode() {
        return this.bakMode;
    }

    public DescribeLayer4RulePolicyResponseBody setCurrentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
        return this;
    }
    public Integer getCurrentIndex() {
        return this.currentIndex;
    }

    public DescribeLayer4RulePolicyResponseBody setForwardProtocol(String forwardProtocol) {
        this.forwardProtocol = forwardProtocol;
        return this;
    }
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    public DescribeLayer4RulePolicyResponseBody setFrontendPort(Integer frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    public DescribeLayer4RulePolicyResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeLayer4RulePolicyResponseBody setPriRealServers(java.util.List<DescribeLayer4RulePolicyResponseBodyPriRealServers> priRealServers) {
        this.priRealServers = priRealServers;
        return this;
    }
    public java.util.List<DescribeLayer4RulePolicyResponseBodyPriRealServers> getPriRealServers() {
        return this.priRealServers;
    }

    public DescribeLayer4RulePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLayer4RulePolicyResponseBody setSecRealServers(java.util.List<DescribeLayer4RulePolicyResponseBodySecRealServers> secRealServers) {
        this.secRealServers = secRealServers;
        return this;
    }
    public java.util.List<DescribeLayer4RulePolicyResponseBodySecRealServers> getSecRealServers() {
        return this.secRealServers;
    }

    public static class DescribeLayer4RulePolicyResponseBodyPriRealServers extends TeaModel {
        @NameInMap("CurrentIndex")
        public Integer currentIndex;

        @NameInMap("Eip")
        public String eip;

        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RealServer")
        public String realServer;

        public static DescribeLayer4RulePolicyResponseBodyPriRealServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RulePolicyResponseBodyPriRealServers self = new DescribeLayer4RulePolicyResponseBodyPriRealServers();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RulePolicyResponseBodyPriRealServers setCurrentIndex(Integer currentIndex) {
            this.currentIndex = currentIndex;
            return this;
        }
        public Integer getCurrentIndex() {
            return this.currentIndex;
        }

        public DescribeLayer4RulePolicyResponseBodyPriRealServers setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeLayer4RulePolicyResponseBodyPriRealServers setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeLayer4RulePolicyResponseBodyPriRealServers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLayer4RulePolicyResponseBodyPriRealServers setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLayer4RulePolicyResponseBodyPriRealServers setRealServer(String realServer) {
            this.realServer = realServer;
            return this;
        }
        public String getRealServer() {
            return this.realServer;
        }

    }

    public static class DescribeLayer4RulePolicyResponseBodySecRealServers extends TeaModel {
        @NameInMap("CurrentIndex")
        public Integer currentIndex;

        @NameInMap("Eip")
        public String eip;

        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RealServer")
        public String realServer;

        public static DescribeLayer4RulePolicyResponseBodySecRealServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RulePolicyResponseBodySecRealServers self = new DescribeLayer4RulePolicyResponseBodySecRealServers();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RulePolicyResponseBodySecRealServers setCurrentIndex(Integer currentIndex) {
            this.currentIndex = currentIndex;
            return this;
        }
        public Integer getCurrentIndex() {
            return this.currentIndex;
        }

        public DescribeLayer4RulePolicyResponseBodySecRealServers setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeLayer4RulePolicyResponseBodySecRealServers setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeLayer4RulePolicyResponseBodySecRealServers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLayer4RulePolicyResponseBodySecRealServers setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLayer4RulePolicyResponseBodySecRealServers setRealServer(String realServer) {
            this.realServer = realServer;
            return this;
        }
        public String getRealServer() {
            return this.realServer;
        }

    }

}
