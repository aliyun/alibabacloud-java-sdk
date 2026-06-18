// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRatePlanInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to filter for rate plan instances that have a remaining site quota. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Returns only rate plan instances that have a remaining site quota.</p>
     * </li>
     * <li><p><strong>false</strong>: Returns all rate plan instances for the user.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckRemainingSiteQuota")
    public String checkRemainingSiteQuota;

    /**
     * <p>The ID of the rate plan instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The default value is <strong>1</strong>. The value must be in the range of <strong>1 to 100,000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
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
     * <p>The sort field. By default, results are sorted by creation time. Valid values:</p>
     * <ul>
     * <li><p><strong>CreateTime</strong>: Sorts by creation time.</p>
     * </li>
     * <li><p><strong>ExpireTime</strong>: Sorts by expiration time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order. The default is descending. Valid values:</p>
     * <ul>
     * <li><p><strong>asc</strong>: Sorts in ascending order.</p>
     * </li>
     * <li><p><strong>desc</strong>: Sorts in descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The status of the rate plan instance. Valid values:</p>
     * <ul>
     * <li><p><strong>online</strong>: The instance is in service.</p>
     * </li>
     * <li><p><strong>offline</strong>: The instance has expired and is unavailable.</p>
     * </li>
     * <li><p><strong>disable</strong>: The instance is released.</p>
     * </li>
     * <li><p><strong>overdue</strong>: The instance is overdue.</p>
     * </li>
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
