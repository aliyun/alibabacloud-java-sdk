// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsShrinkRequest extends TeaModel {
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
    public String userGroupIdsShrink;

    public static ListUserGroupsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsShrinkRequest self = new ListUserGroupsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsShrinkRequest setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }
    public String getAttributeValue() {
        return this.attributeValue;
    }

    public ListUserGroupsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserGroupsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListUserGroupsShrinkRequest setPAPolicyId(String PAPolicyId) {
        this.PAPolicyId = PAPolicyId;
        return this;
    }
    public String getPAPolicyId() {
        return this.PAPolicyId;
    }

    public ListUserGroupsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserGroupsShrinkRequest setUserGroupIdsShrink(String userGroupIdsShrink) {
        this.userGroupIdsShrink = userGroupIdsShrink;
        return this;
    }
    public String getUserGroupIdsShrink() {
        return this.userGroupIdsShrink;
    }

}
