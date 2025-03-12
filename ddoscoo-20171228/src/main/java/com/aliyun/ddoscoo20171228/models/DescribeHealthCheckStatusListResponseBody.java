// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeHealthCheckStatusListResponseBody extends TeaModel {
    @NameInMap("HealthCheckStatusList")
    public java.util.List<DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList> healthCheckStatusList;

    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHealthCheckStatusListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthCheckStatusListResponseBody self = new DescribeHealthCheckStatusListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthCheckStatusListResponseBody setHealthCheckStatusList(java.util.List<DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList> healthCheckStatusList) {
        this.healthCheckStatusList = healthCheckStatusList;
        return this;
    }
    public java.util.List<DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList> getHealthCheckStatusList() {
        return this.healthCheckStatusList;
    }

    public DescribeHealthCheckStatusListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHealthCheckStatusListResponseBodyHealthCheckStatusListRealServerStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeHealthCheckStatusListResponseBodyHealthCheckStatusListRealServerStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckStatusListResponseBodyHealthCheckStatusListRealServerStatusList self = new DescribeHealthCheckStatusListResponseBodyHealthCheckStatusListRealServerStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckStatusListResponseBodyHealthCheckStatusListRealServerStatusList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeHealthCheckStatusListResponseBodyHealthCheckStatusListRealServerStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("FrontendPort")
        public Integer frontendPort;

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

        @NameInMap("RealServerStatusList")
        public java.util.List<DescribeHealthCheckStatusListResponseBodyHealthCheckStatusListRealServerStatusList> realServerStatusList;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList self = new DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList setFrontendPort(Integer frontendPort) {
            this.frontendPort = frontendPort;
            return this;
        }
        public Integer getFrontendPort() {
            return this.frontendPort;
        }

        public DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList setRealServerStatusList(java.util.List<DescribeHealthCheckStatusListResponseBodyHealthCheckStatusListRealServerStatusList> realServerStatusList) {
            this.realServerStatusList = realServerStatusList;
            return this;
        }
        public java.util.List<DescribeHealthCheckStatusListResponseBodyHealthCheckStatusListRealServerStatusList> getRealServerStatusList() {
            return this.realServerStatusList;
        }

        public DescribeHealthCheckStatusListResponseBodyHealthCheckStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
