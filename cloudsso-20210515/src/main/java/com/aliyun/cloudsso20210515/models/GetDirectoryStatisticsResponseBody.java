// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetDirectoryStatisticsResponseBody extends TeaModel {
    @NameInMap("DirectoryStatistics")
    public GetDirectoryStatisticsResponseBodyDirectoryStatistics directoryStatistics;

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
        @NameInMap("AccessAssignmentCount")
        public Integer accessAssignmentCount;

        @NameInMap("AccessConfigurationCount")
        public Integer accessConfigurationCount;

        @NameInMap("AccessConfigurationQuota")
        public Integer accessConfigurationQuota;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("DirectoryName")
        public String directoryName;

        @NameInMap("GroupCount")
        public Integer groupCount;

        @NameInMap("GroupQuota")
        public Integer groupQuota;

        @NameInMap("InProgressTaskCount")
        public Integer inProgressTaskCount;

        @NameInMap("Region")
        public String region;

        @NameInMap("SCIMServerCredentialCount")
        public Integer SCIMServerCredentialCount;

        @NameInMap("SCIMSyncEnabled")
        public Boolean SCIMSyncEnabled;

        @NameInMap("SSOEnabled")
        public Boolean SSOEnabled;

        @NameInMap("UserCount")
        public Integer userCount;

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
