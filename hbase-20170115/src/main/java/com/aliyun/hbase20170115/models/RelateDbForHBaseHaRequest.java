// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class RelateDbForHBaseHaRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HaActive")
    public String haActive;

    @NameInMap("HaActiveClusterKey")
    public String haActiveClusterKey;

    @NameInMap("HaActiveDBType")
    public String haActiveDBType;

    @NameInMap("HaActiveHbaseFsDir")
    public String haActiveHbaseFsDir;

    @NameInMap("HaActiveHdfsUri")
    public String haActiveHdfsUri;

    @NameInMap("HaActivePassword")
    public String haActivePassword;

    @NameInMap("HaActiveUser")
    public String haActiveUser;

    @NameInMap("HaActiveVersion")
    public String haActiveVersion;

    @NameInMap("HaMigrateType")
    public String haMigrateType;

    @NameInMap("HaStandby")
    public String haStandby;

    @NameInMap("HaStandbyClusterKey")
    public String haStandbyClusterKey;

    @NameInMap("HaStandbyDBType")
    public String haStandbyDBType;

    @NameInMap("HaStandbyHbaseFsDir")
    public String haStandbyHbaseFsDir;

    @NameInMap("HaStandbyHdfsUri")
    public String haStandbyHdfsUri;

    @NameInMap("HaStandbyPassword")
    public String haStandbyPassword;

    @NameInMap("HaStandbyUser")
    public String haStandbyUser;

    @NameInMap("HaStandbyVersion")
    public String haStandbyVersion;

    @NameInMap("HaTables")
    public String haTables;

    @NameInMap("IsActiveStandard")
    public Boolean isActiveStandard;

    @NameInMap("IsStandbyStandard")
    public Boolean isStandbyStandard;

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

    public static RelateDbForHBaseHaRequest build(java.util.Map<String, ?> map) throws Exception {
        RelateDbForHBaseHaRequest self = new RelateDbForHBaseHaRequest();
        return TeaModel.build(map, self);
    }

    public RelateDbForHBaseHaRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RelateDbForHBaseHaRequest setHaActive(String haActive) {
        this.haActive = haActive;
        return this;
    }
    public String getHaActive() {
        return this.haActive;
    }

    public RelateDbForHBaseHaRequest setHaActiveClusterKey(String haActiveClusterKey) {
        this.haActiveClusterKey = haActiveClusterKey;
        return this;
    }
    public String getHaActiveClusterKey() {
        return this.haActiveClusterKey;
    }

    public RelateDbForHBaseHaRequest setHaActiveDBType(String haActiveDBType) {
        this.haActiveDBType = haActiveDBType;
        return this;
    }
    public String getHaActiveDBType() {
        return this.haActiveDBType;
    }

    public RelateDbForHBaseHaRequest setHaActiveHbaseFsDir(String haActiveHbaseFsDir) {
        this.haActiveHbaseFsDir = haActiveHbaseFsDir;
        return this;
    }
    public String getHaActiveHbaseFsDir() {
        return this.haActiveHbaseFsDir;
    }

    public RelateDbForHBaseHaRequest setHaActiveHdfsUri(String haActiveHdfsUri) {
        this.haActiveHdfsUri = haActiveHdfsUri;
        return this;
    }
    public String getHaActiveHdfsUri() {
        return this.haActiveHdfsUri;
    }

    public RelateDbForHBaseHaRequest setHaActivePassword(String haActivePassword) {
        this.haActivePassword = haActivePassword;
        return this;
    }
    public String getHaActivePassword() {
        return this.haActivePassword;
    }

    public RelateDbForHBaseHaRequest setHaActiveUser(String haActiveUser) {
        this.haActiveUser = haActiveUser;
        return this;
    }
    public String getHaActiveUser() {
        return this.haActiveUser;
    }

    public RelateDbForHBaseHaRequest setHaActiveVersion(String haActiveVersion) {
        this.haActiveVersion = haActiveVersion;
        return this;
    }
    public String getHaActiveVersion() {
        return this.haActiveVersion;
    }

    public RelateDbForHBaseHaRequest setHaMigrateType(String haMigrateType) {
        this.haMigrateType = haMigrateType;
        return this;
    }
    public String getHaMigrateType() {
        return this.haMigrateType;
    }

    public RelateDbForHBaseHaRequest setHaStandby(String haStandby) {
        this.haStandby = haStandby;
        return this;
    }
    public String getHaStandby() {
        return this.haStandby;
    }

    public RelateDbForHBaseHaRequest setHaStandbyClusterKey(String haStandbyClusterKey) {
        this.haStandbyClusterKey = haStandbyClusterKey;
        return this;
    }
    public String getHaStandbyClusterKey() {
        return this.haStandbyClusterKey;
    }

    public RelateDbForHBaseHaRequest setHaStandbyDBType(String haStandbyDBType) {
        this.haStandbyDBType = haStandbyDBType;
        return this;
    }
    public String getHaStandbyDBType() {
        return this.haStandbyDBType;
    }

    public RelateDbForHBaseHaRequest setHaStandbyHbaseFsDir(String haStandbyHbaseFsDir) {
        this.haStandbyHbaseFsDir = haStandbyHbaseFsDir;
        return this;
    }
    public String getHaStandbyHbaseFsDir() {
        return this.haStandbyHbaseFsDir;
    }

    public RelateDbForHBaseHaRequest setHaStandbyHdfsUri(String haStandbyHdfsUri) {
        this.haStandbyHdfsUri = haStandbyHdfsUri;
        return this;
    }
    public String getHaStandbyHdfsUri() {
        return this.haStandbyHdfsUri;
    }

    public RelateDbForHBaseHaRequest setHaStandbyPassword(String haStandbyPassword) {
        this.haStandbyPassword = haStandbyPassword;
        return this;
    }
    public String getHaStandbyPassword() {
        return this.haStandbyPassword;
    }

    public RelateDbForHBaseHaRequest setHaStandbyUser(String haStandbyUser) {
        this.haStandbyUser = haStandbyUser;
        return this;
    }
    public String getHaStandbyUser() {
        return this.haStandbyUser;
    }

    public RelateDbForHBaseHaRequest setHaStandbyVersion(String haStandbyVersion) {
        this.haStandbyVersion = haStandbyVersion;
        return this;
    }
    public String getHaStandbyVersion() {
        return this.haStandbyVersion;
    }

    public RelateDbForHBaseHaRequest setHaTables(String haTables) {
        this.haTables = haTables;
        return this;
    }
    public String getHaTables() {
        return this.haTables;
    }

    public RelateDbForHBaseHaRequest setIsActiveStandard(Boolean isActiveStandard) {
        this.isActiveStandard = isActiveStandard;
        return this;
    }
    public Boolean getIsActiveStandard() {
        return this.isActiveStandard;
    }

    public RelateDbForHBaseHaRequest setIsStandbyStandard(Boolean isStandbyStandard) {
        this.isStandbyStandard = isStandbyStandard;
        return this;
    }
    public Boolean getIsStandbyStandard() {
        return this.isStandbyStandard;
    }

    public RelateDbForHBaseHaRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RelateDbForHBaseHaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RelateDbForHBaseHaRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RelateDbForHBaseHaRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RelateDbForHBaseHaRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
