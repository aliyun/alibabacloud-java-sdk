// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListWuyingServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("DataDiskCategory")
        public String dataDiskCategory;

        /**
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("DataDiskPerformanceLevel")
        public String dataDiskPerformanceLevel;

        /**
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
         * <strong>example:</strong>
         * <p>p-0ceitx****c5</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
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
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Gpu")
        public String gpu;

        /**
         * <strong>example:</strong>
         * <p>196,608</p>
         */
        @NameInMap("GpuMemory")
        public Integer gpuMemory;

        /**
         * <strong>example:</strong>
         * <p>393,216</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
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

    public static class ListWuyingServerResponseBodyWuyingServerList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("BizRegionId")
        public String bizRegionId;

        /**
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <strong>example:</strong>
         * <p>2025-08-02T16:52:11.000+00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataDisk")
        public java.util.List<ListWuyingServerResponseBodyWuyingServerListDataDisk> dataDisk;

        /**
         * <strong>example:</strong>
         * <p>2025-09-03T16:00:00.000+00:00</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>imgc-06****oagaev</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("InstanceInfoList")
        public java.util.List<ListWuyingServerResponseBodyWuyingServerListInstanceInfoList> instanceInfoList;

        /**
         * <strong>example:</strong>
         * <p>10.80.21.149</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-1b****ayv2</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <strong>example:</strong>
         * <p>exampleOfficeSite</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <strong>example:</strong>
         * <p>SIMPLE</p>
         */
        @NameInMap("OfficeSiteType")
        public String officeSiteType;

        /**
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        @NameInMap("ServerInstanceTypeInfo")
        public ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo serverInstanceTypeInfo;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        /**
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("SystemDiskPerformanceLevel")
        public String systemDiskPerformanceLevel;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <strong>example:</strong>
         * <p>ws-0byd****8wn2lwi</p>
         */
        @NameInMap("WuyingServerId")
        public String wuyingServerId;

        /**
         * <strong>example:</strong>
         * <p>exampleServerName</p>
         */
        @NameInMap("WuyingServerName")
        public String wuyingServerName;

        public static ListWuyingServerResponseBodyWuyingServerList build(java.util.Map<String, ?> map) throws Exception {
            ListWuyingServerResponseBodyWuyingServerList self = new ListWuyingServerResponseBodyWuyingServerList();
            return TeaModel.build(map, self);
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

        public ListWuyingServerResponseBodyWuyingServerList setServerInstanceTypeInfo(ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo serverInstanceTypeInfo) {
            this.serverInstanceTypeInfo = serverInstanceTypeInfo;
            return this;
        }
        public ListWuyingServerResponseBodyWuyingServerListServerInstanceTypeInfo getServerInstanceTypeInfo() {
            return this.serverInstanceTypeInfo;
        }

        public ListWuyingServerResponseBodyWuyingServerList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWuyingServerResponseBodyWuyingServerList setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
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
