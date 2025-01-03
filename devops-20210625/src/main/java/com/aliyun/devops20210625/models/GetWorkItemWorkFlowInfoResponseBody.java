// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemWorkFlowInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

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
        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1613805843000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1613805843000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>156603</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>待处理</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Workitem</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("workflowStageIdentifier")
        public String workflowStageIdentifier;

        /**
         * <strong>example:</strong>
         * <p>确认阶段</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>16274887</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>100011</p>
         */
        @NameInMap("nextWorkflowStatusIdentifier")
        public String nextWorkflowStatusIdentifier;

        /**
         * <strong>example:</strong>
         * <p>fd0xxxxxd00d355b05dxxxx26</p>
         */
        @NameInMap("workflowIdentifier")
        public String workflowIdentifier;

        /**
         * <strong>example:</strong>
         * <p>100005</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>100005</p>
         */
        @NameInMap("defaultStatusIdentifier")
        public String defaultStatusIdentifier;

        /**
         * <strong>example:</strong>
         * <p>工作流的描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1640850318000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1640850318000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>e8bxxxxxxxxxxxxxxxx23</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>名称</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>e8b26xxxxx6e76aa20xxxxx23</p>
         */
        @NameInMap("ownerSpaceIdentifier")
        public String ownerSpaceIdentifier;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ownerSpaceType")
        public String ownerSpaceType;

        /**
         * <strong>example:</strong>
         * <p>Project</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("statusOrder")
        public String statusOrder;

        @NameInMap("statuses")
        public java.util.List<GetWorkItemWorkFlowInfoResponseBodyWorkflowStatuses> statuses;

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
