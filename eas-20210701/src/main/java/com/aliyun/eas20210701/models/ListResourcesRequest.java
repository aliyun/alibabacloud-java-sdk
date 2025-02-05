// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group. You can call the <a href="https://help.aliyun.com/document_detail/412111.html">CreateResource</a> operation to query the ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-h7lcw24dyqztwxxxxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the resource group. You can call the <a href="https://help.aliyun.com/document_detail/412111.html">CreateResource</a> operation to query the name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>MyResource</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    @NameInMap("ResourceStatus")
    public String resourceStatus;

    /**
     * <p>The type of the resource group. Valid values:</p>
     * <ul>
     * <li>Dedicated: the dedicated resource group.</li>
     * <li>SelfManaged: the self-managed resource group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Sort")
    public String sort;

    public static ListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesRequest self = new ListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListResourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListResourcesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListResourcesRequest setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
        return this;
    }
    public String getResourceStatus() {
        return this.resourceStatus;
    }

    public ListResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListResourcesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

}
