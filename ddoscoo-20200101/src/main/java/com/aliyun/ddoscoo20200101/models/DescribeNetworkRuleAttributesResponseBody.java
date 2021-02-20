// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRuleAttributesResponseBody extends TeaModel {
    @NameInMap("NetworkRuleAttributes")
    public java.util.List<DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes> networkRuleAttributes;

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
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Expires")
        public Integer expires;

        @NameInMap("During")
        public Integer during;

        @NameInMap("Cnt")
        public Integer cnt;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack setExpires(Integer expires) {
            this.expires = expires;
            return this;
        }
        public Integer getExpires() {
            return this.expires;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack setDuring(Integer during) {
            this.during = during;
            return this;
        }
        public Integer getDuring() {
            return this.during;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCcSblack setCnt(Integer cnt) {
            this.cnt = cnt;
            return this;
        }
        public Integer getCnt() {
            return this.cnt;
        }

    }

    public static class DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCc extends TeaModel {
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
        @NameInMap("Max")
        public Integer max;

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
        @NameInMap("MaxconnEnable")
        public Integer maxconnEnable;

        @NameInMap("CpsEnable")
        public Integer cpsEnable;

        @NameInMap("Cps")
        public Integer cps;

        @NameInMap("Maxconn")
        public Integer maxconn;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla setMaxconnEnable(Integer maxconnEnable) {
            this.maxconnEnable = maxconnEnable;
            return this;
        }
        public Integer getMaxconnEnable() {
            return this.maxconnEnable;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla setCpsEnable(Integer cpsEnable) {
            this.cpsEnable = cpsEnable;
            return this;
        }
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla setMaxconn(Integer maxconn) {
            this.maxconn = maxconn;
            return this;
        }
        public Integer getMaxconn() {
            return this.maxconn;
        }

    }

    public static class DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit extends TeaModel {
        @NameInMap("MaxconnEnable")
        public Integer maxconnEnable;

        @NameInMap("CpsEnable")
        public Integer cpsEnable;

        @NameInMap("Cps")
        public Integer cps;

        @NameInMap("Pps")
        public Long pps;

        @NameInMap("Bps")
        public Long bps;

        @NameInMap("Maxconn")
        public Integer maxconn;

        @NameInMap("CpsMode")
        public Integer cpsMode;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setMaxconnEnable(Integer maxconnEnable) {
            this.maxconnEnable = maxconnEnable;
            return this;
        }
        public Integer getMaxconnEnable() {
            return this.maxconnEnable;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setCpsEnable(Integer cpsEnable) {
            this.cpsEnable = cpsEnable;
            return this;
        }
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setPps(Long pps) {
            this.pps = pps;
            return this;
        }
        public Long getPps() {
            return this.pps;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setMaxconn(Integer maxconn) {
            this.maxconn = maxconn;
            return this;
        }
        public Integer getMaxconn() {
            return this.maxconn;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit setCpsMode(Integer cpsMode) {
            this.cpsMode = cpsMode;
            return this;
        }
        public Integer getCpsMode() {
            return this.cpsMode;
        }

    }

    public static class DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig extends TeaModel {
        @NameInMap("Cc")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigCc cc;

        @NameInMap("PayloadLen")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigPayloadLen payloadLen;

        @NameInMap("PersistenceTimeout")
        public Integer persistenceTimeout;

        @NameInMap("Sla")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSla sla;

        @NameInMap("Slimit")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfigSlimit slimit;

        @NameInMap("NodataConn")
        public String nodataConn;

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

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig setNodataConn(String nodataConn) {
            this.nodataConn = nodataConn;
            return this;
        }
        public String getNodataConn() {
            return this.nodataConn;
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
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Config")
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig config;

        public static DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes self = new DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributes setConfig(DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig config) {
            this.config = config;
            return this;
        }
        public DescribeNetworkRuleAttributesResponseBodyNetworkRuleAttributesConfig getConfig() {
            return this.config;
        }

    }

}
