// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectionResponseBody extends TeaModel {
    @NameInMap("IsMultimod")
    public String isMultimod;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UiProxyConnAddrInfo")
    public DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo uiProxyConnAddrInfo;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ServiceConnAddrs")
    public DescribeClusterConnectionResponseBodyServiceConnAddrs serviceConnAddrs;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("ThriftConn")
    public DescribeClusterConnectionResponseBodyThriftConn thriftConn;

    @NameInMap("ZkConnAddrs")
    public DescribeClusterConnectionResponseBodyZkConnAddrs zkConnAddrs;

    @NameInMap("SlbConnAddrs")
    public DescribeClusterConnectionResponseBodySlbConnAddrs slbConnAddrs;

    public static DescribeClusterConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectionResponseBody self = new DescribeClusterConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectionResponseBody setIsMultimod(String isMultimod) {
        this.isMultimod = isMultimod;
        return this;
    }
    public String getIsMultimod() {
        return this.isMultimod;
    }

    public DescribeClusterConnectionResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeClusterConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeClusterConnectionResponseBody setServiceConnAddrs(DescribeClusterConnectionResponseBodyServiceConnAddrs serviceConnAddrs) {
        this.serviceConnAddrs = serviceConnAddrs;
        return this;
    }
    public DescribeClusterConnectionResponseBodyServiceConnAddrs getServiceConnAddrs() {
        return this.serviceConnAddrs;
    }

    public DescribeClusterConnectionResponseBody setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public DescribeClusterConnectionResponseBody setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeClusterConnectionResponseBody setThriftConn(DescribeClusterConnectionResponseBodyThriftConn thriftConn) {
        this.thriftConn = thriftConn;
        return this;
    }
    public DescribeClusterConnectionResponseBodyThriftConn getThriftConn() {
        return this.thriftConn;
    }

    public DescribeClusterConnectionResponseBody setZkConnAddrs(DescribeClusterConnectionResponseBodyZkConnAddrs zkConnAddrs) {
        this.zkConnAddrs = zkConnAddrs;
        return this;
    }
    public DescribeClusterConnectionResponseBodyZkConnAddrs getZkConnAddrs() {
        return this.zkConnAddrs;
    }

    public DescribeClusterConnectionResponseBody setSlbConnAddrs(DescribeClusterConnectionResponseBodySlbConnAddrs slbConnAddrs) {
        this.slbConnAddrs = slbConnAddrs;
        return this;
    }
    public DescribeClusterConnectionResponseBodySlbConnAddrs getSlbConnAddrs() {
        return this.slbConnAddrs;
    }

    public static class DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo extends TeaModel {
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ConnAddr")
        public String connAddr;

        public static DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo self = new DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo();
            return TeaModel.build(map, self);
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

        public DescribeClusterConnectionResponseBodyUiProxyConnAddrInfo setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

    }

    public static class DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo extends TeaModel {
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ConnAddr")
        public String connAddr;

        public static DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo self = new DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo();
            return TeaModel.build(map, self);
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

        public DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

    }

    public static class DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddr extends TeaModel {
        @NameInMap("ConnAddrInfo")
        public DescribeClusterConnectionResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo connAddrInfo;

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

    public static class DescribeClusterConnectionResponseBodyThriftConn extends TeaModel {
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ConnAddr")
        public String connAddr;

        public static DescribeClusterConnectionResponseBodyThriftConn build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyThriftConn self = new DescribeClusterConnectionResponseBodyThriftConn();
            return TeaModel.build(map, self);
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

        public DescribeClusterConnectionResponseBodyThriftConn setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

    }

    public static class DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr extends TeaModel {
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ConnAddr")
        public String connAddr;

        public static DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr self = new DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr();
            return TeaModel.build(map, self);
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

        public DescribeClusterConnectionResponseBodyZkConnAddrsZkConnAddr setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
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

    public static class DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo extends TeaModel {
        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ConnAddr")
        public String connAddr;

        public static DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo self = new DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo();
            return TeaModel.build(map, self);
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

        public DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

    }

    public static class DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddr extends TeaModel {
        @NameInMap("ConnAddrInfo")
        public DescribeClusterConnectionResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo connAddrInfo;

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

}
