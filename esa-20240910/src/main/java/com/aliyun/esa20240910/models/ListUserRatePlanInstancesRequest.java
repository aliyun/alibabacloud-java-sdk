// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUserRatePlanInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to filter plan instances that have remaining site quota. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Filters plan instances that have remaining site quota.</li>
     * <li><strong>false</strong>: Queries all plan instances under the user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckRemainingSiteQuota")
    public String checkRemainingSiteQuota;

    /**
     * <p>The plan instance ID. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IsShared")
    public Boolean isShared;

    /**
     * <p>The page number settings for paging. Default value: <strong>1</strong>. Valid values: <strong>1 to 100000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The plan name (English).</p>
     * 
     * <strong>example:</strong>
     * <p>entranceplan</p>
     */
    @NameInMap("PlanNameEn")
    public String planNameEn;

    /**
     * <p>The plan type. Valid values:</p>
     * <ul>
     * <li>normal: fixed edition plan</li>
     * <li>enterprise: enterprise edition plan</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("PlanType")
    public String planType;

    /**
     * <p>Queries plan instances whose remaining validity period is within the specified number of days. The value must be a positive integer. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RemainingExpireDays")
    public Integer remainingExpireDays;

    @NameInMap("ResourceOwner")
    public Long resourceOwner;

    /**
     * <p>The sort field. By default, results are sorted by purchase time. Valid values:</p>
     * <ul>
     * <li><strong>CreateTime</strong>: Purchase time.</li>
     * <li><strong>ExpireTime</strong>: Expiration time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order. Default value: desc. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: Ascending order.</li>
     * <li><strong>desc</strong>: Descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>online</strong>: Normal service status.</li>
     * <li><strong>offline</strong>: Expired but not overdue, in an inactive state.</li>
     * <li><strong>disable</strong>: Released.</li>
     * <li><strong>overdue</strong>: Overdue payment.</li>
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

    /**
     * <p>The plan subscription type. Valid values:</p>
     * <ul>
     * <li>Free Edition (Chinese mainland): entranceplan</li>
     * <li>Free Edition (International): entranceplan_intl</li>
     * <li>Basic Edition: basicplan</li>
     * <li>Standard Edition: standardplan</li>
     * <li>Premium Edition: advancedplan</li>
     * <li>Enterprise Edition: enterpriseplan</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basicplan</p>
     */
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

    public ListUserRatePlanInstancesRequest setIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }
    public Boolean getIsShared() {
        return this.isShared;
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

    public ListUserRatePlanInstancesRequest setResourceOwner(Long resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public Long getResourceOwner() {
        return this.resourceOwner;
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
