// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemWorkFlowInfoResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true或者false
    @NameInMap("success")
    public Boolean success;

    // 工作项信息
    @NameInMap("workflow")
    public GetWorkItemWorkFlowInfoResponseBodyWorkflow workflow;

    public static GetWorkItemWorkFlowInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemWorkFlowInfoResponseBody self = new GetWorkItemWorkFlowInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkItemWorkFlowInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetWorkItemWorkFlowInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetWorkItemWorkFlowInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkItemWorkFlowInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetWorkItemWorkFlowInfoResponseBody setWorkflow(GetWorkItemWorkFlowInfoResponseBodyWorkflow workflow) {
        this.workflow = workflow;
        return this;
    }
    public GetWorkItemWorkFlowInfoResponseBodyWorkflow getWorkflow() {
        return this.workflow;
    }

    public static class GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses extends TeaModel {
        // 创建人
        @NameInMap("creator")
        public String creator;

        // 描述信息
        @NameInMap("description")
        public String description;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 修改时间
        @NameInMap("gmtModified")
        public Long gmtModified;

        // 状态唯一标识
        @NameInMap("identifier")
        public String identifier;

        // 修改人
        @NameInMap("modifier")
        public String modifier;

        // 状态名
        @NameInMap("name")
        public String name;

        // 资源来源
        @NameInMap("resourceType")
        public String resourceType;

        // 状态来源
        @NameInMap("source")
        public String source;

        // 阶段信息-阶段的唯一标识
        @NameInMap("workflowStageIdentifier")
        public String workflowStageIdentifier;

        // 阶段信息-名称
        @NameInMap("workflowStageName")
        public String workflowStageName;

        public static GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses self = new GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses();
            return TeaModel.build(map, self);
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setWorkflowStageIdentifier(String workflowStageIdentifier) {
            this.workflowStageIdentifier = workflowStageIdentifier;
            return this;
        }
        public String getWorkflowStageIdentifier() {
            return this.workflowStageIdentifier;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses setWorkflowStageName(String workflowStageName) {
            this.workflowStageName = workflowStageName;
            return this;
        }
        public String getWorkflowStageName() {
            return this.workflowStageName;
        }

    }

    public static class GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions extends TeaModel {
        // 流转步骤的id
        @NameInMap("id")
        public Long id;

        // action的名称
        @NameInMap("name")
        public String name;

        // action对应的下个状态的信息id
        @NameInMap("nextWorkflowStatusIdentifier")
        public String nextWorkflowStatusIdentifier;

        // action对应的工作流
        @NameInMap("workflowIdentifier")
        public String workflowIdentifier;

        // action对应的当前状态id
        @NameInMap("workflowStatusIdentifier")
        public String workflowStatusIdentifier;

        public static GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions self = new GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions();
            return TeaModel.build(map, self);
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions setNextWorkflowStatusIdentifier(String nextWorkflowStatusIdentifier) {
            this.nextWorkflowStatusIdentifier = nextWorkflowStatusIdentifier;
            return this;
        }
        public String getNextWorkflowStatusIdentifier() {
            return this.nextWorkflowStatusIdentifier;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions setWorkflowIdentifier(String workflowIdentifier) {
            this.workflowIdentifier = workflowIdentifier;
            return this;
        }
        public String getWorkflowIdentifier() {
            return this.workflowIdentifier;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions setWorkflowStatusIdentifier(String workflowStatusIdentifier) {
            this.workflowStatusIdentifier = workflowStatusIdentifier;
            return this;
        }
        public String getWorkflowStatusIdentifier() {
            return this.workflowStatusIdentifier;
        }

    }

    public static class GetWorkItemWorkFlowInfoResponseBodyWorkflow extends TeaModel {
        // 创建人
        @NameInMap("creator")
        public String creator;

        // 工作流的默认状态
        @NameInMap("defaultStatusIdentifier")
        public String defaultStatusIdentifier;

        // 工作流的描述
        @NameInMap("description")
        public String description;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 修改时间
        @NameInMap("gmtModified")
        public Long gmtModified;

        // 工作流唯一标识
        @NameInMap("identifier")
        public String identifier;

        // 修改人
        @NameInMap("modifier")
        public String modifier;

        // 工作流名称
        @NameInMap("name")
        public String name;

        // 工作流所属的团队空间或项目的identifier
        @NameInMap("ownerSpaceIdentifier")
        public String ownerSpaceIdentifier;

        // 工作流所属的团队项目类型
        @NameInMap("ownerSpaceType")
        public String ownerSpaceType;

        // 资源类型
        @NameInMap("resourceType")
        public String resourceType;

        // 工作流来源
        @NameInMap("source")
        public String source;

        // 工作流的状态顺序
        @NameInMap("statusOrder")
        public String statusOrder;

        // 状态列表
        @NameInMap("statuses")
        public java.util.List<GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses> statuses;

        // 工作流的流转步骤
        @NameInMap("workflowActions")
        public java.util.List<GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions> workflowActions;

        public static GetWorkItemWorkFlowInfoResponseBodyWorkflow build(java.util.Map<String, ?> map) throws Exception {
            GetWorkItemWorkFlowInfoResponseBodyWorkflow self = new GetWorkItemWorkFlowInfoResponseBodyWorkflow();
            return TeaModel.build(map, self);
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setDefaultStatusIdentifier(String defaultStatusIdentifier) {
            this.defaultStatusIdentifier = defaultStatusIdentifier;
            return this;
        }
        public String getDefaultStatusIdentifier() {
            return this.defaultStatusIdentifier;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setOwnerSpaceIdentifier(String ownerSpaceIdentifier) {
            this.ownerSpaceIdentifier = ownerSpaceIdentifier;
            return this;
        }
        public String getOwnerSpaceIdentifier() {
            return this.ownerSpaceIdentifier;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setOwnerSpaceType(String ownerSpaceType) {
            this.ownerSpaceType = ownerSpaceType;
            return this;
        }
        public String getOwnerSpaceType() {
            return this.ownerSpaceType;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setStatusOrder(String statusOrder) {
            this.statusOrder = statusOrder;
            return this;
        }
        public String getStatusOrder() {
            return this.statusOrder;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setStatuses(java.util.List<GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses> statuses) {
            this.statuses = statuses;
            return this;
        }
        public java.util.List<GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses> getStatuses() {
            return this.statuses;
        }

        public GetWorkItemWorkFlowInfoResponseBodyWorkflow setWorkflowActions(java.util.List<GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions> workflowActions) {
            this.workflowActions = workflowActions;
            return this;
        }
        public java.util.List<GetWorkItemWorkFlowInfoResponseBodyWorkflowWorkflowActions> getWorkflowActions() {
            return this.workflowActions;
        }

    }

}
