// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BatchDeleteDataLakePartitionsRequest extends TeaModel {
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
    @NameInMap("PartitionValuesList")
    public java.util.List<java.util.List<String>> partitionValuesList;

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
     * <p>3****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static BatchDeleteDataLakePartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDataLakePartitionsRequest self = new BatchDeleteDataLakePartitionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDataLakePartitionsRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public BatchDeleteDataLakePartitionsRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public BatchDeleteDataLakePartitionsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public BatchDeleteDataLakePartitionsRequest setIfExists(Boolean ifExists) {
        this.ifExists = ifExists;
        return this;
    }
    public Boolean getIfExists() {
        return this.ifExists;
    }

    public BatchDeleteDataLakePartitionsRequest setPartitionValuesList(java.util.List<java.util.List<String>> partitionValuesList) {
        this.partitionValuesList = partitionValuesList;
        return this;
    }
    public java.util.List<java.util.List<String>> getPartitionValuesList() {
        return this.partitionValuesList;
    }

    public BatchDeleteDataLakePartitionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public BatchDeleteDataLakePartitionsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public BatchDeleteDataLakePartitionsRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
