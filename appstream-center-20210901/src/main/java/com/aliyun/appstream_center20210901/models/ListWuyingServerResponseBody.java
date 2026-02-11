// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListWuyingServerResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of workstation information.</p>
     */
    @NameInMap("WuyingServerList")
    public java.util.List<ListWuyingServerResponseBodyWuyingServerList> wuyingServerList;

    public static ListWuyingServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWuyingServerResponseBody self = new ListWuyingServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWuyingServerResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWuyingServerResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWuyingServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWuyingServerResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListWuyingServerResponseBody setWuyingServerList(java.util.List<ListWuyingServerResponseBodyWuyingServerList> wuyingServerList) {
        this.wuyingServerList = wuyingServerList;
        return this;
    }
    public java.util.List<ListWuyingServerResponseBodyWuyingServerList> getWuyingServerList() {
        return this.wuyingServerList;
    }

    public static class ListWuyingServerResponseBodyWuyingServerListDataDisk extends TeaModel {
        /**
         * <p>The category of data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        @NameInMap("DataDiskId")
        public String dataDiskId;

        @NameInMap("DataDiskNo")
        public String dataDiskNo;

        /**
         * <p>The PL of the data disk.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        /**
         * <p>The size of the data disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        public static ListWuyingServerResponseBodyWuyingServerListDataDisk build(java.util.Map<String, ?> map) throws Exception {
            ListWuyingServerResponseBodyWuyingServerListDataDisk self = new ListWuyingServerResponseBodyWuyingServerListDataDisk();
            return TeaModel.build(map, self);
        }

        public ListWuyingServerResponseBodyWuyingServerListDataDisk setDataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }
        public String getDataDiskCategory() {
            return this.dataDiskCategory;
        }

        public ListWuyingServerResponseBodyWuyingServerListDataDisk setDataDiskId(String dataDiskId) {
            this.dataDiskId = dataDiskId;
            return this;
        }
        public String getDataDiskId() {
            return this.dataDiskId;
        }

        public ListWuyingServerResponseBodyWuyingServerListDataDisk setDataDiskNo(String dataDiskNo) {
            this.dataDiskNo = dataDiskNo;
            return this;
        }
        public String getDataDiskNo() {
            return this.dataDiskNo;
        }

        public ListWuyingServerResponseBodyWuyingServerListDataDisk setDataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
            this.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
            return this;
        }
        public String getDataDiskPerformanceLevel() {
            return this.dataDiskPerformanceLevel;
        }

        public ListWuyingServerResponseBodyWuyingServerListDataDisk setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

    }

    public static class ListWuyingServerResponseBodyWuyingServerListInstanceInfoList extends TeaModel {
        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0ceitx****c5</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-uf65b****dfnt3wb</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        public static ListWuyingServerResponseBodyWuyingServerListInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListWuyingServerResponseBodyWuyingServerListInstanceInfoList self = new ListWuyingServerResponseBodyWuyingServerListInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public ListWuyingServerResponseBodyWuyingServerListInstanceInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListWuyingServerResponseBodyWuyingServerListInstanceInfoList setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

    }

    public static class ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo extends TeaModel {
        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Gpu")
        public String gpu;

        /**
         * <p>The memory size. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>196,608</p>
         */
        @NameInMap("GpuMemory")
        public Integer gpuMemory;

        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The memory size. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>393,216</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>Workstation specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.proworkstation_flagship_elite_ne.96c384g.192g4x</p>
         */
        @NameInMap("ServerInstanceType")
        public String serverInstanceType;

        public static ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo self = new ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo();
            return TeaModel.build(map, self);
        }

        public ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        public String getGpu() {
            return this.gpu;
        }

        public ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo setGpuMemory(Integer gpuMemory) {
            this.gpuMemory = gpuMemory;
            return this;
        }
        public Integer getGpuMemory() {
            return this.gpuMemory;
        }

        public ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo setServerInstanceType(String serverInstanceType) {
            this.serverInstanceType = serverInstanceType;
            return this;
        }
        public String getServerInstanceType() {
            return this.serverInstanceType;
        }

    }

    public static class ListWuyingServerResponseBodyWuyingServerListSessions extends TeaModel {
        @NameInMap("ResourceSessionStartTime")
        public String resourceSessionStartTime;

        @NameInMap("UserId")
        public String userId;

        public static ListWuyingServerResponseBodyWuyingServerListSessions build(java.util.Map<String, ?> map) throws Exception {
            ListWuyingServerResponseBodyWuyingServerListSessions self = new ListWuyingServerResponseBodyWuyingServerListSessions();
            return TeaModel.build(map, self);
        }

        public ListWuyingServerResponseBodyWuyingServerListSessions setResourceSessionStartTime(String resourceSessionStartTime) {
            this.resourceSessionStartTime = resourceSessionStartTime;
            return this;
        }
        public String getResourceSessionStartTime() {
            return this.resourceSessionStartTime;
        }

        public ListWuyingServerResponseBodyWuyingServerListSessions setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListWuyingServerResponseBodyWuyingServerList extends TeaModel {
        @NameInMap("AddVirtualNodePoolStatus")
        public String addVirtualNodePoolStatus;

        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>Region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("BizRegionId")
        public String bizRegionId;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the storage resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-02T16:52:11.000+00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The data disks.</p>
         */
        @NameInMap("DataDisk")
        public java.util.List<ListWuyingServerResponseBodyWuyingServerListDataDisk> dataDisk;

        /**
         * <p>The time when the subscription instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-03T16:00:00.000+00:00</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("FotaVersion")
        public String fotaVersion;

        /**
         * <p>The ID of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-06****oagaev</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The list of information about the workstation instance.</p>
         */
        @NameInMap("InstanceInfoList")
        public java.util.List<ListWuyingServerResponseBodyWuyingServerListInstanceInfoList> instanceInfoList;

        @NameInMap("MaxPrice")
        public Float maxPrice;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.80.21.149</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        /**
         * <p>The ID of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-1b****ayv2</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The office network name.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleOfficeSite</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The type of the office network.</p>
         * 
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <p>The OS type.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        @NameInMap("PolicyGroupIdList")
        public java.util.List<String> policyGroupIdList;

        @NameInMap("ResourceSessionStatus")
        public String resourceSessionStatus;

        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        /**
         * <p>The specifications.</p>
         */
        @NameInMap("ServerInstanceTypeInfo")
        public ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo serverInstanceTypeInfo;

        @NameInMap("Sessions")
        public java.util.List<ListWuyingServerResponseBodyWuyingServerListSessions> sessions;

        /**
         * <p>The status of the workstation.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SubPayType")
        public String subPayType;

        /**
         * <p>The type of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskId")
        public String systemDiskId;

        /**
         * <p>The performance level (PL) of the system disk.</p>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <p>The size of the system disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        @NameInMap("TimerGroupId")
        public String timerGroupId;

        @NameInMap("Users")
        public java.util.List<String> users;

        @NameInMap("VirtualKubeletIp")
        public String virtualKubeletIp;

        @NameInMap("VirtualNodePoolId")
        public String virtualNodePoolId;

        /**
         * <p>The ID of the workstation.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0byd****8wn2lwi</p>
         */
        @NameInMap("WuyingServerId")
        public String wuyingServerId;

        /**
         * <p>The name of the workstation.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleServerName</p>
         */
        @NameInMap("WuyingServerName")
        public String wuyingServerName;

        public static ListWuyingServerResponseBodyWuyingServerList build(java.util.Map<String, ?> map) throws Exception {
            ListWuyingServerResponseBodyWuyingServerList self = new ListWuyingServerResponseBodyWuyingServerList();
            return TeaModel.build(map, self);
        }

        public ListWuyingServerResponseBodyWuyingServerList setAddVirtualNodePoolStatus(String addVirtualNodePoolStatus) {
            this.addVirtualNodePoolStatus = addVirtualNodePoolStatus;
            return this;
        }
        public String getAddVirtualNodePoolStatus() {
            return this.addVirtualNodePoolStatus;
        }

        public ListWuyingServerResponseBodyWuyingServerList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListWuyingServerResponseBodyWuyingServerList setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListWuyingServerResponseBodyWuyingServerList setBizRegionId(String bizRegionId) {
            this.bizRegionId = bizRegionId;
            return this;
        }
        public String getBizRegionId() {
            return this.bizRegionId;
        }

        public ListWuyingServerResponseBodyWuyingServerList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListWuyingServerResponseBodyWuyingServerList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListWuyingServerResponseBodyWuyingServerList setDataDisk(java.util.List<ListWuyingServerResponseBodyWuyingServerListDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<ListWuyingServerResponseBodyWuyingServerListDataDisk> getDataDisk() {
            return this.dataDisk;
        }

        public ListWuyingServerResponseBodyWuyingServerList setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListWuyingServerResponseBodyWuyingServerList setFotaVersion(String fotaVersion) {
            this.fotaVersion = fotaVersion;
            return this;
        }
        public String getFotaVersion() {
            return this.fotaVersion;
        }

        public ListWuyingServerResponseBodyWuyingServerList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListWuyingServerResponseBodyWuyingServerList setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListWuyingServerResponseBodyWuyingServerList setInstanceInfoList(java.util.List<ListWuyingServerResponseBodyWuyingServerListInstanceInfoList> instanceInfoList) {
            this.instanceInfoList = instanceInfoList;
            return this;
        }
        public java.util.List<ListWuyingServerResponseBodyWuyingServerListInstanceInfoList> getInstanceInfoList() {
            return this.instanceInfoList;
        }

        public ListWuyingServerResponseBodyWuyingServerList setMaxPrice(Float maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        public ListWuyingServerResponseBodyWuyingServerList setNetworkInterfaceIp(String networkInterfaceIp) {
            this.networkInterfaceIp = networkInterfaceIp;
            return this;
        }
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        public ListWuyingServerResponseBodyWuyingServerList setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public ListWuyingServerResponseBodyWuyingServerList setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public ListWuyingServerResponseBodyWuyingServerList setOfficeSiteType(String officeSiteType) {
            this.officeSiteType = officeSiteType;
            return this;
        }
        public String getOfficeSiteType() {
            return this.officeSiteType;
        }

        public ListWuyingServerResponseBodyWuyingServerList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListWuyingServerResponseBodyWuyingServerList setPolicyGroupIdList(java.util.List<String> policyGroupIdList) {
            this.policyGroupIdList = policyGroupIdList;
            return this;
        }
        public java.util.List<String> getPolicyGroupIdList() {
            return this.policyGroupIdList;
        }

        public ListWuyingServerResponseBodyWuyingServerList setResourceSessionStatus(String resourceSessionStatus) {
            this.resourceSessionStatus = resourceSessionStatus;
            return this;
        }
        public String getResourceSessionStatus() {
            return this.resourceSessionStatus;
        }

        public ListWuyingServerResponseBodyWuyingServerList setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        public ListWuyingServerResponseBodyWuyingServerList setServerInstanceTypeInfo(ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo serverInstanceTypeInfo) {
            this.serverInstanceTypeInfo = serverInstanceTypeInfo;
            return this;
        }
        public ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo getServerInstanceTypeInfo() {
            return this.serverInstanceTypeInfo;
        }

        public ListWuyingServerResponseBodyWuyingServerList setSessions(java.util.List<ListWuyingServerResponseBodyWuyingServerListSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<ListWuyingServerResponseBodyWuyingServerListSessions> getSessions() {
            return this.sessions;
        }

        public ListWuyingServerResponseBodyWuyingServerList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWuyingServerResponseBodyWuyingServerList setSubPayType(String subPayType) {
            this.subPayType = subPayType;
            return this;
        }
        public String getSubPayType() {
            return this.subPayType;
        }

        public ListWuyingServerResponseBodyWuyingServerList setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public ListWuyingServerResponseBodyWuyingServerList setSystemDiskId(String systemDiskId) {
            this.systemDiskId = systemDiskId;
            return this;
        }
        public String getSystemDiskId() {
            return this.systemDiskId;
        }

        public ListWuyingServerResponseBodyWuyingServerList setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }
        public String getSystemDiskPerformanceLevel() {
            return this.systemDiskPerformanceLevel;
        }

        public ListWuyingServerResponseBodyWuyingServerList setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public ListWuyingServerResponseBodyWuyingServerList setTimerGroupId(String timerGroupId) {
            this.timerGroupId = timerGroupId;
            return this;
        }
        public String getTimerGroupId() {
            return this.timerGroupId;
        }

        public ListWuyingServerResponseBodyWuyingServerList setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }
        public java.util.List<String> getUsers() {
            return this.users;
        }

        public ListWuyingServerResponseBodyWuyingServerList setVirtualKubeletIp(String virtualKubeletIp) {
            this.virtualKubeletIp = virtualKubeletIp;
            return this;
        }
        public String getVirtualKubeletIp() {
            return this.virtualKubeletIp;
        }

        public ListWuyingServerResponseBodyWuyingServerList setVirtualNodePoolId(String virtualNodePoolId) {
            this.virtualNodePoolId = virtualNodePoolId;
            return this;
        }
        public String getVirtualNodePoolId() {
            return this.virtualNodePoolId;
        }

        public ListWuyingServerResponseBodyWuyingServerList setWuyingServerId(String wuyingServerId) {
            this.wuyingServerId = wuyingServerId;
            return this;
        }
        public String getWuyingServerId() {
            return this.wuyingServerId;
        }

        public ListWuyingServerResponseBodyWuyingServerList setWuyingServerName(String wuyingServerName) {
            this.wuyingServerName = wuyingServerName;
            return this;
        }
        public String getWuyingServerName() {
            return this.wuyingServerName;
        }

    }

}
