// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCodeReviewsRequest extends TeaModel {
    /**
     * <p>The account ID of the submitter.</p>
     * 
     * <strong>example:</strong>
     * <p>209000000000000002</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
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
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23620</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The account ID of the specified reviewer. Exact match is used.</p>
     * 
     * <strong>example:</strong>
     * <p>209000000000000001</p>
     */
    @NameInMap("Reviewer")
    public String reviewer;

    /**
     * <p>The review status.</p>
     * 
     * <strong>example:</strong>
     * <p>Reviewing</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCodeReviewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCodeReviewsRequest self = new ListCodeReviewsRequest();
        return TeaModel.build(map, self);
    }

    public ListCodeReviewsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListCodeReviewsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCodeReviewsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCodeReviewsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListCodeReviewsRequest setReviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }
    public String getReviewer() {
        return this.reviewer;
    }

    public ListCodeReviewsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
