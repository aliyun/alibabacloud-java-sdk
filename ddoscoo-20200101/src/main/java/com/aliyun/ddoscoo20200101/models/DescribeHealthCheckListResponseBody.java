// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of information about the health check configuration.</p>
     */
    @NameInMap("HealthCheckList")
    public java.util.List<DescribeHealthCheckListResponseBodyHealthCheckList> healthCheckList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>83B4AF42-E8EE-4DC9-BD73-87B7733A36F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHealthCheckListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckListResponseBody self = new DescribeHealthCheckListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckListResponseBody setHealthCheckList(java.util.List<DescribeHealthCheckListResponseBodyHealthCheckList> healthCheckList) {
        this.healthCheckList = healthCheckList;
        return this;
    }
    public java.util.List<DescribeHealthCheckListResponseBodyHealthCheckList> getHealthCheckList() {
        return this.healthCheckList;
    }

    public DescribeHealthCheckListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck extends TeaModel {
        /**
         * <p>The domain name.</p>
         * <blockquote>
         * <p>This parameter is returned only when the Layer 7 health check configuration is queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The number of consecutive failed health checks that must occur before a port is declared unhealthy. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Down")
        public Integer down;

        /**
         * <p>The interval at which checks are performed. Valid values: <strong>1</strong> to <strong>30</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The port that was checked.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The response timeout period. Valid values: <strong>1</strong> to <strong>30</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: The Layer 4 health check configuration was queried.</li>
         * <li><strong>http</strong>: The Layer 7 health check configuration was queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The number of consecutive successful health checks that must occur before a port is declared healthy. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Up")
        public Integer up;

        /**
         * <p>The check path.</p>
         * <blockquote>
         * <p>This parameter is returned only when the Layer 7 health check configuration is queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/abc</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck self = new DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setDown(Integer down) {
            this.down = down;
            return this;
        }
        public Integer getDown() {
            return this.down;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setUp(Integer up) {
            this.up = up;
            return this;
        }
        public Integer getUp() {
            return this.up;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DescribeHealthCheckListResponseBodyHealthCheckList extends TeaModel {
        /**
         * <p>The forwarding port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        /**
         * <p>The health check configuration.</p>
         */
        @NameInMap("HealthCheck")
        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck healthCheck;

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

        public static DescribeHealthCheckListResponseBodyHealthCheckList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckListResponseBodyHealthCheckList self = new DescribeHealthCheckListResponseBodyHealthCheckList();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckListResponseBodyHealthCheckList setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckList setHealthCheck(DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

}
