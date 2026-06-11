// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataLakePartitionShrinkRequest extends TeaModel {
    /**
     * <p>The name of the data catalog.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The name of the database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>Specifies whether to ignore the error if the partition to delete does not exist.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IfExists")
    public Boolean ifExists;

    /**
     * <p>The list of partition values.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PartitionValues")
    public String partitionValuesShrink;

    /**
     * <p>The name of the table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table_name</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p>Hover over your profile picture in the upper-right corner of the DMS console to obtain the tenant ID. For details, see <a href="https://help.aliyun.com/document_detail/181330.html">View tenant information</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
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
