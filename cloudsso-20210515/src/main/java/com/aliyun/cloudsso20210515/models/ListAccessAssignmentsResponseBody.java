// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessAssignmentsResponseBody extends TeaModel {
    @NameInMap("AccessAssignments")
    public java.util.List<ListAccessAssignmentsResponseBodyAccessAssignments> accessAssignments;

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

    public static ListAccessAssignmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessAssignmentsResponseBody self = new ListAccessAssignmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessAssignmentsResponseBody setAccessAssignments(java.util.List<ListAccessAssignmentsResponseBodyAccessAssignments> accessAssignments) {
        this.accessAssignments = accessAssignments;
        return this;
    }
    public java.util.List<ListAccessAssignmentsResponseBodyAccessAssignments> getAccessAssignments() {
        return this.accessAssignments;
    }

    public ListAccessAssignmentsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListAccessAssignmentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccessAssignmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessAssignmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccessAssignmentsResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ListAccessAssignmentsResponseBodyAccessAssignments extends TeaModel {
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("PrincipalName")
        public String principalName;

        @NameInMap("PrincipalType")
        public String principalType;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetPath")
        public String targetPath;

        @NameInMap("TargetPathName")
        public String targetPathName;

        @NameInMap("TargetType")
        public String targetType;

        public static ListAccessAssignmentsResponseBodyAccessAssignments build(java.util.Map<String, ?> map) throws Exception {
            ListAccessAssignmentsResponseBodyAccessAssignments self = new ListAccessAssignmentsResponseBodyAccessAssignments();
            return TeaModel.build(map, self);
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setAccessConfigurationId(String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setAccessConfigurationName(String accessConfigurationName) {
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setPrincipalName(String principalName) {
            this.principalName = principalName;
            return this;
        }
        public String getPrincipalName() {
            return this.principalName;
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setTargetPathName(String targetPathName) {
            this.targetPathName = targetPathName;
            return this;
        }
        public String getTargetPathName() {
            return this.targetPathName;
        }

        public ListAccessAssignmentsResponseBodyAccessAssignments setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
