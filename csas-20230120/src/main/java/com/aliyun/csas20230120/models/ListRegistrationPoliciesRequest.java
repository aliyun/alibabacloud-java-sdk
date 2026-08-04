// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRegistrationPoliciesRequest extends TeaModel {
    /**
     * <p>The type of company device registration limit. Valid values:</p>
     * <ul>
     * <li><p><strong>Unlimited</strong>: No limit.</p>
     * </li>
     * <li><p><strong>LimitAll</strong>: Limit by total number.</p>
     * </li>
     * <li><p><strong>LimitDiff</strong>: Limit by device categorization.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LimitAll</p>
     */
    @NameInMap("CompanyLimitType")
    public String companyLimitType;

    /**
     * <p>The current page number for paged queries. Values range from 1 to 10000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The policy matching target type. Valid values:</p>
     * <ul>
     * <li><p><strong>UserGroupAll</strong>: Associate all users.</p>
     * </li>
     * <li><p><strong>UserGroupNormal</strong>: Associate some user groups.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupAll</p>
     */
    @NameInMap("MatchMode")
    public String matchMode;

    /**
     * <p>The name of the device registration policy. It can be 1 to 128 characters long. It supports Chinese characters, uppercase and lowercase English letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>registration_policy_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of items per page for paged queries. Values range from 1 to 500.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The type of personal device registration limit. Valid values:</p>
     * <ul>
     * <li><p><strong>Unlimited</strong>: No limit.</p>
     * </li>
     * <li><p><strong>LimitAll</strong>: Limit by total number.</p>
     * </li>
     * <li><p><strong>LimitDiff</strong>: Limit by device categorization.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LimitDiff</p>
     */
    @NameInMap("PersonalLimitType")
    public String personalLimitType;

    /**
     * <p>A collection of device registration policy IDs. You can enter up to 100 device registration policy IDs.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    /**
     * <p>The status of the device registration policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Enabled</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>Disabled</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The user group ID. Get this value from:</p>
     * <ul>
     * <li><p><a href="~~ListUserGroups~~">ListUserGroups</a>: Batch query user groups.</p>
     * </li>
     * <li><p><a href="~~CreateUserGroup~~">CreateUserGroup</a>: Create user groups.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>usergroup-6f1ef2fc56b6****</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListRegistrationPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRegistrationPoliciesRequest self = new ListRegistrationPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListRegistrationPoliciesRequest setCompanyLimitType(String companyLimitType) {
        this.companyLimitType = companyLimitType;
        return this;
    }
    public String getCompanyLimitType() {
        return this.companyLimitType;
    }

    public ListRegistrationPoliciesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListRegistrationPoliciesRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public ListRegistrationPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListRegistrationPoliciesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRegistrationPoliciesRequest setPersonalLimitType(String personalLimitType) {
        this.personalLimitType = personalLimitType;
        return this;
    }
    public String getPersonalLimitType() {
        return this.personalLimitType;
    }

    public ListRegistrationPoliciesRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

    public ListRegistrationPoliciesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListRegistrationPoliciesRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
