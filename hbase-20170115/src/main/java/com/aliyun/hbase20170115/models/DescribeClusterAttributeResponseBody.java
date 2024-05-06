// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeClusterAttributeResponseBody extends TeaModel {
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("ColdStorageStatus")
    public String coldStorageStatus;

    @NameInMap("ConnectionInfo")
    public DescribeClusterAttributeResponseBodyConnectionInfo connectionInfo;

    @NameInMap("CoreDiskQuantity")
    public Integer coreDiskQuantity;

    @NameInMap("CoreDiskSize")
    public String coreDiskSize;

    @NameInMap("CoreDiskType")
    public String coreDiskType;

    @NameInMap("CoreInstanceQuantity")
    public Integer coreInstanceQuantity;

    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("HaType")
    public String haType;

    @NameInMap("HasUser")
    public String hasUser;

    @NameInMap("LockMode")
    public String lockMode;

    @NameInMap("MainVersion")
    public String mainVersion;

    @NameInMap("MasterDiskSize")
    public Integer masterDiskSize;

    @NameInMap("MasterDiskType")
    public String masterDiskType;

    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    @NameInMap("MinorVersion")
    public String minorVersion;

    @NameInMap("NetInfo")
    public DescribeClusterAttributeResponseBodyNetInfo netInfo;

    @NameInMap("NodeList")
    public DescribeClusterAttributeResponseBodyNodeList nodeList;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UpdateStatus")
    public String updateStatus;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAttributeResponseBody self = new DescribeClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAttributeResponseBody setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public DescribeClusterAttributeResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterAttributeResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeClusterAttributeResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeClusterAttributeResponseBody setColdStorageStatus(String coldStorageStatus) {
        this.coldStorageStatus = coldStorageStatus;
        return this;
    }
    public String getColdStorageStatus() {
        return this.coldStorageStatus;
    }

    public DescribeClusterAttributeResponseBody setConnectionInfo(DescribeClusterAttributeResponseBodyConnectionInfo connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }
    public DescribeClusterAttributeResponseBodyConnectionInfo getConnectionInfo() {
        return this.connectionInfo;
    }

    public DescribeClusterAttributeResponseBody setCoreDiskQuantity(Integer coreDiskQuantity) {
        this.coreDiskQuantity = coreDiskQuantity;
        return this;
    }
    public Integer getCoreDiskQuantity() {
        return this.coreDiskQuantity;
    }

    public DescribeClusterAttributeResponseBody setCoreDiskSize(String coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public String getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public DescribeClusterAttributeResponseBody setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public DescribeClusterAttributeResponseBody setCoreInstanceQuantity(Integer coreInstanceQuantity) {
        this.coreInstanceQuantity = coreInstanceQuantity;
        return this;
    }
    public Integer getCoreInstanceQuantity() {
        return this.coreInstanceQuantity;
    }

    public DescribeClusterAttributeResponseBody setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public DescribeClusterAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeClusterAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeClusterAttributeResponseBody setHaType(String haType) {
        this.haType = haType;
        return this;
    }
    public String getHaType() {
        return this.haType;
    }

    public DescribeClusterAttributeResponseBody setHasUser(String hasUser) {
        this.hasUser = hasUser;
        return this;
    }
    public String getHasUser() {
        return this.hasUser;
    }

    public DescribeClusterAttributeResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeClusterAttributeResponseBody setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public DescribeClusterAttributeResponseBody setMasterDiskSize(Integer masterDiskSize) {
        this.masterDiskSize = masterDiskSize;
        return this;
    }
    public Integer getMasterDiskSize() {
        return this.masterDiskSize;
    }

    public DescribeClusterAttributeResponseBody setMasterDiskType(String masterDiskType) {
        this.masterDiskType = masterDiskType;
        return this;
    }
    public String getMasterDiskType() {
        return this.masterDiskType;
    }

    public DescribeClusterAttributeResponseBody setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public DescribeClusterAttributeResponseBody setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public DescribeClusterAttributeResponseBody setNetInfo(DescribeClusterAttributeResponseBodyNetInfo netInfo) {
        this.netInfo = netInfo;
        return this;
    }
    public DescribeClusterAttributeResponseBodyNetInfo getNetInfo() {
        return this.netInfo;
    }

    public DescribeClusterAttributeResponseBody setNodeList(DescribeClusterAttributeResponseBodyNodeList nodeList) {
        this.nodeList = nodeList;
        return this;
    }
    public DescribeClusterAttributeResponseBodyNodeList getNodeList() {
        return this.nodeList;
    }

    public DescribeClusterAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeClusterAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeClusterAttributeResponseBody setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }
    public String getUpdateStatus() {
        return this.updateStatus;
    }

    public DescribeClusterAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeClusterAttributeResponseBodyConnectionInfoZKClassicConnectionStringList extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static DescribeClusterAttributeResponseBodyConnectionInfoZKClassicConnectionStringList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttributeResponseBodyConnectionInfoZKClassicConnectionStringList self = new DescribeClusterAttributeResponseBodyConnectionInfoZKClassicConnectionStringList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttributeResponseBodyConnectionInfoZKClassicConnectionStringList setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class DescribeClusterAttributeResponseBodyConnectionInfoZKConnectionStringList extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static DescribeClusterAttributeResponseBodyConnectionInfoZKConnectionStringList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttributeResponseBodyConnectionInfoZKConnectionStringList self = new DescribeClusterAttributeResponseBodyConnectionInfoZKConnectionStringList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttributeResponseBodyConnectionInfoZKConnectionStringList setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class DescribeClusterAttributeResponseBodyConnectionInfoZKInnerConnectionStringList extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static DescribeClusterAttributeResponseBodyConnectionInfoZKInnerConnectionStringList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttributeResponseBodyConnectionInfoZKInnerConnectionStringList self = new DescribeClusterAttributeResponseBodyConnectionInfoZKInnerConnectionStringList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttributeResponseBodyConnectionInfoZKInnerConnectionStringList setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class DescribeClusterAttributeResponseBodyConnectionInfoZKPublicConnectionStringList extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static DescribeClusterAttributeResponseBodyConnectionInfoZKPublicConnectionStringList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttributeResponseBodyConnectionInfoZKPublicConnectionStringList self = new DescribeClusterAttributeResponseBodyConnectionInfoZKPublicConnectionStringList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttributeResponseBodyConnectionInfoZKPublicConnectionStringList setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class DescribeClusterAttributeResponseBodyConnectionInfo extends TeaModel {
        @NameInMap("HaRestConnectionString")
        public String haRestConnectionString;

        @NameInMap("HaRestPort")
        public String haRestPort;

        @NameInMap("HaThriftConnectionString")
        public String haThriftConnectionString;

        @NameInMap("HaThriftPort")
        public String haThriftPort;

        @NameInMap("ThriftConnectionString")
        public String thriftConnectionString;

        @NameInMap("ThriftPort")
        public String thriftPort;

        @NameInMap("UIProxyConnectionString")
        public String UIProxyConnectionString;

        @NameInMap("ZKClassicConnectionStringList")
        public DescribeClusterAttributeResponseBodyConnectionInfoZKClassicConnectionStringList ZKClassicConnectionStringList;

        @NameInMap("ZKConnectionStringList")
        public DescribeClusterAttributeResponseBodyConnectionInfoZKConnectionStringList ZKConnectionStringList;

        @NameInMap("ZKInnerConnectionStringList")
        public DescribeClusterAttributeResponseBodyConnectionInfoZKInnerConnectionStringList ZKInnerConnectionStringList;

        @NameInMap("ZKPort")
        public Integer ZKPort;

        @NameInMap("ZKPublicConnectionStringList")
        public DescribeClusterAttributeResponseBodyConnectionInfoZKPublicConnectionStringList ZKPublicConnectionStringList;

        public static DescribeClusterAttributeResponseBodyConnectionInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttributeResponseBodyConnectionInfo self = new DescribeClusterAttributeResponseBodyConnectionInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setHaRestConnectionString(String haRestConnectionString) {
            this.haRestConnectionString = haRestConnectionString;
            return this;
        }
        public String getHaRestConnectionString() {
            return this.haRestConnectionString;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setHaRestPort(String haRestPort) {
            this.haRestPort = haRestPort;
            return this;
        }
        public String getHaRestPort() {
            return this.haRestPort;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setHaThriftConnectionString(String haThriftConnectionString) {
            this.haThriftConnectionString = haThriftConnectionString;
            return this;
        }
        public String getHaThriftConnectionString() {
            return this.haThriftConnectionString;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setHaThriftPort(String haThriftPort) {
            this.haThriftPort = haThriftPort;
            return this;
        }
        public String getHaThriftPort() {
            return this.haThriftPort;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setThriftConnectionString(String thriftConnectionString) {
            this.thriftConnectionString = thriftConnectionString;
            return this;
        }
        public String getThriftConnectionString() {
            return this.thriftConnectionString;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setThriftPort(String thriftPort) {
            this.thriftPort = thriftPort;
            return this;
        }
        public String getThriftPort() {
            return this.thriftPort;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setUIProxyConnectionString(String UIProxyConnectionString) {
            this.UIProxyConnectionString = UIProxyConnectionString;
            return this;
        }
        public String getUIProxyConnectionString() {
            return this.UIProxyConnectionString;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setZKClassicConnectionStringList(DescribeClusterAttributeResponseBodyConnectionInfoZKClassicConnectionStringList ZKClassicConnectionStringList) {
            this.ZKClassicConnectionStringList = ZKClassicConnectionStringList;
            return this;
        }
        public DescribeClusterAttributeResponseBodyConnectionInfoZKClassicConnectionStringList getZKClassicConnectionStringList() {
            return this.ZKClassicConnectionStringList;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setZKConnectionStringList(DescribeClusterAttributeResponseBodyConnectionInfoZKConnectionStringList ZKConnectionStringList) {
            this.ZKConnectionStringList = ZKConnectionStringList;
            return this;
        }
        public DescribeClusterAttributeResponseBodyConnectionInfoZKConnectionStringList getZKConnectionStringList() {
            return this.ZKConnectionStringList;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setZKInnerConnectionStringList(DescribeClusterAttributeResponseBodyConnectionInfoZKInnerConnectionStringList ZKInnerConnectionStringList) {
            this.ZKInnerConnectionStringList = ZKInnerConnectionStringList;
            return this;
        }
        public DescribeClusterAttributeResponseBodyConnectionInfoZKInnerConnectionStringList getZKInnerConnectionStringList() {
            return this.ZKInnerConnectionStringList;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setZKPort(Integer ZKPort) {
            this.ZKPort = ZKPort;
            return this;
        }
        public Integer getZKPort() {
            return this.ZKPort;
        }

        public DescribeClusterAttributeResponseBodyConnectionInfo setZKPublicConnectionStringList(DescribeClusterAttributeResponseBodyConnectionInfoZKPublicConnectionStringList ZKPublicConnectionStringList) {
            this.ZKPublicConnectionStringList = ZKPublicConnectionStringList;
            return this;
        }
        public DescribeClusterAttributeResponseBodyConnectionInfoZKPublicConnectionStringList getZKPublicConnectionStringList() {
            return this.ZKPublicConnectionStringList;
        }

    }

    public static class DescribeClusterAttributeResponseBodyNetInfo extends TeaModel {
        @NameInMap("InnerIpAddress")
        public String innerIpAddress;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        @NameInMap("SecurityIpList")
        public String securityIpList;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeClusterAttributeResponseBodyNetInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttributeResponseBodyNetInfo self = new DescribeClusterAttributeResponseBodyNetInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttributeResponseBodyNetInfo setInnerIpAddress(String innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }
        public String getInnerIpAddress() {
            return this.innerIpAddress;
        }

        public DescribeClusterAttributeResponseBodyNetInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeClusterAttributeResponseBodyNetInfo setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeClusterAttributeResponseBodyNetInfo setSecurityIpList(String securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }
        public String getSecurityIpList() {
            return this.securityIpList;
        }

        public DescribeClusterAttributeResponseBodyNetInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeClusterAttributeResponseBodyNetInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeClusterAttributeResponseBodyNodeListNodeDaemonListDaemon extends TeaModel {
        @NameInMap("DaemonName")
        public String daemonName;

        @NameInMap("DaemonStatus")
        public String daemonStatus;

        public static DescribeClusterAttributeResponseBodyNodeListNodeDaemonListDaemon build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttributeResponseBodyNodeListNodeDaemonListDaemon self = new DescribeClusterAttributeResponseBodyNodeListNodeDaemonListDaemon();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttributeResponseBodyNodeListNodeDaemonListDaemon setDaemonName(String daemonName) {
            this.daemonName = daemonName;
            return this;
        }
        public String getDaemonName() {
            return this.daemonName;
        }

        public DescribeClusterAttributeResponseBodyNodeListNodeDaemonListDaemon setDaemonStatus(String daemonStatus) {
            this.daemonStatus = daemonStatus;
            return this;
        }
        public String getDaemonStatus() {
            return this.daemonStatus;
        }

    }

    public static class DescribeClusterAttributeResponseBodyNodeListNodeDaemonList extends TeaModel {
        @NameInMap("Daemon")
        public java.util.List<DescribeClusterAttributeResponseBodyNodeListNodeDaemonListDaemon> daemon;

        public static DescribeClusterAttributeResponseBodyNodeListNodeDaemonList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttributeResponseBodyNodeListNodeDaemonList self = new DescribeClusterAttributeResponseBodyNodeListNodeDaemonList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttributeResponseBodyNodeListNodeDaemonList setDaemon(java.util.List<DescribeClusterAttributeResponseBodyNodeListNodeDaemonListDaemon> daemon) {
            this.daemon = daemon;
            return this;
        }
        public java.util.List<DescribeClusterAttributeResponseBodyNodeListNodeDaemonListDaemon> getDaemon() {
            return this.daemon;
        }

    }

    public static class DescribeClusterAttributeResponseBodyNodeListNode extends TeaModel {
        @NameInMap("DaemonList")
        public DescribeClusterAttributeResponseBodyNodeListNodeDaemonList daemonList;

        @NameInMap("MemStore")
        public String memStore;

        @NameInMap("NodeDiskQuantity")
        public String nodeDiskQuantity;

        @NameInMap("NodeDiskSize")
        public String nodeDiskSize;

        @NameInMap("NodeDiskType")
        public String nodeDiskType;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeInstanceType")
        public String nodeInstanceType;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("RegionQuantity")
        public String regionQuantity;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("StoreFile")
        public String storeFile;

        public static DescribeClusterAttributeResponseBodyNodeListNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttributeResponseBodyNodeListNode self = new DescribeClusterAttributeResponseBodyNodeListNode();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setDaemonList(DescribeClusterAttributeResponseBodyNodeListNodeDaemonList daemonList) {
            this.daemonList = daemonList;
            return this;
        }
        public DescribeClusterAttributeResponseBodyNodeListNodeDaemonList getDaemonList() {
            return this.daemonList;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setMemStore(String memStore) {
            this.memStore = memStore;
            return this;
        }
        public String getMemStore() {
            return this.memStore;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setNodeDiskQuantity(String nodeDiskQuantity) {
            this.nodeDiskQuantity = nodeDiskQuantity;
            return this;
        }
        public String getNodeDiskQuantity() {
            return this.nodeDiskQuantity;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setNodeDiskSize(String nodeDiskSize) {
            this.nodeDiskSize = nodeDiskSize;
            return this;
        }
        public String getNodeDiskSize() {
            return this.nodeDiskSize;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setNodeDiskType(String nodeDiskType) {
            this.nodeDiskType = nodeDiskType;
            return this;
        }
        public String getNodeDiskType() {
            return this.nodeDiskType;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setNodeInstanceType(String nodeInstanceType) {
            this.nodeInstanceType = nodeInstanceType;
            return this;
        }
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setRegionQuantity(String regionQuantity) {
            this.regionQuantity = regionQuantity;
            return this;
        }
        public String getRegionQuantity() {
            return this.regionQuantity;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public DescribeClusterAttributeResponseBodyNodeListNode setStoreFile(String storeFile) {
            this.storeFile = storeFile;
            return this;
        }
        public String getStoreFile() {
            return this.storeFile;
        }

    }

    public static class DescribeClusterAttributeResponseBodyNodeList extends TeaModel {
        @NameInMap("Node")
        public java.util.List<DescribeClusterAttributeResponseBodyNodeListNode> node;

        public static DescribeClusterAttributeResponseBodyNodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterAttributeResponseBodyNodeList self = new DescribeClusterAttributeResponseBodyNodeList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterAttributeResponseBodyNodeList setNode(java.util.List<DescribeClusterAttributeResponseBodyNodeListNode> node) {
            this.node = node;
            return this;
        }
        public java.util.List<DescribeClusterAttributeResponseBodyNodeListNode> getNode() {
            return this.node;
        }

    }

}
