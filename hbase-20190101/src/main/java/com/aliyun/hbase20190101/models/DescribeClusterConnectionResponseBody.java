// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hbaseue</p>
     */
    @NameInMap("DbType")
    public String dbType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsMultimod")
    public String isMultimod;

    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <strong>example:</strong>
     * <p>70220050-A465-5DCC-8C0C-C38C6E3DB24D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceConnAddrs")
    public DescribeClusterConnectionResponseBodyServiceConnAddrs serviceConnAddrs;

    @NameInMap("SlbConnAddrs")
    public DescribeClusterConnectionResponseBodySlbConnAddrs slbConnAddrs;

    @NameInMap("ThriftConn")
    public DescribeClusterConnectionResponseBodyThriftConn thriftConn;

    @NameInMap("UiProxyConnAddrInfo")
    public DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo uiProxyConnAddrInfo;

    /**
     * <strong>example:</strong>
     * <p>vsw-bp1foll427ze3d4ps****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp15s22y1a7sff5gj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZkConnAddrs")
    public DescribeClusterConnectionResponseBodyZkConnAddrs zkConnAddrs;

    public static DescribeClusterConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectionResponseBody self = new DescribeClusterConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectionResponseBody setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeClusterConnectionResponseBody setIsMultimod(String isMultimod) {
        this.isMultimod = isMultimod;
        return this;
    }
    public String getIsMultimod() {
        return this.isMultimod;
    }

    public DescribeClusterConnectionResponseBody setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public DescribeClusterConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterConnectionResponseBody setServiceConnAddrs(DescribeClusterConnectionResponseBodyServiceConnAddrs serviceConnAddrs) {
        this.serviceConnAddrs = serviceConnAddrs;
        return this;
    }
    public DescribeClusterConnectionResponseBodyServiceConnAddrs getServiceConnAddrs() {
        return this.serviceConnAddrs;
    }

    public DescribeClusterConnectionResponseBody setSlbConnAddrs(DescribeClusterConnectionResponseBodySlbConnAddrs slbConnAddrs) {
        this.slbConnAddrs = slbConnAddrs;
        return this;
    }
    public DescribeClusterConnectionResponseBodySlbConnAddrs getSlbConnAddrs() {
        return this.slbConnAddrs;
    }

    public DescribeClusterConnectionResponseBody setThriftConn(DescribeClusterConnectionResponseBodyThriftConn thriftConn) {
        this.thriftConn = thriftConn;
        return this;
    }
    public DescribeClusterConnectionResponseBodyThriftConn getThriftConn() {
        return this.thriftConn;
    }

    public DescribeClusterConnectionResponseBody setUiProxyConnAddrInfo(DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo uiProxyConnAddrInfo) {
        this.uiProxyConnAddrInfo = uiProxyConnAddrInfo;
        return this;
    }
    public DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo getUiProxyConnAddrInfo() {
        return this.uiProxyConnAddrInfo;
    }

    public DescribeClusterConnectionResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeClusterConnectionResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeClusterConnectionResponseBody setZkConnAddrs(DescribeClusterConnectionResponseBodyZkConnAddrs zkConnAddrs) {
        this.zkConnAddrs = zkConnAddrs;
        return this;
    }
    public DescribeClusterConnectionResponseBodyZkConnAddrs getZkConnAddrs() {
        return this.zkConnAddrs;
    }

    public static class DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hb-****-proxy-phoenix.hbase.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnAddr")
        public String connAddr;

        /**
         * <strong>example:</strong>
         * <p>8765</p>
         */
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetType")
        public String netType;

        public static DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo self = new DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddr extends TeaModel {
        @NameInMap("ConnAddrInfo")
        public DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo connAddrInfo;

        /**
         * <strong>example:</strong>
         * <p>PhoenixConnAddr</p>
         */
        @NameInMap("ConnType")
        public String connType;

        public static DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddr self = new DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddr();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddr setConnAddrInfo(DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo connAddrInfo) {
            this.connAddrInfo = connAddrInfo;
            return this;
        }
        public DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo getConnAddrInfo() {
            return this.connAddrInfo;
        }

        public DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddr setConnType(String connType) {
            this.connType = connType;
            return this;
        }
        public String getConnType() {
            return this.connType;
        }

    }

    public static class DescribeClusterConnectionResponseBodyServiceConnAddrs extends TeaModel {
        @NameInMap("ServiceConnAddr")
        public java.util.List<DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddr> serviceConnAddr;

        public static DescribeClusterConnectionResponseBodyServiceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyServiceConnAddrs self = new DescribeClusterConnectionResponseBodyServiceConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionResponseBodyServiceConnAddrs setServiceConnAddr(java.util.List<DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddr> serviceConnAddr) {
            this.serviceConnAddr = serviceConnAddr;
            return this;
        }
        public java.util.List<DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddr> getServiceConnAddr() {
            return this.serviceConnAddr;
        }

    }

    public static class DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ld-bp150tns0sjxs****-proxy-hbaseue-pub.hbaseue.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnAddr")
        public String connAddr;

        /**
         * <strong>example:</strong>
         * <p>9190</p>
         */
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NetType")
        public String netType;

        public static DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo self = new DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddr extends TeaModel {
        @NameInMap("ConnAddrInfo")
        public DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo connAddrInfo;

        /**
         * <strong>example:</strong>
         * <p>hbaseue</p>
         */
        @NameInMap("SlbType")
        public String slbType;

        public static DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddr self = new DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddr();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddr setConnAddrInfo(DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo connAddrInfo) {
            this.connAddrInfo = connAddrInfo;
            return this;
        }
        public DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo getConnAddrInfo() {
            return this.connAddrInfo;
        }

        public DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddr setSlbType(String slbType) {
            this.slbType = slbType;
            return this;
        }
        public String getSlbType() {
            return this.slbType;
        }

    }

    public static class DescribeClusterConnectionResponseBodySlbConnAddrs extends TeaModel {
        @NameInMap("SlbConnAddr")
        public java.util.List<DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddr> slbConnAddr;

        public static DescribeClusterConnectionResponseBodySlbConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodySlbConnAddrs self = new DescribeClusterConnectionResponseBodySlbConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionResponseBodySlbConnAddrs setSlbConnAddr(java.util.List<DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddr> slbConnAddr) {
            this.slbConnAddr = slbConnAddr;
            return this;
        }
        public java.util.List<DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddr> getSlbConnAddr() {
            return this.slbConnAddr;
        }

    }

    public static class DescribeClusterConnectionResponseBodyThriftConn extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hb-bp1u0639js2h7****-proxy-thrift.hbase.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnAddr")
        public String connAddr;

        /**
         * <strong>example:</strong>
         * <p>9099</p>
         */
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetType")
        public String netType;

        public static DescribeClusterConnectionResponseBodyThriftConn build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyThriftConn self = new DescribeClusterConnectionResponseBodyThriftConn();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionResponseBodyThriftConn setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeClusterConnectionResponseBodyThriftConn setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeClusterConnectionResponseBodyThriftConn setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ld-bp150tns0sjxs****-master1-001.hbaseue.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnAddr")
        public String connAddr;

        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        /**
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("NetType")
        public String netType;

        public static DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo self = new DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ld-bp150tns0sjxs****-master1-001.hbaseue.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnAddr")
        public String connAddr;

        /**
         * <strong>example:</strong>
         * <p>2181</p>
         */
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NetType")
        public String netType;

        public static DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr self = new DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeClusterConnectionResponseBodyZkConnAddrs extends TeaModel {
        @NameInMap("ZkConnAddr")
        public java.util.List<DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr> zkConnAddr;

        public static DescribeClusterConnectionResponseBodyZkConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyZkConnAddrs self = new DescribeClusterConnectionResponseBodyZkConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionResponseBodyZkConnAddrs setZkConnAddr(java.util.List<DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr> zkConnAddr) {
            this.zkConnAddr = zkConnAddr;
            return this;
        }
        public java.util.List<DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr> getZkConnAddr() {
            return this.zkConnAddr;
        }

    }

}
