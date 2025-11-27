// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAuthorizedUserGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the delivery group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The ID of the user group (exact match).</p>
     * 
     * <strong>example:</strong>
     * <p>ug-00001</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the user group (fuzzy match).</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The page number. Pages start from page 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The product type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static ListAuthorizedUserGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedUserGroupsRequest self = new ListAuthorizedUserGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedUserGroupsRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListAuthorizedUserGroupsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListAuthorizedUserGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListAuthorizedUserGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthorizedUserGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAuthorizedUserGroupsRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
