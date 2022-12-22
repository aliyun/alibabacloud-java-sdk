// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class ListVersionsResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of versions of the workflow.
    @NameInMap("TotalCount")
    public Integer totalCount;

    // A list of the versions.
    @NameInMap("Versions")
    public java.util.List<ListVersionsResponseBodyVersions> versions;

    public static ListVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsResponseBody self = new ListVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVersionsResponseBody setVersions(java.util.List<ListVersionsResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListVersionsResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class ListVersionsResponseBodyVersions extends TeaModel {
        // The time when the version was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The ID of the workflow to which the version belongs.
        @NameInMap("FlowId")
        public String flowId;

        // The time when the version was last updated.
        @NameInMap("UpdateTime")
        public String updateTime;

        // The ID of the version.
        @NameInMap("VersionId")
        public String versionId;

        // The name of the version.
        @NameInMap("VersionName")
        public String versionName;

        // The number of the version. Increment from 1.
        @NameInMap("VersionNumber")
        public Integer versionNumber;

        // The status of the version. **Enabled** indicates that the version is enabled.
        @NameInMap("VersionStatus")
        public String versionStatus;

        public static ListVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListVersionsResponseBodyVersions self = new ListVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListVersionsResponseBodyVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVersionsResponseBodyVersions setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListVersionsResponseBodyVersions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListVersionsResponseBodyVersions setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListVersionsResponseBodyVersions setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListVersionsResponseBodyVersions setVersionNumber(Integer versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public Integer getVersionNumber() {
            return this.versionNumber;
        }

        public ListVersionsResponseBodyVersions setVersionStatus(String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public String getVersionStatus() {
            return this.versionStatus;
        }

    }

}
