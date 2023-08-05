// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<DescribeAssetDetailByUuidsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAssetDetailByUuidsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetDetailByUuidsResponseBody self = new DescribeAssetDetailByUuidsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetDetailByUuidsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAssetDetailByUuidsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeAssetDetailByUuidsResponseBody setData(java.util.List<DescribeAssetDetailByUuidsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAssetDetailByUuidsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAssetDetailByUuidsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAssetDetailByUuidsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetDetailByUuidsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAssetDetailByUuidsResponseBodyDataDiskInfoList extends TeaModel {
        @NameInMap("DiskName")
        public String diskName;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("UseSize")
        public Long useSize;

        public static DescribeAssetDetailByUuidsResponseBodyDataDiskInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetDetailByUuidsResponseBodyDataDiskInfoList self = new DescribeAssetDetailByUuidsResponseBodyDataDiskInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAssetDetailByUuidsResponseBodyDataDiskInfoList setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public DescribeAssetDetailByUuidsResponseBodyDataDiskInfoList setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public DescribeAssetDetailByUuidsResponseBodyDataDiskInfoList setUseSize(Long useSize) {
            this.useSize = useSize;
            return this;
        }
        public Long getUseSize() {
            return this.useSize;
        }

    }

    public static class DescribeAssetDetailByUuidsResponseBodyData extends TeaModel {
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("AssetType")
        public String assetType;

        @NameInMap("AssetTypeName")
        public String assetTypeName;

        @NameInMap("AuthModifyTime")
        public Long authModifyTime;

        @NameInMap("AuthVersion")
        public Integer authVersion;

        @NameInMap("AuthVersionName")
        public String authVersionName;

        @NameInMap("Bind")
        public Boolean bind;

        @NameInMap("ClientStatus")
        public String clientStatus;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Cores")
        public Integer cores;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CpuInfo")
        public String cpuInfo;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("DiskInfoList")
        public java.util.List<DescribeAssetDetailByUuidsResponseBodyDataDiskInfoList> diskInfoList;

        @NameInMap("ExposedStatus")
        public Integer exposedStatus;

        @NameInMap("Flag")
        public Integer flag;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupTrace")
        public String groupTrace;

        @NameInMap("HasContainer")
        public String hasContainer;

        @NameInMap("HcStatus")
        public String hcStatus;

        @NameInMap("HealthCheckCount")
        public Integer healthCheckCount;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Importance")
        public Integer importance;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("IpList")
        public java.util.List<String> ipList;

        @NameInMap("IpListString")
        public String ipListString;

        @NameInMap("Kernel")
        public String kernel;

        @NameInMap("LastLoginTimestamp")
        public Long lastLoginTimestamp;

        @NameInMap("MacList")
        public java.util.List<String> macList;

        @NameInMap("MacListString")
        public String macListString;

        @NameInMap("Mem")
        public Integer mem;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsDetail")
        public String osDetail;

        @NameInMap("OsName")
        public String osName;

        @NameInMap("PodCount")
        public Integer podCount;

        @NameInMap("Region")
        public String region;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("RiskCount")
        public String riskCount;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("SafeEventCount")
        public Integer safeEventCount;

        @NameInMap("Status")
        public String status;

        @NameInMap("SysInfo")
        public String sysInfo;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TagId")
        public String tagId;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Vendor")
        public Integer vendor;

        @NameInMap("VendorName")
        public String vendorName;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        @NameInMap("VulCount")
        public Integer vulCount;

        @NameInMap("VulStatus")
        public String vulStatus;

        public static DescribeAssetDetailByUuidsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetDetailByUuidsResponseBodyData self = new DescribeAssetDetailByUuidsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAssetDetailByUuidsResponseBodyData setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setAssetTypeName(String assetTypeName) {
            this.assetTypeName = assetTypeName;
            return this;
        }
        public String getAssetTypeName() {
            return this.assetTypeName;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setAuthModifyTime(Long authModifyTime) {
            this.authModifyTime = authModifyTime;
            return this;
        }
        public Long getAuthModifyTime() {
            return this.authModifyTime;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setAuthVersion(Integer authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public Integer getAuthVersion() {
            return this.authVersion;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setAuthVersionName(String authVersionName) {
            this.authVersionName = authVersionName;
            return this;
        }
        public String getAuthVersionName() {
            return this.authVersionName;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setCores(Integer cores) {
            this.cores = cores;
            return this;
        }
        public Integer getCores() {
            return this.cores;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setCpuInfo(String cpuInfo) {
            this.cpuInfo = cpuInfo;
            return this;
        }
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setDiskInfoList(java.util.List<DescribeAssetDetailByUuidsResponseBodyDataDiskInfoList> diskInfoList) {
            this.diskInfoList = diskInfoList;
            return this;
        }
        public java.util.List<DescribeAssetDetailByUuidsResponseBodyDataDiskInfoList> getDiskInfoList() {
            return this.diskInfoList;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setExposedStatus(Integer exposedStatus) {
            this.exposedStatus = exposedStatus;
            return this;
        }
        public Integer getExposedStatus() {
            return this.exposedStatus;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setGroupTrace(String groupTrace) {
            this.groupTrace = groupTrace;
            return this;
        }
        public String getGroupTrace() {
            return this.groupTrace;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setHasContainer(String hasContainer) {
            this.hasContainer = hasContainer;
            return this;
        }
        public String getHasContainer() {
            return this.hasContainer;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setHcStatus(String hcStatus) {
            this.hcStatus = hcStatus;
            return this;
        }
        public String getHcStatus() {
            return this.hcStatus;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setHealthCheckCount(Integer healthCheckCount) {
            this.healthCheckCount = healthCheckCount;
            return this;
        }
        public Integer getHealthCheckCount() {
            return this.healthCheckCount;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setImportance(Integer importance) {
            this.importance = importance;
            return this;
        }
        public Integer getImportance() {
            return this.importance;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setIpList(java.util.List<String> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<String> getIpList() {
            return this.ipList;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setIpListString(String ipListString) {
            this.ipListString = ipListString;
            return this;
        }
        public String getIpListString() {
            return this.ipListString;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setKernel(String kernel) {
            this.kernel = kernel;
            return this;
        }
        public String getKernel() {
            return this.kernel;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setLastLoginTimestamp(Long lastLoginTimestamp) {
            this.lastLoginTimestamp = lastLoginTimestamp;
            return this;
        }
        public Long getLastLoginTimestamp() {
            return this.lastLoginTimestamp;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setMacList(java.util.List<String> macList) {
            this.macList = macList;
            return this;
        }
        public java.util.List<String> getMacList() {
            return this.macList;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setMacListString(String macListString) {
            this.macListString = macListString;
            return this;
        }
        public String getMacListString() {
            return this.macListString;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setMem(Integer mem) {
            this.mem = mem;
            return this;
        }
        public Integer getMem() {
            return this.mem;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setOsDetail(String osDetail) {
            this.osDetail = osDetail;
            return this;
        }
        public String getOsDetail() {
            return this.osDetail;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setRiskCount(String riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public String getRiskCount() {
            return this.riskCount;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setSafeEventCount(Integer safeEventCount) {
            this.safeEventCount = safeEventCount;
            return this;
        }
        public Integer getSafeEventCount() {
            return this.safeEventCount;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setSysInfo(String sysInfo) {
            this.sysInfo = sysInfo;
            return this;
        }
        public String getSysInfo() {
            return this.sysInfo;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setVulCount(Integer vulCount) {
            this.vulCount = vulCount;
            return this;
        }
        public Integer getVulCount() {
            return this.vulCount;
        }

        public DescribeAssetDetailByUuidsResponseBodyData setVulStatus(String vulStatus) {
            this.vulStatus = vulStatus;
            return this;
        }
        public String getVulStatus() {
            return this.vulStatus;
        }

    }

}
