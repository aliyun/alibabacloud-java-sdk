// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListProhibitedPoliciesRequest extends TeaModel {
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
    public ListProhibitedPoliciesRequestSoftwareId softwareId;

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

    public static ListProhibitedPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProhibitedPoliciesRequest self = new ListProhibitedPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListProhibitedPoliciesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListProhibitedPoliciesRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ListProhibitedPoliciesRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public ListProhibitedPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProhibitedPoliciesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ListProhibitedPoliciesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProhibitedPoliciesRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public ListProhibitedPoliciesRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public ListProhibitedPoliciesRequest setSoftwareId(ListProhibitedPoliciesRequestSoftwareId softwareId) {
        this.softwareId = softwareId;
        return this;
    }
    public ListProhibitedPoliciesRequestSoftwareId getSoftwareId() {
        return this.softwareId;
    }

    public ListProhibitedPoliciesRequest setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
        return this;
    }
    public String getSoftwareName() {
        return this.softwareName;
    }

    public ListProhibitedPoliciesRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public ListProhibitedPoliciesRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public ListProhibitedPoliciesRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static class ListProhibitedPoliciesRequestSoftwareId extends TeaModel {
        /**
         * <p>Specifies whether the prohibited software is a system built-in entry. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A system built-in prohibited software entry shared by all Alibaba Cloud accounts. Modification and deletion are not supported.</li>
         * <li><strong>false</strong>: Custom prohibited software under the current Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The prohibited software ID. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListProhibitedSoftware~~">ListProhibitedSoftware</a>: Lists prohibited software.</li>
         * <li><a href="~~CreateProhibitedSoftware~~">CreateProhibitedSoftware</a>: Creates custom prohibited software.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>swb-83995ff2ae38****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        public static ListProhibitedPoliciesRequestSoftwareId build(java.util.Map<String, ?> map) throws Exception {
            ListProhibitedPoliciesRequestSoftwareId self = new ListProhibitedPoliciesRequestSoftwareId();
            return TeaModel.build(map, self);
        }

        public ListProhibitedPoliciesRequestSoftwareId setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListProhibitedPoliciesRequestSoftwareId setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

    }

}
