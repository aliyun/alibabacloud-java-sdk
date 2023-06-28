// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDriveUsersResponseBody extends TeaModel {
    @NameInMap("CloudDriveUsers")
    public java.util.List<DescribeCloudDriveUsersResponseBodyCloudDriveUsers> cloudDriveUsers;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudDriveUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDriveUsersResponseBody self = new DescribeCloudDriveUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDriveUsersResponseBody setCloudDriveUsers(java.util.List<DescribeCloudDriveUsersResponseBodyCloudDriveUsers> cloudDriveUsers) {
        this.cloudDriveUsers = cloudDriveUsers;
        return this;
    }
    public java.util.List<DescribeCloudDriveUsersResponseBodyCloudDriveUsers> getCloudDriveUsers() {
        return this.cloudDriveUsers;
    }

    public DescribeCloudDriveUsersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudDriveUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudDriveUsersResponseBodyCloudDriveUsers extends TeaModel {
        @NameInMap("DriveId")
        public String driveId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("UsedSize")
        public Long usedSize;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static DescribeCloudDriveUsersResponseBodyCloudDriveUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDriveUsersResponseBodyCloudDriveUsers self = new DescribeCloudDriveUsersResponseBodyCloudDriveUsers();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDriveUsersResponseBodyCloudDriveUsers setDriveId(String driveId) {
            this.driveId = driveId;
            return this;
        }
        public String getDriveId() {
            return this.driveId;
        }

        public DescribeCloudDriveUsersResponseBodyCloudDriveUsers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeCloudDriveUsersResponseBodyCloudDriveUsers setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

        public DescribeCloudDriveUsersResponseBodyCloudDriveUsers setUsedSize(Long usedSize) {
            this.usedSize = usedSize;
            return this;
        }
        public Long getUsedSize() {
            return this.usedSize;
        }

        public DescribeCloudDriveUsersResponseBodyCloudDriveUsers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeCloudDriveUsersResponseBodyCloudDriveUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
