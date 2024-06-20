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
     * 
     * <strong>example:</strong>
     * <p>F9F2F77D-307C-4F15-8D02-AB5957EEBF97</p>
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
         * <p>The threshold that the number of connections initiated from a source IP address can exceed the limit. Set the value to <strong>5</strong>. If the number of connections initiated from a source IP address exceeds the limit five times during the check, the source IP address is added to the blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Cnt")
        public Integer cnt;

        /**
         * <p>The interval at which checks are performed. Set the value to <strong>60</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("During")
        public Integer during;

        /**
         * <p>The validity period of the IP address in the blacklist. Valid values: <strong>60</strong> to <strong>604800</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("Expires")
        public Integer expires;

        /**
         * <p>The type of the limit that causes a source IP address to be added to the blacklist. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Source New Connection Rate Limit</li>
         * <li><strong>2</strong>: Source Concurrent Connection Rate Limit</li>
         * <li><strong>3</strong>: PPS Limit for Source</li>
         * <li><strong>4</strong>: Bandwidth Limit for Source</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The maximum length of a packet. Valid values: <strong>0</strong> to <strong>6000</strong>. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum length of a packet. Valid values: <strong>0</strong> to <strong>6000</strong>. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The maximum number of new connections per second that can be established over the port of the destination instance. Valid values: <strong>100</strong> to <strong>100000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("Cps")
        public Integer cps;

        /**
         * <p>The status of the Destination New Connection Rate Limit switch. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The switch is turned off.</li>
         * <li><strong>1</strong>: The switch is turned on.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpsEnable")
        public Integer cpsEnable;

        /**
         * <p>The maximum number of concurrent connections that can be established over the port of the destination instance. Valid values: <strong>1000</strong> to <strong>1000000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("Maxconn")
        public Integer maxconn;

        /**
         * <p>The status of the Destination Concurrent Connection Rate Limit switch. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The switch is turned off.</li>
         * <li><strong>1</strong>: The switch is turned on.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The bandwidth limit for a source IP address. Valid values: <strong>1024</strong> to <strong>268435456</strong>. Unit: bytes/s. Default value: <strong>0</strong>, which indicates that the bandwidth for a source IP address is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Bps")
        public Long bps;

        /**
         * <p>The maximum number of new connections per second that can be initiated from a source IP address. Valid values: <strong>1</strong> to <strong>500000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Cps")
        public Integer cps;

        /**
         * <p>The status of the Source New Connection Rate Limit switch. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The switch is turned off.</li>
         * <li><strong>1</strong>: The switch is turned on.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CpsEnable")
        public Integer cpsEnable;

        /**
         * <p>The mode of the Source New Connection Rate Limit switch. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: the manual mode</li>
         * <li><strong>2</strong>: the automatic mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpsMode")
        public Integer cpsMode;

        /**
         * <p>The maximum number of concurrent connections initiated from a source IP address. Valid values: <strong>1</strong> to <strong>500000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Maxconn")
        public Integer maxconn;

        /**
         * <p>The status of the Source Concurrent Connection Rate Limit switch. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The switch is turned off.</li>
         * <li><strong>1</strong>: The switch is turned on.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxconnEnable")
        public Integer maxconnEnable;

        /**
         * <p>The packets per second (pps) limit for a source IP address. Valid values: <strong>1</strong> to <strong>100000</strong>. Unit: packets/s. Default value: <strong>0</strong>, which indicates that the pps for a source IP address is unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <ul>
         * <li><strong>on</strong>: The switch is turned on.</li>
         * <li><strong>off</strong>: The switch is turned off.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("NodataConn")
        public String nodataConn;

        /**
         * <p>The settings of the Packet Length Limit policy.</p>
         */
        @NameInMap("PayloadLen")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen payloadLen;

        /**
         * <p>The timeout period of session persistence. Valid values: <strong>30</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>0</strong>, which indicates that session persistence is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <ul>
         * <li><strong>on</strong>: The switch is turned on.</li>
         * <li><strong>off</strong>: The switch is turned off.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
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
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-mp91j1ao****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The forwarding protocol. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
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
