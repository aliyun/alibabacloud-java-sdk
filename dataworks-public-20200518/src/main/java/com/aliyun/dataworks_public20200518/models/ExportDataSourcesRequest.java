// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDataSourcesRequest extends TeaModel {
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
     * <p>The environment in which the data source resides. Valid values:</p>
     * <ul>
     * <li>0: development environment</li>
     * <li>1: production environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EnvType")
    public Integer envType;

    /**
     * <p>The keyword contained in the names of the data sources that you want to export. You can specify only one keyword. For example, if you set this parameter to test, you can call the ExportDataSources operation to export all data sources whose names contain test in the workspace.</p>
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
     * <p>The ID of the DataWorks workspace to which the data sources belong. You can call the <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> operation to query the ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The subtype of the data source. This parameter takes effect only when the DataSourceType parameter is set to rds.</p>
     * <p>If the value of the DataSourceType parameter is rds, the value of this parameter can be mysql, sqlserver, or postgresql.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql</p>
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
