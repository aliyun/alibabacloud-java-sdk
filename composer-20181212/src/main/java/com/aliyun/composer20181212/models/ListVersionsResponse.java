// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class ListVersionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Versions")
    @Validation(required = true)
    public java.util.List<ListVersionsResponseVersions> versions;

    public static ListVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsResponse self = new ListVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListVersionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVersionsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVersionsResponse setVersions(java.util.List<ListVersionsResponseVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListVersionsResponseVersions> getVersions() {
        return this.versions;
    }

    public static class ListVersionsResponseVersions extends TeaModel {
        @NameInMap("VersionId")
        @Validation(required = true)
        public String versionId;

        @NameInMap("FlowId")
        @Validation(required = true)
        public String flowId;

        @NameInMap("VersionName")
        @Validation(required = true)
        public Integer versionName;

        @NameInMap("VersionStatus")
        @Validation(required = true)
        public Integer versionStatus;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        public static ListVersionsResponseVersions build(java.util.Map<String, ?> map) throws Exception {
            ListVersionsResponseVersions self = new ListVersionsResponseVersions();
            return TeaModel.build(map, self);
        }

        public ListVersionsResponseVersions setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListVersionsResponseVersions setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListVersionsResponseVersions setVersionName(Integer versionName) {
            this.versionName = versionName;
            return this;
        }
        public Integer getVersionName() {
            return this.versionName;
        }

        public ListVersionsResponseVersions setVersionStatus(Integer versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public Integer getVersionStatus() {
            return this.versionStatus;
        }

        public ListVersionsResponseVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVersionsResponseVersions setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
