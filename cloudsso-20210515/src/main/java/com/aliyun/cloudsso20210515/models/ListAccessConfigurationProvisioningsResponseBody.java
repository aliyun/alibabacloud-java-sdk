// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListAccessConfigurationProvisioningsResponseBody extends TeaModel {
    /**
     * <p>The accounts for which the access configuration is provisioned.</p>
     */
    @NameInMap("AccessConfigurationProvisionings")
    public java.util.List<ListAccessConfigurationProvisioningsResponseBodyAccessConfigurationProvisionings> accessConfigurationProvisionings;

    /**
     * <p>Indicates whether the queried entries are truncated. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The maximum number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
     * <br>
     * <p>>  This parameter is returned only when the value of `IsTruncated` is `true`.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
         * <p>The first time when the access configuration was provisioned.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the custom policy that is created for an account in the resource directory.</p>
         */
        @NameInMap("RAMPolicyNames")
        public java.util.List<String> RAMPolicyNames;

        /**
         * <p>The name of the RAM role that is created for an account in the resource directory.</p>
         */
        @NameInMap("RAMRoleName")
        public String RAMRoleName;

        /**
         * <p>The name of the Security Assertion Markup Language (SAML) identity provider (IdP) that is created within an account in the resource directory.</p>
         */
        @NameInMap("SAMLProviderName")
        public String SAMLProviderName;

        /**
         * <p>The status of the access configuration. Valid values:</p>
         * <br>
         * <p>*   Provisioned: The access configuration is provisioned.</p>
         * <p>*   ReprovisionRequired: The access configuration needs to be re-provisioned.</p>
         * <p>*   DeprovisionFailed: The access configuration failed to be provisioned.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task object.</p>
         * <br>
         * <p>If the value of TargetType is `RD-Account`, the value of this parameter is the UID of an account in the resource directory.</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the task object.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The path ID of the task object in the resource directory.</p>
         */
        @NameInMap("TargetPath")
        public String targetPath;

        /**
         * <p>The path name of the task object in the resource directory.</p>
         */
        @NameInMap("TargetPathName")
        public String targetPathName;

        /**
         * <p>The type of the task object.</p>
         * <br>
         * <p>Set the value to RD-Account, which specifies the accounts in the resource directory.</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The last time when the access configuration was provisioned.</p>
         */
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
