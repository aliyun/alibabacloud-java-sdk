// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    /**
     * <p>The storage types of the data source. Multiple data source types are separated by commas (,). Valid values:</p>
     * <ul>
     * <li>NAS: File Storage NAS (NAS).</li>
     * <li>OSS: Object Storage Service (OSS).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("DataSourceTypes")
    public String dataSourceTypes;

    /**
     * <p>The dataset types. Multiple dataset types are separated by commas (,). Valid values:</p>
     * <ul>
     * <li>Video: video</li>
     * <li>COMMON: common</li>
     * <li>TEXT: text</li>
     * <li>PIC: picture</li>
     * <li>AUDIO: audio</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMMON,TEXT</p>
     */
    @NameInMap("DataTypes")
    public String dataTypes;

    /**
     * <p>The dataset tag, which is used to filter datasets. Datasets whose tag key or tag value contains a specified string are filtered.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The dataset name. Fuzzy search based on the dataset name is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The order of specific fields of the entries on the returned page. Valid values: ASC and DESC. Default value: ASC.</p>
     * <ul>
     * <li>ASC: The entries are sorted in ascending order.</li>
     * <li>DESC: The entries are sorted in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The dataset properties. Multiple properties are separated by commas (,). Valid values:</p>
     * <ul>
     * <li>DIRECTORY</li>
     * <li>FILE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("Properties")
    public String properties;

    /**
     * <p>The dataset provider. If the value pai is returned, the dataset is a public dataset provided by PAI.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The field used for sorting.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The ID of the iTAG labeled dataset that is used as the source dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>d-rcdg3wxxxxxhc5jk87</p>
     */
    @NameInMap("SourceDatasetId")
    public String sourceDatasetId;

    /**
     * <p>The data source ID.</p>
     * <ul>
     * <li>If SourceType is set to USER, the value of SourceId is a custom string.</li>
     * <li>If SourceType is set to ITAG, the value of SourceId is the ID of the labeling job of iTAG.</li>
     * <li>If SourceType is set to PAI_PUBLIC_DATASET, SourceId is empty by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>d-rbvg5wzljzjhc9ks92</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source types. Multiple source types are separated by commas (,). Valid values:</p>
     * <ul>
     * <li>PAI-PUBLIC-DATASET: a public dataset of Platform for AI (PAI).</li>
     * <li>ITAG: a dataset generated from a labeling job of iTAG.</li>
     * <li>USER: a dataset registered by a user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>USER,ITAG</p>
     */
    @NameInMap("SourceTypes")
    public String sourceTypes;

    /**
     * <p>The ID of the workspace to which the dataset belongs. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID. If you do not specify this parameter, the default workspace is used. If the default workspace does not exist, an error is reported.</p>
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
