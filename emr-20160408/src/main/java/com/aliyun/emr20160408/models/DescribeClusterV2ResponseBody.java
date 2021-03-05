// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterV2ResponseBody extends TeaModel {
    @NameInMap("ClusterInfo")
    public DescribeClusterV2ResponseBodyClusterInfo clusterInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterV2ResponseBody self = new DescribeClusterV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterV2ResponseBody setClusterInfo(DescribeClusterV2ResponseBodyClusterInfo clusterInfo) {
        this.clusterInfo = clusterInfo;
        return this;
    }
    public DescribeClusterV2ResponseBodyClusterInfo getClusterInfo() {
        return this.clusterInfo;
    }

    public DescribeClusterV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo self = new DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoFailReason extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static DescribeClusterV2ResponseBodyClusterInfoFailReason build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoFailReason self = new DescribeClusterV2ResponseBodyClusterInfoFailReason();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoFailReason setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeClusterV2ResponseBodyClusterInfoFailReason setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeClusterV2ResponseBodyClusterInfoFailReason setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("StartTpe")
        public Integer startTpe;

        @NameInMap("Version")
        public String version;

        @NameInMap("OnlyDisplay")
        public Boolean onlyDisplay;

        @NameInMap("Name")
        public String name;

        public static DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware self = new DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setStartTpe(Integer startTpe) {
            this.startTpe = startTpe;
            return this;
        }
        public Integer getStartTpe() {
            return this.startTpe;
        }

        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setOnlyDisplay(Boolean onlyDisplay) {
            this.onlyDisplay = onlyDisplay;
            return this;
        }
        public Boolean getOnlyDisplay() {
            return this.onlyDisplay;
        }

        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwares extends TeaModel {
        @NameInMap("Software")
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware> software;

        public static DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwares build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwares self = new DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwares();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwares setSoftware(java.util.List<DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware> software) {
            this.software = software;
            return this;
        }
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwaresSoftware> getSoftware() {
            return this.software;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoSoftwareInfo extends TeaModel {
        @NameInMap("EmrVer")
        public String emrVer;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("Softwares")
        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwares softwares;

        public static DescribeClusterV2ResponseBodyClusterInfoSoftwareInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoSoftwareInfo self = new DescribeClusterV2ResponseBodyClusterInfoSoftwareInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfo setEmrVer(String emrVer) {
            this.emrVer = emrVer;
            return this;
        }
        public String getEmrVer() {
            return this.emrVer;
        }

        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfo setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfo setSoftwares(DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwares softwares) {
            this.softwares = softwares;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfoSoftwares getSoftwares() {
            return this.softwares;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinksZKLink extends TeaModel {
        @NameInMap("Link")
        public String link;

        @NameInMap("Port")
        public String port;

        public static DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinksZKLink build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinksZKLink self = new DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinksZKLink();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinksZKLink setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinksZKLink setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinks extends TeaModel {
        @NameInMap("ZKLink")
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinksZKLink> ZKLink;

        public static DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinks build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinks self = new DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinks();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinks setZKLink(java.util.List<DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinksZKLink> ZKLink) {
            this.ZKLink = ZKLink;
            return this;
        }
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinksZKLink> getZKLink() {
            return this.ZKLink;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoAccessInfo extends TeaModel {
        @NameInMap("ZKLinks")
        public DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinks ZKLinks;

        public static DescribeClusterV2ResponseBodyClusterInfoAccessInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoAccessInfo self = new DescribeClusterV2ResponseBodyClusterInfoAccessInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoAccessInfo setZKLinks(DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinks ZKLinks) {
            this.ZKLinks = ZKLinks;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoAccessInfoZKLinks getZKLinks() {
            return this.ZKLinks;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Device")
        public String device;

        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("DiskId")
        public String diskId;

        public static DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo self = new DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfos extends TeaModel {
        @NameInMap("DiskInfo")
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo> diskInfo;

        public static DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfos self = new DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfos();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfos setDiskInfo(java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo> diskInfo) {
            this.diskInfo = diskInfo;
            return this;
        }
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfosDiskInfo> getDiskInfo() {
            return this.diskInfo;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfosDaemonInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfosDaemonInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfosDaemonInfo self = new DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfosDaemonInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfosDaemonInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfos extends TeaModel {
        @NameInMap("DaemonInfo")
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfosDaemonInfo> daemonInfo;

        public static DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfos self = new DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfos();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfos setDaemonInfo(java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfosDaemonInfo> daemonInfo) {
            this.daemonInfo = daemonInfo;
            return this;
        }
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfosDaemonInfo> getDaemonInfo() {
            return this.daemonInfo;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SupportIpV6")
        public Boolean supportIpV6;

        @NameInMap("InnerIp")
        public String innerIp;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DiskInfos")
        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfos diskInfos;

        @NameInMap("EmrExpiredTime")
        public String emrExpiredTime;

        @NameInMap("PubIp")
        public String pubIp;

        @NameInMap("DaemonInfos")
        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfos daemonInfos;

        public static DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode self = new DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setSupportIpV6(Boolean supportIpV6) {
            this.supportIpV6 = supportIpV6;
            return this;
        }
        public Boolean getSupportIpV6() {
            return this.supportIpV6;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setInnerIp(String innerIp) {
            this.innerIp = innerIp;
            return this;
        }
        public String getInnerIp() {
            return this.innerIp;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setDiskInfos(DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfos diskInfos) {
            this.diskInfos = diskInfos;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDiskInfos getDiskInfos() {
            return this.diskInfos;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setEmrExpiredTime(String emrExpiredTime) {
            this.emrExpiredTime = emrExpiredTime;
            return this;
        }
        public String getEmrExpiredTime() {
            return this.emrExpiredTime;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setPubIp(String pubIp) {
            this.pubIp = pubIp;
            return this;
        }
        public String getPubIp() {
            return this.pubIp;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode setDaemonInfos(DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfos daemonInfos) {
            this.daemonInfos = daemonInfos;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNodeDaemonInfos getDaemonInfos() {
            return this.daemonInfos;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodes extends TeaModel {
        @NameInMap("Node")
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode> node;

        public static DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodes self = new DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodes();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodes setNode(java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode> node) {
            this.node = node;
            return this;
        }
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodesNode> getNode() {
            return this.node;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup extends TeaModel {
        @NameInMap("Nodes")
        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodes nodes;

        @NameInMap("LockType")
        public String lockType;

        @NameInMap("HostGroupType")
        public String hostGroupType;

        @NameInMap("HostGroupSubType")
        public String hostGroupSubType;

        @NameInMap("HostGroupChangeStatus")
        public String hostGroupChangeStatus;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("LockReason")
        public String lockReason;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("BandWidth")
        public String bandWidth;

        @NameInMap("DiskCount")
        public Integer diskCount;

        @NameInMap("Period")
        public String period;

        @NameInMap("DiskCapacity")
        public Integer diskCapacity;

        @NameInMap("CpuCore")
        public Integer cpuCore;

        @NameInMap("MemoryCapacity")
        public Integer memoryCapacity;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("HostGroupChangeType")
        public String hostGroupChangeType;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        public static DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup self = new DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setNodes(DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodes nodes) {
            this.nodes = nodes;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroupNodes getNodes() {
            return this.nodes;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setLockType(String lockType) {
            this.lockType = lockType;
            return this;
        }
        public String getLockType() {
            return this.lockType;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setHostGroupSubType(String hostGroupSubType) {
            this.hostGroupSubType = hostGroupSubType;
            return this;
        }
        public String getHostGroupSubType() {
            return this.hostGroupSubType;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setHostGroupChangeStatus(String hostGroupChangeStatus) {
            this.hostGroupChangeStatus = hostGroupChangeStatus;
            return this;
        }
        public String getHostGroupChangeStatus() {
            return this.hostGroupChangeStatus;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setBandWidth(String bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public String getBandWidth() {
            return this.bandWidth;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setCpuCore(Integer cpuCore) {
            this.cpuCore = cpuCore;
            return this;
        }
        public Integer getCpuCore() {
            return this.cpuCore;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setMemoryCapacity(Integer memoryCapacity) {
            this.memoryCapacity = memoryCapacity;
            return this;
        }
        public Integer getMemoryCapacity() {
            return this.memoryCapacity;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setHostGroupChangeType(String hostGroupChangeType) {
            this.hostGroupChangeType = hostGroupChangeType;
            return this;
        }
        public String getHostGroupChangeType() {
            return this.hostGroupChangeType;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoHostGroupList extends TeaModel {
        @NameInMap("HostGroup")
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup> hostGroup;

        public static DescribeClusterV2ResponseBodyClusterInfoHostGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoHostGroupList self = new DescribeClusterV2ResponseBodyClusterInfoHostGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostGroupList setHostGroup(java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup> hostGroup) {
            this.hostGroup = hostGroup;
            return this;
        }
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoHostGroupListHostGroup> getHostGroup() {
            return this.hostGroup;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoBootstrapActionListBootstrapAction extends TeaModel {
        @NameInMap("Arg")
        public String arg;

        @NameInMap("Path")
        public String path;

        @NameInMap("Name")
        public String name;

        public static DescribeClusterV2ResponseBodyClusterInfoBootstrapActionListBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoBootstrapActionListBootstrapAction self = new DescribeClusterV2ResponseBodyClusterInfoBootstrapActionListBootstrapAction();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoBootstrapActionListBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public DescribeClusterV2ResponseBodyClusterInfoBootstrapActionListBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeClusterV2ResponseBodyClusterInfoBootstrapActionListBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoBootstrapActionList extends TeaModel {
        @NameInMap("BootstrapAction")
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoBootstrapActionListBootstrapAction> bootstrapAction;

        public static DescribeClusterV2ResponseBodyClusterInfoBootstrapActionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoBootstrapActionList self = new DescribeClusterV2ResponseBodyClusterInfoBootstrapActionList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoBootstrapActionList setBootstrapAction(java.util.List<DescribeClusterV2ResponseBodyClusterInfoBootstrapActionListBootstrapAction> bootstrapAction) {
            this.bootstrapAction = bootstrapAction;
            return this;
        }
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoBootstrapActionListBootstrapAction> getBootstrapAction() {
            return this.bootstrapAction;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo self = new DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoList extends TeaModel {
        @NameInMap("GatewayClusterInfo")
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo> gatewayClusterInfo;

        public static DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoList self = new DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoList setGatewayClusterInfo(java.util.List<DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo> gatewayClusterInfo) {
            this.gatewayClusterInfo = gatewayClusterInfo;
            return this;
        }
        public java.util.List<DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoListGatewayClusterInfo> getGatewayClusterInfo() {
            return this.gatewayClusterInfo;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfoHostPoolInfo extends TeaModel {
        @NameInMap("HpBizId")
        public String hpBizId;

        @NameInMap("HpName")
        public String hpName;

        public static DescribeClusterV2ResponseBodyClusterInfoHostPoolInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfoHostPoolInfo self = new DescribeClusterV2ResponseBodyClusterInfoHostPoolInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostPoolInfo setHpBizId(String hpBizId) {
            this.hpBizId = hpBizId;
            return this;
        }
        public String getHpBizId() {
            return this.hpBizId;
        }

        public DescribeClusterV2ResponseBodyClusterInfoHostPoolInfo setHpName(String hpName) {
            this.hpName = hpName;
            return this;
        }
        public String getHpName() {
            return this.hpName;
        }

    }

    public static class DescribeClusterV2ResponseBodyClusterInfo extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("LogEnable")
        public Boolean logEnable;

        @NameInMap("TaskNodeInService")
        public Integer taskNodeInService;

        @NameInMap("AutoScalingSpotWithLimitAllowed")
        public Boolean autoScalingSpotWithLimitAllowed;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("StopTime")
        public Long stopTime;

        @NameInMap("CreateType")
        public String createType;

        @NameInMap("DepositType")
        public String depositType;

        @NameInMap("RelateClusterInfo")
        public DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo relateClusterInfo;

        @NameInMap("RelateClusterId")
        public String relateClusterId;

        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        @NameInMap("ResizeDiskEnable")
        public Boolean resizeDiskEnable;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("FailReason")
        public DescribeClusterV2ResponseBodyClusterInfoFailReason failReason;

        @NameInMap("UserDefinedEmrEcsRole")
        public String userDefinedEmrEcsRole;

        @NameInMap("MetaStoreType")
        public String metaStoreType;

        @NameInMap("SoftwareInfo")
        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfo softwareInfo;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Configurations")
        public String configurations;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("AutoScalingVersion")
        public String autoScalingVersion;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("AccessInfo")
        public DescribeClusterV2ResponseBodyClusterInfoAccessInfo accessInfo;

        @NameInMap("CreateResource")
        public String createResource;

        @NameInMap("Status")
        public String status;

        @NameInMap("RunningTime")
        public Integer runningTime;

        @NameInMap("HighAvailabilityEnable")
        public Boolean highAvailabilityEnable;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("AutoScalingAllowed")
        public Boolean autoScalingAllowed;

        @NameInMap("HostGroupList")
        public DescribeClusterV2ResponseBodyClusterInfoHostGroupList hostGroupList;

        @NameInMap("MasterNodeInService")
        public Integer masterNodeInService;

        @NameInMap("AutoScalingEnable")
        public Boolean autoScalingEnable;

        @NameInMap("AutoScalingWithGraceAllowed")
        public Boolean autoScalingWithGraceAllowed;

        @NameInMap("ShowSoftwareInterface")
        public Boolean showSoftwareInterface;

        @NameInMap("CoreNodeInService")
        public Integer coreNodeInService;

        @NameInMap("AutoScalingByLoadAllowed")
        public Boolean autoScalingByLoadAllowed;

        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        @NameInMap("LocalMetaDb")
        public Boolean localMetaDb;

        @NameInMap("BootstrapActionList")
        public DescribeClusterV2ResponseBodyClusterInfoBootstrapActionList bootstrapActionList;

        @NameInMap("GatewayClusterInfoList")
        public DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoList gatewayClusterInfoList;

        @NameInMap("InstanceGeneration")
        public String instanceGeneration;

        @NameInMap("Name")
        public String name;

        @NameInMap("EasEnable")
        public Boolean easEnable;

        @NameInMap("MachineType")
        public String machineType;

        @NameInMap("HostPoolInfo")
        public DescribeClusterV2ResponseBodyClusterInfoHostPoolInfo hostPoolInfo;

        @NameInMap("MasterNodeTotal")
        public Integer masterNodeTotal;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        @NameInMap("CoreNodeTotal")
        public Integer coreNodeTotal;

        @NameInMap("GatewayClusterIds")
        public String gatewayClusterIds;

        @NameInMap("BootstrapFailed")
        public Boolean bootstrapFailed;

        @NameInMap("Id")
        public String id;

        @NameInMap("TaskNodeTotal")
        public Integer taskNodeTotal;

        public static DescribeClusterV2ResponseBodyClusterInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterV2ResponseBodyClusterInfo self = new DescribeClusterV2ResponseBodyClusterInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterV2ResponseBodyClusterInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setLogEnable(Boolean logEnable) {
            this.logEnable = logEnable;
            return this;
        }
        public Boolean getLogEnable() {
            return this.logEnable;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setTaskNodeInService(Integer taskNodeInService) {
            this.taskNodeInService = taskNodeInService;
            return this;
        }
        public Integer getTaskNodeInService() {
            return this.taskNodeInService;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setAutoScalingSpotWithLimitAllowed(Boolean autoScalingSpotWithLimitAllowed) {
            this.autoScalingSpotWithLimitAllowed = autoScalingSpotWithLimitAllowed;
            return this;
        }
        public Boolean getAutoScalingSpotWithLimitAllowed() {
            return this.autoScalingSpotWithLimitAllowed;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setStopTime(Long stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public Long getStopTime() {
            return this.stopTime;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setDepositType(String depositType) {
            this.depositType = depositType;
            return this;
        }
        public String getDepositType() {
            return this.depositType;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setRelateClusterInfo(DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo relateClusterInfo) {
            this.relateClusterInfo = relateClusterInfo;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoRelateClusterInfo getRelateClusterInfo() {
            return this.relateClusterInfo;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setRelateClusterId(String relateClusterId) {
            this.relateClusterId = relateClusterId;
            return this;
        }
        public String getRelateClusterId() {
            return this.relateClusterId;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setResizeDiskEnable(Boolean resizeDiskEnable) {
            this.resizeDiskEnable = resizeDiskEnable;
            return this;
        }
        public Boolean getResizeDiskEnable() {
            return this.resizeDiskEnable;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setFailReason(DescribeClusterV2ResponseBodyClusterInfoFailReason failReason) {
            this.failReason = failReason;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoFailReason getFailReason() {
            return this.failReason;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setUserDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
            this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
            return this;
        }
        public String getUserDefinedEmrEcsRole() {
            return this.userDefinedEmrEcsRole;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setMetaStoreType(String metaStoreType) {
            this.metaStoreType = metaStoreType;
            return this;
        }
        public String getMetaStoreType() {
            return this.metaStoreType;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setSoftwareInfo(DescribeClusterV2ResponseBodyClusterInfoSoftwareInfo softwareInfo) {
            this.softwareInfo = softwareInfo;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoSoftwareInfo getSoftwareInfo() {
            return this.softwareInfo;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setConfigurations(String configurations) {
            this.configurations = configurations;
            return this;
        }
        public String getConfigurations() {
            return this.configurations;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setAutoScalingVersion(String autoScalingVersion) {
            this.autoScalingVersion = autoScalingVersion;
            return this;
        }
        public String getAutoScalingVersion() {
            return this.autoScalingVersion;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setAccessInfo(DescribeClusterV2ResponseBodyClusterInfoAccessInfo accessInfo) {
            this.accessInfo = accessInfo;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoAccessInfo getAccessInfo() {
            return this.accessInfo;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setCreateResource(String createResource) {
            this.createResource = createResource;
            return this;
        }
        public String getCreateResource() {
            return this.createResource;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setRunningTime(Integer runningTime) {
            this.runningTime = runningTime;
            return this;
        }
        public Integer getRunningTime() {
            return this.runningTime;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setHighAvailabilityEnable(Boolean highAvailabilityEnable) {
            this.highAvailabilityEnable = highAvailabilityEnable;
            return this;
        }
        public Boolean getHighAvailabilityEnable() {
            return this.highAvailabilityEnable;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setAutoScalingAllowed(Boolean autoScalingAllowed) {
            this.autoScalingAllowed = autoScalingAllowed;
            return this;
        }
        public Boolean getAutoScalingAllowed() {
            return this.autoScalingAllowed;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setHostGroupList(DescribeClusterV2ResponseBodyClusterInfoHostGroupList hostGroupList) {
            this.hostGroupList = hostGroupList;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoHostGroupList getHostGroupList() {
            return this.hostGroupList;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setMasterNodeInService(Integer masterNodeInService) {
            this.masterNodeInService = masterNodeInService;
            return this;
        }
        public Integer getMasterNodeInService() {
            return this.masterNodeInService;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setAutoScalingEnable(Boolean autoScalingEnable) {
            this.autoScalingEnable = autoScalingEnable;
            return this;
        }
        public Boolean getAutoScalingEnable() {
            return this.autoScalingEnable;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setAutoScalingWithGraceAllowed(Boolean autoScalingWithGraceAllowed) {
            this.autoScalingWithGraceAllowed = autoScalingWithGraceAllowed;
            return this;
        }
        public Boolean getAutoScalingWithGraceAllowed() {
            return this.autoScalingWithGraceAllowed;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setShowSoftwareInterface(Boolean showSoftwareInterface) {
            this.showSoftwareInterface = showSoftwareInterface;
            return this;
        }
        public Boolean getShowSoftwareInterface() {
            return this.showSoftwareInterface;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setCoreNodeInService(Integer coreNodeInService) {
            this.coreNodeInService = coreNodeInService;
            return this;
        }
        public Integer getCoreNodeInService() {
            return this.coreNodeInService;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setAutoScalingByLoadAllowed(Boolean autoScalingByLoadAllowed) {
            this.autoScalingByLoadAllowed = autoScalingByLoadAllowed;
            return this;
        }
        public Boolean getAutoScalingByLoadAllowed() {
            return this.autoScalingByLoadAllowed;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setLocalMetaDb(Boolean localMetaDb) {
            this.localMetaDb = localMetaDb;
            return this;
        }
        public Boolean getLocalMetaDb() {
            return this.localMetaDb;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setBootstrapActionList(DescribeClusterV2ResponseBodyClusterInfoBootstrapActionList bootstrapActionList) {
            this.bootstrapActionList = bootstrapActionList;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoBootstrapActionList getBootstrapActionList() {
            return this.bootstrapActionList;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setGatewayClusterInfoList(DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoList gatewayClusterInfoList) {
            this.gatewayClusterInfoList = gatewayClusterInfoList;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoGatewayClusterInfoList getGatewayClusterInfoList() {
            return this.gatewayClusterInfoList;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setInstanceGeneration(String instanceGeneration) {
            this.instanceGeneration = instanceGeneration;
            return this;
        }
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setEasEnable(Boolean easEnable) {
            this.easEnable = easEnable;
            return this;
        }
        public Boolean getEasEnable() {
            return this.easEnable;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setHostPoolInfo(DescribeClusterV2ResponseBodyClusterInfoHostPoolInfo hostPoolInfo) {
            this.hostPoolInfo = hostPoolInfo;
            return this;
        }
        public DescribeClusterV2ResponseBodyClusterInfoHostPoolInfo getHostPoolInfo() {
            return this.hostPoolInfo;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setMasterNodeTotal(Integer masterNodeTotal) {
            this.masterNodeTotal = masterNodeTotal;
            return this;
        }
        public Integer getMasterNodeTotal() {
            return this.masterNodeTotal;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setCoreNodeTotal(Integer coreNodeTotal) {
            this.coreNodeTotal = coreNodeTotal;
            return this;
        }
        public Integer getCoreNodeTotal() {
            return this.coreNodeTotal;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setGatewayClusterIds(String gatewayClusterIds) {
            this.gatewayClusterIds = gatewayClusterIds;
            return this;
        }
        public String getGatewayClusterIds() {
            return this.gatewayClusterIds;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setBootstrapFailed(Boolean bootstrapFailed) {
            this.bootstrapFailed = bootstrapFailed;
            return this;
        }
        public Boolean getBootstrapFailed() {
            return this.bootstrapFailed;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeClusterV2ResponseBodyClusterInfo setTaskNodeTotal(Integer taskNodeTotal) {
            this.taskNodeTotal = taskNodeTotal;
            return this;
        }
        public Integer getTaskNodeTotal() {
            return this.taskNodeTotal;
        }

    }

}
