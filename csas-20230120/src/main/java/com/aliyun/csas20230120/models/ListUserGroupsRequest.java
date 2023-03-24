// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsRequest extends TeaModel {
    @NameInMap("AttributeValue")
    public String attributeValue;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PAPolicyId")
    public String PAPolicyId;

    @NameInMap("PageSize")
    public Integer pageSize;

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
