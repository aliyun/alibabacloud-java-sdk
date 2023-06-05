// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBTableListRequest extends TeaModel {
    /**
     * <p>The name of the metadatabase.</p>
     */
    @NameInMap("AppGuid")
    public String appGuid;

    /**
     * <p>The type of the data source. Valid values: odps and emr.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The globally unique identifier (GUID) of the MaxCompute project. Specify the GUID in the `odps.{projectName}` format. This parameter must be configured if you set the DataSourceType parameter to odps.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the E-MapReduce (EMR) cluster. This parameter must be configured if you set the DataSourceType parameter to emr.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetMetaDBTableListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaDBTableListRequest self = new GetMetaDBTableListRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaDBTableListRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public GetMetaDBTableListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetMetaDBTableListRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public GetMetaDBTableListRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public GetMetaDBTableListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetMetaDBTableListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
