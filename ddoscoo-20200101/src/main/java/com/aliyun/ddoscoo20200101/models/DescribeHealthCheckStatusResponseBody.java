// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HealthCheckStatus")
    public java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatus> healthCheckStatus;

    public static DescribeHealthCheckStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusResponseBody self = new DescribeHealthCheckStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHealthCheckStatusResponseBody setHealthCheckStatus(java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatus> healthCheckStatus) {
        this.healthCheckStatus = healthCheckStatus;
        return this;
    }
    public java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatus> getHealthCheckStatus() {
        return this.healthCheckStatus;
    }

    public static class DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Address")
        public String address;

        public static DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList self = new DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

    }

    public static class DescribeHealthCheckStatusResponseBodyHealthCheckStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("FrontendPort")
        public Integer frontendPort;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RealServerStatusList")
        public java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList> realServerStatusList;

        public static DescribeHealthCheckStatusResponseBodyHealthCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckStatusResponseBodyHealthCheckStatus self = new DescribeHealthCheckStatusResponseBodyHealthCheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatus setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatus setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatus setRealServerStatusList(java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList> realServerStatusList) {
            this.realServerStatusList = realServerStatusList;
            return this;
        }
        public java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList> getRealServerStatusList() {
            return this.realServerStatusList;
        }

    }

}
