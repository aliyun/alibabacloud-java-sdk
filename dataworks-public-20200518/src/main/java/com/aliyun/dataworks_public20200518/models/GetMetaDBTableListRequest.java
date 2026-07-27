// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaDBTableListRequest extends TeaModel {
    /**
     * <p>The unique identifier for the project, in the format <code>odps.{projectName}</code>. This parameter is required only if the <code>DataSourceType</code> is set to <code>odps</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.testProjectName</p>
     */
    @NameInMap("AppGuid")
    public String appGuid;

    /**
     * <p>The ID of the E-MapReduce (EMR) cluster. This parameter is required only if the <code>DataSourceType</code> is set to <code>emr</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the data source. Valid values: <code>odps</code> and <code>emr</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 1,000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
