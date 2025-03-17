// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BatchUpdateDataLakePartitionsShrinkRequest extends TeaModel {
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

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static BatchUpdateDataLakePartitionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateDataLakePartitionsShrinkRequest self = new BatchUpdateDataLakePartitionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateDataLakePartitionsShrinkRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public BatchUpdateDataLakePartitionsShrinkRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public BatchUpdateDataLakePartitionsShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public BatchUpdateDataLakePartitionsShrinkRequest setPartitionInputsShrink(String partitionInputsShrink) {
        this.partitionInputsShrink = partitionInputsShrink;
        return this;
    }
    public String getPartitionInputsShrink() {
        return this.partitionInputsShrink;
    }

    public BatchUpdateDataLakePartitionsShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public BatchUpdateDataLakePartitionsShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public BatchUpdateDataLakePartitionsShrinkRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
