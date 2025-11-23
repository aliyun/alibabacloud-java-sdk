// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataLakePartitionRequest extends TeaModel {
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
     * <p>The region where the data lake resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DataRegion")
    public String dataRegion;

    /**
     * <p>The database name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>Specifies whether to ignore the exception if the name of the created partition is the same as the name of an existing partition.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IfNotExists")
    public Boolean ifNotExists;

    /**
     * <p>Specifies whether to return information about the created partition. If the value is true, the Partition parameter is returned. Valid values:</p>
     * <ul>
     * <li>true: returns information about the created partition.</li>
     * <li>false: does not return information about the created partition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedResult")
    public Boolean needResult;

    /**
     * <p>The information about the created partition.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PartitionInput")
    public DLPartitionInput partitionInput;

    /**
     * <p>The name of the table</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the tenant ID, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
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

    public static CreateDataLakePartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLakePartitionRequest self = new CreateDataLakePartitionRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataLakePartitionRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public CreateDataLakePartitionRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public CreateDataLakePartitionRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public CreateDataLakePartitionRequest setIfNotExists(Boolean ifNotExists) {
        this.ifNotExists = ifNotExists;
        return this;
    }
    public Boolean getIfNotExists() {
        return this.ifNotExists;
    }

    public CreateDataLakePartitionRequest setNeedResult(Boolean needResult) {
        this.needResult = needResult;
        return this;
    }
    public Boolean getNeedResult() {
        return this.needResult;
    }

    public CreateDataLakePartitionRequest setPartitionInput(DLPartitionInput partitionInput) {
        this.partitionInput = partitionInput;
        return this;
    }
    public DLPartitionInput getPartitionInput() {
        return this.partitionInput;
    }

    public CreateDataLakePartitionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public CreateDataLakePartitionRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CreateDataLakePartitionRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
