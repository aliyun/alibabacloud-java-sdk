// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUsersResponseBody extends TeaModel {
    /**
     * <p>The token that determines the start point of the next query. If this parameter is left empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The convenience accounts.</p>
     */
    @NameInMap("Users")
    public java.util.List<DescribeUsersResponseBodyUsers> users;

    public static DescribeUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersResponseBody self = new DescribeUsersResponseBody();
        return TeaModel.build(map, self);
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

    public static class DescribeUsersResponseBodyUsersExtras extends TeaModel {
        @NameInMap("AssignedResourceCount")
        public java.util.Map<String, ?> assignedResourceCount;

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
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>org-4mdgc1cocc59z****</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The organization name.</p>
         * 
         * <strong>example:</strong>
         * <p>Organization 1</p>
         */
        @NameInMap("OrgName")
        public String orgName;

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

    }

    public static class DescribeUsersResponseBodyUsersProperties extends TeaModel {
        @NameInMap("Key")
        public String key;

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
         * <p>The work address of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou \<em>\</em>\*</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The profile picture of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn">https://cdn</a>.*****</p>
         */
        @NameInMap("Avatar")
        public String avatar;

        /**
         * <p>The email address of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The username of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("ExternalName")
        public String externalName;

        @NameInMap("Extras")
        public DescribeUsersResponseBodyUsersExtras extras;

        /**
         * <p>The user groups to which the convenience user belongs.</p>
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
         * <p>Indicates whether the convenience user is an administrator. If the convenience user is of the administrator-activated type, you must specify a user administrator. Notifications such as password reset on a client are sent to the email address or mobile number of the user administrator. For more information, see <a href="https://help.aliyun.com/document_detail/214472.html">Create a convenience user</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTenantManager")
        public Boolean isTenantManager;

        /**
         * <p>The employee number of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>A10000**</p>
         */
        @NameInMap("JobNumber")
        public String jobNumber;

        /**
         * <p>The nickname of the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>Lee</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The ID of the organization to which the convenience user belongs.</p>
         * <blockquote>
         * <p> This parameter will be deprecated in the future.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>org-4mdgc1cocc59z****</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        /**
         * <p>The organizations to which the convenience user belongs.</p>
         */
        @NameInMap("Orgs")
        public java.util.List<DescribeUsersResponseBodyUsersOrgs> orgs;

        /**
         * <p>The type of the convenience account.</p>
         * <ul>
         * <li>Administrator-activated type: The administrator specifies the username and password of the convenience account. User notifications such as password reset notifications are sent to the email address or mobile number of the administrator.</li>
         * <li>User-activated type: The administrator specifies the username and the email address or mobile number of a convenience user. Notifications such as activation notifications that contain the default password are sent to the email address or mobile number of the convenience user.</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>CreateFromManager</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>administrator-activated</p>
         * <!-- -->
         * </li>
         * <li><p>Normal</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>user-activated</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The mobile number of the convenience user. If you leave this parameter empty, the value of this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1381111****</p>
         */
        @NameInMap("Phone")
        public String phone;

        @NameInMap("Properties")
        public java.util.List<DescribeUsersResponseBodyUsersProperties> properties;

        @NameInMap("RealNickName")
        public String realNickName;

        /**
         * <p>The remarks on the convenience user.</p>
         * 
         * <strong>example:</strong>
         * <p>TestUser</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the convenience user.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>0: The convenience user is normal.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>9: The convenience user is locked.</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
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
