// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupTableRequest extends TeaModel {
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

    public static SetupTableRequest build(java.util.Map<String, ?> map) throws Exception {
        SetupTableRequest self = new SetupTableRequest();
        return TeaModel.build(map, self);
    }

    public SetupTableRequest setAllowFullTableScan(Boolean allowFullTableScan) {
        this.allowFullTableScan = allowFullTableScan;
        return this;
    }
    public Boolean getAllowFullTableScan() {
        return this.allowFullTableScan;
    }

    public SetupTableRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public SetupTableRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public SetupTableRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetupTableRequest setTableName(java.util.List<String> tableName) {
        this.tableName = tableName;
        return this;
    }
    public java.util.List<String> getTableName() {
        return this.tableName;
    }

}
