// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    /**
     * <p>Specifies the dataset\&quot;s visibility.</p>
     * <ul>
     * <li><p><code>PUBLIC</code>: The dataset is publicly accessible.</p>
     * </li>
     * <li><p><code>PRIVATE</code>: The dataset is privately accessible.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The data source type. To specify multiple types, separate them with commas (,). Valid values:</p>
     * <ul>
     * <li><p><code>NAS</code>: The data source is NAS.</p>
     * </li>
     * <li><p><code>OSS</code>: The data source is OSS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceTypes")
    public String dataSourceTypes;

    /**
     * <p>The data type of the dataset. To specify multiple data types, separate them with commas (,). Valid values:</p>
     * <ul>
     * <li><p><code>VIDEO</code>: video.</p>
     * </li>
     * <li><p><code>COMMON</code>: general.</p>
     * </li>
     * <li><p><code>TEXT</code>: text.</p>
     * </li>
     * <li><p><code>PIC</code>: image.</p>
     * </li>
     * <li><p><code>AUDIO</code>: audio.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON,TEXT</p>
     */
    @NameInMap("DataTypes")
    public String dataTypes;

    /**
     * <p>A comma-separated list of dataset IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>d-rcdg3wxxxxxhc5jk87</p>
     */
    @NameInMap("DatasetIds")
    public String datasetIds;

    /**
     * <p>The dataset edition. Valid values:</p>
     * <ul>
     * <li><p><code>BASIC</code>: Basic edition. Does not support file metadata management.</p>
     * </li>
     * <li><p><code>ADVANCED</code>: Advanced edition. This edition is supported only for OSS datasets. Each version can manage metadata for up to 1 million files.</p>
     * </li>
     * <li><p><code>LOGICAL</code>: Logical edition. This edition is supported only for OSS datasets and is suitable for most use cases. Each version can manage metadata for up to 1 million files. You must use an SDK with this edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BASIC</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>A label used to filter datasets. The operation returns datasets whose label key or value contains the specified string.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The dataset name. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order for the results, based on the <code>SortBy</code> parameter. The default is <code>ASC</code>.</p>
     * <ul>
     * <li><p><code>ASC</code>: ascending order.</p>
     * </li>
     * <li><p><code>DESC</code>: descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number for the paged query. Starts at 1. The default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of datasets to return per page. The default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The dataset properties. To specify multiple properties, separate them with commas (,). Valid values:</p>
     * <ul>
     * <li><p><code>DIRECTORY</code>: A folder.</p>
     * </li>
     * <li><p><code>FILE</code>: A file.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("Properties")
    public String properties;

    /**
     * <p>The dataset provider. Set this parameter to <code>pai</code> to query public datasets on the PAI platform.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>A filter for shared datasets.</p>
     * <ul>
     * <li><p><code>TO_ME</code>: Returns only datasets shared with you.</p>
     * </li>
     * <li><p><code>BY_ME</code>: Returns only datasets that you have shared with others and displays details of the sharing configuration.</p>
     * </li>
     * <li><p>If this parameter is omitted or empty, the operation returns all datasets in the current workspace, including those shared with you.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BY_ME</p>
     */
    @NameInMap("ShareScope")
    public String shareScope;

    /**
     * <p>The sort field.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The source dataset ID for an iTAG annotation set.</p>
     * 
     * <strong>example:</strong>
     * <p>d-rcdg3wxxxxxhc5jk87</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <p>The source ID. The value of this parameter varies based on the <code>SourceTypes</code> value:</p>
     * <ul>
     * <li><p>If <code>SourceTypes</code> is <code>USER</code>, you can specify a custom value for <code>SourceId</code>.</p>
     * </li>
     * <li><p>If <code>SourceTypes</code> is <code>ITAG</code>, <code>SourceId</code> is the ID of the iTAG task.</p>
     * </li>
     * <li><p>If <code>SourceTypes</code> is <code>PAI_PUBLIC_DATASET</code>, this parameter is empty by default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>d-rbvg5wzljzjhc9ks92</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type. To specify multiple types, separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>USER,ITAG</p>
     */
    @NameInMap("SourceTypes")
    public String sourceTypes;

    /**
     * <p>The ID of the workspace that contains the dataset. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.
     * If this parameter is not specified, the default workspace is used. An error is returned if the default workspace does not exist.</p>
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
