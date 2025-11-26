// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourcePostgreSQLParameters extends TeaModel {
    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Password")
    public String password;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SchemaName")
    public String schemaName;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SnapshotMode")
    public String snapshotMode;

    @NameInMap("TableNames")
    public String tableNames;

    @NameInMap("User")
    public String user;

    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    @NameInMap("VpcId")
    public String vpcId;

    public static SourcePostgreSQLParameters build(java.util.Map<String, ?> map) throws Exception {
        SourcePostgreSQLParameters self = new SourcePostgreSQLParameters();
        return TeaModel.build(map, self);
    }

    public SourcePostgreSQLParameters setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public SourcePostgreSQLParameters setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public SourcePostgreSQLParameters setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SourcePostgreSQLParameters setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SourcePostgreSQLParameters setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public SourcePostgreSQLParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SourcePostgreSQLParameters setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public SourcePostgreSQLParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SourcePostgreSQLParameters setSnapshotMode(String snapshotMode) {
        this.snapshotMode = snapshotMode;
        return this;
    }
    public String getSnapshotMode() {
        return this.snapshotMode;
    }

    public SourcePostgreSQLParameters setTableNames(String tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public String getTableNames() {
        return this.tableNames;
    }

    public SourcePostgreSQLParameters setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public SourcePostgreSQLParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SourcePostgreSQLParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
