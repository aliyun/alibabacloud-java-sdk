// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteDataLakePartitionRequest extends TeaModel {
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
    public java.util.List<String> partitionValues;

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

    public static DeleteDataLakePartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLakePartitionRequest self = new DeleteDataLakePartitionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataLakePartitionRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public DeleteDataLakePartitionRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public DeleteDataLakePartitionRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DeleteDataLakePartitionRequest setIfExists(Boolean ifExists) {
        this.ifExists = ifExists;
        return this;
    }
    public Boolean getIfExists() {
        return this.ifExists;
    }

    public DeleteDataLakePartitionRequest setPartitionValues(java.util.List<String> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }
    public java.util.List<String> getPartitionValues() {
        return this.partitionValues;
    }

    public DeleteDataLakePartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DeleteDataLakePartitionRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
