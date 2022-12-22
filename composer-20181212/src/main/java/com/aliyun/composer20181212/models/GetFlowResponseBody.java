// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetFlowResponseBody extends TeaModel {
    // The time when the workflow was created.
    @NameInMap("CreateTime")
    public String createTime;

    // The version ID of the workflow.
    @NameInMap("CurrentVersionId")
    public String currentVersionId;

    // The definition of the workflow.
    @NameInMap("Definition")
    public String definition;

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

    // The ID of the region where the workflow resides.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The resource group ID.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // The template ID.
    @NameInMap("TemplateId")
    public String templateId;

    // The time when the workflow was last updated.
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowResponseBody self = new GetFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetFlowResponseBody setCurrentVersionId(String currentVersionId) {
        this.currentVersionId = currentVersionId;
        return this;
    }
    public String getCurrentVersionId() {
        return this.currentVersionId;
    }

    public GetFlowResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetFlowResponseBody setFlowDescription(String flowDescription) {
        this.flowDescription = flowDescription;
        return this;
    }
    public String getFlowDescription() {
        return this.flowDescription;
    }

    public GetFlowResponseBody setFlowEditMode(String flowEditMode) {
        this.flowEditMode = flowEditMode;
        return this;
    }
    public String getFlowEditMode() {
        return this.flowEditMode;
    }

    public GetFlowResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetFlowResponseBody setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public GetFlowResponseBody setFlowSource(String flowSource) {
        this.flowSource = flowSource;
        return this;
    }
    public String getFlowSource() {
        return this.flowSource;
    }

    public GetFlowResponseBody setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public String getFlowStatus() {
        return this.flowStatus;
    }

    public GetFlowResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFlowResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetFlowResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetFlowResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
