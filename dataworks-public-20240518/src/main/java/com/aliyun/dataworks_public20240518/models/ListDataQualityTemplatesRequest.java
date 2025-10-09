// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityTemplatesRequest extends TeaModel {
    /**
     * <p>The directory path to which the data quality template belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>/timeliness/ods_layer</p>
     */
    @NameInMap("Catalog")
    public String catalog;

    /**
     * <p>Fuzzy match for the template rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>table_rows</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of records per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page number of the results. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListDataQualityTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityTemplatesRequest self = new ListDataQualityTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataQualityTemplatesRequest setCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }
    public String getCatalog() {
        return this.catalog;
    }

    public ListDataQualityTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDataQualityTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataQualityTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataQualityTemplatesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
