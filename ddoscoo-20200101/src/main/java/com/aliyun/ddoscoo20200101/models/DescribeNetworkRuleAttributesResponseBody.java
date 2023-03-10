// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleAttributesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the mitigation settings of the port forwarding rule for a non-website service. The mitigation settings include session persistence and DDoS mitigation policies.</p>
     */
    @NameInMap("NetworkRuleAttributes")
    public java.util.List<DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes> networkRuleAttributes;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNetworkRuleAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRuleAttributesResponseBody self = new DescribeNetworkRuleAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRuleAttributesResponseBody setNetworkRuleAttributes(java.util.List<DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes> networkRuleAttributes) {
        this.networkRuleAttributes = networkRuleAttributes;
        return this;
    }
    public java.util.List<DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes> getNetworkRuleAttributes() {
        return this.networkRuleAttributes;
    }

    public DescribeNetworkRuleAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack extends TeaModel {
        /**
         * <p>The threshold that the number of connections initiated from a source IP address can exceed the limit. Set the value to **5**. If the number of connections initiated from a source IP address exceeds the limit five times during the check, the source IP address is added to the blacklist.</p>
         */
        @NameInMap("Cnt")
        public Integer cnt;

        /**
         * <p>The interval at which checks are performed. Set the value to **60**. Unit: seconds.</p>
         */
        @NameInMap("During")
        public Integer during;

        /**
         * <p>The validity period of the IP address in the blacklist. Valid values: **60** to **604800**. Unit: seconds.</p>
         */
        @NameInMap("Expires")
        public Integer expires;

        /**
         * <p>The type of the limit that causes a source IP address to be added to the blacklist. Valid values:</p>
         * <br>
         * <p>*   **1**: Source New Connection Rate Limit</p>
         * <p>*   **2**: Source Concurrent Connection Rate Limit</p>
         * <p>*   **3**: PPS Limit for Source</p>
         * <p>*   **4**: Bandwidth Limit for Source</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack setCnt(Integer cnt) {
            this.cnt = cnt;
            return this;
        }
        public Integer getCnt() {
            return this.cnt;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack setDuring(Integer during) {
            this.during = during;
            return this;
        }
        public Integer getDuring() {
            return this.during;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack setExpires(Integer expires) {
            this.expires = expires;
            return this;
        }
        public Integer getExpires() {
            return this.expires;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCc extends TeaModel {
        /**
         * <p>The protection policy that a source IP address is added to the blacklist when the number of connections initiated from the IP address frequently exceeds the limit.</p>
         */
        @NameInMap("Sblack")
        public java.util.List<DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack> sblack;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCc build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCc self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCc();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCc setSblack(java.util.List<DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack> sblack) {
            this.sblack = sblack;
            return this;
        }
        public java.util.List<DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack> getSblack() {
            return this.sblack;
        }

    }

    public static class DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen extends TeaModel {
        /**
         * <p>The maximum length of a packet. Valid values: **0** to **6000**. Unit: bytes.</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum length of a packet. Valid values: **0** to **6000**. Unit: bytes.</p>
         */
        @NameInMap("Min")
        public Integer min;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

    }

    public static class DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla extends TeaModel {
        /**
         * <p>The maximum number of new connections per second that can be established over the port of the destination instance. Valid values: **100** to **100000**.</p>
         */
        @NameInMap("Cps")
        public Integer cps;

        /**
         * <p>The status of the Destination New Connection Rate Limit switch. Valid values:</p>
         * <br>
         * <p>*   **0**: The switch is turned off.</p>
         * <p>*   **1**: The switch is turned on.</p>
         */
        @NameInMap("CpsEnable")
        public Integer cpsEnable;

        /**
         * <p>The maximum number of concurrent connections that can be established over the port of the destination instance. Valid values: **1000** to **1000000**.</p>
         */
        @NameInMap("Maxconn")
        public Integer maxconn;

        /**
         * <p>The status of the Destination Concurrent Connection Rate Limit switch. Valid values:</p>
         * <br>
         * <p>*   **0**: The switch is turned off.</p>
         * <p>*   **1**: The switch is turned on.</p>
         */
        @NameInMap("MaxconnEnable")
        public Integer maxconnEnable;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla setCpsEnable(Integer cpsEnable) {
            this.cpsEnable = cpsEnable;
            return this;
        }
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla setMaxconn(Integer maxconn) {
            this.maxconn = maxconn;
            return this;
        }
        public Integer getMaxconn() {
            return this.maxconn;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla setMaxconnEnable(Integer maxconnEnable) {
            this.maxconnEnable = maxconnEnable;
            return this;
        }
        public Integer getMaxconnEnable() {
            return this.maxconnEnable;
        }

    }

    public static class DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit extends TeaModel {
        /**
         * <p>The bandwidth limit for a source IP address. Valid values: **1024** to **268435456**. Unit: bytes/s. Default value: **0**, which indicates that the bandwidth for a source IP address is unlimited.</p>
         */
        @NameInMap("Bps")
        public Long bps;

        /**
         * <p>The maximum number of new connections per second that can be initiated from a source IP address. Valid values: **1** to **500000**.</p>
         */
        @NameInMap("Cps")
        public Integer cps;

        /**
         * <p>The status of the Source New Connection Rate Limit switch. Valid values:</p>
         * <br>
         * <p>*   **0**: The switch is turned off.</p>
         * <p>*   **1**: The switch is turned on.</p>
         */
        @NameInMap("CpsEnable")
        public Integer cpsEnable;

        /**
         * <p>The mode of the Source New Connection Rate Limit switch. Valid values:</p>
         * <br>
         * <p>*   **1**: the manual mode</p>
         * <p>*   **2**: the automatic mode</p>
         */
        @NameInMap("CpsMode")
        public Integer cpsMode;

        /**
         * <p>The maximum number of concurrent connections initiated from a source IP address. Valid values: **1** to **500000**.</p>
         */
        @NameInMap("Maxconn")
        public Integer maxconn;

        /**
         * <p>The status of the Source Concurrent Connection Rate Limit switch. Valid values:</p>
         * <br>
         * <p>*   **0**: The switch is turned off.</p>
         * <p>*   **1**: The switch is turned on.</p>
         */
        @NameInMap("MaxconnEnable")
        public Integer maxconnEnable;

        /**
         * <p>The packets per second (pps) limit for a source IP address. Valid values: **1** to **100000**. Unit: packets/s. Default value: **0**, which indicates that the pps for a source IP address is unlimited.</p>
         */
        @NameInMap("Pps")
        public Long pps;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setCpsEnable(Integer cpsEnable) {
            this.cpsEnable = cpsEnable;
            return this;
        }
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setCpsMode(Integer cpsMode) {
            this.cpsMode = cpsMode;
            return this;
        }
        public Integer getCpsMode() {
            return this.cpsMode;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setMaxconn(Integer maxconn) {
            this.maxconn = maxconn;
            return this;
        }
        public Integer getMaxconn() {
            return this.maxconn;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setMaxconnEnable(Integer maxconnEnable) {
            this.maxconnEnable = maxconnEnable;
            return this;
        }
        public Integer getMaxconnEnable() {
            return this.maxconnEnable;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setPps(Long pps) {
            this.pps = pps;
            return this;
        }
        public Long getPps() {
            return this.pps;
        }

    }

    public static class DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig extends TeaModel {
        /**
         * <p>The protection policy applied when the number of connections initiated from a source IP address frequently exceeds the limit.</p>
         */
        @NameInMap("Cc")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCc cc;

        /**
         * <p>The status of the Empty Connection switch. Valid values:</p>
         * <br>
         * <p>*   **on**: The switch is turned on.</p>
         * <p>*   **off**: The switch is turned off.</p>
         */
        @NameInMap("NodataConn")
        public String nodataConn;

        /**
         * <p>The settings of the Packet Length Limit policy.</p>
         */
        @NameInMap("PayloadLen")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen payloadLen;

        /**
         * <p>The timeout period of session persistence. Valid values: **30** to **3600**. Unit: seconds. Default value: **0**, which indicates that session persistence is disabled.</p>
         */
        @NameInMap("PersistenceTimeout")
        public Integer persistenceTimeout;

        /**
         * <p>The settings of the Speed Limit for Destination policy.</p>
         */
        @NameInMap("Sla")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla sla;

        /**
         * <p>The settings of the Speed Limit for Source policy.</p>
         */
        @NameInMap("Slimit")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit slimit;

        /**
         * <p>The status of the False Source switch. Valid values:</p>
         * <br>
         * <p>*   **on**: The switch is turned on.</p>
         * <p>*   **off**: The switch is turned off.</p>
         */
        @NameInMap("Synproxy")
        public String synproxy;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig setCc(DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCc cc) {
            this.cc = cc;
            return this;
        }
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCc getCc() {
            return this.cc;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig setNodataConn(String nodataConn) {
            this.nodataConn = nodataConn;
            return this;
        }
        public String getNodataConn() {
            return this.nodataConn;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig setPayloadLen(DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen payloadLen) {
            this.payloadLen = payloadLen;
            return this;
        }
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen getPayloadLen() {
            return this.payloadLen;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig setPersistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Integer getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig setSla(DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla sla) {
            this.sla = sla;
            return this;
        }
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla getSla() {
            return this.sla;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig setSlimit(DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit slimit) {
            this.slimit = slimit;
            return this;
        }
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit getSlimit() {
            return this.slimit;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig setSynproxy(String synproxy) {
            this.synproxy = synproxy;
            return this;
        }
        public String getSynproxy() {
            return this.synproxy;
        }

    }

    public static class DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes extends TeaModel {
        /**
         * <p>The mitigation settings of the port forwarding rule.</p>
         */
        @NameInMap("Config")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig config;

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
         * <p>The forwarding protocol. Valid values:</p>
         * <br>
         * <p>*   **tcp**</p>
         * <p>*   **udp**</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes setConfig(DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig config) {
            this.config = config;
            return this;
        }
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig getConfig() {
            return this.config;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
