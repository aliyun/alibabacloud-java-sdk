// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringRequest extends TeaModel {
    /**
     * <p>The computing group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-2ze34****-clickhouse</p>
     */
    @NameInMap("ComputingGroupId")
    public String computingGroupId;

    /**
     * <p>The connection string.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-2ze34****-clickhouse..clickhouseserver.pre.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The connection string prefix.</p>
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

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li><p><code>Vpc</code>: VPC</p>
     * </li>
     * <li><p><code>Public</code>: public network</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("DBInstanceNetType")
    public String DBInstanceNetType;

    /**
     * <ul>
     * <li><p>The database ports to disable. You can specify multiple ports, separated by commas.</p>
     * </li>
     * <li><p>This parameter is supported only for clusters with a kernel version of 24.10.1.11098_1 or later.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is not supported for clusters that were upgraded to kernel version 24.10.1.11098_1 or later from an earlier version.</p>
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
