// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListDatasetJobsRequest extends TeaModel {
    /**
     * <p>The dataset version name.</p>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("DatasetVersion")
    public String datasetVersion;

    /**
     * <p>The task action.</p>
     * 
     * <strong>example:</strong>
     * <p>SemanticIndex</p>
     */
    @NameInMap("JobAction")
    public String jobAction;

    /**
     * <p>The sorting order for the specified sorting field in a paged query. Used together with SortBy. Default value: DESC. Valid values:</p>
     * <ul>
     * <li>ASC: ascending order.</li>
     * <li>DESC: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sort field. By default, results are sorted by creation time in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The task status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Specifies whether to return task logs.</p>
     */
    @NameInMap("WithLogs")
    public Boolean withLogs;

    /**
     * <p>The workspace ID. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDatasetJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasetJobsRequest self = new ListDatasetJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasetJobsRequest setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    public ListDatasetJobsRequest setJobAction(String jobAction) {
        this.jobAction = jobAction;
        return this;
    }
    public String getJobAction() {
        return this.jobAction;
    }

    public ListDatasetJobsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDatasetJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasetJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasetJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDatasetJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListDatasetJobsRequest setWithLogs(Boolean withLogs) {
        this.withLogs = withLogs;
        return this;
    }
    public Boolean getWithLogs() {
        return this.withLogs;
    }

    public ListDatasetJobsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
