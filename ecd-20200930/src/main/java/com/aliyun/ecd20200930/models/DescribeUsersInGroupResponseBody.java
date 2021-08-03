// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUsersInGroupResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsersCount")
    public Integer usersCount;

    @NameInMap("OnlineUsersCount")
    public Integer onlineUsersCount;

    @NameInMap("EndUsers")
    public java.util.List<DescribeUsersInGroupResponseBodyEndUsers> endUsers;

    public static DescribeUsersInGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsersInGroupResponseBody self = new DescribeUsersInGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsersInGroupResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUsersInGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUsersInGroupResponseBody setUsersCount(Integer usersCount) {
        this.usersCount = usersCount;
        return this;
    }
    public Integer getUsersCount() {
        return this.usersCount;
    }

    public DescribeUsersInGroupResponseBody setOnlineUsersCount(Integer onlineUsersCount) {
        this.onlineUsersCount = onlineUsersCount;
        return this;
    }
    public Integer getOnlineUsersCount() {
        return this.onlineUsersCount;
    }

    public DescribeUsersInGroupResponseBody setEndUsers(java.util.List<DescribeUsersInGroupResponseBodyEndUsers> endUsers) {
        this.endUsers = endUsers;
        return this;
    }
    public java.util.List<DescribeUsersInGroupResponseBodyEndUsers> getEndUsers() {
        return this.endUsers;
    }

    public static class DescribeUsersInGroupResponseBodyEndUsers extends TeaModel {
        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("EndUserEmail")
        public String endUserEmail;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("EndUserType")
        public String endUserType;

        @NameInMap("EndUserPhone")
        public String endUserPhone;

        @NameInMap("EndUserName")
        public String endUserName;

        public static DescribeUsersInGroupResponseBodyEndUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsersInGroupResponseBodyEndUsers self = new DescribeUsersInGroupResponseBodyEndUsers();
            return TeaModel.build(map, self);
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserEmail(String endUserEmail) {
            this.endUserEmail = endUserEmail;
            return this;
        }
        public String getEndUserEmail() {
            return this.endUserEmail;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserType(String endUserType) {
            this.endUserType = endUserType;
            return this;
        }
        public String getEndUserType() {
            return this.endUserType;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserPhone(String endUserPhone) {
            this.endUserPhone = endUserPhone;
            return this;
        }
        public String getEndUserPhone() {
            return this.endUserPhone;
        }

        public DescribeUsersInGroupResponseBodyEndUsers setEndUserName(String endUserName) {
            this.endUserName = endUserName;
            return this;
        }
        public String getEndUserName() {
            return this.endUserName;
        }

    }

}
