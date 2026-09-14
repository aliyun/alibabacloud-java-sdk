// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrossProjectPipelineRunItemsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
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
    public Integer pageSize;

    /**
     * <p>The ID of the cross-workspace publish pipeline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fcfd4160-e2ff-4603-9719-09128fe733df</p>
     */
    @NameInMap("PipelineRunId")
    public String pipelineRunId;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListCrossProjectPipelineRunItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCrossProjectPipelineRunItemsRequest self = new ListCrossProjectPipelineRunItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListCrossProjectPipelineRunItemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCrossProjectPipelineRunItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCrossProjectPipelineRunItemsRequest setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    public ListCrossProjectPipelineRunItemsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
