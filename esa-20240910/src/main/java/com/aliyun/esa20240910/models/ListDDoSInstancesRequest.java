// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListDDoSInstancesRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-ddos-b1e0l80ugfeo</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page number. Default: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of entries per page. Default: 20. Maximum: 500. Valid values: integers from 1 to 500.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Associated site package instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-a71k7bw1adf</p>
     */
    @NameInMap("SiteInstanceId")
    public String siteInstanceId;

    /**
     * <p>Sort field. Default: CreateTime.</p>
     * <ul>
     * <li><strong>CreateTime</strong>: Time when the instance was purchased.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Sort order:</p>
     * <ul>
     * <li><p>asc: ascending.</p>
     * </li>
     * <li><p>desc: descending.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>Instance status.</p>
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
