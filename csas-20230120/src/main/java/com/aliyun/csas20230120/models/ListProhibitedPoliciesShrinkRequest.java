// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedPoliciesShrinkRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paged query. Valid values: 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>Specifies whether the policy is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled. The policy is delivered to endpoints and takes effect.</li>
     * <li><strong>false</strong>: Disabled. The policy configuration is retained but not delivered to endpoints.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The effective scope. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: Applies to all users under the current Alibaba Cloud account. No user group needs to be specified.</li>
     * <li><strong>UserGroupNormal</strong>: Applies only to users in the user groups specified by UserGroupIds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupAll</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>Policy Name of the software prohibition policy. Fuzzy match is supported. Policy Name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The object type of the controlled target. Valid values:</p>
     * <ul>
     * <li><strong>App</strong>: Controls by prohibited software. The controlled objects are specified by SoftwareIds.</li>
     * <li><strong>Tag</strong>: Controls by prohibited software tag. The controlled objects are specified by TagIds. All prohibited software under the tag is controlled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>App</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The number of entries per page in a paged query. Valid values: 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The collection of software prohibition policy IDs. Duplicate values are not allowed.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    /**
     * <p>The action to take. Valid values:</p>
     * <ul>
     * <li><strong>Ban</strong>: Blocks the software from running and displays a pop-up notification on the endpoint to alert the user.</li>
     * <li><strong>BanSilent</strong>: Blocks the software from running without notifying the user. The blocking is silent.</li>
     * <li><strong>Warn</strong>: Only displays a pop-up notification on the endpoint to alert the user without blocking the software from running.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ban</p>
     */
    @NameInMap("PolicyType")
    public String policyType;

    /**
     * <p>The unique identifier of the prohibited software.</p>
     */
    @NameInMap("SoftwareId")
    public String softwareIdShrink;

    /**
     * <p>The name of the prohibited software. Fuzzy match is supported. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Thunder</p>
     */
    @NameInMap("SoftwareName")
    public String softwareName;

    /**
     * <p>The prohibited software tag ID, used to filter policies that reference this tag. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListProhibitedTags~~">ListProhibitedTags</a>: Lists prohibited software tags.</li>
     * <li><a href="~~CreateProhibitedTag~~">CreateProhibitedTag</a>: Creates a custom prohibited software tag.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tag-d3f64e8bdd4a****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    /**
     * <p>The name of the prohibited software tag. Fuzzy match is supported. The name can be up to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-). Spaces are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudProduct</p>
     */
    @NameInMap("TagName")
    public String tagName;

    /**
     * <p>The user group ID, used to filter policies whose effective scope includes this user group. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListUserGroups~~">ListUserGroups</a>: Lists user groups.</li>
     * <li><a href="~~CreateUserGroup~~">CreateUserGroup</a>: Creates a user group.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>usergroup-9d4f2a7b3c1e****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListProhibitedPoliciesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedPoliciesShrinkRequest self = new ListProhibitedPoliciesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProhibitedPoliciesShrinkRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListProhibitedPoliciesShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ListProhibitedPoliciesShrinkRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public ListProhibitedPoliciesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProhibitedPoliciesShrinkRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ListProhibitedPoliciesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProhibitedPoliciesShrinkRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public ListProhibitedPoliciesShrinkRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListProhibitedPoliciesShrinkRequest setSoftwareIdShrink(String softwareIdShrink) {
        this.softwareIdShrink = softwareIdShrink;
        return this;
    }
    public String getSoftwareIdShrink() {
        return this.softwareIdShrink;
    }

    public ListProhibitedPoliciesShrinkRequest setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
        return this;
    }
    public String getSoftwareName() {
        return this.softwareName;
    }

    public ListProhibitedPoliciesShrinkRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public ListProhibitedPoliciesShrinkRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public ListProhibitedPoliciesShrinkRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
