// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SearchMetaTablesRequest extends TeaModel {
    /**
     * <p>The GUID of the workspace where the metatables reside.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.engine_name</p>
     */
    @NameInMap("AppGuid")
    public String appGuid;

    /**
     * <p>The ID of the EMR cluster. This parameter is required only if you set the DataSourceType parameter to emr.</p>
     * <p>You can log on to the <a href="https://emr.console.aliyun.com/?spm=a2c4g.11186623.0.0.965cc5c2GeiHet#/cn-hangzhou">EMR console</a> to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The type of the data source. Valid values: odps and emr.</p>
     * 
     * <strong>example:</strong>
     * <p>emr</p>
     */
    @NameInMap("DataSourceType")
    public String dataSourceType;

    /**
     * <p>The type of the metatables. Valid values: 0 and 1. The value 0 indicates that tables are queried. The value 1 indicates that views are queried. If you do not configure this parameter, all types of metatables are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EntityType")
    public Integer entityType;

    /**
     * <p>The keyword based on which metatables are queried. During the query, the system tokenizes the names of metatables and matches the names with the keyword. If no name is matched, the value null is returned. By default, the system uses underscores (_) to tokenize the names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
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
     * <p>The schema information of the table. You must configure this parameter if you enable the three-layer model of MaxCompute.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Schema")
    public String schema;

    public static SearchMetaTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMetaTablesRequest self = new SearchMetaTablesRequest();
        return TeaModel.build(map, self);
    }

    public SearchMetaTablesRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public SearchMetaTablesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SearchMetaTablesRequest setDataSourceType(String dataSourceType) {
        this.dataSourceType = dataSourceType;
        return this;
    }
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public SearchMetaTablesRequest setEntityType(Integer entityType) {
        this.entityType = entityType;
        return this;
    }
    public Integer getEntityType() {
        return this.entityType;
    }

    public SearchMetaTablesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public SearchMetaTablesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchMetaTablesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMetaTablesRequest setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
