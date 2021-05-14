// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupBroadcastTablesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("Active")
    @Validation(required = true)
    public Boolean active;

    @NameInMap("TableName")
    @Validation(required = true)
    public java.util.List<String> tableName;

    public static SetupBroadcastTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetupBroadcastTablesRequest self = new SetupBroadcastTablesRequest();
        return TeaModel.build(map, self);
    }

    public SetupBroadcastTablesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetupBroadcastTablesRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetupBroadcastTablesRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SetupBroadcastTablesRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public SetupBroadcastTablesRequest setTableName(java.util.List<String> tableName) {
        this.tableName = tableName;
        return this;
    }
    public java.util.List<String> getTableName() {
        return this.tableName;
    }

}
