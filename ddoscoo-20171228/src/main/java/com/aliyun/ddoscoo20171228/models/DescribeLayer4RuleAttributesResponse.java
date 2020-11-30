// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeLayer4RuleAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Listeners")
    @Validation(required = true)
    public java.util.List<DescribeLayer4RuleAttributesResponseListeners> listeners;

    public static DescribeLayer4RuleAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLayer4RuleAttributesResponse self = new DescribeLayer4RuleAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLayer4RuleAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLayer4RuleAttributesResponse setListeners(java.util.List<DescribeLayer4RuleAttributesResponseListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<DescribeLayer4RuleAttributesResponseListeners> getListeners() {
        return this.listeners;
    }

    public static class DescribeLayer4RuleAttributesResponseListenersConfigSla extends TeaModel {
        @NameInMap("Cps")
        @Validation(required = true)
        public Integer cps;

        @NameInMap("Maxconn")
        @Validation(required = true)
        public Integer maxconn;

        @NameInMap("CpsEnable")
        @Validation(required = true)
        public Integer cpsEnable;

        @NameInMap("MaxconnEnable")
        @Validation(required = true)
        public Integer maxconnEnable;

        public static DescribeLayer4RuleAttributesResponseListenersConfigSla build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseListenersConfigSla self = new DescribeLayer4RuleAttributesResponseListenersConfigSla();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSla setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSla setMaxconn(Integer maxconn) {
            this.maxconn = maxconn;
            return this;
        }
        public Integer getMaxconn() {
            return this.maxconn;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSla setCpsEnable(Integer cpsEnable) {
            this.cpsEnable = cpsEnable;
            return this;
        }
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSla setMaxconnEnable(Integer maxconnEnable) {
            this.maxconnEnable = maxconnEnable;
            return this;
        }
        public Integer getMaxconnEnable() {
            return this.maxconnEnable;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseListenersConfigSlimit extends TeaModel {
        @NameInMap("Cps")
        @Validation(required = true)
        public Integer cps;

        @NameInMap("Maxconn")
        @Validation(required = true)
        public Integer maxconn;

        @NameInMap("CpsEnable")
        @Validation(required = true)
        public Integer cpsEnable;

        @NameInMap("CpsMode")
        @Validation(required = true)
        public Integer cpsMode;

        @NameInMap("MaxconnEnable")
        @Validation(required = true)
        public Integer maxconnEnable;

        @NameInMap("Bps")
        @Validation(required = true)
        public Long bps;

        @NameInMap("Pps")
        @Validation(required = true)
        public Long pps;

        public static DescribeLayer4RuleAttributesResponseListenersConfigSlimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseListenersConfigSlimit self = new DescribeLayer4RuleAttributesResponseListenersConfigSlimit();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSlimit setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSlimit setMaxconn(Integer maxconn) {
            this.maxconn = maxconn;
            return this;
        }
        public Integer getMaxconn() {
            return this.maxconn;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSlimit setCpsEnable(Integer cpsEnable) {
            this.cpsEnable = cpsEnable;
            return this;
        }
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSlimit setCpsMode(Integer cpsMode) {
            this.cpsMode = cpsMode;
            return this;
        }
        public Integer getCpsMode() {
            return this.cpsMode;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSlimit setMaxconnEnable(Integer maxconnEnable) {
            this.maxconnEnable = maxconnEnable;
            return this;
        }
        public Integer getMaxconnEnable() {
            return this.maxconnEnable;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSlimit setBps(Long bps) {
            this.bps = bps;
            return this;
        }
        public Long getBps() {
            return this.bps;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigSlimit setPps(Long pps) {
            this.pps = pps;
            return this;
        }
        public Long getPps() {
            return this.pps;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseListenersConfigPayloadLen extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Integer min;

        @NameInMap("Max")
        @Validation(required = true)
        public Integer max;

        public static DescribeLayer4RuleAttributesResponseListenersConfigPayloadLen build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseListenersConfigPayloadLen self = new DescribeLayer4RuleAttributesResponseListenersConfigPayloadLen();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigPayloadLen setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigPayloadLen setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseListenersConfigCcSblack extends TeaModel {
        @NameInMap("During")
        @Validation(required = true)
        public Integer during;

        @NameInMap("Expires")
        @Validation(required = true)
        public Integer expires;

        @NameInMap("Cnt")
        @Validation(required = true)
        public Integer cnt;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        public static DescribeLayer4RuleAttributesResponseListenersConfigCcSblack build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseListenersConfigCcSblack self = new DescribeLayer4RuleAttributesResponseListenersConfigCcSblack();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigCcSblack setDuring(Integer during) {
            this.during = during;
            return this;
        }
        public Integer getDuring() {
            return this.during;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigCcSblack setExpires(Integer expires) {
            this.expires = expires;
            return this;
        }
        public Integer getExpires() {
            return this.expires;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigCcSblack setCnt(Integer cnt) {
            this.cnt = cnt;
            return this;
        }
        public Integer getCnt() {
            return this.cnt;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigCcSblack setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseListenersConfigCc extends TeaModel {
        @NameInMap("Sblack")
        @Validation(required = true)
        public java.util.List<DescribeLayer4RuleAttributesResponseListenersConfigCcSblack> sblack;

        public static DescribeLayer4RuleAttributesResponseListenersConfigCc build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseListenersConfigCc self = new DescribeLayer4RuleAttributesResponseListenersConfigCc();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseListenersConfigCc setSblack(java.util.List<DescribeLayer4RuleAttributesResponseListenersConfigCcSblack> sblack) {
            this.sblack = sblack;
            return this;
        }
        public java.util.List<DescribeLayer4RuleAttributesResponseListenersConfigCcSblack> getSblack() {
            return this.sblack;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseListenersConfig extends TeaModel {
        @NameInMap("PersistenceTimeout")
        @Validation(required = true)
        public Integer persistenceTimeout;

        @NameInMap("Synproxy")
        @Validation(required = true)
        public String synproxy;

        @NameInMap("NodataConn")
        @Validation(required = true)
        public String nodataConn;

        @NameInMap("Sla")
        @Validation(required = true)
        public DescribeLayer4RuleAttributesResponseListenersConfigSla sla;

        @NameInMap("Slimit")
        @Validation(required = true)
        public DescribeLayer4RuleAttributesResponseListenersConfigSlimit slimit;

        @NameInMap("PayloadLen")
        @Validation(required = true)
        public DescribeLayer4RuleAttributesResponseListenersConfigPayloadLen payloadLen;

        @NameInMap("Cc")
        @Validation(required = true)
        public DescribeLayer4RuleAttributesResponseListenersConfigCc cc;

        public static DescribeLayer4RuleAttributesResponseListenersConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseListenersConfig self = new DescribeLayer4RuleAttributesResponseListenersConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseListenersConfig setPersistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Integer getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfig setSynproxy(String synproxy) {
            this.synproxy = synproxy;
            return this;
        }
        public String getSynproxy() {
            return this.synproxy;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfig setNodataConn(String nodataConn) {
            this.nodataConn = nodataConn;
            return this;
        }
        public String getNodataConn() {
            return this.nodataConn;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfig setSla(DescribeLayer4RuleAttributesResponseListenersConfigSla sla) {
            this.sla = sla;
            return this;
        }
        public DescribeLayer4RuleAttributesResponseListenersConfigSla getSla() {
            return this.sla;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfig setSlimit(DescribeLayer4RuleAttributesResponseListenersConfigSlimit slimit) {
            this.slimit = slimit;
            return this;
        }
        public DescribeLayer4RuleAttributesResponseListenersConfigSlimit getSlimit() {
            return this.slimit;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfig setPayloadLen(DescribeLayer4RuleAttributesResponseListenersConfigPayloadLen payloadLen) {
            this.payloadLen = payloadLen;
            return this;
        }
        public DescribeLayer4RuleAttributesResponseListenersConfigPayloadLen getPayloadLen() {
            return this.payloadLen;
        }

        public DescribeLayer4RuleAttributesResponseListenersConfig setCc(DescribeLayer4RuleAttributesResponseListenersConfigCc cc) {
            this.cc = cc;
            return this;
        }
        public DescribeLayer4RuleAttributesResponseListenersConfigCc getCc() {
            return this.cc;
        }

    }

    public static class DescribeLayer4RuleAttributesResponseListeners extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("FrontendPort")
        @Validation(required = true)
        public Integer frontendPort;

        @NameInMap("Config")
        @Validation(required = true)
        public DescribeLayer4RuleAttributesResponseListenersConfig config;

        public static DescribeLayer4RuleAttributesResponseListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeLayer4RuleAttributesResponseListeners self = new DescribeLayer4RuleAttributesResponseListeners();
            return TeaModel.build(map, self);
        }

        public DescribeLayer4RuleAttributesResponseListeners setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLayer4RuleAttributesResponseListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLayer4RuleAttributesResponseListeners setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeLayer4RuleAttributesResponseListeners setConfig(DescribeLayer4RuleAttributesResponseListenersConfig config) {
            this.config = config;
            return this;
        }
        public DescribeLayer4RuleAttributesResponseListenersConfig getConfig() {
            return this.config;
        }

    }

}
