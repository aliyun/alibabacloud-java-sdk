// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><code>Desc</code>: descending order</p>
     * </li>
     * <li><p><code>Asc</code>: ascending order</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
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
     * <p>The resource group ID. The <a href="https://help.aliyun.com/document_detail/412111.html">CreateResource</a> operation returns this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-r-h7lcw24dyqztwxxxxxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The resource group name. The <a href="https://help.aliyun.com/document_detail/412111.html">CreateResource</a> operation returns this name.</p>
     * 
     * <strong>example:</strong>
     * <p>MyResource</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The resource group status.</p>
     * 
     * <strong>example:</strong>
     * <p>ResourceReady</p>
     */
    @NameInMap("ResourceStatus")
    public String resourceStatus;

    /**
     * <p>The resource group type. Valid values:</p>
     * <ul>
     * <li><p><code>Dedicated</code>: dedicated resource group</p>
     * </li>
     * <li><p><code>SelfManaged</code>: self-managed resource group</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The sort field. Timestamp fields are sorted in descending order by default.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The usage mode of the resource group. The default value is <code>inference</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>inference</p>
     */
    @NameInMap("UsageMode")
    public String usageMode;

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

    public ListResourcesRequest setUsageMode(String usageMode) {
        this.usageMode = usageMode;
        return this;
    }
    public String getUsageMode() {
        return this.usageMode;
    }

}
