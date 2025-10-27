// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringRequest extends TeaModel {
    @NameInMap("ComputingGroupId")
    public String computingGroupId;

    /**
     * <p>The endpoint of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-2ze34****-clickhouse..clickhouseserver.pre.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The prefix of the endpoint that is used to connect to the database.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-****-clickhouse</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-xxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <ul>
     * <li><p>The database ports that you want to disable. Separate multiple ports with commas (,).</p>
     * </li>
     * <li><p>This parameter is supported only for clusters whose minor engine version is 24.10.1.11098_1 or later.</p>
     * <p>**</p>
     * <p><strong>Note</strong> If you create a cluster whose minor engine version is earlier than 24.10.1.11098_1 and you update the minor engine version to 24.10.1.11098_1 or later, the cluster still does not support this parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9001,8123</p>
     */
    @NameInMap("DisablePorts")
    public String disablePorts;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDBInstanceConnectionStringRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringRequest self = new ModifyDBInstanceConnectionStringRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringRequest setComputingGroupId(String computingGroupId) {
        this.computingGroupId = computingGroupId;
        return this;
    }
    public String getComputingGroupId() {
        return this.computingGroupId;
    }

    public ModifyDBInstanceConnectionStringRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBInstanceConnectionStringRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public ModifyDBInstanceConnectionStringRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceConnectionStringRequest setDBInstanceNetType(String DBInstanceNetType) {
        this.DBInstanceNetType = DBInstanceNetType;
        return this;
    }
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    public ModifyDBInstanceConnectionStringRequest setDisablePorts(String disablePorts) {
        this.disablePorts = disablePorts;
        return this;
    }
    public String getDisablePorts() {
        return this.disablePorts;
    }

    public ModifyDBInstanceConnectionStringRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
