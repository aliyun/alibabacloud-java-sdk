// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListPostpaidRatePlanInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ListPostpaidRatePlanInstances</p>
     */
    @NameInMap("CheckRemainingSiteQuota")
    public String checkRemainingSiteQuota;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("Status")
    public String status;

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
