// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteDataLakePartitionShrinkRequest extends TeaModel {
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
    @NameInMap("IfExists")
    public Boolean ifExists;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PartitionValues")
    public String partitionValuesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table_name</p>
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

    public static DeleteDataLakePartitionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLakePartitionShrinkRequest self = new DeleteDataLakePartitionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataLakePartitionShrinkRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public DeleteDataLakePartitionShrinkRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public DeleteDataLakePartitionShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DeleteDataLakePartitionShrinkRequest setIfExists(Boolean ifExists) {
        this.ifExists = ifExists;
        return this;
    }
    public Boolean getIfExists() {
        return this.ifExists;
    }

    public DeleteDataLakePartitionShrinkRequest setPartitionValuesShrink(String partitionValuesShrink) {
        this.partitionValuesShrink = partitionValuesShrink;
        return this;
    }
    public String getPartitionValuesShrink() {
        return this.partitionValuesShrink;
    }

    public DeleteDataLakePartitionShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DeleteDataLakePartitionShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public DeleteDataLakePartitionShrinkRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
