// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsRequest extends TeaModel {
    /**
     * <p>The value of a user group property. The value must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("AttributeValue")
    public String attributeValue;

    /**
     * <p>The page number of the current page in a paged query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the user group. The name must be 1 to 128 characters in length. It can contain letters, digits, periods (.), underscores (_), and hyphens (-). It supports both uppercase and lowercase letters and Chinese characters.</p>
     * 
     * <strong>example:</strong>
     * <p>user_group_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of an internal network access policy. You can get this value from:</p>
     * <ul>
     * <li><p><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: List internal network access policies.</p>
     * </li>
     * <li><p><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Create an internal network access policy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pa-policy-54a7838a48bf****</p>
     */
    @NameInMap("PAPolicyId")
    public String PAPolicyId;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A collection of user group IDs. You can specify up to 100 IDs.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    public static ListUserGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsRequest self = new ListUserGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsRequest setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }
    public String getAttributeValue() {
        return this.attributeValue;
    }

    public ListUserGroupsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUserGroupsRequest setPAPolicyId(String PAPolicyId) {
        this.PAPolicyId = PAPolicyId;
        return this;
    }
    public String getPAPolicyId() {
        return this.PAPolicyId;
    }

    public ListUserGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserGroupsRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

}
