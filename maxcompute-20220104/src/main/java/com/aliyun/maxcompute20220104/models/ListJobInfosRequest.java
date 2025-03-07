// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobInfosRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort query results in ascending or descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ascOrder")
    public Boolean ascOrder;

    /**
     * <p>The ancestor node IDs.</p>
     */
    @NameInMap("extNodeIdList")
    public java.util.List<String> extNodeIdList;

    /**
     * <p>The start timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1672112000</p>
     */
    @NameInMap("from")
    public Long from;

    /**
     * <p>The job instance IDs.</p>
     */
    @NameInMap("instanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <p>The job owners.</p>
     */
    @NameInMap("jobOwnerList")
    public java.util.List<String> jobOwnerList;

    /**
     * <p>The job priorities.</p>
     */
    @NameInMap("priorityList")
    public java.util.List<Long> priorityList;

    /**
     * <p>The project names.</p>
     */
    @NameInMap("projectList")
    public java.util.List<String> projectList;

    /**
     * <p>The quota nickname.</p>
     * 
     * <strong>example:</strong>
     * <p>quota_nickname</p>
     */
    @NameInMap("quotaNickname")
    public String quotaNickname;

    /**
     * <p>The intelligent diagnostics tags.</p>
     */
    @NameInMap("sceneTagList")
    public java.util.List<String> sceneTagList;

    /**
     * <p>The job signatures.</p>
     */
    @NameInMap("signatureList")
    public java.util.List<String> signatureList;

    /**
     * <p>The sorting columns.</p>
     */
    @NameInMap("sortByList")
    public java.util.List<String> sortByList;

    /**
     * <p>The orders for the sorting columns.</p>
     */
    @NameInMap("sortOrderList")
    public java.util.List<String> sortOrderList;

    /**
     * <p>The job states.</p>
     */
    @NameInMap("statusList")
    public java.util.List<String> statusList;

    /**
     * <p>The end timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1672112130</p>
     */
    @NameInMap("to")
    public Long to;

    /**
     * <p>The job types.</p>
     */
    @NameInMap("typeList")
    public java.util.List<String> typeList;

    /**
     * <p>The column based on which you want to sort query results.</p>
     * 
     * <strong>example:</strong>
     * <p>cuUsage</p>
     */
    @NameInMap("orderColumn")
    public String orderColumn;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>478403690625249</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListJobInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobInfosRequest self = new ListJobInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListJobInfosRequest setAscOrder(Boolean ascOrder) {
        this.ascOrder = ascOrder;
        return this;
    }
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    public ListJobInfosRequest setExtNodeIdList(java.util.List<String> extNodeIdList) {
        this.extNodeIdList = extNodeIdList;
        return this;
    }
    public java.util.List<String> getExtNodeIdList() {
        return this.extNodeIdList;
    }

    public ListJobInfosRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public ListJobInfosRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public ListJobInfosRequest setJobOwnerList(java.util.List<String> jobOwnerList) {
        this.jobOwnerList = jobOwnerList;
        return this;
    }
    public java.util.List<String> getJobOwnerList() {
        return this.jobOwnerList;
    }

    public ListJobInfosRequest setPriorityList(java.util.List<Long> priorityList) {
        this.priorityList = priorityList;
        return this;
    }
    public java.util.List<Long> getPriorityList() {
        return this.priorityList;
    }

    public ListJobInfosRequest setProjectList(java.util.List<String> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<String> getProjectList() {
        return this.projectList;
    }

    public ListJobInfosRequest setQuotaNickname(String quotaNickname) {
        this.quotaNickname = quotaNickname;
        return this;
    }
    public String getQuotaNickname() {
        return this.quotaNickname;
    }

    public ListJobInfosRequest setSceneTagList(java.util.List<String> sceneTagList) {
        this.sceneTagList = sceneTagList;
        return this;
    }
    public java.util.List<String> getSceneTagList() {
        return this.sceneTagList;
    }

    public ListJobInfosRequest setSignatureList(java.util.List<String> signatureList) {
        this.signatureList = signatureList;
        return this;
    }
    public java.util.List<String> getSignatureList() {
        return this.signatureList;
    }

    public ListJobInfosRequest setSortByList(java.util.List<String> sortByList) {
        this.sortByList = sortByList;
        return this;
    }
    public java.util.List<String> getSortByList() {
        return this.sortByList;
    }

    public ListJobInfosRequest setSortOrderList(java.util.List<String> sortOrderList) {
        this.sortOrderList = sortOrderList;
        return this;
    }
    public java.util.List<String> getSortOrderList() {
        return this.sortOrderList;
    }

    public ListJobInfosRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public ListJobInfosRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public ListJobInfosRequest setTypeList(java.util.List<String> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

    public ListJobInfosRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListJobInfosRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListJobInfosRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListJobInfosRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListJobInfosRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
