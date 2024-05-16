// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataSourcesRequest extends TeaModel {
    /**
     * <p>The status of the data source. Valid values:</p>
     * <br>
     * <p>*   ENABLED: The data source is accessible.</p>
     * <p>*   DISABLED: The data source is inaccessible.</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The number of the page to return. The value of this parameter must be an integer greater than or equal to 1.</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The subtype of the data source. This parameter takes effect only if the DataSourceType parameter is set to rds.</p>
     * <br>
     * <p>If the DataSourceType parameter is set to rds, this parameter can be set to mysql, sqlserver, or postgresql.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <br>
     * <p>*   odps</p>
     * <p>*   mysql</p>
     * <p>*   rds</p>
     * <p>*   oss</p>
     * <p>*   sqlserver</p>
     * <p>*   polardb</p>
     * <p>*   oracle</p>
     * <p>*   mongodb</p>
     * <p>*   emr</p>
     * <p>*   postgresql</p>
     * <p>*   analyticdb_for_mysql</p>
     * <p>*   hybriddb_for_postgresql</p>
     * <p>*   holo</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The environment in which the data source is used. Valid values: 0 and 1. The value 0 indicates the development environment. The value 1 indicates the production environment.</p>
     */
    @NameInMap("SubType")
    public String subType;

    public static ListDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesRequest self = new ListDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ListDataSourcesRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public ListDataSourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDataSourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSourcesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataSourcesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListDataSourcesRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
