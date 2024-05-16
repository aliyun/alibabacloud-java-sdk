// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDataSourcesRequest extends TeaModel {
    /**
     * <p>The data source type. Valid values:</p>
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
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The environment to which the data sources belong. Valid values:</p>
     * <br>
     * <p>*   0: development environment</p>
     * <p>*   1: production environment</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The keyword contained in the names of the data sources to be exported.</p>
     * <br>
     * <p>You can specify only one keyword. For example, if you set this parameter to test, all the data sources whose names contain test in the specified workspace are exported.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return. The value of this parameter must be a positive integer greater than or equal to 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace to which the data sources belong. You can call the [ListProjects](https://help.aliyun.com/document_detail/178393.html) operation to query the ID of the workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The data source subtype. This parameter takes effect only if the DataSourceType parameter is set to rds.</p>
     * <br>
     * <p>If the DataSourceType parameter is set to rds, this parameter can be set to mysql, sqlserver, or postgresql.</p>
     */
    @NameInMap("SubType")
    public String subType;

    public static ExportDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDataSourcesRequest self = new ExportDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ExportDataSourcesRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public ExportDataSourcesRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public ExportDataSourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExportDataSourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ExportDataSourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ExportDataSourcesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ExportDataSourcesRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
