// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class ListVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("VersionName")
        public Integer versionName;

        @NameInMap("VersionStatus")
        public Integer versionStatus;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListVersionsResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListVersionsResponseBodyVersions self = new ListVersionsResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListVersionsResponseBodyVersions setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListVersionsResponseBodyVersions setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListVersionsResponseBodyVersions setVersionName(Integer versionName) {
            this.versionName = versionName;
            return this;
        }
        public Integer getVersionName() {
            return this.versionName;
        }

        public ListVersionsResponseBodyVersions setVersionStatus(Integer versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public Integer getVersionStatus() {
            return this.versionStatus;
        }

        public ListVersionsResponseBodyVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVersionsResponseBodyVersions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
