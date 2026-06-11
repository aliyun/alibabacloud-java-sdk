// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class BatchCreateDataLakePartitionsRequest extends TeaModel {
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
     * <p>Specifies whether to ignore an error if a partition with the same name already exists. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Ignore the error.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not ignore the error.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IfNotExists")
    public Boolean ifNotExists;

    /**
     * <p>Specifies whether to return partition information. If you set this parameter to <strong>true</strong>, the response includes the Partitions parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedResult")
    public Boolean needResult;

    /**
     * <p>The information about the new partitions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PartitionInputs")
    public java.util.List<DLPartitionInput> partitionInputs;

    /**
     * <p>The name of the table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
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

    public static BatchCreateDataLakePartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDataLakePartitionsRequest self = new BatchCreateDataLakePartitionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateDataLakePartitionsRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public BatchCreateDataLakePartitionsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public BatchCreateDataLakePartitionsRequest setIfNotExists(Boolean ifNotExists) {
        this.ifNotExists = ifNotExists;
        return this;
    }
    public Boolean getIfNotExists() {
        return this.ifNotExists;
    }

    public BatchCreateDataLakePartitionsRequest setNeedResult(Boolean needResult) {
        this.needResult = needResult;
        return this;
    }
    public Boolean getNeedResult() {
        return this.needResult;
    }

    public BatchCreateDataLakePartitionsRequest setPartitionInputs(java.util.List<DLPartitionInput> partitionInputs) {
        this.partitionInputs = partitionInputs;
        return this;
    }
    public java.util.List<DLPartitionInput> getPartitionInputs() {
        return this.partitionInputs;
    }

    public BatchCreateDataLakePartitionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public BatchCreateDataLakePartitionsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public BatchCreateDataLakePartitionsRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
