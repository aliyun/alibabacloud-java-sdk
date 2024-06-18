// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessPolicesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>private_access_policy_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>tag-c0cb77857a99****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>用户组ID。取值来源：</p>
     * <ul>
     * <li><a href="~~ListUserGroups~~">ListUserGroups</a>：批量查询用户组。</li>
     * <li><a href="~~CreateUserGroup~~">CreateUserGroup</a>：创建用户组。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>usergroup-6f1ef2fc56b6****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListPrivateAccessPolicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessPolicesRequest self = new ListPrivateAccessPolicesRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessPolicesRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListPrivateAccessPolicesRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public ListPrivateAccessPolicesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListPrivateAccessPolicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPrivateAccessPolicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPrivateAccessPolicesRequest setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
        return this;
    }
    public String getPolicyAction() {
        return this.policyAction;
    }

    public ListPrivateAccessPolicesRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public ListPrivateAccessPolicesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListPrivateAccessPolicesRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public ListPrivateAccessPolicesRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public ListPrivateAccessPolicesRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
