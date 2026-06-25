// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetVersionsRequest extends TeaModel {
    /**
     * <p>The label keys used to filter the dataset list. Datasets are returned if their label keys contain the specified strings.</p>
     * 
     * <strong>example:</strong>
     * <p>key1,key2</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeys;

    /**
     * <p>The label values used to filter the dataset list. Datasets are returned if their label values contain the specified strings.</p>
     * 
     * <strong>example:</strong>
     * <p>value1,value2</p>
     */
    @NameInMap("LabelValues")
    public String labelValues;

    /**
     * <p>The sort order for the paged query. The default value is ASC. Valid values:</p>
     * <ul>
     * <li><p>ASC: Ascending order.</p>
     * </li>
     * <li><p>DESC: Descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. The value starts from 1. The default is 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The default value is 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The dataset properties. Valid values:</p>
     * <ul>
     * <li><p>DIRECTORY: Folder.</p>
     * </li>
     * <li><p>FILE: File.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Properties")
    public String properties;

    /**
     * <p>The field to use for sorting in a paged query. The default value is GmtCreateTime. Valid values:</p>
     * <ul>
     * <li><p>GmtCreateTime (default): Creation time.</p>
     * </li>
     * <li><p>GmtModifiedTime: Modification time.</p>
     * </li>
     * <li><p>SourceType</p>
     * </li>
     * <li><p>DataSourceType</p>
     * </li>
     * <li><p>Property</p>
     * </li>
     * <li><p>DataSize</p>
     * </li>
     * <li><p>DataCount</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The ID of the data source.</p>
     * <ul>
     * <li><p>If SourceTypes is USER, you can specify a custom ID.</p>
     * </li>
     * <li><p>If SourceTypes is ITAG, this is the ID of the iTAG annotation task.</p>
     * </li>
     * <li><p>If SourceTypes is PAI_PUBLIC_DATASET, this parameter is empty by default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>d-a0xbe5n03bhqof46ce</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type. Valid values:</p>
     * <ul>
     * <li><p>PAI-PUBLIC-DATASET: A public dataset from PAI.</p>
     * </li>
     * <li><p>ITAG: A dataset generated from the annotation results of the iTAG module.</p>
     * </li>
     * <li><p>USER: A dataset registered by a user.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("SourceTypes")
    public String sourceTypes;

    public static ListDatasetVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetVersionsRequest self = new ListDatasetVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetVersionsRequest setLabelKeys(String labelKeys) {
        this.labelKeys = labelKeys;
        return this;
    }
    public String getLabelKeys() {
        return this.labelKeys;
    }

    public ListDatasetVersionsRequest setLabelValues(String labelValues) {
        this.labelValues = labelValues;
        return this;
    }
    public String getLabelValues() {
        return this.labelValues;
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
