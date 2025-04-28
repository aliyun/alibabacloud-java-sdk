// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetVersionsRequest extends TeaModel {
    /**
     * <p>The dataset tag keys, which are used to filter datasets. Datasets whose tag keys or tag values contain a specified string are filtered.</p>
     * 
     * <strong>example:</strong>
     * <p>key1,key2</p>
     */
    @NameInMap("LabelKeys")
    public String labelKeys;

    /**
     * <p>The dataset tag values, which are used to filter datasets. Datasets whose tag keys or tag values contain a specified string are filtered.</p>
     * 
     * <strong>example:</strong>
     * <p>value1,value2</p>
     */
    @NameInMap("LabelValues")
    public String labelValues;

    /**
     * <p>The order in which the entries are sorted by the specific field on the returned page. Default value: ASC. Valid values:</p>
     * <ul>
     * <li>ASC: ascending order</li>
     * <li>DESC: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
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
     * <li>DIRECTORY</li>
     * <li>FILE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DIRECTORY</p>
     */
    @NameInMap("Properties")
    public String properties;

    /**
     * <p>The field used to sort the results in queries by page. Default value: GmtCreateTime.
     * Valid values:</p>
     * <ul>
     * <li>SourceType</li>
     * <li>DataSourceType</li>
     * <li>DataSize</li>
     * <li>DataCount</li>
     * <li>Property</li>
     * <li>GmtCreateTime: The results are sorted by creation time. This is the default value.</li>
     * <li>GmtModifiedTime: The results are sorted by modification time.</li>
     * <li>DatasetId</li>
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
     * <li>If SourceType is set to USER, the value of SourceId is a custom string.</li>
     * <li>If SourceType is set to ITAG, the value of SourceId is the ID of the labeling job of iTAG.</li>
     * <li>If SourceType is set to PAI_PUBLIC_DATASET, SourceId is empty by default.</li>
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
     * <li>PAI-PUBLIC-DATASET: a public dataset of Platform for AI (PAI).</li>
     * <li>ITAG: a dataset generated from a labeling job of iTAG.</li>
     * <li>USER: a dataset registered by a user.</li>
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
