// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class FlashbackRecycleBinTableRequest extends TeaModel {
    /**
     * <p>The name of the database to which the table belongs.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the instance to which the table belongs.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the logical table to be restored.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static FlashbackRecycleBinTableRequest build(java.util.Map<String, ?> map) throws Exception {
        FlashbackRecycleBinTableRequest self = new FlashbackRecycleBinTableRequest();
        return TeaModel.build(map, self);
    }

    public FlashbackRecycleBinTableRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public FlashbackRecycleBinTableRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public FlashbackRecycleBinTableRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public FlashbackRecycleBinTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
