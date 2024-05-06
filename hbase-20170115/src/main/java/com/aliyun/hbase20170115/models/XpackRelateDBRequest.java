// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class XpackRelateDBRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DbClusterIds")
    public String dbClusterIds;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RelateDbType")
    public String relateDbType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static XpackRelateDBRequest build(java.util.Map<String, ?> map) throws Exception {
        XpackRelateDBRequest self = new XpackRelateDBRequest();
        return TeaModel.build(map, self);
    }

    public XpackRelateDBRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public XpackRelateDBRequest setDbClusterIds(String dbClusterIds) {
        this.dbClusterIds = dbClusterIds;
        return this;
    }
    public String getDbClusterIds() {
        return this.dbClusterIds;
    }

    public XpackRelateDBRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public XpackRelateDBRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public XpackRelateDBRequest setRelateDbType(String relateDbType) {
        this.relateDbType = relateDbType;
        return this;
    }
    public String getRelateDbType() {
        return this.relateDbType;
    }

    public XpackRelateDBRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public XpackRelateDBRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public XpackRelateDBRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
