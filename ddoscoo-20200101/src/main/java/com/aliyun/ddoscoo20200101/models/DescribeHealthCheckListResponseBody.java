// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckListResponseBody extends TeaModel {
    @NameInMap("HealthCheckList")
    public java.util.List<DescribeHealthCheckListResponseBodyHealthCheckList> healthCheckList;

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
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Down")
        public Integer down;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Timeout")
        public Integer timeout;

        @NameInMap("Type")
        public String type;

        @NameInMap("Up")
        public Integer up;

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
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("HealthCheck")
        public DescribeHealthCheckListResponseBodyHealthCheckListHealthCheck healthCheck;

        @NameInMap("InstanceId")
        public String instanceId;

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
