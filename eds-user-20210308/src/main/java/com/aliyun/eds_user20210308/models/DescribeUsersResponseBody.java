// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUsersResponseBody extends TeaModel {
    /**
     * <p>The total number of users that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The token for the next query. An empty NextToken indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The collection of convenience user information.</p>
     */
    @NameInMap("Users")
    public java.util.List<DescribeUsersResponseBodyUsers> users;

    public static DescribeUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersResponseBody self = new DescribeUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsersResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsersResponseBody setUsers(java.util.List<DescribeUsersResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<DescribeUsersResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class DescribeUsersResponseBodyUsersExtrasResourcePolicyList extends TeaModel {
        /**
         * <p>The ID of the resource policy.</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The Policy Name of the resource policy.</p>
         */
        @NameInMap("PolicyName")
        public String policyName;

        public static DescribeUsersResponseBodyUsersExtrasResourcePolicyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersResponseBodyUsersExtrasResourcePolicyList self = new DescribeUsersResponseBodyUsersExtrasResourcePolicyList();
            return TeaModel.build(map, self);
        }

        public DescribeUsersResponseBodyUsersExtrasResourcePolicyList setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeUsersResponseBodyUsersExtrasResourcePolicyList setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

    }

    public static class DescribeUsersResponseBodyUsersExtras extends TeaModel {
        /**
         * <p>The number of allocated cloud resources.</p>
         */
        @NameInMap("AssignedResourceCount")
        public java.util.Map<String, ?> assignedResourceCount;

        /**
         * <p>The list of resource policies associated with the user.</p>
         */
        @NameInMap("ResourcePolicyList")
        public java.util.List<DescribeUsersResponseBodyUsersExtrasResourcePolicyList> resourcePolicyList;

        public static DescribeUsersResponseBodyUsersExtras build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersResponseBodyUsersExtras self = new DescribeUsersResponseBodyUsersExtras();
            return TeaModel.build(map, self);
        }

        public DescribeUsersResponseBodyUsersExtras setAssignedResourceCount(java.util.Map<String, ?> assignedResourceCount) {
            this.assignedResourceCount = assignedResourceCount;
            return this;
        }
        public java.util.Map<String, ?> getAssignedResourceCount() {
            return this.assignedResourceCount;
        }

        public DescribeUsersResponseBodyUsersExtras setResourcePolicyList(java.util.List<DescribeUsersResponseBodyUsersExtrasResourcePolicyList> resourcePolicyList) {
            this.resourcePolicyList = resourcePolicyList;
            return this;
        }
        public java.util.List<DescribeUsersResponseBodyUsersExtrasResourcePolicyList> getResourcePolicyList() {
            return this.resourcePolicyList;
        }

    }

    public static class DescribeUsersResponseBodyUsersGroups extends TeaModel {
        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-12341234****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>User Group 1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static DescribeUsersResponseBodyUsersGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersResponseBodyUsersGroups self = new DescribeUsersResponseBodyUsersGroups();
            return TeaModel.build(map, self);
        }

        public DescribeUsersResponseBodyUsersGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeUsersResponseBodyUsersGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class DescribeUsersResponseBodyUsersOrgs extends TeaModel {
        /**
         * <p>The ID of the department.</p>
         * 
         * <strong>example:</strong>
         * <p>org-4mdgc1cocc59z****</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The name of the department.</p>
         * 
         * <strong>example:</strong>
         * <p>Department 1</p>
         */
        @NameInMap("OrgName")
        public String orgName;

        /**
         * <p>The name path from the root organization to the current organization.</p>
         * 
         * <strong>example:</strong>
         * <p>Product Department/Design Department</p>
         */
        @NameInMap("OrgNamePath")
        public String orgNamePath;

        public static DescribeUsersResponseBodyUsersOrgs build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersResponseBodyUsersOrgs self = new DescribeUsersResponseBodyUsersOrgs();
            return TeaModel.build(map, self);
        }

        public DescribeUsersResponseBodyUsersOrgs setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public DescribeUsersResponseBodyUsersOrgs setOrgName(String orgName) {
            this.orgName = orgName;
            return this;
        }
        public String getOrgName() {
            return this.orgName;
        }

        public DescribeUsersResponseBodyUsersOrgs setOrgNamePath(String orgNamePath) {
            this.orgNamePath = orgNamePath;
            return this;
        }
        public String getOrgNamePath() {
            return this.orgNamePath;
        }

    }

    public static class DescribeUsersResponseBodyUsersProperties extends TeaModel {
        /**
         * <p>The property name.</p>
         * 
         * <strong>example:</strong>
         * <p>Role</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The property value.</p>
         * 
         * <strong>example:</strong>
         * <p>Student</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeUsersResponseBodyUsersProperties build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersResponseBodyUsersProperties self = new DescribeUsersResponseBodyUsersProperties();
            return TeaModel.build(map, self);
        }

        public DescribeUsersResponseBodyUsersProperties setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeUsersResponseBodyUsersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeUsersResponseBodyUsers extends TeaModel {
        /**
         * <p>The work address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou***</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The URL of the profile picture.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn">https://cdn</a>.*****</p>
         */
        @NameInMap("Avatar")
        public String avatar;

        /**
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Specifies whether to enable administrator access permissions.</p>
         */
        @NameInMap("EnableAdminAccess")
        public Boolean enableAdminAccess;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The name of the externally imported user.</p>
         * <blockquote>
         * <p>This field is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Ma**</p>
         */
        @NameInMap("ExternalName")
        public String externalName;

        /**
         * <p>The extended information of the user.</p>
         */
        @NameInMap("Extras")
        public DescribeUsersResponseBodyUsersExtras extras;

        /**
         * <p>The collection of user groups to which the convenience user belongs.</p>
         */
        @NameInMap("Groups")
        public java.util.List<DescribeUsersResponseBodyUsersGroups> groups;

        /**
         * <p>The ID of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>4205**</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the user is a tenant administrator. If the convenience user to be created uses the administrator activation type, you must specify a tenant administrator. Notifications such as password resets initiated by end users through the client are sent to the email address or mobile phone number of the tenant administrator. For more information, see <a href="https://help.aliyun.com/document_detail/214472.html">Create a convenience user</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTenantManager")
        public Boolean isTenantManager;

        /**
         * <p>The employee ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>A10000**</p>
         */
        @NameInMap("JobNumber")
        public String jobNumber;

        /**
         * <p>The nickname of the user. The value is obtained in the following order:</p>
         * <ul>
         * <li>RealNickName</li>
         * <li>Remark</li>
         * <li>EndUserId</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Li**</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The ID of the department to which the convenience user belongs.</p>
         * <blockquote>
         * <p><strong>[Deprecated]</strong> This parameter will be deprecated soon.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>org-4mdgc1cocc59z****</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The collection of departments to which the convenience user belongs.</p>
         */
        @NameInMap("Orgs")
        public java.util.List<DescribeUsersResponseBodyUsersOrgs> orgs;

        /**
         * <p>The convenience user type. Valid values:</p>
         * <ul>
         * <li>CreateFromManager: administrator-activated. The administrator sets the username and password. User notifications such as password reset notifications are sent to the email address or mobile phone number of the administrator.</li>
         * <li>Normal: user-activated. The administrator sets the username and the email address or mobile phone number for receiving notifications. User notifications such as cloud desktop activation notifications (including the initial password) are sent to the email address or mobile phone number of the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The password validity period, in days. Valid values: 30 to 365. By default, the password never expires.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PasswordExpireDays")
        public Integer passwordExpireDays;

        /**
         * <p>The remaining days of the password validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PasswordExpireRestDays")
        public Integer passwordExpireRestDays;

        /**
         * <p>The mobile phone number. This parameter is not returned if it is not configured.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The user properties.</p>
         */
        @NameInMap("Properties")
        public java.util.List<DescribeUsersResponseBodyUsersProperties> properties;

        /**
         * <p>The display name of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Li**</p>
         */
        @NameInMap("RealNickName")
        public String realNickName;

        /**
         * <p>The remarks for the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>Test user.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The globally unique ID of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>41fd1254d8f7****</p>
         */
        @NameInMap("WyId")
        public String wyId;

        public static DescribeUsersResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersResponseBodyUsers self = new DescribeUsersResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public DescribeUsersResponseBodyUsers setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeUsersResponseBodyUsers setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public DescribeUsersResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeUsersResponseBodyUsers setEnableAdminAccess(Boolean enableAdminAccess) {
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }
        public Boolean getEnableAdminAccess() {
            return this.enableAdminAccess;
        }

        public DescribeUsersResponseBodyUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeUsersResponseBodyUsers setExternalName(String externalName) {
            this.externalName = externalName;
            return this;
        }
        public String getExternalName() {
            return this.externalName;
        }

        public DescribeUsersResponseBodyUsers setExtras(DescribeUsersResponseBodyUsersExtras extras) {
            this.extras = extras;
            return this;
        }
        public DescribeUsersResponseBodyUsersExtras getExtras() {
            return this.extras;
        }

        public DescribeUsersResponseBodyUsers setGroups(java.util.List<DescribeUsersResponseBodyUsersGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<DescribeUsersResponseBodyUsersGroups> getGroups() {
            return this.groups;
        }

        public DescribeUsersResponseBodyUsers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeUsersResponseBodyUsers setIsTenantManager(Boolean isTenantManager) {
            this.isTenantManager = isTenantManager;
            return this;
        }
        public Boolean getIsTenantManager() {
            return this.isTenantManager;
        }

        public DescribeUsersResponseBodyUsers setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }
        public String getJobNumber() {
            return this.jobNumber;
        }

        public DescribeUsersResponseBodyUsers setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public DescribeUsersResponseBodyUsers setOrgId(String orgId) {
            this.orgId = orgId;
            return this;
        }
        public String getOrgId() {
            return this.orgId;
        }

        public DescribeUsersResponseBodyUsers setOrgs(java.util.List<DescribeUsersResponseBodyUsersOrgs> orgs) {
            this.orgs = orgs;
            return this;
        }
        public java.util.List<DescribeUsersResponseBodyUsersOrgs> getOrgs() {
            return this.orgs;
        }

        public DescribeUsersResponseBodyUsers setOwnerType(String ownerType) {
            this.ownerType = ownerType;
            return this;
        }
        public String getOwnerType() {
            return this.ownerType;
        }

        public DescribeUsersResponseBodyUsers setPasswordExpireDays(Integer passwordExpireDays) {
            this.passwordExpireDays = passwordExpireDays;
            return this;
        }
        public Integer getPasswordExpireDays() {
            return this.passwordExpireDays;
        }

        public DescribeUsersResponseBodyUsers setPasswordExpireRestDays(Integer passwordExpireRestDays) {
            this.passwordExpireRestDays = passwordExpireRestDays;
            return this;
        }
        public Integer getPasswordExpireRestDays() {
            return this.passwordExpireRestDays;
        }

        public DescribeUsersResponseBodyUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeUsersResponseBodyUsers setProperties(java.util.List<DescribeUsersResponseBodyUsersProperties> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.List<DescribeUsersResponseBodyUsersProperties> getProperties() {
            return this.properties;
        }

        public DescribeUsersResponseBodyUsers setRealNickName(String realNickName) {
            this.realNickName = realNickName;
            return this;
        }
        public String getRealNickName() {
            return this.realNickName;
        }

        public DescribeUsersResponseBodyUsers setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeUsersResponseBodyUsers setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public DescribeUsersResponseBodyUsers setWyId(String wyId) {
            this.wyId = wyId;
            return this;
        }
        public String getWyId() {
            return this.wyId;
        }

    }

}
