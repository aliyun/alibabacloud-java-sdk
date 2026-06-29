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
     * <p>The plan instance ID. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number to return in a paged query. Default value: <strong>1</strong>. Valid values: <strong>1</strong> to <strong>100000</strong>. Settings for paging take effect only when this parameter is specified.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 500. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The plan name in English.</p>
     * 
     * <strong>example:</strong>
     * <p>entranceplan</p>
     */
    @NameInMap("PlanNameEn")
    public String planNameEn;

    /**
     * <p>The plan type. Valid values:</p>
     * <ul>
     * <li>normal: fixed-version plan</li>
     * <li>enterprise: Enterprise Edition plan.</li>
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

    /**
     * <p>The field by which to sort the results. By default, results are sorted by purchase time. Valid values:</p>
     * <ul>
     * <li><strong>CreateTime</strong>: purchase time.</li>
     * <li><strong>ExpireTime</strong>: expiration time.</li>
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
     * <li><strong>asc</strong>: ascending order.</li>
     * <li><strong>desc</strong>: descending order.</li>
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
     * <li><strong>online</strong>: The plan instance is in normal service.</li>
     * <li><strong>offline</strong>: The plan instance has expired but has not exceeded the grace period and is not active.</li>
     * <li><strong>disable</strong>: The plan instance has been released.</li>
     * <li><strong>overdue</strong>: The plan instance has an overdue payment.</li>
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
     * <li>entranceplan: Free Edition (Chinese mainland)</li>
     * <li>entranceplan_intl: Free Edition (International)</li>
     * <li>basicplan: Basic Edition</li>
     * <li>standardplan: Standard Edition</li>
     * <li>advancedplan: Premium Edition</li>
     * <li>enterpriseplan: Enterprise Edition.</li>
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
