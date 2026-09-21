// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListDDoSInstancesRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-ddos-b1e0l80ugfeo</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number for a paged query. The value must be greater than or equal to 1. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Default value: 20. Maximum value: 500. Valid values: any integer from 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The instance ID of the associated site plan.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-a71k7bw1adf</p>
     */
    @NameInMap("SiteInstanceId")
    public String siteInstanceId;

    /**
     * <p>The sort field. By default, results are sorted by purchase time. Valid values:</p>
     * <ul>
     * <li><strong>CreateTime</strong>: purchase time.</li>
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
     * <li>asc: ascending order.</li>
     * <li>desc: descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListDDoSInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDDoSInstancesRequest self = new ListDDoSInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListDDoSInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDDoSInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDDoSInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDDoSInstancesRequest setSiteInstanceId(String siteInstanceId) {
        this.siteInstanceId = siteInstanceId;
        return this;
    }
    public String getSiteInstanceId() {
        return this.siteInstanceId;
    }

    public ListDDoSInstancesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDDoSInstancesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListDDoSInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
