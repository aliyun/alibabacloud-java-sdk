// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListBotInstancesRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-xcdn-96wblslz****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number for the paged query. Settings this parameter for paging. Default value: 1. Valid values: 1 to 100000.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for the paged query. This parameter is used for paging. Valid values: 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field by which to sort the results. By default, the results are sorted by purchase time. Valid values:</p>
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
     * <p>desc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>online</strong>: The instance is running normally.</li>
     * <li><strong>offline</strong>: The instance has expired but has not exceeded the retention period and is unavailable.</li>
     * <li><strong>disable</strong>: The instance has been released.</li>
     * <li><strong>overdue</strong>: The instance has an overdue payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListBotInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBotInstancesRequest self = new ListBotInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListBotInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListBotInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBotInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBotInstancesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListBotInstancesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListBotInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
