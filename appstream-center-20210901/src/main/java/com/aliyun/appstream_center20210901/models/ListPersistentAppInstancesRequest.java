// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListPersistentAppInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the delivery group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-0bxls9m9arax6****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The IDs of the persistent sessions.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AppInstancePersistentIds")
    public java.util.List<String> appInstancePersistentIds;

    /**
     * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The value cannot be greater than <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * <li>CloudBrowser: Cloud-based Browser</li>
     * <li>AndroidCloud: Cloud Phone</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListPersistentAppInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPersistentAppInstancesRequest self = new ListPersistentAppInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListPersistentAppInstancesRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListPersistentAppInstancesRequest setAppInstancePersistentIds(java.util.List<String> appInstancePersistentIds) {
        this.appInstancePersistentIds = appInstancePersistentIds;
        return this;
    }
    public java.util.List<String> getAppInstancePersistentIds() {
        return this.appInstancePersistentIds;
    }

    public ListPersistentAppInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPersistentAppInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPersistentAppInstancesRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
