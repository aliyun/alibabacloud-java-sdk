// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer4RulesResponseBody extends TeaModel {
    /**
     * <p>Detailed configuration of port forwarding rules, including the forwarding port, forwarding protocol, and origin server addresses, etc.</p>
     */
    @NameInMap("Listeners")
    public java.util.List<DescribeLayer4RulesResponseBodyListeners> listeners;

    /**
     * <p>The ID of the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>949919A2-6636-1444-9213-AB27DD88AAA8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Long total;

    public static DescribeLayer4RulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RulesResponseBody self = new DescribeLayer4RulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RulesResponseBody setListeners(java.util.List<DescribeLayer4RulesResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<DescribeLayer4RulesResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public DescribeLayer4RulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLayer4RulesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class DescribeLayer4RulesResponseBodyListenersUsTimeout extends TeaModel {
        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        @NameInMap("RsTimeout")
        public Long rsTimeout;

        public static DescribeLayer4RulesResponseBodyListenersUsTimeout build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RulesResponseBodyListenersUsTimeout self = new DescribeLayer4RulesResponseBodyListenersUsTimeout();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RulesResponseBodyListenersUsTimeout setConnectTimeout(Long connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Long getConnectTimeout() {
            return this.connectTimeout;
        }

        public DescribeLayer4RulesResponseBodyListenersUsTimeout setRsTimeout(Long rsTimeout) {
            this.rsTimeout = rsTimeout;
            return this;
        }
        public Long getRsTimeout() {
            return this.rsTimeout;
        }

    }

    public static class DescribeLayer4RulesResponseBodyListeners extends TeaModel {
        /**
         * <p>The origin server port.</p>
         * 
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("BackendPort")
        public Integer backendPort;

        /**
         * <p>The origin mode. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Indicates the default origin mode.</li>
         * <li><strong>1</strong>: Indicates the primary/backup origin mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BakMode")
        public Integer bakMode;

        /**
         * <p>The currently effective origin server type. Values:</p>
         * <ul>
         * <li><strong>1</strong>: Indicates that the primary origin server settings are in effect (DDoS protection forwards business traffic to the primary origin server IP address).</li>
         * <li><strong>2</strong>: Indicates that the backup origin server settings are in effect (DDoS protection forwards business traffic to the backup origin server IP address).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentIndex")
        public Integer currentIndex;

        /**
         * <p>The IP address of the DDoS protection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>203.107.XX.XX</p>
         */
        @NameInMap("Eip")
        public String eip;

        /**
         * <p>The forwarding port.</p>
         * 
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        /**
         * <p>The ID of the DDoS protection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zvp2ay9b****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the rule was automatically created. Values:</p>
         * <ul>
         * <li><strong>true</strong>: Indicates that the rule was automatically created by DDoS protection.</li>
         * <li><strong>false</strong>: Indicates that the rule was manually created by you.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAutoCreate")
        public Boolean isAutoCreate;

        /**
         * <p>Payload rule module switch. Values:</p>
         * <ul>
         * <li>1: Enabled</li>
         * <li>0: Disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PayloadRuleEnable")
        public Long payloadRuleEnable;

        /**
         * <p>The type of forwarding protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>Traffic diversion switch. Values:</p>
         * <ul>
         * <li><strong>0</strong> Off.</li>
         * <li><strong>1</strong> On.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ProxyEnable")
        public Integer proxyEnable;

        /**
         * <p>Traffic diversion status. Values:</p>
         * <ul>
         * <li>on: Diversion is effective</li>
         * <li>off: Diversion is ineffective</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ProxyStatus")
        public String proxyStatus;

        /**
         * <p>The list of origin server IP addresses.</p>
         */
        @NameInMap("RealServers")
        public java.util.List<String> realServers;

        /**
         * <p>The remarks for the port forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test-remark</p>
         */
        @NameInMap("Remark")
        public String remark;

        @NameInMap("UsTimeout")
        public DescribeLayer4RulesResponseBodyListenersUsTimeout usTimeout;

        public static DescribeLayer4RulesResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RulesResponseBodyListeners self = new DescribeLayer4RulesResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RulesResponseBodyListeners setBackendPort(Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }
        public Integer getBackendPort() {
            return this.backendPort;
        }

        public DescribeLayer4RulesResponseBodyListeners setBakMode(Integer bakMode) {
            this.bakMode = bakMode;
            return this;
        }
        public Integer getBakMode() {
            return this.bakMode;
        }

        public DescribeLayer4RulesResponseBodyListeners setCurrentIndex(Integer currentIndex) {
            this.currentIndex = currentIndex;
            return this;
        }
        public Integer getCurrentIndex() {
            return this.currentIndex;
        }

        public DescribeLayer4RulesResponseBodyListeners setEip(String eip) {
            this.eip = eip;
            return this;
        }
        public String getEip() {
            return this.eip;
        }

        public DescribeLayer4RulesResponseBodyListeners setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeLayer4RulesResponseBodyListeners setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLayer4RulesResponseBodyListeners setIsAutoCreate(Boolean isAutoCreate) {
            this.isAutoCreate = isAutoCreate;
            return this;
        }
        public Boolean getIsAutoCreate() {
            return this.isAutoCreate;
        }

        public DescribeLayer4RulesResponseBodyListeners setPayloadRuleEnable(Long payloadRuleEnable) {
            this.payloadRuleEnable = payloadRuleEnable;
            return this;
        }
        public Long getPayloadRuleEnable() {
            return this.payloadRuleEnable;
        }

        public DescribeLayer4RulesResponseBodyListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLayer4RulesResponseBodyListeners setProxyEnable(Integer proxyEnable) {
            this.proxyEnable = proxyEnable;
            return this;
        }
        public Integer getProxyEnable() {
            return this.proxyEnable;
        }

        public DescribeLayer4RulesResponseBodyListeners setProxyStatus(String proxyStatus) {
            this.proxyStatus = proxyStatus;
            return this;
        }
        public String getProxyStatus() {
            return this.proxyStatus;
        }

        public DescribeLayer4RulesResponseBodyListeners setRealServers(java.util.List<String> realServers) {
            this.realServers = realServers;
            return this;
        }
        public java.util.List<String> getRealServers() {
            return this.realServers;
        }

        public DescribeLayer4RulesResponseBodyListeners setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeLayer4RulesResponseBodyListeners setUsTimeout(DescribeLayer4RulesResponseBodyListenersUsTimeout usTimeout) {
            this.usTimeout = usTimeout;
            return this;
        }
        public DescribeLayer4RulesResponseBodyListenersUsTimeout getUsTimeout() {
            return this.usTimeout;
        }

    }

}
