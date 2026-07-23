// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPostpaidRatePlanInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to check for remaining site quota. Valid values:</p>
     * <ul>
     * <li><p>true: Queries instances that have remaining site quota.</p>
     * </li>
     * <li><p>false: Does not filter by this condition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckRemainingSiteQuota")
    public String checkRemainingSiteQuota;

    /**
     * <p>The instance ID. Use this parameter to query a specific instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-dps-xxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number for paging queries. The value must be greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging queries. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwner")
    public Long resourceOwner;

    /**
     * <p>The field by which to sort results. Valid values:</p>
     * <ul>
     * <li>CreateTime: sorted by creation time</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>asc: ascending order</p>
     * </li>
     * <li><p>desc: descending order</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><p>online: Normal.</p>
     * </li>
     * <li><p>overdue: Overdue payment.</p>
     * </li>
     * <li><p>disable: Released.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Specifies whether the instance has purchased additional bot or DDoS protection.</p>
     * 
     * <strong>example:</strong>
     * <p>bot</p>
     */
    @NameInMap("UnrelatedType")
    public String unrelatedType;

    public static ListPostpaidRatePlanInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPostpaidRatePlanInstancesRequest self = new ListPostpaidRatePlanInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListPostpaidRatePlanInstancesRequest setCheckRemainingSiteQuota(String checkRemainingSiteQuota) {
        this.checkRemainingSiteQuota = checkRemainingSiteQuota;
        return this;
    }
    public String getCheckRemainingSiteQuota() {
        return this.checkRemainingSiteQuota;
    }

    public ListPostpaidRatePlanInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListPostpaidRatePlanInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPostpaidRatePlanInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPostpaidRatePlanInstancesRequest setResourceOwner(Long resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public Long getResourceOwner() {
        return this.resourceOwner;
    }

    public ListPostpaidRatePlanInstancesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListPostpaidRatePlanInstancesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListPostpaidRatePlanInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListPostpaidRatePlanInstancesRequest setUnrelatedType(String unrelatedType) {
        this.unrelatedType = unrelatedType;
        return this;
    }
    public String getUnrelatedType() {
        return this.unrelatedType;
    }

}
