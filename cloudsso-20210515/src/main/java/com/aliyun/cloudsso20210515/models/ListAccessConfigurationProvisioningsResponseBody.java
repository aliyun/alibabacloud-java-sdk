// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationProvisioningsResponseBody extends TeaModel {
    @NameInMap("AccessConfigurationProvisionings")
    public java.util.List<ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings> accessConfigurationProvisionings;

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

    public static ListAccessConfigurationProvisioningsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessConfigurationProvisioningsResponseBody self = new ListAccessConfigurationProvisioningsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessConfigurationProvisioningsResponseBody setAccessConfigurationProvisionings(java.util.List<ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings> accessConfigurationProvisionings) {
        this.accessConfigurationProvisionings = accessConfigurationProvisionings;
        return this;
    }
    public java.util.List<ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings> getAccessConfigurationProvisionings() {
        return this.accessConfigurationProvisionings;
    }

    public ListAccessConfigurationProvisioningsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListAccessConfigurationProvisioningsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccessConfigurationProvisioningsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccessConfigurationProvisioningsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccessConfigurationProvisioningsResponseBody setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static class ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings extends TeaModel {
        @NameInMap("AccessConfigurationId")
        public String accessConfigurationId;

        @NameInMap("AccessConfigurationName")
        public String accessConfigurationName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("RAMPolicyNames")
        public java.util.List<String> RAMPolicyNames;

        @NameInMap("RAMRoleName")
        public String RAMRoleName;

        @NameInMap("SAMLProviderName")
        public String SAMLProviderName;

        @NameInMap("Status")
        public String status;

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

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings build(java.util.Map<String, ?> map) throws Exception {
            ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings self = new ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings();
            return TeaModel.build(map, self);
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setAccessConfigurationId(String accessConfigurationId) {
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setAccessConfigurationName(String accessConfigurationName) {
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setRAMPolicyNames(java.util.List<String> RAMPolicyNames) {
            this.RAMPolicyNames = RAMPolicyNames;
            return this;
        }
        public java.util.List<String> getRAMPolicyNames() {
            return this.RAMPolicyNames;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setRAMRoleName(String RAMRoleName) {
            this.RAMRoleName = RAMRoleName;
            return this;
        }
        public String getRAMRoleName() {
            return this.RAMRoleName;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setSAMLProviderName(String SAMLProviderName) {
            this.SAMLProviderName = SAMLProviderName;
            return this;
        }
        public String getSAMLProviderName() {
            return this.SAMLProviderName;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        public String getTargetPath() {
            return this.targetPath;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setTargetPathName(String targetPathName) {
            this.targetPathName = targetPathName;
            return this;
        }
        public String getTargetPathName() {
            return this.targetPathName;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
