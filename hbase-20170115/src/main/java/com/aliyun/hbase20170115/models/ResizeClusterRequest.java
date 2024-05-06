// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ResizeClusterRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CloudType")
    public String cloudType;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ColdStorageSize")
    public String coldStorageSize;

    @NameInMap("CoreDiskQuantity")
    public String coreDiskQuantity;

    @NameInMap("CoreDiskSize")
    public String coreDiskSize;

    @NameInMap("CoreDiskType")
    public String coreDiskType;

    @NameInMap("CoreInstanceQuantity")
    public String coreInstanceQuantity;

    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("IsColdStorage")
    public String isColdStorage;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UpgradeType")
    public String upgradeType;

    @NameInMap("ZoneId")
    public String zoneId;

    public static ResizeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeClusterRequest self = new ResizeClusterRequest();
        return TeaModel.build(map, self);
    }

    public ResizeClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResizeClusterRequest setCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }
    public String getCloudType() {
        return this.cloudType;
    }

    public ResizeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeClusterRequest setColdStorageSize(String coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public String getColdStorageSize() {
        return this.coldStorageSize;
    }

    public ResizeClusterRequest setCoreDiskQuantity(String coreDiskQuantity) {
        this.coreDiskQuantity = coreDiskQuantity;
        return this;
    }
    public String getCoreDiskQuantity() {
        return this.coreDiskQuantity;
    }

    public ResizeClusterRequest setCoreDiskSize(String coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public String getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public ResizeClusterRequest setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public ResizeClusterRequest setCoreInstanceQuantity(String coreInstanceQuantity) {
        this.coreInstanceQuantity = coreInstanceQuantity;
        return this;
    }
    public String getCoreInstanceQuantity() {
        return this.coreInstanceQuantity;
    }

    public ResizeClusterRequest setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public ResizeClusterRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ResizeClusterRequest setIsColdStorage(String isColdStorage) {
        this.isColdStorage = isColdStorage;
        return this;
    }
    public String getIsColdStorage() {
        return this.isColdStorage;
    }

    public ResizeClusterRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ResizeClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResizeClusterRequest setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public ResizeClusterRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
