// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableRequest extends TeaModel {
    /**
     * <p>The globally unique identifier (GUID) of the MaxCompute project. Specify the GUID in the odps.{projectName} format.</p>
     */
    @NameInMap("AppGuid")
    public String appGuid;

    /**
     * <p>The environment of the DataWorks workspace. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The schema information of the table. You need to enter the schema information of the table if you enable the table schema in MaxCompute.</p>
     */
    @NameInMap("Schema")
    public String schema;

    /**
     * <p>The name of the MaxCompute table.</p>
     * <br>
     * <p>This parameter is required.</p>
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
