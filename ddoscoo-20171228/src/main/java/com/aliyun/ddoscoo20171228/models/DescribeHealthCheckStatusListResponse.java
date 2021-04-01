// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("HealthCheckStatusList")
    @Validation(required = true)
    public java.util.List<DescribeHealthCheckStatusListResponseHealthCheckStatusList> healthCheckStatusList;

    public static DescribeHealthCheckStatusListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusListResponse self = new DescribeHealthCheckStatusListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHealthCheckStatusListResponse setHealthCheckStatusList(java.util.List<DescribeHealthCheckStatusListResponseHealthCheckStatusList> healthCheckStatusList) {
        this.healthCheckStatusList = healthCheckStatusList;
        return this;
    }
    public java.util.List<DescribeHealthCheckStatusListResponseHealthCheckStatusList> getHealthCheckStatusList() {
        return this.healthCheckStatusList;
    }

    public static class DescribeHealthCheckStatusListResponseHealthCheckStatusListRealServerStatusList extends TeaModel {
        @NameInMap("Address")
        @Validation(required = true)
        public String address;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DescribeHealthCheckStatusListResponseHealthCheckStatusListRealServerStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckStatusListResponseHealthCheckStatusListRealServerStatusList self = new DescribeHealthCheckStatusListResponseHealthCheckStatusListRealServerStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckStatusListResponseHealthCheckStatusListRealServerStatusList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeHealthCheckStatusListResponseHealthCheckStatusListRealServerStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeHealthCheckStatusListResponseHealthCheckStatusList extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("FrontendPort")
        @Validation(required = true)
        public Integer frontendPort;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("RealServerStatusList")
        @Validation(required = true)
        public java.util.List<DescribeHealthCheckStatusListResponseHealthCheckStatusListRealServerStatusList> realServerStatusList;

        public static DescribeHealthCheckStatusListResponseHealthCheckStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckStatusListResponseHealthCheckStatusList self = new DescribeHealthCheckStatusListResponseHealthCheckStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckStatusListResponseHealthCheckStatusList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHealthCheckStatusListResponseHealthCheckStatusList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeHealthCheckStatusListResponseHealthCheckStatusList setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeHealthCheckStatusListResponseHealthCheckStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHealthCheckStatusListResponseHealthCheckStatusList setRealServerStatusList(java.util.List<DescribeHealthCheckStatusListResponseHealthCheckStatusListRealServerStatusList> realServerStatusList) {
            this.realServerStatusList = realServerStatusList;
            return this;
        }
        public java.util.List<DescribeHealthCheckStatusListResponseHealthCheckStatusListRealServerStatusList> getRealServerStatusList() {
            return this.realServerStatusList;
        }

    }

}
