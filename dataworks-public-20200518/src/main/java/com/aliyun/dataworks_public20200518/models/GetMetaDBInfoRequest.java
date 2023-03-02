// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBInfoRequest extends TeaModel {
    /**
     * <p>The ID of the compute engine instance. Specify the ID in the Engine type.Engine name format.</p>
     */
    @NameInMap("AppGuid")
    public String appGuid;

    /**
     * <p>The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <br>
     * <p>You can log on to the [EMR console](https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou) to obtain the ID of the EMR cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the data source. Valid values: odps and emr.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The name of the metadatabase. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <br>
     * <p>You can call the [ListMetaDB](~~185662~~) operation to query the name of the metadatabase.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    public static GetMetaDBInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBInfoRequest self = new GetMetaDBInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaDBInfoRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public GetMetaDBInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaDBInfoRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaDBInfoRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

}
