// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUsersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the convenience users.</p>
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

    public static class DescribeUsersResponseBodyUsersGroups extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

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
        @NameInMap("OrgId")
        public String orgId;

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

    public static class DescribeUsersResponseBodyUsers extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Avatar")
        public String avatar;

        /**
         * <p>The email address.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The name of the user.</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("Groups")
        public java.util.List<DescribeUsersResponseBodyUsersGroups> groups;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the user is an administrator. If the convenience user is of the administrator-activated type, you must specify a user administrator. Notifications such as password reset on a client are sent to the email address or mobile phone of the user administrator. For more information, see [Create a convenience user](~~214472~~).</p>
         */
        @NameInMap("IsTenantManager")
        public Boolean isTenantManager;

        @NameInMap("JobNumber")
        public String jobNumber;

        /**
         * <p>The nickname of the user.</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <p>The ID of the organization to which the user belongs.</p>
         */
        @NameInMap("OrgId")
        public String orgId;

        @NameInMap("Orgs")
        public java.util.List<DescribeUsersResponseBodyUsersOrgs> orgs;

        /**
         * <p>The type of the convenience account.</p>
         * <br>
         * <p>*   The administrator-activated type. The administrator specifies the username and the password of the convenience account. User notifications such as password reset are sent to the email address or mobile number of the administrator.</p>
         * <p>*   The user-activated type. The administrator specifies the username and the email address or mobile number of a user. Activation notifications are sent to the email address or mobile number of the user.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   CreateFromManager</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    administrator-activated</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Normal: user-activated</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("OwnerType")
        public String ownerType;

        /**
         * <p>The mobile number of the user. If you leave this parameter empty, the value of this parameter is not returned.</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The remarks on the user.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the user.</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The user ID that is globally unique.</p>
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
