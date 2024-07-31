// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableRequest extends TeaModel {
    /**
     * <p>The globally unique identifier (GUID) of the MaxCompute project. Specify the GUID in the odps.{projectName} format.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.test</p>
     */
    @NameInMap("AppGuid")
    public String appGuid;

    /**
     * <p>The type of the compute engine or data source. Valid values:</p>
     * <ul>
     * <li>cdh</li>
     * <li>analyticdb_for_mysql</li>
     * <li>odps</li>
     * <li>emr</li>
     * <li>hadoop</li>
     * <li>holodb</li>
     * <li>hybriddb_for_postgresql</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The schema information of the table. You need to enter the schema information of the table if you enable the table schema in MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The name of the MaxCompute table.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table1</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static DeleteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableRequest self = new DeleteTableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTableRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public DeleteTableRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public DeleteTableRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteTableRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

    public DeleteTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
