// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ListClustersResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListClustersResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>DDB109DC-E37D-5475-8D49-47542C57BD38</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClustersResponseBody self = new ListClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClustersResponseBody setData(java.util.List<ListClustersResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListClustersResponseBodyData> getData() {
        return this.data;
    }

    public ListClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListClustersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClustersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListClustersResponseBodyDataVirtualWareHouses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>tcp:9000,http:8123,mysql:9004</p>
         */
        @NameInMap("Ports")
        public String ports;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("VirtualWareHouseCacheStorage")
        public Integer virtualWareHouseCacheStorage;

        /**
         * <strong>example:</strong>
         * <p>n1.xlarge</p>
         */
        @NameInMap("VirtualWareHouseClass")
        public String virtualWareHouseClass;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VirtualWareHouseDescription")
        public String virtualWareHouseDescription;

        /**
         * <strong>example:</strong>
         * <p>vw-uf6a499c0m3w5****</p>
         */
        @NameInMap("VirtualWareHouseId")
        public String virtualWareHouseId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("VirtualWareHouseStatus")
        public String virtualWareHouseStatus;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1tg609m5j85jejq****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListClustersResponseBodyDataVirtualWareHouses build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyDataVirtualWareHouses self = new ListClustersResponseBodyDataVirtualWareHouses();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyDataVirtualWareHouses setPorts(String ports) {
            this.ports = ports;
            return this;
        }
        public String getPorts() {
            return this.ports;
        }

        public ListClustersResponseBodyDataVirtualWareHouses setVirtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
            this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
            return this;
        }
        public Integer getVirtualWareHouseCacheStorage() {
            return this.virtualWareHouseCacheStorage;
        }

        public ListClustersResponseBodyDataVirtualWareHouses setVirtualWareHouseClass(String virtualWareHouseClass) {
            this.virtualWareHouseClass = virtualWareHouseClass;
            return this;
        }
        public String getVirtualWareHouseClass() {
            return this.virtualWareHouseClass;
        }

        public ListClustersResponseBodyDataVirtualWareHouses setVirtualWareHouseDescription(String virtualWareHouseDescription) {
            this.virtualWareHouseDescription = virtualWareHouseDescription;
            return this;
        }
        public String getVirtualWareHouseDescription() {
            return this.virtualWareHouseDescription;
        }

        public ListClustersResponseBodyDataVirtualWareHouses setVirtualWareHouseId(String virtualWareHouseId) {
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }
        public String getVirtualWareHouseId() {
            return this.virtualWareHouseId;
        }

        public ListClustersResponseBodyDataVirtualWareHouses setVirtualWareHouseStatus(String virtualWareHouseStatus) {
            this.virtualWareHouseStatus = virtualWareHouseStatus;
            return this;
        }
        public String getVirtualWareHouseStatus() {
            return this.virtualWareHouseStatus;
        }

        public ListClustersResponseBodyDataVirtualWareHouses setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public ListClustersResponseBodyDataVirtualWareHouses setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListClustersResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("CacheStorageSizeGiB")
        public Integer cacheStorageSizeGiB;

        /**
         * <strong>example:</strong>
         * <p>CloudESSD</p>
         */
        @NameInMap("CacheStorageType")
        public String cacheStorageType;

        /**
         * <strong>example:</strong>
         * <p>clickhouse_go_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2022-03-18T08:14:48Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <strong>example:</strong>
         * <p>21.8</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <strong>example:</strong>
         * <p>2022-04-17T08:14:48Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <strong>example:</strong>
         * <p>DISK_FULL</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ObjectStoreSizeGiB")
        public Long objectStoreSizeGiB;

        /**
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ResourceCpuCores")
        public Integer resourceCpuCores;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("ResourceMemoryGiB")
        public Integer resourceMemoryGiB;

        @NameInMap("VirtualWareHouses")
        public java.util.List<ListClustersResponseBodyDataVirtualWareHouses> virtualWareHouses;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zedznmtm8j7fksbc****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vsw-bp1tg609m5j85jejq****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListClustersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListClustersResponseBodyData self = new ListClustersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListClustersResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListClustersResponseBodyData setCacheStorageSizeGiB(Integer cacheStorageSizeGiB) {
            this.cacheStorageSizeGiB = cacheStorageSizeGiB;
            return this;
        }
        public Integer getCacheStorageSizeGiB() {
            return this.cacheStorageSizeGiB;
        }

        public ListClustersResponseBodyData setCacheStorageType(String cacheStorageType) {
            this.cacheStorageType = cacheStorageType;
            return this;
        }
        public String getCacheStorageType() {
            return this.cacheStorageType;
        }

        public ListClustersResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public ListClustersResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListClustersResponseBodyData setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public ListClustersResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public ListClustersResponseBodyData setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public ListClustersResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public ListClustersResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListClustersResponseBodyData setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public ListClustersResponseBodyData setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public ListClustersResponseBodyData setObjectStoreSizeGiB(Long objectStoreSizeGiB) {
            this.objectStoreSizeGiB = objectStoreSizeGiB;
            return this;
        }
        public Long getObjectStoreSizeGiB() {
            return this.objectStoreSizeGiB;
        }

        public ListClustersResponseBodyData setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public ListClustersResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListClustersResponseBodyData setResourceCpuCores(Integer resourceCpuCores) {
            this.resourceCpuCores = resourceCpuCores;
            return this;
        }
        public Integer getResourceCpuCores() {
            return this.resourceCpuCores;
        }

        public ListClustersResponseBodyData setResourceMemoryGiB(Integer resourceMemoryGiB) {
            this.resourceMemoryGiB = resourceMemoryGiB;
            return this;
        }
        public Integer getResourceMemoryGiB() {
            return this.resourceMemoryGiB;
        }

        public ListClustersResponseBodyData setVirtualWareHouses(java.util.List<ListClustersResponseBodyDataVirtualWareHouses> virtualWareHouses) {
            this.virtualWareHouses = virtualWareHouses;
            return this;
        }
        public java.util.List<ListClustersResponseBodyDataVirtualWareHouses> getVirtualWareHouses() {
            return this.virtualWareHouses;
        }

        public ListClustersResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListClustersResponseBodyData setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public ListClustersResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
