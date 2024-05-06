// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectAddrsResponseBody extends TeaModel {
    @NameInMap("DbType")
    public String dbType;

    @NameInMap("IsMultimod")
    public String isMultimod;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceConnAddrs")
    public DescribeClusterConnectAddrsResponseBodyServiceConnAddrs serviceConnAddrs;

    @NameInMap("SlbConnAddrs")
    public DescribeClusterConnectAddrsResponseBodySlbConnAddrs slbConnAddrs;

    @NameInMap("ThriftConn")
    public DescribeClusterConnectAddrsResponseBodyThriftConn thriftConn;

    @NameInMap("UiProxyConnAddrInfo")
    public DescribeClusterConnectAddrsResponseBodyUiProxyConnAddrInfo uiProxyConnAddrInfo;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZkConnAddrs")
    public DescribeClusterConnectAddrsResponseBodyZkConnAddrs zkConnAddrs;

    public static DescribeClusterConnectAddrsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectAddrsResponseBody self = new DescribeClusterConnectAddrsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectAddrsResponseBody setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeClusterConnectAddrsResponseBody setIsMultimod(String isMultimod) {
        this.isMultimod = isMultimod;
        return this;
    }
    public String getIsMultimod() {
        return this.isMultimod;
    }

    public DescribeClusterConnectAddrsResponseBody setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public DescribeClusterConnectAddrsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterConnectAddrsResponseBody setServiceConnAddrs(DescribeClusterConnectAddrsResponseBodyServiceConnAddrs serviceConnAddrs) {
        this.serviceConnAddrs = serviceConnAddrs;
        return this;
    }
    public DescribeClusterConnectAddrsResponseBodyServiceConnAddrs getServiceConnAddrs() {
        return this.serviceConnAddrs;
    }

    public DescribeClusterConnectAddrsResponseBody setSlbConnAddrs(DescribeClusterConnectAddrsResponseBodySlbConnAddrs slbConnAddrs) {
        this.slbConnAddrs = slbConnAddrs;
        return this;
    }
    public DescribeClusterConnectAddrsResponseBodySlbConnAddrs getSlbConnAddrs() {
        return this.slbConnAddrs;
    }

    public DescribeClusterConnectAddrsResponseBody setThriftConn(DescribeClusterConnectAddrsResponseBodyThriftConn thriftConn) {
        this.thriftConn = thriftConn;
        return this;
    }
    public DescribeClusterConnectAddrsResponseBodyThriftConn getThriftConn() {
        return this.thriftConn;
    }

    public DescribeClusterConnectAddrsResponseBody setUiProxyConnAddrInfo(DescribeClusterConnectAddrsResponseBodyUiProxyConnAddrInfo uiProxyConnAddrInfo) {
        this.uiProxyConnAddrInfo = uiProxyConnAddrInfo;
        return this;
    }
    public DescribeClusterConnectAddrsResponseBodyUiProxyConnAddrInfo getUiProxyConnAddrInfo() {
        return this.uiProxyConnAddrInfo;
    }

    public DescribeClusterConnectAddrsResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeClusterConnectAddrsResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeClusterConnectAddrsResponseBody setZkConnAddrs(DescribeClusterConnectAddrsResponseBodyZkConnAddrs zkConnAddrs) {
        this.zkConnAddrs = zkConnAddrs;
        return this;
    }
    public DescribeClusterConnectAddrsResponseBodyZkConnAddrs getZkConnAddrs() {
        return this.zkConnAddrs;
    }

    public static class DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo extends TeaModel {
        @NameInMap("ConnAddr")
        public String connAddr;

        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("NetType")
        public String netType;

        public static DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo self = new DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddr extends TeaModel {
        @NameInMap("ConnAddrInfo")
        public DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo connAddrInfo;

        @NameInMap("ConnType")
        public String connType;

        public static DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddr self = new DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddr();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddr setConnAddrInfo(DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo connAddrInfo) {
            this.connAddrInfo = connAddrInfo;
            return this;
        }
        public DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddrConnAddrInfo getConnAddrInfo() {
            return this.connAddrInfo;
        }

        public DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddr setConnType(String connType) {
            this.connType = connType;
            return this;
        }
        public String getConnType() {
            return this.connType;
        }

    }

    public static class DescribeClusterConnectAddrsResponseBodyServiceConnAddrs extends TeaModel {
        @NameInMap("ServiceConnAddr")
        public java.util.List<DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddr> serviceConnAddr;

        public static DescribeClusterConnectAddrsResponseBodyServiceConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectAddrsResponseBodyServiceConnAddrs self = new DescribeClusterConnectAddrsResponseBodyServiceConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectAddrsResponseBodyServiceConnAddrs setServiceConnAddr(java.util.List<DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddr> serviceConnAddr) {
            this.serviceConnAddr = serviceConnAddr;
            return this;
        }
        public java.util.List<DescribeClusterConnectAddrsResponseBodyServiceConnAddrsServiceConnAddr> getServiceConnAddr() {
            return this.serviceConnAddr;
        }

    }

    public static class DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo extends TeaModel {
        @NameInMap("ConnAddr")
        public String connAddr;

        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("NetType")
        public String netType;

        public static DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo self = new DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddr extends TeaModel {
        @NameInMap("ConnAddrInfo")
        public DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo connAddrInfo;

        @NameInMap("SlbType")
        public String slbType;

        public static DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddr self = new DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddr();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddr setConnAddrInfo(DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo connAddrInfo) {
            this.connAddrInfo = connAddrInfo;
            return this;
        }
        public DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddrConnAddrInfo getConnAddrInfo() {
            return this.connAddrInfo;
        }

        public DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddr setSlbType(String slbType) {
            this.slbType = slbType;
            return this;
        }
        public String getSlbType() {
            return this.slbType;
        }

    }

    public static class DescribeClusterConnectAddrsResponseBodySlbConnAddrs extends TeaModel {
        @NameInMap("SlbConnAddr")
        public java.util.List<DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddr> slbConnAddr;

        public static DescribeClusterConnectAddrsResponseBodySlbConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectAddrsResponseBodySlbConnAddrs self = new DescribeClusterConnectAddrsResponseBodySlbConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectAddrsResponseBodySlbConnAddrs setSlbConnAddr(java.util.List<DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddr> slbConnAddr) {
            this.slbConnAddr = slbConnAddr;
            return this;
        }
        public java.util.List<DescribeClusterConnectAddrsResponseBodySlbConnAddrsSlbConnAddr> getSlbConnAddr() {
            return this.slbConnAddr;
        }

    }

    public static class DescribeClusterConnectAddrsResponseBodyThriftConn extends TeaModel {
        @NameInMap("ConnAddr")
        public String connAddr;

        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("NetType")
        public String netType;

        public static DescribeClusterConnectAddrsResponseBodyThriftConn build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectAddrsResponseBodyThriftConn self = new DescribeClusterConnectAddrsResponseBodyThriftConn();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectAddrsResponseBodyThriftConn setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeClusterConnectAddrsResponseBodyThriftConn setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeClusterConnectAddrsResponseBodyThriftConn setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeClusterConnectAddrsResponseBodyUiProxyConnAddrInfo extends TeaModel {
        @NameInMap("ConnAddr")
        public String connAddr;

        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("NetType")
        public String netType;

        public static DescribeClusterConnectAddrsResponseBodyUiProxyConnAddrInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectAddrsResponseBodyUiProxyConnAddrInfo self = new DescribeClusterConnectAddrsResponseBodyUiProxyConnAddrInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectAddrsResponseBodyUiProxyConnAddrInfo setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeClusterConnectAddrsResponseBodyUiProxyConnAddrInfo setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeClusterConnectAddrsResponseBodyUiProxyConnAddrInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeClusterConnectAddrsResponseBodyZkConnAddrsZkConnAddr extends TeaModel {
        @NameInMap("ConnAddr")
        public String connAddr;

        @NameInMap("ConnAddrPort")
        public String connAddrPort;

        @NameInMap("NetType")
        public String netType;

        public static DescribeClusterConnectAddrsResponseBodyZkConnAddrsZkConnAddr build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectAddrsResponseBodyZkConnAddrsZkConnAddr self = new DescribeClusterConnectAddrsResponseBodyZkConnAddrsZkConnAddr();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectAddrsResponseBodyZkConnAddrsZkConnAddr setConnAddr(String connAddr) {
            this.connAddr = connAddr;
            return this;
        }
        public String getConnAddr() {
            return this.connAddr;
        }

        public DescribeClusterConnectAddrsResponseBodyZkConnAddrsZkConnAddr setConnAddrPort(String connAddrPort) {
            this.connAddrPort = connAddrPort;
            return this;
        }
        public String getConnAddrPort() {
            return this.connAddrPort;
        }

        public DescribeClusterConnectAddrsResponseBodyZkConnAddrsZkConnAddr setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

    }

    public static class DescribeClusterConnectAddrsResponseBodyZkConnAddrs extends TeaModel {
        @NameInMap("ZkConnAddr")
        public java.util.List<DescribeClusterConnectAddrsResponseBodyZkConnAddrsZkConnAddr> zkConnAddr;

        public static DescribeClusterConnectAddrsResponseBodyZkConnAddrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectAddrsResponseBodyZkConnAddrs self = new DescribeClusterConnectAddrsResponseBodyZkConnAddrs();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectAddrsResponseBodyZkConnAddrs setZkConnAddr(java.util.List<DescribeClusterConnectAddrsResponseBodyZkConnAddrsZkConnAddr> zkConnAddr) {
            this.zkConnAddr = zkConnAddr;
            return this;
        }
        public java.util.List<DescribeClusterConnectAddrsResponseBodyZkConnAddrsZkConnAddr> getZkConnAddr() {
            return this.zkConnAddr;
        }

    }

}
