// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataSourcesRequest extends TeaModel {
    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li>odps</li>
     * <li>mysql</li>
     * <li>rds</li>
     * <li>oss</li>
     * <li>sqlserver</li>
     * <li>polardb</li>
     * <li>oracle</li>
     * <li>mongodb</li>
     * <li>emr</li>
     * <li>postgresql</li>
     * <li>analyticdb_for_mysql</li>
     * <li>hybriddb_for_postgresql</li>
     * <li>holo</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rds</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The environment in which the data source is used. Valid values: 0 and 1. The value 0 indicates development environment. The value 1 indicates production environment.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The name of the data source that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace to which the data sources belong. You can call the <a href="https://help.aliyun.com/document_detail/2780068.html">ListProjects</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The status of the data source. Valid values:</p>
     * <ul>
     * <li>ENABLED</li>
     * <li>DISABLED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The subtype of the data source. This parameter takes effect only when the DataSourceType parameter is set to rds.</p>
     * <p>If the value of the DataSourceType parameter is rds, the value of this parameter can be mysql, sqlserver, or postgresql.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
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
