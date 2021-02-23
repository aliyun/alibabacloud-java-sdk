// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetFlowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("FlowDescription")
    public String flowDescription;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("CurrentVersionId")
    public Integer currentVersionId;

    @NameInMap("FlowStatus")
    public String flowStatus;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("FlowSource")
    public String flowSource;

    @NameInMap("FlowEditMode")
    public String flowEditMode;

    public static GetFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowResponseBody self = new GetFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFlowResponseBody setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetFlowResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetFlowResponseBody setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public GetFlowResponseBody setFlowDescription(String flowDescription) {
        this.flowDescription = flowDescription;
        return this;
    }
    public String getFlowDescription() {
        return this.flowDescription;
    }

    public GetFlowResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetFlowResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetFlowResponseBody setCurrentVersionId(Integer currentVersionId) {
        this.currentVersionId = currentVersionId;
        return this;
    }
    public Integer getCurrentVersionId() {
        return this.currentVersionId;
    }

    public GetFlowResponseBody setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public String getFlowStatus() {
        return this.flowStatus;
    }

    public GetFlowResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetFlowResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetFlowResponseBody setFlowSource(String flowSource) {
        this.flowSource = flowSource;
        return this;
    }
    public String getFlowSource() {
        return this.flowSource;
    }

    public GetFlowResponseBody setFlowEditMode(String flowEditMode) {
        this.flowEditMode = flowEditMode;
        return this;
    }
    public String getFlowEditMode() {
        return this.flowEditMode;
    }

}
