// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HealthCheckList")
    public java.util.List<DescribeHealthCheckListResponseBodyHealthCheckList> healthCheckList;

    public static DescribeHealthCheckListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckListResponseBody self = new DescribeHealthCheckListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHealthCheckListResponseBody setHealthCheckList(java.util.List<DescribeHealthCheckListResponseBodyHealthCheckList> healthCheckList) {
        this.healthCheckList = healthCheckList;
        return this;
    }
    public java.util.List<DescribeHealthCheckListResponseBodyHealthCheckList> getHealthCheckList() {
        return this.healthCheckList;
    }

    public static class DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck extends TeaModel {
        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Type")
        public String type;

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

        public static DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck self = new DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck();
            return TeaModel.build(map, self);
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

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setUp(Integer up) {
            this.up = up;
            return this;
        }
        public Integer getUp() {
            return this.up;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setDown(Integer down) {
            this.down = down;
            return this;
        }
        public Integer getDown() {
            return this.down;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
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
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("HealthCheck")
        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck healthCheck;

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

        public DescribeHealthCheckListResponseBodyHealthCheckList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHealthCheckListResponseBodyHealthCheckList setHealthCheck(DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck getHealthCheck() {
            return this.healthCheck;
        }

    }

}
