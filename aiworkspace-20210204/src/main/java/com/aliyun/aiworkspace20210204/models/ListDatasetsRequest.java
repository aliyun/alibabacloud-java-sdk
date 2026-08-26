// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    /**
     * <p>The visibility of the dataset.</p>
     * <ul>
     * <li>PUBLIC: public.</li>
     * <li>PRIVATE: private.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The data source types. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li>NAS: Alibaba Cloud Network Attached Storage (NAS).</li>
     * <li>OSS: Alibaba Cloud Object Storage Service (OSS).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceTypes")
    public String dataSourceTypes;

    /**
     * <p>The data types of the dataset. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li>VIDEO: video.</li>
     * <li>COMMON: common.</li>
     * <li>TEXT: text.</li>
     * <li>PIC: image.</li>
     * <li>AUDIO: audio.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON,TEXT</p>
     */
    @NameInMap("DataTypes")
    public String dataTypes;

    /**
     * <p>The dataset IDs. You can specify multiple dataset IDs separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>d-rcdg3wxxxxxhc5jk87</p>
     */
    @NameInMap("DatasetIds")
    public String datasetIds;

    /**
     * <p>The dataset edition. Valid values:</p>
     * <ul>
     * <li>BASIC: Basic Edition. Does not support dataset file metadata management.</li>
     * <li>ADVANCED: Advanced Edition. Supported only for OSS type. Each version supports up to 1 million file metadata entries.</li>
     * <li>LOGICAL: Logical Edition. Supported only for OSS type. Each version supports up to 1 million file metadata entries. Applicable to most scenarios and requires the use of the SDK.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The dataset label used to filter the dataset list. Datasets whose label key or value contains the specified string are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The dataset name. Fuzzy match is supported based on the dataset name.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sorting order for the specified sort field in paging queries. Default value: ASC.</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page settings for paging queries. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The dataset properties. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li>DIRECTORY: folder.</li>
     * <li>FILE: file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("Properties")
    public String properties;

    /**
     * <p>The dataset provider. A value of &quot;pai&quot; indicates that the dataset is a PAI platform public dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The sharing filter for datasets:</p>
     * <ul>
     * <li>TO_ME: returns only datasets shared with you.</li>
     * <li>BY_ME: returns only datasets you shared with others, with sharing configuration details displayed.</li>
     * <li>If this parameter is not set or is set to empty: returns all datasets in the current workspace, including TO_ME.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BY_ME</p>
     */
    @NameInMap("ShareScope")
    public String shareScope;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The source dataset ID of the iTAG annotation set.</p>
     * 
     * <strong>example:</strong>
     * <p>d-rcdg3wxxxxxhc5jk87</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <p>The data source ID.</p>
     * <ul>
     * <li>If SourceTypes is set to USER, you can customize the SourceId value.</li>
     * <li>If SourceTypes is set to ITAG, which indicates a dataset generated from iTAG annotation results, SourceId is the iTAG task ID.</li>
     * <li>If SourceTypes is set to PAI_PUBLIC_DATASET, which indicates a dataset created from a PAI public dataset, SourceId is empty by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>d-rbvg5wzljzjhc9ks92</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source types. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>USER,ITAG</p>
     */
    @NameInMap("SourceTypes")
    public String sourceTypes;

    /**
     * <p>The ID of the workspace where the dataset resides. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.
     * If you do not specify this parameter, the default workspace is used. If the default workspace does not exist, an error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>324**</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDatasetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsRequest self = new ListDatasetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetsRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListDatasetsRequest setDataSourceTypes(String dataSourceTypes) {
        this.dataSourceTypes = dataSourceTypes;
        return this;
    }
    public String getDataSourceTypes() {
        return this.dataSourceTypes;
    }

    public ListDatasetsRequest setDataTypes(String dataTypes) {
        this.dataTypes = dataTypes;
        return this;
    }
    public String getDataTypes() {
        return this.dataTypes;
    }

    public ListDatasetsRequest setDatasetIds(String datasetIds) {
        this.datasetIds = datasetIds;
        return this;
    }
    public String getDatasetIds() {
        return this.datasetIds;
    }

    public ListDatasetsRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public ListDatasetsRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ListDatasetsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDatasetsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDatasetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetsRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public ListDatasetsRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListDatasetsRequest setShareScope(String shareScope) {
        this.shareScope = shareScope;
        return this;
    }
    public String getShareScope() {
        return this.shareScope;
    }

    public ListDatasetsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDatasetsRequest setSourceDatasetId(String sourceDatasetId) {
        this.sourceDatasetId = sourceDatasetId;
        return this;
    }
    public String getSourceDatasetId() {
        return this.sourceDatasetId;
    }

    public ListDatasetsRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ListDatasetsRequest setSourceTypes(String sourceTypes) {
        this.sourceTypes = sourceTypes;
        return this;
    }
    public String getSourceTypes() {
        return this.sourceTypes;
    }

    public ListDatasetsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
