// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCacheReserveInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the cache reserve instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1 to 500</strong>. Default value: <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The criterion by which you want to sort the queried instances. Valid values:</p>
     * <ul>
     * <li>ExpireTime: sorts the instances by the time when the instances expire.</li>
     * <li>CreateTime: sorts the instances by the time when the instances were purchased.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ExpireTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The order by which you want to sort the queried instances. Valid values:</p>
     * <ul>
     * <li>asc: in ascending order.</li>
     * <li>desc: in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The status of the cache reserve instance. Valid values:</p>
     * <ul>
     * <li>online: The instance is in service.</li>
     * <li>offline: The instance has expired within an allowable period. In this state, the plan is unavailable.</li>
     * <li>disable: The instance is released.</li>
     * <li>overdue: The instance is stopped due to overdue payments.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ListCacheReserveInstances</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCacheReserveInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCacheReserveInstancesRequest self = new ListCacheReserveInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListCacheReserveInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCacheReserveInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCacheReserveInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCacheReserveInstancesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListCacheReserveInstancesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListCacheReserveInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
