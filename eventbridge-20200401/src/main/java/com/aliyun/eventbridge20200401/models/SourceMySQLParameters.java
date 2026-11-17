// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SourceMySQLParameters extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>database1</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <strong>example:</strong>
     * <p>rm-bp1vxxx.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeSchemaChanges")
    public String includeSchemaChanges;

    /**
     * <strong>example:</strong>
     * <p>PrivateNetwork</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <strong>example:</strong>
     * <p>when_needed</p>
     */
    @NameInMap("SnapshotMode")
    public String snapshotMode;

    /**
     * <strong>example:</strong>
     * <p>database1.table1</p>
     */
    @NameInMap("TableNames")
    public String tableNames;

    /**
     * <strong>example:</strong>
     * <p>example_user</p>
     */
    @NameInMap("User")
    public String user;

    /**
     * <strong>example:</strong>
     * <p>[vsw-a1b2c3d4e5f6g7h8i9j0k]</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <strong>example:</strong>
     * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SourceMySQLParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceMySQLParameters self = new SourceMySQLParameters();
        return TeaModel.build(map, self);
    }

    public SourceMySQLParameters setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public SourceMySQLParameters setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public SourceMySQLParameters setIncludeSchemaChanges(String includeSchemaChanges) {
        this.includeSchemaChanges = includeSchemaChanges;
        return this;
    }
    public String getIncludeSchemaChanges() {
        return this.includeSchemaChanges;
    }

    public SourceMySQLParameters setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SourceMySQLParameters setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SourceMySQLParameters setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public SourceMySQLParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SourceMySQLParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SourceMySQLParameters setSnapshotMode(String snapshotMode) {
        this.snapshotMode = snapshotMode;
        return this;
    }
    public String getSnapshotMode() {
        return this.snapshotMode;
    }

    public SourceMySQLParameters setTableNames(String tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public String getTableNames() {
        return this.tableNames;
    }

    public SourceMySQLParameters setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public SourceMySQLParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SourceMySQLParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
