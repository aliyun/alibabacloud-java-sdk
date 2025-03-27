// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCacheReserveInstancesRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size. Range: <strong>1~500</strong>, default is <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The criterion by which you want to sort the queried instances. Valid values:</p>
     * <ul>
     * <li><strong>ExpireTime</strong></li>
     * <li><strong>CreateTime</strong></li>
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
     * <li><strong>asc</strong></li>
     * <li><strong>desc</strong></li>
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
     * <li><strong>online</strong>: The instance is in service.</li>
     * <li><strong>offline</strong>: The instance has expired within an allowable period. In this state, it is unavailable.</li>
     * <li><strong>disable</strong>: The instance has been released.</li>
     * <li><strong>overdue</strong>: The instance has been stopped due to overdue payments.</li>
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
