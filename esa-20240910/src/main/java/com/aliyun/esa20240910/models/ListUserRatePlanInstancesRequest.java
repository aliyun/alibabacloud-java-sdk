// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRatePlanInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to query only the plans that have remaining quota for associating websites. Valid values:</p>
     * <ul>
     * <li>true: queries only the plans that have remaining quota for associating websites.</li>
     * <li>false: queries all plans in your account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckRemainingSiteQuota")
    public String checkRemainingSiteQuota;

    /**
     * <p>The plan ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: <strong>1</strong>.</p>
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
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PlanNameEn")
    public String planNameEn;

    @NameInMap("PlanType")
    public String planType;

    @NameInMap("RemainingExpireDays")
    public Integer remainingExpireDays;

    /**
     * <p>The sorting field. By default, the queried plans are sorted by purchase time. Valid values:</p>
     * <ul>
     * <li>CreateTime: the time when the plans were purchased.</li>
     * <li>ExpireTime: the time when the plans expire.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The order in which you want to sort the query results. Default value: desc. Valid values:</p>
     * <ul>
     * <li>asc: in ascending order.</li>
     * <li>desc: in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The plan status. Valid values:</p>
     * <ul>
     * <li>online: The plan is in service.</li>
     * <li>offline: The plan has expired within an allowable period. In this state, the plan is unavailable.</li>
     * <li>disable: The plan is released.</li>
     * <li>overdue: The plan is stopped due to overdue payments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("SubscribeType")
    public String subscribeType;

    public static ListUserRatePlanInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserRatePlanInstancesRequest self = new ListUserRatePlanInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserRatePlanInstancesRequest setCheckRemainingSiteQuota(String checkRemainingSiteQuota) {
        this.checkRemainingSiteQuota = checkRemainingSiteQuota;
        return this;
    }
    public String getCheckRemainingSiteQuota() {
        return this.checkRemainingSiteQuota;
    }

    public ListUserRatePlanInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUserRatePlanInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserRatePlanInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserRatePlanInstancesRequest setPlanNameEn(String planNameEn) {
        this.planNameEn = planNameEn;
        return this;
    }
    public String getPlanNameEn() {
        return this.planNameEn;
    }

    public ListUserRatePlanInstancesRequest setPlanType(String planType) {
        this.planType = planType;
        return this;
    }
    public String getPlanType() {
        return this.planType;
    }

    public ListUserRatePlanInstancesRequest setRemainingExpireDays(Integer remainingExpireDays) {
        this.remainingExpireDays = remainingExpireDays;
        return this;
    }
    public Integer getRemainingExpireDays() {
        return this.remainingExpireDays;
    }

    public ListUserRatePlanInstancesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListUserRatePlanInstancesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListUserRatePlanInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUserRatePlanInstancesRequest setSubscribeType(String subscribeType) {
        this.subscribeType = subscribeType;
        return this;
    }
    public String getSubscribeType() {
        return this.subscribeType;
    }

}
