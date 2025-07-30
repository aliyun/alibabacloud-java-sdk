// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeGroupUserResponseBody extends TeaModel {
    @NameInMap("Groups")
    public java.util.List<DescribeGroupUserResponseBodyGroups> groups;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>AA8D67CB-345D-5CDA-986E-FFAC7D0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Users")
    public java.util.List<DescribeGroupUserResponseBodyUsers> users;

    public static DescribeGroupUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupUserResponseBody self = new DescribeGroupUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupUserResponseBody setGroups(java.util.List<DescribeGroupUserResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribeGroupUserResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public DescribeGroupUserResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGroupUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupUserResponseBody setUsers(java.util.List<DescribeGroupUserResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<DescribeGroupUserResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class DescribeGroupUserResponseBodyGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ug-91mvbosdjsdfh****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserCount")
        public String userCount;

        public static DescribeGroupUserResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupUserResponseBodyGroups self = new DescribeGroupUserResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeGroupUserResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeGroupUserResponseBodyGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeGroupUserResponseBodyGroups setUserCount(String userCount) {
            this.userCount = userCount;
            return this;
        }
        public String getUserCount() {
            return this.userCount;
        }

    }

    public static class DescribeGroupUserResponseBodyUsers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx-xx-xx</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <strong>example:</strong>
         * <p><a href="https://avatar.****.com">https://avatar.****.com</a></p>
         */
        @NameInMap("Avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>alex****@aliyun.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>alex****</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <strong>example:</strong>
         * <p>2024-08-26T02:59:22.000+00:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2024-08-26T02:59:22.000+00:00</p>
         */
        @NameInMap("GmtJoinGroup")
        public String gmtJoinGroup;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("JobNumber")
        public String jobNumber;

        /**
         * <strong>example:</strong>
         * <p>alex</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>188888****</p>
         */
        @NameInMap("Phone")
        public String phone;

        @NameInMap("Remark")
        public String remark;

        public static DescribeGroupUserResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupUserResponseBodyUsers self = new DescribeGroupUserResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public DescribeGroupUserResponseBodyUsers setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeGroupUserResponseBodyUsers setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public DescribeGroupUserResponseBodyUsers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeGroupUserResponseBodyUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeGroupUserResponseBodyUsers setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeGroupUserResponseBodyUsers setGmtJoinGroup(String gmtJoinGroup) {
            this.gmtJoinGroup = gmtJoinGroup;
            return this;
        }
        public String getGmtJoinGroup() {
            return this.gmtJoinGroup;
        }

        public DescribeGroupUserResponseBodyUsers setJobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }
        public String getJobNumber() {
            return this.jobNumber;
        }

        public DescribeGroupUserResponseBodyUsers setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public DescribeGroupUserResponseBodyUsers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public DescribeGroupUserResponseBodyUsers setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
