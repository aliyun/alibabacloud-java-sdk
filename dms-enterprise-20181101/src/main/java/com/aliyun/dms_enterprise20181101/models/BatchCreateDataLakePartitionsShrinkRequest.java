// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BatchCreateDataLakePartitionsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DataRegion")
    public String dataRegion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IfNotExists")
    public Boolean ifNotExists;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedResult")
    public Boolean needResult;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PartitionInputs")
    public String partitionInputsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static BatchCreateDataLakePartitionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDataLakePartitionsShrinkRequest self = new BatchCreateDataLakePartitionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateDataLakePartitionsShrinkRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public BatchCreateDataLakePartitionsShrinkRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public BatchCreateDataLakePartitionsShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public BatchCreateDataLakePartitionsShrinkRequest setIfNotExists(Boolean ifNotExists) {
        this.ifNotExists = ifNotExists;
        return this;
    }
    public Boolean getIfNotExists() {
        return this.ifNotExists;
    }

    public BatchCreateDataLakePartitionsShrinkRequest setNeedResult(Boolean needResult) {
        this.needResult = needResult;
        return this;
    }
    public Boolean getNeedResult() {
        return this.needResult;
    }

    public BatchCreateDataLakePartitionsShrinkRequest setPartitionInputsShrink(String partitionInputsShrink) {
        this.partitionInputsShrink = partitionInputsShrink;
        return this;
    }
    public String getPartitionInputsShrink() {
        return this.partitionInputsShrink;
    }

    public BatchCreateDataLakePartitionsShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public BatchCreateDataLakePartitionsShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
