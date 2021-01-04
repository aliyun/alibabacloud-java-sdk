// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkFlowTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("WorkFlowTemplates")
    public ListWorkFlowTemplatesResponseBodyWorkFlowTemplates workFlowTemplates;

    public static ListWorkFlowTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowTemplatesResponseBody self = new ListWorkFlowTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("Position")
        public Integer position;

        @NameInMap("CreateUserId")
        public Long createUserId;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("NodeId")
        public Long nodeId;

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

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodesWorkflowNode setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
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
        @NameInMap("IsSystem")
        public Integer isSystem;

        @NameInMap("WorkflowNodes")
        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes workflowNodes;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("CreateUserId")
        public Long createUserId;

        public static ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate self = new ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setIsSystem(Integer isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public Integer getIsSystem() {
            return this.isSystem;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setWorkflowNodes(ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes workflowNodes) {
            this.workflowNodes = workflowNodes;
            return this;
        }
        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplateWorkflowNodes getWorkflowNodes() {
            return this.workflowNodes;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListWorkFlowTemplatesResponseBodyWorkFlowTemplatesWorkFlowTemplate setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
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
