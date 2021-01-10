// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowVersionResponseBody extends TeaModel {
    @NameInMap("Versions")
    public java.util.List<ListFlowVersionResponseBodyVersions> versions;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFlowVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowVersionResponseBody self = new ListFlowVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowVersionResponseBody setVersions(java.util.List<ListFlowVersionResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListFlowVersionResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public ListFlowVersionResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public ListFlowVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFlowVersionResponseBodyVersions extends TeaModel {
        @NameInMap("Version")
        public Integer version;

        @NameInMap("State")
        public Integer state;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("FlowId")
        public String flowId;

        public static ListFlowVersionResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListFlowVersionResponseBodyVersions self = new ListFlowVersionResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListFlowVersionResponseBodyVersions setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

        public ListFlowVersionResponseBodyVersions setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public ListFlowVersionResponseBodyVersions setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListFlowVersionResponseBodyVersions setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListFlowVersionResponseBodyVersions setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListFlowVersionResponseBodyVersions setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

    }

}
