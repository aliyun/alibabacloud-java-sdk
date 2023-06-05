// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBInfoRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("AppGuid")
    public String appGuid;

    /**
     * <p>The business data returned.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The comment.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The type of the metadatabase. Only hive is supported.</p>
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
