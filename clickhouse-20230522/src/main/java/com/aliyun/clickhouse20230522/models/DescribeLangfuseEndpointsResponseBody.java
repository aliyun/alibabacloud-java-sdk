// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseEndpointsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeLangfuseEndpointsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLangfuseEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseEndpointsResponseBody self = new DescribeLangfuseEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseEndpointsResponseBody setData(DescribeLangfuseEndpointsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLangfuseEndpointsResponseBodyData getData() {
        return this.data;
    }

    public DescribeLangfuseEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLangfuseEndpointsResponseBodyDataEndpointsPorts extends TeaModel {
        /**
         * <p>The access port. Valid values:</p>
         * <ul>
         * <li>http: 3000</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li>http: HTTP port.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        public static DescribeLangfuseEndpointsResponseBodyDataEndpointsPorts build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseEndpointsResponseBodyDataEndpointsPorts self = new DescribeLangfuseEndpointsResponseBodyDataEndpointsPorts();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseEndpointsResponseBodyDataEndpointsPorts setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeLangfuseEndpointsResponseBodyDataEndpointsPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

    }

    public static class DescribeLangfuseEndpointsResponseBodyDataEndpoints extends TeaModel {
        /**
         * <p>The endpoint of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lfs-2zeejcvmzn1******.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The endpoint name.</p>
         * 
         * <strong>example:</strong>
         * <p>lfs-2zeejcvmzn1******</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.30.<strong><strong>.</strong></strong></p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The network type of the endpoint. Valid values:</p>
         * <ul>
         * <li>VPC: VPC.</li>
         * <li>PUBLIC: Internet.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetType")
        public String netType;

        /**
         * <p>The port details.</p>
         */
        @NameInMap("Ports")
        public java.util.List<DescribeLangfuseEndpointsResponseBodyDataEndpointsPorts> ports;

        /**
         * <p>The vSwitch ID.</p>
         * 
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

        public static DescribeLangfuseEndpointsResponseBodyDataEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseEndpointsResponseBodyDataEndpoints self = new DescribeLangfuseEndpointsResponseBodyDataEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseEndpointsResponseBodyDataEndpoints setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeLangfuseEndpointsResponseBodyDataEndpoints setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public DescribeLangfuseEndpointsResponseBodyDataEndpoints setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeLangfuseEndpointsResponseBodyDataEndpoints setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeLangfuseEndpointsResponseBodyDataEndpoints setPorts(java.util.List<DescribeLangfuseEndpointsResponseBodyDataEndpointsPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<DescribeLangfuseEndpointsResponseBodyDataEndpointsPorts> getPorts() {
            return this.ports;
        }

        public DescribeLangfuseEndpointsResponseBodyDataEndpoints setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLangfuseEndpointsResponseBodyDataEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeLangfuseEndpointsResponseBodyData extends TeaModel {
        /**
         * <p>The list of endpoints.</p>
         */
        @NameInMap("Endpoints")
        public java.util.List<DescribeLangfuseEndpointsResponseBodyDataEndpoints> endpoints;

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: virtual private cloud (VPC).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("InstanceNetworkType")
        public String instanceNetworkType;

        public static DescribeLangfuseEndpointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLangfuseEndpointsResponseBodyData self = new DescribeLangfuseEndpointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLangfuseEndpointsResponseBodyData setEndpoints(java.util.List<DescribeLangfuseEndpointsResponseBodyDataEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<DescribeLangfuseEndpointsResponseBodyDataEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public DescribeLangfuseEndpointsResponseBodyData setInstanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

    }

}
