// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Listeners")
    @Validation(required = true)
    public java.util.List<DescribeHealthCheckListResponseListeners> listeners;

    public static DescribeHealthCheckListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckListResponse self = new DescribeHealthCheckListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHealthCheckListResponse setListeners(java.util.List<DescribeHealthCheckListResponseListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<DescribeHealthCheckListResponseListeners> getListeners() {
        return this.listeners;
    }

    public static class DescribeHealthCheckListResponseListenersHealthCheck extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Domain")
        @Validation(required = true)
        public String domain;

        @NameInMap("Uri")
        @Validation(required = true)
        public String uri;

        @NameInMap("Down")
        @Validation(required = true)
        public Integer down;

        @NameInMap("Interval")
        @Validation(required = true)
        public Integer interval;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("Timeout")
        @Validation(required = true)
        public Integer timeout;

        @NameInMap("Up")
        @Validation(required = true)
        public Integer up;

        public static DescribeHealthCheckListResponseListenersHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckListResponseListenersHealthCheck self = new DescribeHealthCheckListResponseListenersHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckListResponseListenersHealthCheck setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeHealthCheckListResponseListenersHealthCheck setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHealthCheckListResponseListenersHealthCheck setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

        public DescribeHealthCheckListResponseListenersHealthCheck setDown(Integer down) {
            this.down = down;
            return this;
        }
        public Integer getDown() {
            return this.down;
        }

        public DescribeHealthCheckListResponseListenersHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeHealthCheckListResponseListenersHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeHealthCheckListResponseListenersHealthCheck setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public DescribeHealthCheckListResponseListenersHealthCheck setUp(Integer up) {
            this.up = up;
            return this;
        }
        public Integer getUp() {
            return this.up;
        }

    }

    public static class DescribeHealthCheckListResponseListeners extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("FrontendPort")
        @Validation(required = true)
        public Integer frontendPort;

        @NameInMap("HealthCheck")
        @Validation(required = true)
        public DescribeHealthCheckListResponseListenersHealthCheck healthCheck;

        public static DescribeHealthCheckListResponseListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckListResponseListeners self = new DescribeHealthCheckListResponseListeners();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckListResponseListeners setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHealthCheckListResponseListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeHealthCheckListResponseListeners setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeHealthCheckListResponseListeners setHealthCheck(DescribeHealthCheckListResponseListenersHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public DescribeHealthCheckListResponseListenersHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

    }

}
