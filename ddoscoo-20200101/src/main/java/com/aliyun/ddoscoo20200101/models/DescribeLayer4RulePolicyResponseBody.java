// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulePolicyResponseBody extends TeaModel {
    /**
     * <p>The port of the origin server.</p>
     */
    @NameInMap("BackendPort")
    public Integer backendPort;

    /**
     * <p>The mode that is used to forward service traffic. Valid values:</p>
     * <br>
     * <p>*   0: the default mode. In this mode, Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the origin IP address that you specified when you created the port forwarding rule. You can call the [CreateNetworkRules](https://help.aliyun.com/document_detail/157482.html) operation to create a port forwarding rule.</p>
     * <p>*   1: the origin redundancy mode. In this mode, Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary or secondary origin servers. You can call the [ConfigLayer4RulePolicy](https://help.aliyun.com/document_detail/312684.html) operation to configure IP addresses.</p>
     */
    @NameInMap("BakMode")
    public String bakMode;

    /**
     * <p>The origin server that is used to receive service traffic. Valid values:</p>
     * <br>
     * <p>*   **1**: the primary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary origin server.</p>
     * <p>*   **2**: the secondary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the secondary origin server.</p>
     */
    @NameInMap("CurrentIndex")
    public Integer currentIndex;

    /**
     * <p>The type of the protocol.</p>
     */
    @NameInMap("ForwardProtocol")
    public String forwardProtocol;

    /**
     * <p>The forwarding port.</p>
     */
    @NameInMap("FrontendPort")
    public Integer frontendPort;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>An array that consists of the information about the primary origin server, including the IP addresses, forwarding protocol, and forwarding port.</p>
     */
    @NameInMap("PriRealServers")
    public java.util.List<DescribeLayer4RulePolicyResponseBodyPriRealServers> priRealServers;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the information about the secondary origin server, including the IP addresses, forwarding protocol, and forwarding port.</p>
     */
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
        /**
         * <p>The origin server that is used to receive service traffic. Valid values:</p>
         * <br>
         * <p>*   **1**: the primary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary origin server.</p>
         * <p>*   **2**: the secondary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the secondary origin server.</p>
         */
        @NameInMap("CurrentIndex")
        public Integer currentIndex;

        /**
         * <p>The IP address of the instance.</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <p>The forwarding port.</p>
         */
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the protocol.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The IP address of the primary origin server.</p>
         */
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
        /**
         * <p>The origin server that is used to receive service traffic. Valid values:</p>
         * <br>
         * <p>*   **1**: the primary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the primary origin server.</p>
         * <p>*   **2**: the secondary origin server, which indicates that Anti-DDoS Pro or Anti-DDoS Premium forwards service traffic to the IP addresses of the secondary origin server.</p>
         */
        @NameInMap("CurrentIndex")
        public Integer currentIndex;

        /**
         * <p>The IP address of the instance.</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <p>The forwarding port.</p>
         */
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the protocol.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The IP address of the secondary origin server.</p>
         */
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
