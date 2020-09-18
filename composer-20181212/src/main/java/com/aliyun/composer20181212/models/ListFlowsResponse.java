// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class ListFlowsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("Flows")
    @Validation(required = true)
    public java.util.List<ListFlowsResponseFlows> flows;

    public static ListFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsResponse self = new ListFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListFlowsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFlowsResponse setFlows(java.util.List<ListFlowsResponseFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<ListFlowsResponseFlows> getFlows() {
        return this.flows;
    }

    public static class ListFlowsResponseFlows extends TeaModel {
        @NameInMap("FlowId")
        @Validation(required = true)
        public String flowId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("FlowName")
        @Validation(required = true)
        public String flowName;

        @NameInMap("FlowDescription")
        @Validation(required = true)
        public String flowDescription;

        @NameInMap("VersionId")
        @Validation(required = true)
        public Integer versionId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("FlowStatus")
        @Validation(required = true)
        public String flowStatus;

        @NameInMap("TemplateId")
        @Validation(required = true)
        public String templateId;

        @NameInMap("FlowSource")
        @Validation(required = true)
        public String flowSource;

        @NameInMap("FlowEditMode")
        @Validation(required = true)
        public String flowEditMode;

        public static ListFlowsResponseFlows build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseFlows self = new ListFlowsResponseFlows();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseFlows setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListFlowsResponseFlows setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListFlowsResponseFlows setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListFlowsResponseFlows setFlowDescription(String flowDescription) {
            this.flowDescription = flowDescription;
            return this;
        }
        public String getFlowDescription() {
            return this.flowDescription;
        }

        public ListFlowsResponseFlows setVersionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }
        public Integer getVersionId() {
            return this.versionId;
        }

        public ListFlowsResponseFlows setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFlowsResponseFlows setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListFlowsResponseFlows setFlowStatus(String flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public String getFlowStatus() {
            return this.flowStatus;
        }

        public ListFlowsResponseFlows setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListFlowsResponseFlows setFlowSource(String flowSource) {
            this.flowSource = flowSource;
            return this;
        }
        public String getFlowSource() {
            return this.flowSource;
        }

        public ListFlowsResponseFlows setFlowEditMode(String flowEditMode) {
            this.flowEditMode = flowEditMode;
            return this;
        }
        public String getFlowEditMode() {
            return this.flowEditMode;
        }

    }

}
