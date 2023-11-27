// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUserProvisioningsResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCounts")
    public Integer totalCounts;

    @NameInMap("UserProvisionings")
    public java.util.List<ListUserProvisioningsResponseBodyUserProvisionings> userProvisionings;

    public static ListUserProvisioningsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserProvisioningsResponseBody self = new ListUserProvisioningsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserProvisioningsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUserProvisioningsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserProvisioningsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserProvisioningsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserProvisioningsResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public ListUserProvisioningsResponseBody setUserProvisionings(java.util.List<ListUserProvisioningsResponseBodyUserProvisionings> userProvisionings) {
        this.userProvisionings = userProvisionings;
        return this;
    }
    public java.util.List<ListUserProvisioningsResponseBodyUserProvisionings> getUserProvisionings() {
        return this.userProvisionings;
    }

    public static class ListUserProvisioningsResponseBodyUserProvisionings extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeletionStrategy")
        public String deletionStrategy;

        @NameInMap("Description")
        public String description;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("DuplicationStrategy")
        public String duplicationStrategy;

        @NameInMap("OwnerPk")
        public String ownerPk;

        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("PrincipalType")
        public String principalType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetPath")
        public String targetPath;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserProvisioningId")
        public String userProvisioningId;

        public static ListUserProvisioningsResponseBodyUserProvisionings build(java.util.Map<String, ?> map) throws Exception {
            ListUserProvisioningsResponseBodyUserProvisionings self = new ListUserProvisioningsResponseBodyUserProvisionings();
            return TeaModel.build(map, self);
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setDeletionStrategy(String deletionStrategy) {
            this.deletionStrategy = deletionStrategy;
            return this;
        }
        public String getDeletionStrategy() {
            return this.deletionStrategy;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setDuplicationStrategy(String duplicationStrategy) {
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }
        public String getDuplicationStrategy() {
            return this.duplicationStrategy;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setOwnerPk(String ownerPk) {
            this.ownerPk = ownerPk;
            return this;
        }
        public String getOwnerPk() {
            return this.ownerPk;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUserProvisioningsResponseBodyUserProvisionings setUserProvisioningId(String userProvisioningId) {
            this.userProvisioningId = userProvisioningId;
            return this;
        }
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

    }

}
