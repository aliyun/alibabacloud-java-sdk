// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupTableAsyncRequest extends TeaModel {
    @NameInMap("AllowFullTableScan")
    public Boolean allowFullTableScan;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TableName")
    public java.util.List<String> tableName;

    public static SetupTableAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        SetupTableAsyncRequest self = new SetupTableAsyncRequest();
        return TeaModel.build(map, self);
    }

    public SetupTableAsyncRequest setAllowFullTableScan(Boolean allowFullTableScan) {
        this.allowFullTableScan = allowFullTableScan;
        return this;
    }
    public Boolean getAllowFullTableScan() {
        return this.allowFullTableScan;
    }

    public SetupTableAsyncRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SetupTableAsyncRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetupTableAsyncRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetupTableAsyncRequest setTableName(java.util.List<String> tableName) {
        this.tableName = tableName;
        return this;
    }
    public java.util.List<String> getTableName() {
        return this.tableName;
    }

}
