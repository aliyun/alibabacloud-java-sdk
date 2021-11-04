// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkFlowTemplatesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("WorkFlowTemplates")
    public ListWorkFlowTemplatesResponseBodyWorkFlowTemplates workFlowTemplates;

    public static ListWorkFlowTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowTemplatesResponseBody self = new ListWorkFlowTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowTemplatesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkFlowTemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListWorkFlowTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkFlowTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListWorkFlowTemplatesResponseBody setWorkFlowTemplates(ListWorkFlowTemplatesResponseBodyWorkFlowTemplates workFlowTemplates) {
        this.workFlowTemplates = workFlowTemplates;
        return this;
    }
    public ListWorkFlowTemplatesResponseBodyWorkFlowTemplates getWorkFlowTemplates() {
        return this.workFlowTemplates;
    }

    public static class ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreateUserId")
        public Long createUserId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Position")
        public Integer position;

        @NameInMap("TemplateId")
        public Long templateId;

        public static ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode self = new ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes extends TeaModel {
        @NameInMap("WorkflowNode")
        public java.util.List<ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode> workflowNode;

        public static ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes self = new ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes setWorkflowNode(java.util.List<ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode> workflowNode) {
            this.workflowNode = workflowNode;
            return this;
        }
        public java.util.List<ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode> getWorkflowNode() {
            return this.workflowNode;
        }

    }

    public static class ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreateUserId")
        public Long createUserId;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("IsSystem")
        public Integer isSystem;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("WorkflowNodes")
        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes workflowNodes;

        public static ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate self = new ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setIsSystem(Integer isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public Integer getIsSystem() {
            return this.isSystem;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setWorkflowNodes(ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes workflowNodes) {
            this.workflowNodes = workflowNodes;
            return this;
        }
        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes getWorkflowNodes() {
            return this.workflowNodes;
        }

    }

    public static class ListWorkFlowTemplatesResponseBodyWorkFlowTemplates extends TeaModel {
        @NameInMap("WorkFlowTemplate")
        public java.util.List<ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate> workFlowTemplate;

        public static ListWorkFlowTemplatesResponseBodyWorkFlowTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowTemplatesResponseBodyWorkFlowTemplates self = new ListWorkFlowTemplatesResponseBodyWorkFlowTemplates();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplates setWorkFlowTemplate(java.util.List<ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate> workFlowTemplate) {
            this.workFlowTemplate = workFlowTemplate;
            return this;
        }
        public java.util.List<ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate> getWorkFlowTemplate() {
            return this.workFlowTemplate;
        }

    }

}
