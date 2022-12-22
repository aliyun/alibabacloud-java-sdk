// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class ListFlowsResponseBody extends TeaModel {
    // A list of workflows.
    @NameInMap("Flows")
    public java.util.List<ListFlowsResponseBodyFlows> flows;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of workflows in the current region.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsResponseBody self = new ListFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowsResponseBody setFlows(java.util.List<ListFlowsResponseBodyFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<ListFlowsResponseBodyFlows> getFlows() {
        return this.flows;
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

    public static class ListFlowsResponseBodyFlows extends TeaModel {
        // The time when the workflow was created.
        @NameInMap("CreateTime")
        public String createTime;

        // The description of the workflow.
        @NameInMap("FlowDescription")
        public String flowDescription;

        // The edit mode of the workflow.
        @NameInMap("FlowEditMode")
        public String flowEditMode;

        // The ID of the workflow.
        @NameInMap("FlowId")
        public String flowId;

        // The name of the workflow.
        @NameInMap("FlowName")
        public String flowName;

        // The source of the workflow.
        @NameInMap("FlowSource")
        public String flowSource;

        // The status of the workflow. Valid values:
        // 
        // *   **Enabled**: The workflow is enabled.
        // *   **Disabled**: The workflow is disabled.
        @NameInMap("FlowStatus")
        public String flowStatus;

        // The region to which the workflow belongs.
        @NameInMap("RegionId")
        public String regionId;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The template ID. You can call the ListTemplates operation to obtain the template ID.
        @NameInMap("TemplateId")
        public String templateId;

        // The time when the workflow was last updated.
        @NameInMap("UpdateTime")
        public String updateTime;

        // The latest version of the workflow.
        @NameInMap("VersionId")
        public String versionId;

        public static ListFlowsResponseBodyFlows build(java.util.Map<String, ?> map) throws Exception {
            ListFlowsResponseBodyFlows self = new ListFlowsResponseBodyFlows();
            return TeaModel.build(map, self);
        }

        public ListFlowsResponseBodyFlows setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListFlowsResponseBodyFlows setFlowDescription(String flowDescription) {
            this.flowDescription = flowDescription;
            return this;
        }
        public String getFlowDescription() {
            return this.flowDescription;
        }

        public ListFlowsResponseBodyFlows setFlowEditMode(String flowEditMode) {
            this.flowEditMode = flowEditMode;
            return this;
        }
        public String getFlowEditMode() {
            return this.flowEditMode;
        }

        public ListFlowsResponseBodyFlows setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ListFlowsResponseBodyFlows setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ListFlowsResponseBodyFlows setFlowSource(String flowSource) {
            this.flowSource = flowSource;
            return this;
        }
        public String getFlowSource() {
            return this.flowSource;
        }

        public ListFlowsResponseBodyFlows setFlowStatus(String flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }
        public String getFlowStatus() {
            return this.flowStatus;
        }

        public ListFlowsResponseBodyFlows setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListFlowsResponseBodyFlows setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListFlowsResponseBodyFlows setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListFlowsResponseBodyFlows setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListFlowsResponseBodyFlows setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
