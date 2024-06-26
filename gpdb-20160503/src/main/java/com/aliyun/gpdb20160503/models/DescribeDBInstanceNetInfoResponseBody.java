// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    /**
     * <p>The connection information of the instance.</p>
     */
    @NameInMap("DBInstanceNetInfos")
    public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos DBInstanceNetInfos;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li>Classic: classic network.</li>
     * <li>VPC: VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Classic</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7565770E-7C45-462D-BA4A-8A5396F2CAD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceNetInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceNetInfoResponseBody self = new DescribeDBInstanceNetInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceNetInfoResponseBody setDBInstanceNetInfos(DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos DBInstanceNetInfos) {
        this.DBInstanceNetInfos = DBInstanceNetInfos;
        return this;
    }
    public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos getDBInstanceNetInfos() {
        return this.DBInstanceNetInfos;
    }

    public DescribeDBInstanceNetInfoResponseBody setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public DescribeDBInstanceNetInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo extends TeaModel {
        /**
         * <p>The type of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        /**
         * <p>The endpoint that is used to connect to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxx.gpdb.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("IPAddress")
        public String IPAddress;

        /**
         * <p>The type of the IP address.</p>
         * <ul>
         * <li>Valid values for instances in the classic network: Inner and Public.</li>
         * <li>Valid values for instances in a virtual private cloud (VPC): Private and Public.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Inner</p>
         */
        @NameInMap("IPType")
        public String IPType;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>3432</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The VPC ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxxx</p>
         */
        @NameInMap("VPCId")
        public String VPCId;

        /**
         * <p>The vSwitch ID. Multiple IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxxxxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the instance that is deployed in a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxxxxx</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setIPType(String IPType) {
            this.IPType = IPType;
            return this;
        }
        public String getIPType() {
            return this.IPType;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos extends TeaModel {
        @NameInMap("DBInstanceNetInfo")
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo> DBInstanceNetInfo;

        public static DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos self = new DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfos setDBInstanceNetInfo(java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo> DBInstanceNetInfo) {
            this.DBInstanceNetInfo = DBInstanceNetInfo;
            return this;
        }
        public java.util.List<DescribeDBInstanceNetInfoResponseBodyDBInstanceNetInfosDBInstanceNetInfo> getDBInstanceNetInfo() {
            return this.DBInstanceNetInfo;
        }

    }

}
