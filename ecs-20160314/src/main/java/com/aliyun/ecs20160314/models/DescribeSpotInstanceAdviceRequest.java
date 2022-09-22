// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeSpotInstanceAdviceRequest extends TeaModel {
    @NameInMap("Cores")
    public Integer cores;

    @NameInMap("IoOptimized")
    public String ioOptimized;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("MinCores")
    public Integer minCores;

    @NameInMap("MinMemory")
    public Float minMemory;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeSpotInstanceAdviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSpotInstanceAdviceRequest self = new DescribeSpotInstanceAdviceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSpotInstanceAdviceRequest setCores(Integer cores) {
        this.cores = cores;
        return this;
    }
    public Integer getCores() {
        return this.cores;
    }

    public DescribeSpotInstanceAdviceRequest setIoOptimized(String ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public String getIoOptimized() {
        return this.ioOptimized;
    }

    public DescribeSpotInstanceAdviceRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public DescribeSpotInstanceAdviceRequest setMinCores(Integer minCores) {
        this.minCores = minCores;
        return this;
    }
    public Integer getMinCores() {
        return this.minCores;
    }

    public DescribeSpotInstanceAdviceRequest setMinMemory(Float minMemory) {
        this.minMemory = minMemory;
        return this;
    }
    public Float getMinMemory() {
        return this.minMemory;
    }

    public DescribeSpotInstanceAdviceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeSpotInstanceAdviceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSpotInstanceAdviceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSpotInstanceAdviceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSpotInstanceAdviceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSpotInstanceAdviceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSpotInstanceAdviceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
