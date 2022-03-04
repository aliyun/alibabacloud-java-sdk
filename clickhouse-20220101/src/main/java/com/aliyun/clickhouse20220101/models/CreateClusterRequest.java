// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CreateClusterRequest extends TeaModel {
    // 是否自动续费
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    // 实例描述信息
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    // 付费类型 Prepaid | Postpaid
    @NameInMap("PayType")
    public String payType;

    // 预付费周期 Year | Month
    @NameInMap("Period")
    public String period;

    @NameInMap("RegionId")
    public String regionId;

    // 预付费时长
    @NameInMap("UsedTime")
    public String usedTime;

    // 计算组本地缓存空间 GiB
    @NameInMap("VirtualWareHouseCacheStorage")
    public Integer virtualWareHouseCacheStorage;

    // 计算组规格码
    @NameInMap("VirtualWareHouseClass")
    public String virtualWareHouseClass;

    // 计算组描述信息
    @NameInMap("VirtualWareHouseDescription")
    public String virtualWareHouseDescription;

    @NameInMap("VpcId")
    public String vpcId;

    // 默认交换机ID
    @NameInMap("VswitchId")
    public String vswitchId;

    // 可用区ID
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterRequest self = new CreateClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateClusterRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public CreateClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateClusterRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateClusterRequest setVirtualWareHouseCacheStorage(Integer virtualWareHouseCacheStorage) {
        this.virtualWareHouseCacheStorage = virtualWareHouseCacheStorage;
        return this;
    }
    public Integer getVirtualWareHouseCacheStorage() {
        return this.virtualWareHouseCacheStorage;
    }

    public CreateClusterRequest setVirtualWareHouseClass(String virtualWareHouseClass) {
        this.virtualWareHouseClass = virtualWareHouseClass;
        return this;
    }
    public String getVirtualWareHouseClass() {
        return this.virtualWareHouseClass;
    }

    public CreateClusterRequest setVirtualWareHouseDescription(String virtualWareHouseDescription) {
        this.virtualWareHouseDescription = virtualWareHouseDescription;
        return this;
    }
    public String getVirtualWareHouseDescription() {
        return this.virtualWareHouseDescription;
    }

    public CreateClusterRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateClusterRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public CreateClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
