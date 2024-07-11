// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class RelateDbForHBaseHaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bds-t4nj9v2x85******</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp1w6krp539******</p>
     */
    @NameInMap("HaActive")
    public String haActive;

    /**
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn******-master1-001.hbase.singapore.rds.aliyuncs.com,hb-t4naqsay5gn******-master3-001.hbase.singapore.rds.aliyuncs.com,hb-t4naqsay5gn******-master2-001.hbase.singapore.rds.aliyuncs.com:2181:/hbase</p>
     */
    @NameInMap("HaActiveClusterKey")
    public String haActiveClusterKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase</p>
     */
    @NameInMap("HaActiveDBType")
    public String haActiveDBType;

    /**
     * <strong>example:</strong>
     * <p>/hbase</p>
     */
    @NameInMap("HaActiveHbaseFsDir")
    public String haActiveHbaseFsDir;

    /**
     * <strong>example:</strong>
     * <p>hdfs://hb-t4naqsay5gn******-master1-001.hbase.rds.aliyuncs.com:8020,hb-t4naqsay5gn******-master2-001.hbase.rds.aliyuncs.com:8020</p>
     */
    @NameInMap("HaActiveHdfsUri")
    public String haActiveHdfsUri;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("HaActivePassword")
    public String haActivePassword;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("HaActiveUser")
    public String haActiveUser;

    /**
     * <strong>example:</strong>
     * <p>HBase2x</p>
     */
    @NameInMap("HaActiveVersion")
    public String haActiveVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLUSTER</p>
     */
    @NameInMap("HaMigrateType")
    public String haMigrateType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-bp1bl7iqzka******</p>
     */
    @NameInMap("HaStandby")
    public String haStandby;

    /**
     * <strong>example:</strong>
     * <p>hb-bp1w6krp539******-master1-001.hbase.singapore.rds.aliyuncs.com,hb-bp1w6krp539******-master3-001.hbase.singapore.rds.aliyuncs.com,hb-t4naqsay5gn******-master2-001.hbase.singapore.rds.aliyuncs.com:2181:/hbase</p>
     */
    @NameInMap("HaStandbyClusterKey")
    public String haStandbyClusterKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hbase</p>
     */
    @NameInMap("HaStandbyDBType")
    public String haStandbyDBType;

    /**
     * <strong>example:</strong>
     * <p>/hbase</p>
     */
    @NameInMap("HaStandbyHbaseFsDir")
    public String haStandbyHbaseFsDir;

    /**
     * <strong>example:</strong>
     * <p>hdfs://hb-bp1w6krp539******-master1-001.hbase.rds.aliyuncs.com:8020,hb-bp1w6krp539******-master2-001.hbase.rds.aliyuncs.com:8020</p>
     */
    @NameInMap("HaStandbyHdfsUri")
    public String haStandbyHdfsUri;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("HaStandbyPassword")
    public String haStandbyPassword;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("HaStandbyUser")
    public String haStandbyUser;

    /**
     * <strong>example:</strong>
     * <p>HBase2x</p>
     */
    @NameInMap("HaStandbyVersion")
    public String haStandbyVersion;

    /**
     * <strong>example:</strong>
     * <p>test,test1</p>
     */
    @NameInMap("HaTables")
    public String haTables;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsActiveStandard")
    public Boolean isActiveStandard;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsStandbyStandard")
    public Boolean isStandbyStandard;

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

}
