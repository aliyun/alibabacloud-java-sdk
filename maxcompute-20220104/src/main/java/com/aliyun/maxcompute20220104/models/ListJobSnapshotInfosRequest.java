// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobSnapshotInfosRequest extends TeaModel {
    /**
     * <p>Specifies whether to sort the results in ascending order.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ascOrder")
    public Boolean ascOrder;

    /**
     * <p>The upstream node IDs.</p>
     */
    @NameInMap("extNodeIdList")
    public java.util.List<String> extNodeIdList;

    /**
     * <p>The start timestamp.</p>
     * <blockquote>
     * <p>This parameter is invalid. The end timestamp specifies the snapshot time to query.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1706840714</p>
     */
    @NameInMap("from")
    public Long from;

    /**
     * <p>The job instance Id.</p>
     */
    @NameInMap("instanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <p>The list of job owners.</p>
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
     * <p>The nickname of the compute quota used by the job.</p>
     * 
     * <strong>example:</strong>
     * <p>quota_A</p>
     */
    @NameInMap("quotaNickname")
    public String quotaNickname;

    /**
     * <p>The SQL job signatures.</p>
     */
    @NameInMap("signatureList")
    public java.util.List<String> signatureList;

    /**
     * <p>The multi-column sort fields.</p>
     */
    @NameInMap("sortByList")
    public java.util.List<String> sortByList;

    /**
     * <p>The multi-column sort orders.</p>
     */
    @NameInMap("sortOrderList")
    public java.util.List<String> sortOrderList;

    /**
     * <p>The job statuses.</p>
     */
    @NameInMap("statusList")
    public java.util.List<String> statusList;

    /**
     * <p>The end timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1706840714</p>
     */
    @NameInMap("to")
    public Long to;

    /**
     * <p>The job types.</p>
     */
    @NameInMap("typeList")
    public java.util.List<String> typeList;

    /**
     * <p>The sort column. Valid values:</p>
     * <ul>
     * <li>submittedAtTime</li>
     * <li>waitingTime</li>
     * <li>runningAtTime</li>
     * <li>runningTime</li>
     * <li>snapshotTime</li>
     * <li>totalTime</li>
     * <li>cpuUsage </li>
     * <li>memoryUsage</li>
     * <li>minCpuPct</li>
     * <li>minMemoryPct</li>
     * <li>priority</li>
     * <li>cpuRequest</li>
     * <li>memoryRequest</li>
     * <li>cpuUsageToRequestRatio</li>
     * <li>memoryUsageToRequestRatio</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cpuUsage</p>
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
     * <p>The page size, which is the maximum number of entries to return per page.</p>
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
     * <p>cn-chengdu</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The tenant ID. You can view the tenant ID by logging on to the MaxCompute console and choosing Tenant Management &gt; Tenant Properties in the left-side navigation pane.</p>
     * 
     * <strong>example:</strong>
     * <p>478403690625249</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListJobSnapshotInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobSnapshotInfosRequest self = new ListJobSnapshotInfosRequest();
        return TeaModel.build(map, self);
    }

    public ListJobSnapshotInfosRequest setAscOrder(Boolean ascOrder) {
        this.ascOrder = ascOrder;
        return this;
    }
    public Boolean getAscOrder() {
        return this.ascOrder;
    }

    public ListJobSnapshotInfosRequest setExtNodeIdList(java.util.List<String> extNodeIdList) {
        this.extNodeIdList = extNodeIdList;
        return this;
    }
    public java.util.List<String> getExtNodeIdList() {
        return this.extNodeIdList;
    }

    public ListJobSnapshotInfosRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public ListJobSnapshotInfosRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public ListJobSnapshotInfosRequest setJobOwnerList(java.util.List<String> jobOwnerList) {
        this.jobOwnerList = jobOwnerList;
        return this;
    }
    public java.util.List<String> getJobOwnerList() {
        return this.jobOwnerList;
    }

    public ListJobSnapshotInfosRequest setPriorityList(java.util.List<Long> priorityList) {
        this.priorityList = priorityList;
        return this;
    }
    public java.util.List<Long> getPriorityList() {
        return this.priorityList;
    }

    public ListJobSnapshotInfosRequest setProjectList(java.util.List<String> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<String> getProjectList() {
        return this.projectList;
    }

    public ListJobSnapshotInfosRequest setQuotaNickname(String quotaNickname) {
        this.quotaNickname = quotaNickname;
        return this;
    }
    public String getQuotaNickname() {
        return this.quotaNickname;
    }

    public ListJobSnapshotInfosRequest setSignatureList(java.util.List<String> signatureList) {
        this.signatureList = signatureList;
        return this;
    }
    public java.util.List<String> getSignatureList() {
        return this.signatureList;
    }

    public ListJobSnapshotInfosRequest setSortByList(java.util.List<String> sortByList) {
        this.sortByList = sortByList;
        return this;
    }
    public java.util.List<String> getSortByList() {
        return this.sortByList;
    }

    public ListJobSnapshotInfosRequest setSortOrderList(java.util.List<String> sortOrderList) {
        this.sortOrderList = sortOrderList;
        return this;
    }
    public java.util.List<String> getSortOrderList() {
        return this.sortOrderList;
    }

    public ListJobSnapshotInfosRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public ListJobSnapshotInfosRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

    public ListJobSnapshotInfosRequest setTypeList(java.util.List<String> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

    public ListJobSnapshotInfosRequest setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
        return this;
    }
    public String getOrderColumn() {
        return this.orderColumn;
    }

    public ListJobSnapshotInfosRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListJobSnapshotInfosRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListJobSnapshotInfosRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListJobSnapshotInfosRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
