// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class GetFlowResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

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

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("UpdateTime")
    @Validation(required = true)
    public String updateTime;

    @NameInMap("CurrentVersionId")
    @Validation(required = true)
    public Integer currentVersionId;

    @NameInMap("FlowStatus")
    @Validation(required = true)
    public String flowStatus;

    @NameInMap("Definition")
    @Validation(required = true)
    public String definition;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    @NameInMap("FlowSource")
    @Validation(required = true)
    public String flowSource;

    @NameInMap("FlowEditMode")
    @Validation(required = true)
    public String flowEditMode;

    public static GetFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowResponse self = new GetFlowResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFlowResponse setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public GetFlowResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetFlowResponse setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public GetFlowResponse setFlowDescription(String flowDescription) {
        this.flowDescription = flowDescription;
        return this;
    }
    public String getFlowDescription() {
        return this.flowDescription;
    }

    public GetFlowResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetFlowResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetFlowResponse setCurrentVersionId(Integer currentVersionId) {
        this.currentVersionId = currentVersionId;
        return this;
    }
    public Integer getCurrentVersionId() {
        return this.currentVersionId;
    }

    public GetFlowResponse setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public String getFlowStatus() {
        return this.flowStatus;
    }

    public GetFlowResponse setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public GetFlowResponse setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetFlowResponse setFlowSource(String flowSource) {
        this.flowSource = flowSource;
        return this;
    }
    public String getFlowSource() {
        return this.flowSource;
    }

    public GetFlowResponse setFlowEditMode(String flowEditMode) {
        this.flowEditMode = flowEditMode;
        return this;
    }
    public String getFlowEditMode() {
        return this.flowEditMode;
    }

}
