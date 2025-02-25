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
     * <p>Sorting method. Values:</p>
     * <ul>
     * <li><strong>ExpireTime</strong>: Expiration time.</li>
     * <li><strong>CreateTime</strong>: Purchase time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ExpireTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Sorting order. Supported values:</p>
     * <ul>
     * <li><strong>asc</strong>: Ascending.</li>
     * <li><strong>desc</strong>: Descending.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>Cache reserve instance status. Supported values:</p>
     * <ul>
     * <li><strong>online</strong>: Normal service status.</li>
     * <li><strong>offline</strong>: Expired but not overdue, in an unavailable state.</li>
     * <li><strong>disable</strong>: Released status.</li>
     * <li><strong>overdue</strong>: Overdue and suspended status.</li>
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
