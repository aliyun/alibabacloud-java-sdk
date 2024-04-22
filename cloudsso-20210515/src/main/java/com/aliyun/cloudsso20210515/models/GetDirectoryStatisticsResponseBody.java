// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectoryStatisticsResponseBody extends TeaModel {
    /**
     * <p>The statistics of the directory.</p>
     */
    @NameInMap("DirectoryStatistics")
    public GetDirectoryStatisticsResponseBodyDirectoryStatistics directoryStatistics;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDirectoryStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryStatisticsResponseBody self = new GetDirectoryStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDirectoryStatisticsResponseBody setDirectoryStatistics(GetDirectoryStatisticsResponseBodyDirectoryStatistics directoryStatistics) {
        this.directoryStatistics = directoryStatistics;
        return this;
    }
    public GetDirectoryStatisticsResponseBodyDirectoryStatistics getDirectoryStatistics() {
        return this.directoryStatistics;
    }

    public GetDirectoryStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDirectoryStatisticsResponseBodyDirectoryStatistics extends TeaModel {
        /**
         * <p>The number of access permissions that are assigned.</p>
         */
        @NameInMap("AccessAssignmentCount")
        public Integer accessAssignmentCount;

        /**
         * <p>The number of access configurations.</p>
         */
        @NameInMap("AccessConfigurationCount")
        public Integer accessConfigurationCount;

        /**
         * <p>The quota for access configurations.</p>
         */
        @NameInMap("AccessConfigurationQuota")
        public Integer accessConfigurationQuota;

        /**
         * <p>The ID of the directory.</p>
         */
        @NameInMap("DirectoryId")
        public String directoryId;

        /**
         * <p>The name of the directory.</p>
         */
        @NameInMap("DirectoryName")
        public String directoryName;

        /**
         * <p>The number of user groups.</p>
         */
        @NameInMap("GroupCount")
        public Integer groupCount;

        /**
         * <p>The quota for user groups.</p>
         */
        @NameInMap("GroupQuota")
        public Integer groupQuota;

        /**
         * <p>The number of tasks that are being performed.</p>
         */
        @NameInMap("InProgressTaskCount")
        public Integer inProgressTaskCount;

        @NameInMap("InlinePolicyPerAccessConfigurationQuota")
        public Integer inlinePolicyPerAccessConfigurationQuota;

        /**
         * <p>The region ID of the directory.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The number of SCIM credentials.</p>
         */
        @NameInMap("SCIMServerCredentialCount")
        public Integer SCIMServerCredentialCount;

        /**
         * <p>Indicates whether SCIM synchronization is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("SCIMSyncEnabled")
        public Boolean SCIMSyncEnabled;

        /**
         * <p>Indicates whether SSO is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("SSOEnabled")
        public Boolean SSOEnabled;

        /**
         * <p>The quota for system policies that can be configured for an access configuration.</p>
         */
        @NameInMap("SystemPolicyPerAccessConfigurationQuota")
        public Integer systemPolicyPerAccessConfigurationQuota;

        /**
         * <p>The number of users.</p>
         */
        @NameInMap("UserCount")
        public Integer userCount;

        /**
         * <p>The quota for users.</p>
         */
        @NameInMap("UserQuota")
        public Integer userQuota;

        public static GetDirectoryStatisticsResponseBodyDirectoryStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetDirectoryStatisticsResponseBodyDirectoryStatistics self = new GetDirectoryStatisticsResponseBodyDirectoryStatistics();
            return TeaModel.build(map, self);
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setAccessAssignmentCount(Integer accessAssignmentCount) {
            this.accessAssignmentCount = accessAssignmentCount;
            return this;
        }
        public Integer getAccessAssignmentCount() {
            return this.accessAssignmentCount;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setAccessConfigurationCount(Integer accessConfigurationCount) {
            this.accessConfigurationCount = accessConfigurationCount;
            return this;
        }
        public Integer getAccessConfigurationCount() {
            return this.accessConfigurationCount;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setAccessConfigurationQuota(Integer accessConfigurationQuota) {
            this.accessConfigurationQuota = accessConfigurationQuota;
            return this;
        }
        public Integer getAccessConfigurationQuota() {
            return this.accessConfigurationQuota;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setDirectoryName(String directoryName) {
            this.directoryName = directoryName;
            return this;
        }
        public String getDirectoryName() {
            return this.directoryName;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setGroupQuota(Integer groupQuota) {
            this.groupQuota = groupQuota;
            return this;
        }
        public Integer getGroupQuota() {
            return this.groupQuota;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setInProgressTaskCount(Integer inProgressTaskCount) {
            this.inProgressTaskCount = inProgressTaskCount;
            return this;
        }
        public Integer getInProgressTaskCount() {
            return this.inProgressTaskCount;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setInlinePolicyPerAccessConfigurationQuota(Integer inlinePolicyPerAccessConfigurationQuota) {
            this.inlinePolicyPerAccessConfigurationQuota = inlinePolicyPerAccessConfigurationQuota;
            return this;
        }
        public Integer getInlinePolicyPerAccessConfigurationQuota() {
            return this.inlinePolicyPerAccessConfigurationQuota;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setSCIMServerCredentialCount(Integer SCIMServerCredentialCount) {
            this.SCIMServerCredentialCount = SCIMServerCredentialCount;
            return this;
        }
        public Integer getSCIMServerCredentialCount() {
            return this.SCIMServerCredentialCount;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setSCIMSyncEnabled(Boolean SCIMSyncEnabled) {
            this.SCIMSyncEnabled = SCIMSyncEnabled;
            return this;
        }
        public Boolean getSCIMSyncEnabled() {
            return this.SCIMSyncEnabled;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setSSOEnabled(Boolean SSOEnabled) {
            this.SSOEnabled = SSOEnabled;
            return this;
        }
        public Boolean getSSOEnabled() {
            return this.SSOEnabled;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setSystemPolicyPerAccessConfigurationQuota(Integer systemPolicyPerAccessConfigurationQuota) {
            this.systemPolicyPerAccessConfigurationQuota = systemPolicyPerAccessConfigurationQuota;
            return this;
        }
        public Integer getSystemPolicyPerAccessConfigurationQuota() {
            return this.systemPolicyPerAccessConfigurationQuota;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public GetDirectoryStatisticsResponseBodyDirectoryStatistics setUserQuota(Integer userQuota) {
            this.userQuota = userQuota;
            return this;
        }
        public Integer getUserQuota() {
            return this.userQuota;
        }

    }

}
