// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessPolicesRequest extends TeaModel {
    /**
     * <p>The ID of the private access application. The application ID cannot be used together with the private access tag ID for filtering. Sources of the value:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Queries private access applications by batch.</li>
     * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: Creates a private access application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The name of the private access application.</p>
     * 
     * <strong>example:</strong>
     * <p>办公</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The page number of the current page that is returned during paginated queries. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the private access policy. The name must be 1 to 128 characters in length and supports Chinese characters and uppercase and lowercase English letters. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>private_access_policy_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page that is set during paginated queries. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The action of the private access policy. Valid values:</p>
     * <ul>
     * <li><strong>Block</strong>: Block.</li>
     * <li><strong>Allow</strong>: Allow.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    /**
     * <p>The collection of private access policy IDs. You can specify up to 100 private access policy IDs.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    /**
     * <p>The status of the private access policy. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the private access tag. The tag ID cannot be used together with the application ID for filtering. Sources of the value:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: Queries private access tags by batch.</li>
     * <li><a href="~~CreatePrivateAccessTag~~">CreatePrivateAccessTag</a>: Creates a private access tag.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag-c0cb77857a99****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    /**
     * <p>The name of the tag.</p>
     * 
     * <strong>example:</strong>
     * <p>云产品</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The ID of the user group. Sources of the value:</p>
     * <ul>
     * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: Queries user groups by batch.</li>
     * <li><a href="~~CreateUserGroup~~">CreateUserGroup</a>: Creates a user group.</li>
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
