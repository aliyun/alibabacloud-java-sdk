// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccApprovalsShrinkRequest extends TeaModel {
    @NameInMap("ApprovalIds")
    public String approvalIdsShrink;

    @NameInMap("ApprovalStates")
    public String approvalStatesShrink;

    @NameInMap("ApprovalTypes")
    public String approvalTypesShrink;

    @NameInMap("ApproverId")
    public Long approverId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("Order")
    public String order;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Param")
    public String paramShrink;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProposerId")
    public Long proposerId;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("UserId")
    public String userId;

    public static ListCsccApprovalsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCsccApprovalsShrinkRequest self = new ListCsccApprovalsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCsccApprovalsShrinkRequest setApprovalIdsShrink(String approvalIdsShrink) {
        this.approvalIdsShrink = approvalIdsShrink;
        return this;
    }
    public String getApprovalIdsShrink() {
        return this.approvalIdsShrink;
    }

    public ListCsccApprovalsShrinkRequest setApprovalStatesShrink(String approvalStatesShrink) {
        this.approvalStatesShrink = approvalStatesShrink;
        return this;
    }
    public String getApprovalStatesShrink() {
        return this.approvalStatesShrink;
    }

    public ListCsccApprovalsShrinkRequest setApprovalTypesShrink(String approvalTypesShrink) {
        this.approvalTypesShrink = approvalTypesShrink;
        return this;
    }
    public String getApprovalTypesShrink() {
        return this.approvalTypesShrink;
    }

    public ListCsccApprovalsShrinkRequest setApproverId(Long approverId) {
        this.approverId = approverId;
        return this;
    }
    public Long getApproverId() {
        return this.approverId;
    }

    public ListCsccApprovalsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCsccApprovalsShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListCsccApprovalsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCsccApprovalsShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListCsccApprovalsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCsccApprovalsShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public ListCsccApprovalsShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListCsccApprovalsShrinkRequest setProposerId(Long proposerId) {
        this.proposerId = proposerId;
        return this;
    }
    public Long getProposerId() {
        return this.proposerId;
    }

    public ListCsccApprovalsShrinkRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public ListCsccApprovalsShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
