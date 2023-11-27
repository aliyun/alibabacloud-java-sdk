// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListUserProvisioningEventsResponseBody extends TeaModel {
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

    @NameInMap("UserProvisioningEvents")
    public java.util.List<ListUserProvisioningEventsResponseBodyUserProvisioningEvents> userProvisioningEvents;

    public static ListUserProvisioningEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserProvisioningEventsResponseBody self = new ListUserProvisioningEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserProvisioningEventsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListUserProvisioningEventsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserProvisioningEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserProvisioningEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserProvisioningEventsResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public ListUserProvisioningEventsResponseBody setUserProvisioningEvents(java.util.List<ListUserProvisioningEventsResponseBodyUserProvisioningEvents> userProvisioningEvents) {
        this.userProvisioningEvents = userProvisioningEvents;
        return this;
    }
    public java.util.List<ListUserProvisioningEventsResponseBodyUserProvisioningEvents> getUserProvisioningEvents() {
        return this.userProvisioningEvents;
    }

    public static class ListUserProvisioningEventsResponseBodyUserProvisioningEvents extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeletionStrategy")
        public String deletionStrategy;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("DuplicationStrategy")
        public String duplicationStrategy;

        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("EventId")
        public String eventId;

        @NameInMap("LatestAsyncTime")
        public String latestAsyncTime;

        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("PrincipalType")
        public String principalType;

        @NameInMap("SourceType")
        public String sourceType;

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

        public static ListUserProvisioningEventsResponseBodyUserProvisioningEvents build(java.util.Map<String, ?> map) throws Exception {
            ListUserProvisioningEventsResponseBodyUserProvisioningEvents self = new ListUserProvisioningEventsResponseBodyUserProvisioningEvents();
            return TeaModel.build(map, self);
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setDeletionStrategy(String deletionStrategy) {
            this.deletionStrategy = deletionStrategy;
            return this;
        }
        public String getDeletionStrategy() {
            return this.deletionStrategy;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setDuplicationStrategy(String duplicationStrategy) {
            this.duplicationStrategy = duplicationStrategy;
            return this;
        }
        public String getDuplicationStrategy() {
            return this.duplicationStrategy;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setLatestAsyncTime(String latestAsyncTime) {
            this.latestAsyncTime = latestAsyncTime;
            return this;
        }
        public String getLatestAsyncTime() {
            return this.latestAsyncTime;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListUserProvisioningEventsResponseBodyUserProvisioningEvents setUserProvisioningId(String userProvisioningId) {
            this.userProvisioningId = userProvisioningId;
            return this;
        }
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

    }

}
