// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableProducingTasksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C-A_SAMPLE_CLUSTER_ID</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>myschema</p>
     */
    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.sample_project.sample_table</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <strong>example:</strong>
     * <p>sample_table</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetMetaTableProducingTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableProducingTasksRequest self = new GetMetaTableProducingTasksRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableProducingTasksRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaTableProducingTasksRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaTableProducingTasksRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public GetMetaTableProducingTasksRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public GetMetaTableProducingTasksRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableProducingTasksRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
