// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckConfigResponseBody extends TeaModel {
    @NameInMap("Listeners")
    public java.util.List<DescribeHealthCheckConfigResponseBodyListeners> listeners;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHealthCheckConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckConfigResponseBody self = new DescribeHealthCheckConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckConfigResponseBody setListeners(java.util.List<DescribeHealthCheckConfigResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<DescribeHealthCheckConfigResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public DescribeHealthCheckConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHealthCheckConfigResponseBodyListenersCheck extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Up")
        public Integer up;

        @NameInMap("Down")
        public Integer down;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Uri")
        public String uri;

        public static DescribeHealthCheckConfigResponseBodyListenersCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckConfigResponseBodyListenersCheck self = new DescribeHealthCheckConfigResponseBodyListenersCheck();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckConfigResponseBodyListenersCheck setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeHealthCheckConfigResponseBodyListenersCheck setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public DescribeHealthCheckConfigResponseBodyListenersCheck setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHealthCheckConfigResponseBodyListenersCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeHealthCheckConfigResponseBodyListenersCheck setUp(Integer up) {
            this.up = up;
            return this;
        }
        public Integer getUp() {
            return this.up;
        }

        public DescribeHealthCheckConfigResponseBodyListenersCheck setDown(Integer down) {
            this.down = down;
            return this;
        }
        public Integer getDown() {
            return this.down;
        }

        public DescribeHealthCheckConfigResponseBodyListenersCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeHealthCheckConfigResponseBodyListenersCheck setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DescribeHealthCheckConfigResponseBodyListenersConfigSla extends TeaModel {
        @NameInMap("CpsEnable")
        public Integer cpsEnable;

        @NameInMap("Cps")
        public Integer cps;

        @NameInMap("MaxConnEnable")
        public Integer maxConnEnable;

        @NameInMap("MaxConn")
        public Integer maxConn;

        public static DescribeHealthCheckConfigResponseBodyListenersConfigSla build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckConfigResponseBodyListenersConfigSla self = new DescribeHealthCheckConfigResponseBodyListenersConfigSla();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfigSla setCpsEnable(Integer cpsEnable) {
            this.cpsEnable = cpsEnable;
            return this;
        }
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfigSla setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfigSla setMaxConnEnable(Integer maxConnEnable) {
            this.maxConnEnable = maxConnEnable;
            return this;
        }
        public Integer getMaxConnEnable() {
            return this.maxConnEnable;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfigSla setMaxConn(Integer maxConn) {
            this.maxConn = maxConn;
            return this;
        }
        public Integer getMaxConn() {
            return this.maxConn;
        }

    }

    public static class DescribeHealthCheckConfigResponseBodyListenersConfigPayloadLength extends TeaModel {
        @NameInMap("Max")
        public Integer max;

        @NameInMap("Min")
        public Integer min;

        public static DescribeHealthCheckConfigResponseBodyListenersConfigPayloadLength build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckConfigResponseBodyListenersConfigPayloadLength self = new DescribeHealthCheckConfigResponseBodyListenersConfigPayloadLength();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfigPayloadLength setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfigPayloadLength setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

    }

    public static class DescribeHealthCheckConfigResponseBodyListenersConfigSlimit extends TeaModel {
        @NameInMap("CpsEnable")
        public Integer cpsEnable;

        @NameInMap("Cps")
        public Integer cps;

        @NameInMap("MaxConnEnable")
        public Integer maxConnEnable;

        @NameInMap("MaxConn")
        public Integer maxConn;

        public static DescribeHealthCheckConfigResponseBodyListenersConfigSlimit build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckConfigResponseBodyListenersConfigSlimit self = new DescribeHealthCheckConfigResponseBodyListenersConfigSlimit();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfigSlimit setCpsEnable(Integer cpsEnable) {
            this.cpsEnable = cpsEnable;
            return this;
        }
        public Integer getCpsEnable() {
            return this.cpsEnable;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfigSlimit setCps(Integer cps) {
            this.cps = cps;
            return this;
        }
        public Integer getCps() {
            return this.cps;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfigSlimit setMaxConnEnable(Integer maxConnEnable) {
            this.maxConnEnable = maxConnEnable;
            return this;
        }
        public Integer getMaxConnEnable() {
            return this.maxConnEnable;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfigSlimit setMaxConn(Integer maxConn) {
            this.maxConn = maxConn;
            return this;
        }
        public Integer getMaxConn() {
            return this.maxConn;
        }

    }

    public static class DescribeHealthCheckConfigResponseBodyListenersConfig extends TeaModel {
        @NameInMap("SynProxy")
        public String synProxy;

        @NameInMap("PersistenceTimeout")
        public Integer persistenceTimeout;

        @NameInMap("NoDataConn")
        public String noDataConn;

        @NameInMap("Sla")
        public DescribeHealthCheckConfigResponseBodyListenersConfigSla sla;

        @NameInMap("PayloadLength")
        public DescribeHealthCheckConfigResponseBodyListenersConfigPayloadLength payloadLength;

        @NameInMap("Slimit")
        public DescribeHealthCheckConfigResponseBodyListenersConfigSlimit slimit;

        public static DescribeHealthCheckConfigResponseBodyListenersConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckConfigResponseBodyListenersConfig self = new DescribeHealthCheckConfigResponseBodyListenersConfig();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfig setSynProxy(String synProxy) {
            this.synProxy = synProxy;
            return this;
        }
        public String getSynProxy() {
            return this.synProxy;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfig setPersistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Integer getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfig setNoDataConn(String noDataConn) {
            this.noDataConn = noDataConn;
            return this;
        }
        public String getNoDataConn() {
            return this.noDataConn;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfig setSla(DescribeHealthCheckConfigResponseBodyListenersConfigSla sla) {
            this.sla = sla;
            return this;
        }
        public DescribeHealthCheckConfigResponseBodyListenersConfigSla getSla() {
            return this.sla;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfig setPayloadLength(DescribeHealthCheckConfigResponseBodyListenersConfigPayloadLength payloadLength) {
            this.payloadLength = payloadLength;
            return this;
        }
        public DescribeHealthCheckConfigResponseBodyListenersConfigPayloadLength getPayloadLength() {
            return this.payloadLength;
        }

        public DescribeHealthCheckConfigResponseBodyListenersConfig setSlimit(DescribeHealthCheckConfigResponseBodyListenersConfigSlimit slimit) {
            this.slimit = slimit;
            return this;
        }
        public DescribeHealthCheckConfigResponseBodyListenersConfigSlimit getSlimit() {
            return this.slimit;
        }

    }

    public static class DescribeHealthCheckConfigResponseBodyListeners extends TeaModel {
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("Check")
        public DescribeHealthCheckConfigResponseBodyListenersCheck check;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("BackPort")
        public Integer backPort;

        @NameInMap("Config")
        public DescribeHealthCheckConfigResponseBodyListenersConfig config;

        public static DescribeHealthCheckConfigResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckConfigResponseBodyListeners self = new DescribeHealthCheckConfigResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckConfigResponseBodyListeners setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeHealthCheckConfigResponseBodyListeners setCheck(DescribeHealthCheckConfigResponseBodyListenersCheck check) {
            this.check = check;
            return this;
        }
        public DescribeHealthCheckConfigResponseBodyListenersCheck getCheck() {
            return this.check;
        }

        public DescribeHealthCheckConfigResponseBodyListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeHealthCheckConfigResponseBodyListeners setBackPort(Integer backPort) {
            this.backPort = backPort;
            return this;
        }
        public Integer getBackPort() {
            return this.backPort;
        }

        public DescribeHealthCheckConfigResponseBodyListeners setConfig(DescribeHealthCheckConfigResponseBodyListenersConfig config) {
            this.config = config;
            return this;
        }
        public DescribeHealthCheckConfigResponseBodyListenersConfig getConfig() {
            return this.config;
        }

    }

}
