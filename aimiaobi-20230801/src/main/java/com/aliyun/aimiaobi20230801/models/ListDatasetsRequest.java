// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDatasetsRequest extends TeaModel {
    /**
     * <p>A keyword within the dataset description to filter results.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DatasetId")
    public Long datasetId;

    /**
     * <p>The dataset name. The name must be globally unique.</p>
     * 
     * <strong>example:</strong>
     * <p>businessDataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The dataset type.</p>
     * 
     * <strong>example:</strong>
     * <p>CustomSemanticSearch</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    /**
     * <p>The end of the creation time range.</p>
     * 
     * <strong>example:</strong>
     * <p>创建时间-结束</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to return configuration and usage information. Default value: false.</p>
     */
    @NameInMap("IncludeConfig")
    public Boolean includeConfig;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Specifies the dataset search setting.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SearchDatasetEnable")
    public Integer searchDatasetEnable;

    /**
     * <p>The start of the creation time range.</p>
     * 
     * <strong>example:</strong>
     * <p>创建时间-开始</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The unique ID of the Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get workspaceId</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDatasetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetsRequest self = new ListDatasetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetsRequest setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public ListDatasetsRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public ListDatasetsRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ListDatasetsRequest setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public ListDatasetsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListDatasetsRequest setIncludeConfig(Boolean includeConfig) {
        this.includeConfig = includeConfig;
        return this;
    }
    public Boolean getIncludeConfig() {
        return this.includeConfig;
    }

    public ListDatasetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDatasetsRequest setSearchDatasetEnable(Integer searchDatasetEnable) {
        this.searchDatasetEnable = searchDatasetEnable;
        return this;
    }
    public Integer getSearchDatasetEnable() {
        return this.searchDatasetEnable;
    }

    public ListDatasetsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListDatasetsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
