// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableBasicInfoRequest extends TeaModel {
    /**
     * <p>The name of the metatable in the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <br>
     * <p>You can call the [GetMetaDBTableList](https://help.aliyun.com/document_detail/173916.html) operation to query the name of the metatable.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The type of the data source. Valid values: odps and emr.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Extension")
    public Boolean extension;

    /**
     * <p>The name of the metadatabase. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <br>
     * <p>You can call the [ListMetaDB](https://help.aliyun.com/document_detail/185662.html) operation to query the name of the metadatabase.</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>Specifies whether to include extended fields in query results.</p>
     * <br>
     * <p>The extended fields include ReadCount, FavoriteCount, and ViewCount.</p>
     * <br>
     * <p>This parameter takes effect only if you set the DataSourceType parameter to odps.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static GetMetaTableBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableBasicInfoRequest self = new GetMetaTableBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableBasicInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaTableBasicInfoRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaTableBasicInfoRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetMetaTableBasicInfoRequest setExtension(Boolean extension) {
        this.extension = extension;
        return this;
    }
    public Boolean getExtension() {
        return this.extension;
    }

    public GetMetaTableBasicInfoRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableBasicInfoRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
