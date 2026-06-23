// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListPipelineRunsRequest extends TeaModel {
    /**
     * <p>Filters the results by the creator of the pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>110755000425****</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The ID of the artifact.</p>
     * 
     * <strong>example:</strong>
     * <p>860438872620113XXXX</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The page number. Pages start from 1. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace. You can obtain this ID from the Workspace Management page in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * <p>This parameter specifies the DataWorks workspace to use for the API call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Filters the results by the current status of the pipeline.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><code>Init</code>: initializing</p>
     * </li>
     * <li><p><code>Running</code>: running</p>
     * </li>
     * <li><p><code>Success</code>: succeeded</p>
     * </li>
     * <li><p><code>Fail</code>: failed</p>
     * </li>
     * <li><p><code>Termination</code>: terminated</p>
     * </li>
     * <li><p><code>Cancel</code>: canceled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListPipelineRunsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineRunsRequest self = new ListPipelineRunsRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelineRunsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListPipelineRunsRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ListPipelineRunsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPipelineRunsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelineRunsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListPipelineRunsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
