// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProcessInstanceResponseBody extends TeaModel {
    @NameInMap("ProcessInstance")
    public GetProcessInstanceResponseBodyProcessInstance processInstance;

    /**
     * <strong>example:</strong>
     * <p>0bc5df3a17****903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProcessInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProcessInstanceResponseBody self = new GetProcessInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProcessInstanceResponseBody setProcessInstance(GetProcessInstanceResponseBodyProcessInstance processInstance) {
        this.processInstance = processInstance;
        return this;
    }
    public GetProcessInstanceResponseBodyProcessInstance getProcessInstance() {
        return this.processInstance;
    }

    public GetProcessInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DataWorksProjectRole</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Assignees")
        public java.util.List<String> assignees;

        /**
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("ExtensionProperties")
        public String extensionProperties;

        /**
         * <strong>example:</strong>
         * <p>7a809b6a-2a62-4c6c-9c23-c2a145e3877d</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>default-name</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes build(java.util.Map<String, ?> map) throws Exception {
            GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes self = new GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes();
            return TeaModel.build(map, self);
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes setAssignees(java.util.List<String> assignees) {
            this.assignees = assignees;
            return this;
        }
        public java.util.List<String> getAssignees() {
            return this.assignees;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes setExtensionProperties(String extensionProperties) {
            this.extensionProperties = extensionProperties;
            return this;
        }
        public String getExtensionProperties() {
            return this.extensionProperties;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Mail</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dingtalk">https://dingtalk</a></p>
         */
        @NameInMap("Receiver")
        public String receiver;

        public static GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices build(java.util.Map<String, ?> map) throws Exception {
            GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices self = new GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices();
            return TeaModel.build(map, self);
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

    }

    public static class GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <strong>example:</strong>
         * <p>Deployment</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>odpsProject</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions self = new GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions();
            return TeaModel.build(map, self);
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition extends TeaModel {
        @NameInMap("ApprovalNodes")
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes> approvalNodes;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>323861511451222099</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>SYSTEM_GENERATE_DEFAULT</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("NotificationServices")
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices> notificationServices;

        @NameInMap("RuleConditions")
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions> ruleConditions;

        /**
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition build(java.util.Map<String, ?> map) throws Exception {
            GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition self = new GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition();
            return TeaModel.build(map, self);
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition setApprovalNodes(java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes> approvalNodes) {
            this.approvalNodes = approvalNodes;
            return this;
        }
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes> getApprovalNodes() {
            return this.approvalNodes;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition setNotificationServices(java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices> notificationServices) {
            this.notificationServices = notificationServices;
            return this;
        }
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices> getNotificationServices() {
            return this.notificationServices;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition setRuleConditions(java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DataWorksProjectRole</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Assignees")
        public java.util.List<String> assignees;

        /**
         * <strong>example:</strong>
         * <p>7a809b6a-2a62-4c6c-9c23-c2a145e3877d</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>default-name</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode build(java.util.Map<String, ?> map) throws Exception {
            GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode self = new GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode();
            return TeaModel.build(map, self);
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode setAssignees(java.util.List<String> assignees) {
            this.assignees = assignees;
            return this;
        }
        public java.util.List<String> getAssignees() {
            return this.assignees;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetProcessInstanceResponseBodyProcessInstanceApprovalTasksTaskCandidates extends TeaModel {
        @NameInMap("MemberName")
        public String memberName;

        /**
         * <strong>example:</strong>
         * <p>207947397776614297</p>
         */
        @NameInMap("MemberUserId")
        public String memberUserId;

        public static GetProcessInstanceResponseBodyProcessInstanceApprovalTasksTaskCandidates build(java.util.Map<String, ?> map) throws Exception {
            GetProcessInstanceResponseBodyProcessInstanceApprovalTasksTaskCandidates self = new GetProcessInstanceResponseBodyProcessInstanceApprovalTasksTaskCandidates();
            return TeaModel.build(map, self);
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasksTaskCandidates setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasksTaskCandidates setMemberUserId(String memberUserId) {
            this.memberUserId = memberUserId;
            return this;
        }
        public String getMemberUserId() {
            return this.memberUserId;
        }

    }

    public static class GetProcessInstanceResponseBodyProcessInstanceApprovalTasks extends TeaModel {
        @NameInMap("ApprovalComment")
        public String approvalComment;

        /**
         * <strong>example:</strong>
         * <p>deny</p>
         */
        @NameInMap("ApprovalDecision")
        public String approvalDecision;

        @NameInMap("ApprovalNode")
        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode approvalNode;

        /**
         * <strong>example:</strong>
         * <p>207947399706614297</p>
         */
        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("AssigneeName")
        public String assigneeName;

        /**
         * <strong>example:</strong>
         * <p>1715590800000</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <strong>example:</strong>
         * <p>1715587200000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>task_001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>Aborted</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("TaskCandidates")
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalTasksTaskCandidates> taskCandidates;

        public static GetProcessInstanceResponseBodyProcessInstanceApprovalTasks build(java.util.Map<String, ?> map) throws Exception {
            GetProcessInstanceResponseBodyProcessInstanceApprovalTasks self = new GetProcessInstanceResponseBodyProcessInstanceApprovalTasks();
            return TeaModel.build(map, self);
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasks setApprovalComment(String approvalComment) {
            this.approvalComment = approvalComment;
            return this;
        }
        public String getApprovalComment() {
            return this.approvalComment;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasks setApprovalDecision(String approvalDecision) {
            this.approvalDecision = approvalDecision;
            return this;
        }
        public String getApprovalDecision() {
            return this.approvalDecision;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasks setApprovalNode(GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode approvalNode) {
            this.approvalNode = approvalNode;
            return this;
        }
        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode getApprovalNode() {
            return this.approvalNode;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasks setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasks setAssigneeName(String assigneeName) {
            this.assigneeName = assigneeName;
            return this;
        }
        public String getAssigneeName() {
            return this.assigneeName;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasks setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasks setTaskCandidates(java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalTasksTaskCandidates> taskCandidates) {
            this.taskCandidates = taskCandidates;
            return this;
        }
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalTasksTaskCandidates> getTaskCandidates() {
            return this.taskCandidates;
        }

    }

    public static class GetProcessInstanceResponseBodyProcessInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1107558004253538</p>
         */
        @NameInMap("Applicator")
        public String applicator;

        /**
         * <strong>example:</strong>
         * <p>test_account</p>
         */
        @NameInMap("ApplicatorName")
        public String applicatorName;

        @NameInMap("ApprovalProcessDefinition")
        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition approvalProcessDefinition;

        @NameInMap("ApprovalTasks")
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalTasks> approvalTasks;

        /**
         * <strong>example:</strong>
         * <p>S-400007:ODPS acl auth failed. odps table acl auth failed</p>
         */
        @NameInMap("AuthErrorMessage")
        public String authErrorMessage;

        /**
         * <strong>example:</strong>
         * <p>332066440109224007</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>2026-05-25 10:20:18 CST</p>
         */
        @NameInMap("StartTime")
        public Object startTime;

        /**
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        public static GetProcessInstanceResponseBodyProcessInstance build(java.util.Map<String, ?> map) throws Exception {
            GetProcessInstanceResponseBodyProcessInstance self = new GetProcessInstanceResponseBodyProcessInstance();
            return TeaModel.build(map, self);
        }

        public GetProcessInstanceResponseBodyProcessInstance setApplicator(String applicator) {
            this.applicator = applicator;
            return this;
        }
        public String getApplicator() {
            return this.applicator;
        }

        public GetProcessInstanceResponseBodyProcessInstance setApplicatorName(String applicatorName) {
            this.applicatorName = applicatorName;
            return this;
        }
        public String getApplicatorName() {
            return this.applicatorName;
        }

        public GetProcessInstanceResponseBodyProcessInstance setApprovalProcessDefinition(GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition approvalProcessDefinition) {
            this.approvalProcessDefinition = approvalProcessDefinition;
            return this;
        }
        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition getApprovalProcessDefinition() {
            return this.approvalProcessDefinition;
        }

        public GetProcessInstanceResponseBodyProcessInstance setApprovalTasks(java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalTasks> approvalTasks) {
            this.approvalTasks = approvalTasks;
            return this;
        }
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalTasks> getApprovalTasks() {
            return this.approvalTasks;
        }

        public GetProcessInstanceResponseBodyProcessInstance setAuthErrorMessage(String authErrorMessage) {
            this.authErrorMessage = authErrorMessage;
            return this;
        }
        public String getAuthErrorMessage() {
            return this.authErrorMessage;
        }

        public GetProcessInstanceResponseBodyProcessInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProcessInstanceResponseBodyProcessInstance setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetProcessInstanceResponseBodyProcessInstance setStartTime(Object startTime) {
            this.startTime = startTime;
            return this;
        }
        public Object getStartTime() {
            return this.startTime;
        }

        public GetProcessInstanceResponseBodyProcessInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProcessInstanceResponseBodyProcessInstance setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
