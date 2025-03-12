// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckListResponseBody extends TeaModel {
    @NameInMap("Listeners")
    public java.util.List<DescribeHealthCheckListResponseBodyListeners> listeners;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHealthCheckListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckListResponseBody self = new DescribeHealthCheckListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckListResponseBody setListeners(java.util.List<DescribeHealthCheckListResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<DescribeHealthCheckListResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public DescribeHealthCheckListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHealthCheckListResponseBodyListenersHealthCheck extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Down")
        public Integer down;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Up")
        public Integer up;

        /**
         * <strong>example:</strong>
         * <p>/a/b/c</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static DescribeHealthCheckListResponseBodyListenersHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckListResponseBodyListenersHealthCheck self = new DescribeHealthCheckListResponseBodyListenersHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckListResponseBodyListenersHealthCheck setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHealthCheckListResponseBodyListenersHealthCheck setDown(Integer down) {
            this.down = down;
            return this;
        }
        public Integer getDown() {
            return this.down;
        }

        public DescribeHealthCheckListResponseBodyListenersHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeHealthCheckListResponseBodyListenersHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeHealthCheckListResponseBodyListenersHealthCheck setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public DescribeHealthCheckListResponseBodyListenersHealthCheck setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeHealthCheckListResponseBodyListenersHealthCheck setUp(Integer up) {
            this.up = up;
            return this;
        }
        public Integer getUp() {
            return this.up;
        }

        public DescribeHealthCheckListResponseBodyListenersHealthCheck setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DescribeHealthCheckListResponseBodyListeners extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("HealthCheck")
        public DescribeHealthCheckListResponseBodyListenersHealthCheck healthCheck;

        /**
         * <strong>example:</strong>
         * <p>ddoscoo-cn-XXXXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeHealthCheckListResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckListResponseBodyListeners self = new DescribeHealthCheckListResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckListResponseBodyListeners setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeHealthCheckListResponseBodyListeners setHealthCheck(DescribeHealthCheckListResponseBodyListenersHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public DescribeHealthCheckListResponseBodyListenersHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public DescribeHealthCheckListResponseBodyListeners setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHealthCheckListResponseBodyListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
