// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeEndpointsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeEndpointsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointsResponseBody self = new DescribeEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointsResponseBody setData(DescribeEndpointsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEndpointsResponseBodyData getData() {
        return this.data;
    }

    public DescribeEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEndpointsResponseBodyDataEndpointsPorts extends TeaModel {
        @NameInMap("Port")
        public Integer port;

        @NameInMap("Protocol")
        public String protocol;

        public static DescribeEndpointsResponseBodyDataEndpointsPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointsResponseBodyDataEndpointsPorts self = new DescribeEndpointsResponseBodyDataEndpointsPorts();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointsResponseBodyDataEndpointsPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeEndpointsResponseBodyDataEndpointsPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeEndpointsResponseBodyDataEndpoints extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Ports")
        public java.util.List<DescribeEndpointsResponseBodyDataEndpointsPorts> ports;

        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeEndpointsResponseBodyDataEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointsResponseBodyDataEndpoints self = new DescribeEndpointsResponseBodyDataEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointsResponseBodyDataEndpoints setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeEndpointsResponseBodyDataEndpoints setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeEndpointsResponseBodyDataEndpoints setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeEndpointsResponseBodyDataEndpoints setPorts(java.util.List<DescribeEndpointsResponseBodyDataEndpointsPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeEndpointsResponseBodyDataEndpointsPorts> getPorts() {
            return this.ports;
        }

        public DescribeEndpointsResponseBodyDataEndpoints setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEndpointsResponseBodyDataEndpoints setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeEndpointsResponseBodyDataEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeEndpointsResponseBodyDataEndpoints setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeEndpointsResponseBodyData extends TeaModel {
        @NameInMap("Endpoints")
        public java.util.List<DescribeEndpointsResponseBodyDataEndpoints> endpoints;

        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        public static DescribeEndpointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndpointsResponseBodyData self = new DescribeEndpointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEndpointsResponseBodyData setEndpoints(java.util.List<DescribeEndpointsResponseBodyDataEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<DescribeEndpointsResponseBodyDataEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public DescribeEndpointsResponseBodyData setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

    }

}
