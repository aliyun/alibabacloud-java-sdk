// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessPolicesShrinkRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PolicyAction")
    public String policyAction;

    @NameInMap("PolicyIds")
    public String policyIdsShrink;

    @NameInMap("Status")
    public String status;

    @NameInMap("TagId")
    public String tagId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListPrivateAccessPolicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessPolicesShrinkRequest self = new ListPrivateAccessPolicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessPolicesShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListPrivateAccessPolicesShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPrivateAccessPolicesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPrivateAccessPolicesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPrivateAccessPolicesShrinkRequest setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
        return this;
    }
    public String getPolicyAction() {
        return this.policyAction;
    }

    public ListPrivateAccessPolicesShrinkRequest setPolicyIdsShrink(String policyIdsShrink) {
        this.policyIdsShrink = policyIdsShrink;
        return this;
    }
    public String getPolicyIdsShrink() {
        return this.policyIdsShrink;
    }

    public ListPrivateAccessPolicesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListPrivateAccessPolicesShrinkRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public ListPrivateAccessPolicesShrinkRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
