// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPostpaidRatePlanInstancesRequest extends TeaModel {
    /**
     * <p>Specifies whether to return only instances that have remaining site quota. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Returns only instances with remaining site quota.</p>
     * </li>
     * <li><p><code>false</code>: Returns all instances, regardless of site quota.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckRemainingSiteQuota")
    public String checkRemainingSiteQuota;

    /**
     * <p>The ID of the instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-dps-xxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The value must be greater than or equal to 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The maximum value is 500.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field to sort the results by. Valid value:</p>
     * <ul>
     * <li><code>CreateTime</code>: Sorts by creation time.</li>
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
     * <li><p><code>asc</code>: ascending</p>
     * </li>
     * <li><p><code>desc</code>: descending</p>
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
     * <li><p><code>online</code>: The instance is running.</p>
     * </li>
     * <li><p><code>overdue</code>: The payment for the instance is overdue.</p>
     * </li>
     * <li><p><code>disable</code>: The instance is released.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The type of add-on service to filter by, such as <code>bot</code> or <code>ddos</code>.</p>
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
