// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrawlersShrinkRequest extends TeaModel {
    /**
     * <p>The list of data source IDs. Up to 10 IDs are supported.</p>
     */
    @NameInMap("DataSourceIds")
    public String dataSourceIdsShrink;

    /**
     * <p>The DataWorks environment type. Dev indicates the development environment. Prod indicates the production environment.</p>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The metadata crawler name. Supports fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>example_crawler</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The DataWorks user ID of the crawler owner.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Starts from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The crawler type. Call GetCrawlerTypeCapabilities to query the valid values supported in the current region.</p>
     * 
     * <strong>example:</strong>
     * <p>starrocks</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListCrawlersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlersShrinkRequest self = new ListCrawlersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCrawlersShrinkRequest setDataSourceIdsShrink(String dataSourceIdsShrink) {
        this.dataSourceIdsShrink = dataSourceIdsShrink;
        return this;
    }
    public String getDataSourceIdsShrink() {
        return this.dataSourceIdsShrink;
    }

    public ListCrawlersShrinkRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListCrawlersShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCrawlersShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListCrawlersShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCrawlersShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCrawlersShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListCrawlersShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
