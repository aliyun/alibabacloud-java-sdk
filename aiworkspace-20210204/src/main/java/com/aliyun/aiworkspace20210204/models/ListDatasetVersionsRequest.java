// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetVersionsRequest extends TeaModel {
    /**
     * <p>The dataset label used to filter the dataset list. Datasets whose label key or value contains the specified string are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>key1,key2</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeys;

    /**
     * <p>The dataset label used to filter the dataset list. Datasets whose label key or value contains the specified string are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>value1,value2</p>
     */
    @NameInMap("LabelValues")
    public String labelValues;

    /**
     * <p>The order in which entries are sorted by the specified field in a paged query. Default value: ASC.</p>
     * <ul>
     * <li>ASC: ascending order.</li>
     * <li>DESC: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number of the dataset list. Minimum value: 1. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Default value: 10.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The dataset property. Valid values:</p>
     * <ul>
     * <li>DIRECTORY: folder.</li>
     * <li>FILE: file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Properties")
    public String properties;

    /**
     * <p>The field by which entries are sorted in a paged query. Default value: GmtCreateTime. Valid values:</p>
     * <ul>
     * <li><p>GmtCreateTime (default): sort by creation time.</p>
     * </li>
     * <li><p>GmtModifiedTime: sort by modification time.</p>
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
     * <p>The data source ID.</p>
     * <ul>
     * <li>If SourceTypes is set to USER, SourceId can be customized.</li>
     * <li>If SourceTypes is set to ITAG, which indicates a dataset generated from iTAG labeling results, SourceId is the iTAG task ID.</li>
     * <li>If SourceTypes is set to PAI_PUBLIC_DATASET, which indicates a dataset created from a PAI public dataset, SourceId is empty by default.</li>
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
     * <li>PAI-PUBLIC-DATASET: PAI public dataset.</li>
     * <li>ITAG: dataset generated from iTAG labeling results.</li>
     * <li>USER: dataset registered by a user.</li>
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
