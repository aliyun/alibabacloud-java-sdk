// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupBroadcastTablesRequest extends TeaModel {
    /**
     * <p>Specifies whether to activate a broadcast table for the database.</p>
     */
    @NameInMap("Active")
    public Boolean active;

    /**
     * <p>The name of the database for which you want to configure a broadcast table.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region in which the PolarDB-X 1.0 instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the table.</p>
     */
    @NameInMap("TableName")
    public java.util.List<String> tableName;

    public static SetupBroadcastTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetupBroadcastTablesRequest self = new SetupBroadcastTablesRequest();
        return TeaModel.build(map, self);
    }

    public SetupBroadcastTablesRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public SetupBroadcastTablesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SetupBroadcastTablesRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetupBroadcastTablesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetupBroadcastTablesRequest setTableName(java.util.List<String> tableName) {
        this.tableName = tableName;
        return this;
    }
    public java.util.List<String> getTableName() {
        return this.tableName;
    }

}
