// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDriveUsersResponseBody extends TeaModel {
    @NameInMap("CloudDriveUsers")
    public java.util.List<DescribeCloudDriveUsersResponseBodyCloudDriveUsers> cloudDriveUsers;

    /**
     * <strong>example:</strong>
     * <p>aGN4YzAxQGNuLWhhbmd6aG91LjExNzU5NTMyNjgzMTQ1****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>F083AAE5-7AA9-53BB-9060-AFFB2C18****</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DriveId")
        public String driveId;

        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>10240000</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        /**
         * <strong>example:</strong>
         * <p>20490</p>
         */
        @NameInMap("UsedSize")
        public Long usedSize;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
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

        public DescribeCloudDriveUsersResponseBodyCloudDriveUsers setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
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
