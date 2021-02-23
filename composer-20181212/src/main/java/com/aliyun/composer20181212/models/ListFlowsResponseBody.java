// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class ListFlowsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Flows")
    public java.util.List<ListFlowsResponseBodyFlows> flows;

    public static ListFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsResponseBody self = new ListFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListFlowsResponseBody setFlows(java.util.List<ListFlowsResponseBodyFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<ListFlowsResponseBodyFlows> getFlows() {
        return this.flows;
    }

    public static class ListFlowsResponseBodyFlows extends TeaModel {
        @NameInMap("FlowId")
        public String flowId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("FlowName")
        public String flowName;

        @NameInMap("FlowDescription")
        public String flowDescription;

        @NameInMap("VersionId")
        public Integer versionId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("FlowStatus")
        public String flowStatus;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("FlowSource")
        public String flowSource;

        @NameInMap("FlowEditMode")
        public String flowEditMode;

        public static ListFlowsResponseBodyFlows build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlows self = new ListFlowsResponseBodyFlows();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlows setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListFlowsResponseBodyFlows setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListFlowsResponseBodyFlows setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListFlowsResponseBodyFlows setFlowDescription(String flowDescription) {
            this.flowDescription = flowDescription;
            return this;
        }
        public String getFlowDescription() {
            return this.flowDescription;
        }

        public ListFlowsResponseBodyFlows setVersionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }
        public Integer getVersionId() {
            return this.versionId;
        }

        public ListFlowsResponseBodyFlows setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFlowsResponseBodyFlows setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListFlowsResponseBodyFlows setFlowStatus(String flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public String getFlowStatus() {
            return this.flowStatus;
        }

        public ListFlowsResponseBodyFlows setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListFlowsResponseBodyFlows setFlowSource(String flowSource) {
            this.flowSource = flowSource;
            return this;
        }
        public String getFlowSource() {
            return this.flowSource;
        }

        public ListFlowsResponseBodyFlows setFlowEditMode(String flowEditMode) {
            this.flowEditMode = flowEditMode;
            return this;
        }
        public String getFlowEditMode() {
            return this.flowEditMode;
        }

    }

}
