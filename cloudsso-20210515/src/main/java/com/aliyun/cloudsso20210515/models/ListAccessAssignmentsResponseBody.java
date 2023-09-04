// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessAssignmentsResponseBody extends TeaModel {
    /**
     * <p>The access permissions that are assigned.</p>
     */
    @NameInMap("AccessAssignments")
    public java.util.List<ListAccessAssignmentsResponseBodyAccessAssignments> accessAssignments;

    /**
     * <p>Indicates whether the queried entries are truncated. Valid values:</p>
     * <br>
     * <p>*   true: The queried entries are truncated.</p>
     * <p>*   false: The queried entries are not truncated.</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is returned for the next page.</p>
     * <br>
     * <p>>  This parameter is returned only when the value of `IsTruncated` is `true`.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The ID of the access configuration.</p>
         */
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        /**
         * <p>The name of the access configuration.</p>
         */
        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        /**
         * <p>The time when the access permissions were assigned.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the CloudSSO identity.</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The name of the CloudSSO identity.</p>
         */
        @NameInMap("PrincipalName")
        public String principalName;

        /**
         * <p>The type of the CloudSSO identity. Valid values:</p>
         * <br>
         * <p>*   User</p>
         * <p>*   Group</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        /**
         * <p>The ID of the task object.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the task object.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The path ID of the task object in your resource directory.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The path name of the task object in your resource directory.</p>
         */
        @NameInMap("TargetPathName")
        public String targetPathName;

        /**
         * <p>The type of the task object.</p>
         * <br>
         * <p>The value is fixed as RD-Account, which indicates an account in your resource directory.</p>
         */
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
