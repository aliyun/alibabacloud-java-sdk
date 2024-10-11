// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>9140518B-F330-5364-82FE-EC7298816EDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResponseBody self = new DescribeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResponseBody setData(DescribeClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeClusterResponseBodyData getData() {
        return this.data;
    }

    public DescribeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterResponseBodyDataVirtualWareHouses extends TeaModel {
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
         * <p>vw-bp1w2728d535t****</p>
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
         * <p>vsw-2vcmrf8c878scsv43****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeClusterResponseBodyDataVirtualWareHouses build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyDataVirtualWareHouses self = new DescribeClusterResponseBodyDataVirtualWareHouses();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyDataVirtualWareHouses setPorts(String ports) {
            this.ports = ports;
            return this;
        }
        public String getPorts() {
            return this.ports;
        }

        public DescribeClusterResponseBodyDataVirtualWareHouses setVirtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
            this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
            return this;
        }
        public Integer getVirtualWareHouseCacheStorage() {
            return this.virtualWareHouseCacheStorage;
        }

        public DescribeClusterResponseBodyDataVirtualWareHouses setVirtualWareHouseClass(String virtualWareHouseClass) {
            this.virtualWareHouseClass = virtualWareHouseClass;
            return this;
        }
        public String getVirtualWareHouseClass() {
            return this.virtualWareHouseClass;
        }

        public DescribeClusterResponseBodyDataVirtualWareHouses setVirtualWareHouseDescription(String virtualWareHouseDescription) {
            this.virtualWareHouseDescription = virtualWareHouseDescription;
            return this;
        }
        public String getVirtualWareHouseDescription() {
            return this.virtualWareHouseDescription;
        }

        public DescribeClusterResponseBodyDataVirtualWareHouses setVirtualWareHouseId(String virtualWareHouseId) {
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }
        public String getVirtualWareHouseId() {
            return this.virtualWareHouseId;
        }

        public DescribeClusterResponseBodyDataVirtualWareHouses setVirtualWareHouseStatus(String virtualWareHouseStatus) {
            this.virtualWareHouseStatus = virtualWareHouseStatus;
            return this;
        }
        public String getVirtualWareHouseStatus() {
            return this.virtualWareHouseStatus;
        }

        public DescribeClusterResponseBodyDataVirtualWareHouses setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeClusterResponseBodyDataVirtualWareHouses setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeClusterResponseBodyData extends TeaModel {
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
         * <p>cc-uf6a499c0m3w5****</p>
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
        public java.util.List<DescribeClusterResponseBodyDataVirtualWareHouses> virtualWareHouses;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9duj8xd6r1gzhsg*****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vsw-2vcmrf8c878scsv43****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterResponseBodyData self = new DescribeClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeClusterResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeClusterResponseBodyData setCacheStorageSizeGiB(Integer cacheStorageSizeGiB) {
            this.cacheStorageSizeGiB = cacheStorageSizeGiB;
            return this;
        }
        public Integer getCacheStorageSizeGiB() {
            return this.cacheStorageSizeGiB;
        }

        public DescribeClusterResponseBodyData setCacheStorageType(String cacheStorageType) {
            this.cacheStorageType = cacheStorageType;
            return this;
        }
        public String getCacheStorageType() {
            return this.cacheStorageType;
        }

        public DescribeClusterResponseBodyData setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeClusterResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeClusterResponseBodyData setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeClusterResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeClusterResponseBodyData setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeClusterResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeClusterResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeClusterResponseBodyData setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeClusterResponseBodyData setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeClusterResponseBodyData setObjectStoreSizeGiB(Long objectStoreSizeGiB) {
            this.objectStoreSizeGiB = objectStoreSizeGiB;
            return this;
        }
        public Long getObjectStoreSizeGiB() {
            return this.objectStoreSizeGiB;
        }

        public DescribeClusterResponseBodyData setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeClusterResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeClusterResponseBodyData setResourceCpuCores(Integer resourceCpuCores) {
            this.resourceCpuCores = resourceCpuCores;
            return this;
        }
        public Integer getResourceCpuCores() {
            return this.resourceCpuCores;
        }

        public DescribeClusterResponseBodyData setResourceMemoryGiB(Integer resourceMemoryGiB) {
            this.resourceMemoryGiB = resourceMemoryGiB;
            return this;
        }
        public Integer getResourceMemoryGiB() {
            return this.resourceMemoryGiB;
        }

        public DescribeClusterResponseBodyData setVirtualWareHouses(java.util.List<DescribeClusterResponseBodyDataVirtualWareHouses> virtualWareHouses) {
            this.virtualWareHouses = virtualWareHouses;
            return this;
        }
        public java.util.List<DescribeClusterResponseBodyDataVirtualWareHouses> getVirtualWareHouses() {
            return this.virtualWareHouses;
        }

        public DescribeClusterResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeClusterResponseBodyData setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeClusterResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
