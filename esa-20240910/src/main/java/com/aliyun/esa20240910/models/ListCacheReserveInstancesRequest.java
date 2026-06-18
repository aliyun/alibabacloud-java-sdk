// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCacheReserveInstancesRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
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
     * <p>The number of entries per page. Valid values: <strong>1 to 500</strong>. The default value is <strong>500</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field to sort the results by. Valid values:</p>
     * <ul>
     * <li><p><strong>ExpireTime</strong>: Expiration time.</p>
     * </li>
     * <li><p><strong>CreateTime</strong>: Creation time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ExpireTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>asc</strong>: Ascending order.</p>
     * </li>
     * <li><p><strong>desc</strong>: Descending order.</p>
     * </li>
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
     * <li><p><strong>online</strong>: The instance is running normally.</p>
     * </li>
     * <li><p><strong>offline</strong>: The instance has expired and is unavailable but remains within the grace period.</p>
     * </li>
     * <li><p><strong>disable</strong>: The instance is disabled.</p>
     * </li>
     * <li><p><strong>overdue</strong>: The instance is suspended due to an overdue payment.</p>
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
