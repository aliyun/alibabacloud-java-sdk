// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetVersionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourcesTypes")
    public String dataSourcesTypes;

    /**
     * <strong>example:</strong>
     * <p>key1,key2</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeys;

    /**
     * <strong>example:</strong>
     * <p>value1,value2</p>
     */
    @NameInMap("LableValues")
    public String lableValues;

    /**
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Properties")
    public String properties;

    /**
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>d-a0xbe5n03bhqof46ce</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceTypes")
    public String sourceTypes;

    public static ListDatasetVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetVersionsRequest self = new ListDatasetVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetVersionsRequest setDataSourcesTypes(String dataSourcesTypes) {
        this.dataSourcesTypes = dataSourcesTypes;
        return this;
    }
    public String getDataSourcesTypes() {
        return this.dataSourcesTypes;
    }

    public ListDatasetVersionsRequest setLabelKeys(String labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public String getLabelKeys() {
        return this.labelKeys;
    }

    public ListDatasetVersionsRequest setLableValues(String lableValues) {
        this.lableValues = lableValues;
        return this;
    }
    public String getLableValues() {
        return this.lableValues;
    }

    public ListDatasetVersionsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDatasetVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetVersionsRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public ListDatasetVersionsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDatasetVersionsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ListDatasetVersionsRequest setSourceTypes(String sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public String getSourceTypes() {
        return this.sourceTypes;
    }

}
