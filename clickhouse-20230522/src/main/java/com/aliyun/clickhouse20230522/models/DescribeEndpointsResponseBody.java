// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeEndpointsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeEndpointsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>xxx-xxx-xxx</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>8123</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>HttpPort</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>cc-****-clickhouse.clickhouseserver.pre.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <strong>example:</strong>
         * <p>172.30.XX.XX</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetType")
        public String netType;

        @NameInMap("Ports")
        public java.util.List<DescribeEndpointsResponseBodyDataEndpointsPorts> ports;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>vsw-0xi8829****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf61z****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vpc-uf61z****</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>VPC</p>
         */
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
