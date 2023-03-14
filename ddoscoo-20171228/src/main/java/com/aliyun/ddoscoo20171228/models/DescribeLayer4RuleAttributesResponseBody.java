// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer4RuleAttributesResponseBody extends TeaModel {
    @NameInMap("Listeners")
    public java.util.List<DescribeLayer4RuleAttributesResponseBodyListeners> listeners;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLayer4RuleAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RuleAttributesResponseBody self = new DescribeLayer4RuleAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RuleAttributesResponseBody setListeners(java.util.List<DescribeLayer4RuleAttributesResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<DescribeLayer4RuleAttributesResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public DescribeLayer4RuleAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack extends TeaModel {
        @NameInMap("Cnt")
        public Integer cnt;

        @NameInMap("During")
        public Integer during;

        @NameInMap("Expires")
        public Integer expires;

        @NameInMap("Type")
        public Integer type;

        public static DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack self = new DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack setCnt(Integer cnt) {
            this.cnt = cnt;
            return this;
        }
        public Integer getCnt() {
            return this.cnt;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack setDuring(Integer during) {
            this.during = during;
            return this;
        }
        public Integer getDuring() {
            return this.during;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack setExpires(Integer expires) {
            this.expires = expires;
            return this;
        }
        public Integer getExpires() {
            return this.expires;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseBodyListenersConfigCc extends TeaModel {
        @NameInMap("Sblack")
        public java.util.List<DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack> sblack;

        public static DescribeLayer4RuleAttributesResponseBodyListenersConfigCc build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseBodyListenersConfigCc self = new DescribeLayer4RuleAttributesResponseBodyListenersConfigCc();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigCc setSblack(java.util.List<DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack> sblack) {
            this.sblack = sblack;
            return this;
        }
        public java.util.List<DescribeLayer4RuleAttributesResponseBodyListenersConfigCcSblack> getSblack() {
            return this.sblack;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseBodyListenersConfigPayloadLen extends TeaModel {
        @NameInMap("Max")
        public Integer max;

        @NameInMap("Min")
        public Integer min;

        public static DescribeLayer4RuleAttributesResponseBodyListenersConfigPayloadLen build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseBodyListenersConfigPayloadLen self = new DescribeLayer4RuleAttributesResponseBodyListenersConfigPayloadLen();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigPayloadLen setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigPayloadLen setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseBodyListenersConfigSla extends TeaModel {
        @NameInMap("Cps")
        public Integer cps;

        @NameInMap("CpsEnable")
        public Integer cpsEnable;

        @NameInMap("Maxconn")
        public Integer maxconn;

        @NameInMap("MaxconnEnable")
        public Integer maxconnEnable;

        public static DescribeLayer4RuleAttributesResponseBodyListenersConfigSla build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseBodyListenersConfigSla self = new DescribeLayer4RuleAttributesResponseBodyListenersConfigSla();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSla setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSla setCpsEnable(Integer cpsEnable) {
            this.cpsEnable = cpsEnable;
            return this;
        }
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSla setMaxconn(Integer maxconn) {
            this.maxconn = maxconn;
            return this;
        }
        public Integer getMaxconn() {
            return this.maxconn;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSla setMaxconnEnable(Integer maxconnEnable) {
            this.maxconnEnable = maxconnEnable;
            return this;
        }
        public Integer getMaxconnEnable() {
            return this.maxconnEnable;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit extends TeaModel {
        @NameInMap("Bps")
        public Long bps;

        @NameInMap("Cps")
        public Integer cps;

        @NameInMap("CpsEnable")
        public Integer cpsEnable;

        @NameInMap("CpsMode")
        public Integer cpsMode;

        @NameInMap("Maxconn")
        public Integer maxconn;

        @NameInMap("MaxconnEnable")
        public Integer maxconnEnable;

        @NameInMap("Pps")
        public Long pps;

        public static DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit self = new DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit setCpsEnable(Integer cpsEnable) {
            this.cpsEnable = cpsEnable;
            return this;
        }
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit setCpsMode(Integer cpsMode) {
            this.cpsMode = cpsMode;
            return this;
        }
        public Integer getCpsMode() {
            return this.cpsMode;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit setMaxconn(Integer maxconn) {
            this.maxconn = maxconn;
            return this;
        }
        public Integer getMaxconn() {
            return this.maxconn;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit setMaxconnEnable(Integer maxconnEnable) {
            this.maxconnEnable = maxconnEnable;
            return this;
        }
        public Integer getMaxconnEnable() {
            return this.maxconnEnable;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit setPps(Long pps) {
            this.pps = pps;
            return this;
        }
        public Long getPps() {
            return this.pps;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseBodyListenersConfig extends TeaModel {
        @NameInMap("Cc")
        public DescribeLayer4RuleAttributesResponseBodyListenersConfigCc cc;

        @NameInMap("NodataConn")
        public String nodataConn;

        @NameInMap("PayloadLen")
        public DescribeLayer4RuleAttributesResponseBodyListenersConfigPayloadLen payloadLen;

        @NameInMap("PersistenceTimeout")
        public Integer persistenceTimeout;

        @NameInMap("Sla")
        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSla sla;

        @NameInMap("Slimit")
        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit slimit;

        @NameInMap("Synproxy")
        public String synproxy;

        public static DescribeLayer4RuleAttributesResponseBodyListenersConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseBodyListenersConfig self = new DescribeLayer4RuleAttributesResponseBodyListenersConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfig setCc(DescribeLayer4RuleAttributesResponseBodyListenersConfigCc cc) {
            this.cc = cc;
            return this;
        }
        public DescribeLayer4RuleAttributesResponseBodyListenersConfigCc getCc() {
            return this.cc;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfig setNodataConn(String nodataConn) {
            this.nodataConn = nodataConn;
            return this;
        }
        public String getNodataConn() {
            return this.nodataConn;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfig setPayloadLen(DescribeLayer4RuleAttributesResponseBodyListenersConfigPayloadLen payloadLen) {
            this.payloadLen = payloadLen;
            return this;
        }
        public DescribeLayer4RuleAttributesResponseBodyListenersConfigPayloadLen getPayloadLen() {
            return this.payloadLen;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfig setPersistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Integer getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfig setSla(DescribeLayer4RuleAttributesResponseBodyListenersConfigSla sla) {
            this.sla = sla;
            return this;
        }
        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSla getSla() {
            return this.sla;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfig setSlimit(DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit slimit) {
            this.slimit = slimit;
            return this;
        }
        public DescribeLayer4RuleAttributesResponseBodyListenersConfigSlimit getSlimit() {
            return this.slimit;
        }

        public DescribeLayer4RuleAttributesResponseBodyListenersConfig setSynproxy(String synproxy) {
            this.synproxy = synproxy;
            return this;
        }
        public String getSynproxy() {
            return this.synproxy;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseBodyListeners extends TeaModel {
        @NameInMap("Config")
        public DescribeLayer4RuleAttributesResponseBodyListenersConfig config;

        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Protocol")
        public String protocol;

        public static DescribeLayer4RuleAttributesResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseBodyListeners self = new DescribeLayer4RuleAttributesResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseBodyListeners setConfig(DescribeLayer4RuleAttributesResponseBodyListenersConfig config) {
            this.config = config;
            return this;
        }
        public DescribeLayer4RuleAttributesResponseBodyListenersConfig getConfig() {
            return this.config;
        }

        public DescribeLayer4RuleAttributesResponseBodyListeners setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeLayer4RuleAttributesResponseBodyListeners setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLayer4RuleAttributesResponseBodyListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
