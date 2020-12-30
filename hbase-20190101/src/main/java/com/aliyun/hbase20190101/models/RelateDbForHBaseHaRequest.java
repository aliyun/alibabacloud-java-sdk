// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class RelateDbForHBaseHaRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HaTables")
    public String haTables;

    @NameInMap("HaActiveHdfsUri")
    public String haActiveHdfsUri;

    @NameInMap("HaActiveHbaseFsDir")
    public String haActiveHbaseFsDir;

    @NameInMap("HaActiveClusterKey")
    public String haActiveClusterKey;

    @NameInMap("HaActiveVersion")
    public String haActiveVersion;

    @NameInMap("HaActiveUser")
    public String haActiveUser;

    @NameInMap("HaActivePassword")
    public String haActivePassword;

    @NameInMap("HaStandbyHdfsUri")
    public String haStandbyHdfsUri;

    @NameInMap("HaStandbyHbaseFsDir")
    public String haStandbyHbaseFsDir;

    @NameInMap("HaStandbyClusterKey")
    public String haStandbyClusterKey;

    @NameInMap("HaStandbyVersion")
    public String haStandbyVersion;

    @NameInMap("HaStandbyUser")
    public String haStandbyUser;

    @NameInMap("HaStandbyPassword")
    public String haStandbyPassword;

    @NameInMap("HaActive")
    public String haActive;

    @NameInMap("HaStandby")
    public String haStandby;

    @NameInMap("HaActiveDBType")
    public String haActiveDBType;

    @NameInMap("HaStandbyDBType")
    public String haStandbyDBType;

    @NameInMap("IsActiveStandard")
    public Boolean isActiveStandard;

    @NameInMap("IsStandbyStandard")
    public Boolean isStandbyStandard;

    @NameInMap("HaMigrateType")
    public String haMigrateType;

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

    public RelateDbForHBaseHaRequest setHaTables(String haTables) {
        this.haTables = haTables;
        return this;
    }
    public String getHaTables() {
        return this.haTables;
    }

    public RelateDbForHBaseHaRequest setHaActiveHdfsUri(String haActiveHdfsUri) {
        this.haActiveHdfsUri = haActiveHdfsUri;
        return this;
    }
    public String getHaActiveHdfsUri() {
        return this.haActiveHdfsUri;
    }

    public RelateDbForHBaseHaRequest setHaActiveHbaseFsDir(String haActiveHbaseFsDir) {
        this.haActiveHbaseFsDir = haActiveHbaseFsDir;
        return this;
    }
    public String getHaActiveHbaseFsDir() {
        return this.haActiveHbaseFsDir;
    }

    public RelateDbForHBaseHaRequest setHaActiveClusterKey(String haActiveClusterKey) {
        this.haActiveClusterKey = haActiveClusterKey;
        return this;
    }
    public String getHaActiveClusterKey() {
        return this.haActiveClusterKey;
    }

    public RelateDbForHBaseHaRequest setHaActiveVersion(String haActiveVersion) {
        this.haActiveVersion = haActiveVersion;
        return this;
    }
    public String getHaActiveVersion() {
        return this.haActiveVersion;
    }

    public RelateDbForHBaseHaRequest setHaActiveUser(String haActiveUser) {
        this.haActiveUser = haActiveUser;
        return this;
    }
    public String getHaActiveUser() {
        return this.haActiveUser;
    }

    public RelateDbForHBaseHaRequest setHaActivePassword(String haActivePassword) {
        this.haActivePassword = haActivePassword;
        return this;
    }
    public String getHaActivePassword() {
        return this.haActivePassword;
    }

    public RelateDbForHBaseHaRequest setHaStandbyHdfsUri(String haStandbyHdfsUri) {
        this.haStandbyHdfsUri = haStandbyHdfsUri;
        return this;
    }
    public String getHaStandbyHdfsUri() {
        return this.haStandbyHdfsUri;
    }

    public RelateDbForHBaseHaRequest setHaStandbyHbaseFsDir(String haStandbyHbaseFsDir) {
        this.haStandbyHbaseFsDir = haStandbyHbaseFsDir;
        return this;
    }
    public String getHaStandbyHbaseFsDir() {
        return this.haStandbyHbaseFsDir;
    }

    public RelateDbForHBaseHaRequest setHaStandbyClusterKey(String haStandbyClusterKey) {
        this.haStandbyClusterKey = haStandbyClusterKey;
        return this;
    }
    public String getHaStandbyClusterKey() {
        return this.haStandbyClusterKey;
    }

    public RelateDbForHBaseHaRequest setHaStandbyVersion(String haStandbyVersion) {
        this.haStandbyVersion = haStandbyVersion;
        return this;
    }
    public String getHaStandbyVersion() {
        return this.haStandbyVersion;
    }

    public RelateDbForHBaseHaRequest setHaStandbyUser(String haStandbyUser) {
        this.haStandbyUser = haStandbyUser;
        return this;
    }
    public String getHaStandbyUser() {
        return this.haStandbyUser;
    }

    public RelateDbForHBaseHaRequest setHaStandbyPassword(String haStandbyPassword) {
        this.haStandbyPassword = haStandbyPassword;
        return this;
    }
    public String getHaStandbyPassword() {
        return this.haStandbyPassword;
    }

    public RelateDbForHBaseHaRequest setHaActive(String haActive) {
        this.haActive = haActive;
        return this;
    }
    public String getHaActive() {
        return this.haActive;
    }

    public RelateDbForHBaseHaRequest setHaStandby(String haStandby) {
        this.haStandby = haStandby;
        return this;
    }
    public String getHaStandby() {
        return this.haStandby;
    }

    public RelateDbForHBaseHaRequest setHaActiveDBType(String haActiveDBType) {
        this.haActiveDBType = haActiveDBType;
        return this;
    }
    public String getHaActiveDBType() {
        return this.haActiveDBType;
    }

    public RelateDbForHBaseHaRequest setHaStandbyDBType(String haStandbyDBType) {
        this.haStandbyDBType = haStandbyDBType;
        return this;
    }
    public String getHaStandbyDBType() {
        return this.haStandbyDBType;
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

    public RelateDbForHBaseHaRequest setHaMigrateType(String haMigrateType) {
        this.haMigrateType = haMigrateType;
        return this;
    }
    public String getHaMigrateType() {
        return this.haMigrateType;
    }

}
