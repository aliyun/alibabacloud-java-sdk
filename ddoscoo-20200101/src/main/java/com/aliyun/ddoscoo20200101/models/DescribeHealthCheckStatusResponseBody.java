// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the health status of the origin server.</p>
     */
    @NameInMap("HealthCheckStatus")
    public java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatus> healthCheckStatus;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHealthCheckStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusResponseBody self = new DescribeHealthCheckStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusResponseBody setHealthCheckStatus(java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatus> healthCheckStatus) {
        this.healthCheckStatus = healthCheckStatus;
        return this;
    }
    public java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatus> getHealthCheckStatus() {
        return this.healthCheckStatus;
    }

    public DescribeHealthCheckStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList extends TeaModel {
        /**
         * <p>The IP address of the origin server.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The health state of the IP address. Valid values:</p>
         * <br>
         * <p>*   **normal**: healthy</p>
         * <p>*   **abnormal**: unhealthy</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList self = new DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeHealthCheckStatusResponseBodyHealthCheckStatus extends TeaModel {
        /**
         * <p>The forwarding port.</p>
         */
        @NameInMap("FrontendPort")
        public Integer frontendPort;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The forwarding protocol. Valid values:</p>
         * <br>
         * <p>*   **tcp**</p>
         * <p>*   **udp**</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>An array that consists of the health states of the IP addresses of the origin server.</p>
         */
        @NameInMap("RealServerStatusList")
        public java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList> realServerStatusList;

        /**
         * <p>The health status of the origin server. Valid values:</p>
         * <br>
         * <p>*   **normal**: healthy</p>
         * <p>*   **abnormal**: unhealthy</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeHealthCheckStatusResponseBodyHealthCheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckStatusResponseBodyHealthCheckStatus self = new DescribeHealthCheckStatusResponseBodyHealthCheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatus setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatus setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatus setRealServerStatusList(java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList> realServerStatusList) {
            this.realServerStatusList = realServerStatusList;
            return this;
        }
        public java.util.List<DescribeHealthCheckStatusResponseBodyHealthCheckStatusRealServerStatusList> getRealServerStatusList() {
            return this.realServerStatusList;
        }

        public DescribeHealthCheckStatusResponseBodyHealthCheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
