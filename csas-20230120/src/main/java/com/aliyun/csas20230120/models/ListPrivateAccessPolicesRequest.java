// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessPolicesRequest extends TeaModel {
    /**
     * <p>The ID of the office application. Either the ID or tag of the office application is used for queries. You can obtain the value by calling the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: queries office applications.</li>
     * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: creates an office application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The name of the office application.</p>
     * 
     * <strong>example:</strong>
     * <p>Office</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The page number. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the private access policy. The value must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), underscores (_), and periods (.).</p>
     * 
     * <strong>example:</strong>
     * <p>private_access_policy_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page. Valid values: 1 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The action in the private access policy. Valid values:</p>
     * <ul>
     * <li><strong>Block</strong></li>
     * <li><strong>Allow</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("PolicyAction")
    public String policyAction;

    /**
     * <p>The IDs of the private access policies. You can enter up to 100 IDs.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    /**
     * <p>The status of the private access policy. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong></li>
     * <li><strong>Disabled</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the tag for the office application. Either the ID or tag of the office application is used for queries. You can obtain the value by calling the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: queries tags for office applications.</li>
     * <li><a href="~~CreatePrivateAccessTag~~">CreatePrivateAccessTag</a>: creates a tag for office applications.</li>
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
     * <p>Cloud service</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The ID of the user group. You can obtain the value by calling the following operations:</p>
     * <ul>
     * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: queries user groups.</li>
     * <li><a href="~~CreateUserGroup~~">CreateUserGroup</a>: creates a user group.</li>
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
