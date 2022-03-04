// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeClusterResponseBodyData data;

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
        // 端口信息 英文逗号分隔
        @NameInMap("Ports")
        public String ports;

        // 计算组本地缓存空间GiB
        @NameInMap("VirtualWareHouseCacheStorage")
        public Integer virtualWareHouseCacheStorage;

        // 计算组规格码
        @NameInMap("VirtualWareHouseClass")
        public String virtualWareHouseClass;

        // 计算组描述信息
        @NameInMap("VirtualWareHouseDescription")
        public String virtualWareHouseDescription;

        @NameInMap("VirtualWareHouseId")
        public String virtualWareHouseId;

        // 计算组状态 详见describeVirtualWareHouseStatusSet接口
        @NameInMap("VirtualWareHouseStatus")
        public String virtualWareHouseStatus;

        // 交换机ID
        @NameInMap("VswitchId")
        public String vswitchId;

        // 可用区
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
        // 实例所属账户Uid
        @NameInMap("AliUid")
        public Long aliUid;

        // 实例总本地缓存空间 GiB
        @NameInMap("CacheStorageSizeGiB")
        public Integer cacheStorageSizeGiB;

        // 实例本地缓存类型
        @NameInMap("CacheStorageType")
        public String cacheStorageType;

        // 商品Code
        @NameInMap("CommodityCode")
        public String commodityCode;

        // 实例创建时间 UTC时间
        @NameInMap("CreateTime")
        public String createTime;

        // 实例描述信息
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        // 实例状态 详见describeClusterStatusSet接口
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        // 内核版本
        @NameInMap("EngineVersion")
        public String engineVersion;

        // 实例到期时间 UTC时间
        @NameInMap("ExpireTime")
        public String expireTime;

        // 实例锁定状态 Unlock:正常 | ManualLock:手动锁定 | LockByExpiration:过期锁定
        @NameInMap("LockMode")
        public String lockMode;

        // 实例锁定原因
        @NameInMap("LockReason")
        public String lockReason;

        // 实例总对象存储空间 GiB
        @NameInMap("ObjectStoreSizeGiB")
        public Long objectStoreSizeGiB;

        // 付费类型
        @NameInMap("PayType")
        public String payType;

        @NameInMap("RegionId")
        public String regionId;

        // 实例总CPU资源 cores
        @NameInMap("ResourceCpuCores")
        public Integer resourceCpuCores;

        // 实例总内存资源 GiB
        @NameInMap("ResourceMemoryGiB")
        public Integer resourceMemoryGiB;

        // 计算组列表
        @NameInMap("VirtualWareHouses")
        public java.util.List<DescribeClusterResponseBodyDataVirtualWareHouses> virtualWareHouses;

        @NameInMap("VpcId")
        public String vpcId;

        // 默认交换机ID
        @NameInMap("VswitchId")
        public String vswitchId;

        // 默认可用区
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
