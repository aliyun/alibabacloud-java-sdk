// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccApprovalsRequest extends TeaModel {
    @NameInMap("ApprovalIds")
    public java.util.List<Long> approvalIds;

    @NameInMap("ApprovalStates")
    public java.util.List<Integer> approvalStates;

    @NameInMap("ApprovalTypes")
    public java.util.List<Integer> approvalTypes;

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
    public java.util.Map<String, ?> param;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProposerId")
    public Long proposerId;

    @NameInMap("Start")
    public Integer start;

    @NameInMap("UserId")
    public String userId;

    public static ListCsccApprovalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCsccApprovalsRequest self = new ListCsccApprovalsRequest();
        return TeaModel.build(map, self);
    }

    public ListCsccApprovalsRequest setApprovalIds(java.util.List<Long> approvalIds) {
        this.approvalIds = approvalIds;
        return this;
    }
    public java.util.List<Long> getApprovalIds() {
        return this.approvalIds;
    }

    public ListCsccApprovalsRequest setApprovalStates(java.util.List<Integer> approvalStates) {
        this.approvalStates = approvalStates;
        return this;
    }
    public java.util.List<Integer> getApprovalStates() {
        return this.approvalStates;
    }

    public ListCsccApprovalsRequest setApprovalTypes(java.util.List<Integer> approvalTypes) {
        this.approvalTypes = approvalTypes;
        return this;
    }
    public java.util.List<Integer> getApprovalTypes() {
        return this.approvalTypes;
    }

    public ListCsccApprovalsRequest setApproverId(Long approverId) {
        this.approverId = approverId;
        return this;
    }
    public Long getApproverId() {
        return this.approverId;
    }

    public ListCsccApprovalsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCsccApprovalsRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListCsccApprovalsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListCsccApprovalsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListCsccApprovalsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCsccApprovalsRequest setParam(java.util.Map<String, ?> param) {
        this.param = param;
        return this;
    }
    public java.util.Map<String, ?> getParam() {
        return this.param;
    }

    public ListCsccApprovalsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListCsccApprovalsRequest setProposerId(Long proposerId) {
        this.proposerId = proposerId;
        return this;
    }
    public Long getProposerId() {
        return this.proposerId;
    }

    public ListCsccApprovalsRequest setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public ListCsccApprovalsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
