// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListFlowResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Flows")
    public java.util.List<ListFlowResponseBodyFlows> flows;

    public static ListFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowResponseBody self = new ListFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFlowResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public ListFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowResponseBody setFlows(java.util.List<ListFlowResponseBodyFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<ListFlowResponseBodyFlows> getFlows() {
        return this.flows;
    }

    public static class ListFlowResponseBodyFlows extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ProdVersion")
        public Integer prodVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentVersion")
        public Integer currentVersion;

        @NameInMap("EditMode")
        public String editMode;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Source")
        public String source;

        @NameInMap("Name")
        public String name;

        @NameInMap("FlowId")
        public String flowId;

        public static ListFlowResponseBodyFlows build(java.util.Map<String, ?> map) throws Exception {
            ListFlowResponseBodyFlows self = new ListFlowResponseBodyFlows();
            return TeaModel.build(map, self);
        }

        public ListFlowResponseBodyFlows setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowResponseBodyFlows setProdVersion(Integer prodVersion) {
            this.prodVersion = prodVersion;
            return this;
        }
        public Integer getProdVersion() {
            return this.prodVersion;
        }

        public ListFlowResponseBodyFlows setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowResponseBodyFlows setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListFlowResponseBodyFlows setCurrentVersion(Integer currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Integer getCurrentVersion() {
            return this.currentVersion;
        }

        public ListFlowResponseBodyFlows setEditMode(String editMode) {
            this.editMode = editMode;
            return this;
        }
        public String getEditMode() {
            return this.editMode;
        }

        public ListFlowResponseBodyFlows setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListFlowResponseBodyFlows setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListFlowResponseBodyFlows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowResponseBodyFlows setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

    }

}
