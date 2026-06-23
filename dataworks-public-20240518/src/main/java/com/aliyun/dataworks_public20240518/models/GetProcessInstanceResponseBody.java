// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProcessInstanceResponseBody extends TeaModel {
    /**
     * <p>Details of the approval process instance.</p>
     */
    @NameInMap("ProcessInstance")
    public GetProcessInstanceResponseBodyProcessInstance processInstance;

    /**
     * <p>The request ID. Use this ID to locate logs and troubleshoot issues.</p>
     * 
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
         * <p>The type of the approver for the node. Valid values:</p>
         * <ul>
         * <li><p><code>DataWorksProjectRole</code>: A workspace role</p>
         * </li>
         * <li><p><code>DataWorksProjectMember</code>: A workspace member</p>
         * </li>
         * <li><p><code>TableAdministrator</code>: A table administrator</p>
         * </li>
         * <li><p><code>TableOrProjectAdministrator</code>: A table or workspace administrator</p>
         * </li>
         * <li><p><code>AliyunResourceOwner</code>: An Alibaba Cloud account</p>
         * </li>
         * <li><p><code>MaxComputeRole</code>: A MaxCompute role</p>
         * </li>
         * <li><p><code>DLFAdmin</code>: A DlfLegacy administrator</p>
         * </li>
         * <li><p><code>DLFNextAdmin</code>: A DLFNext administrator</p>
         * </li>
         * <li><p><code>TenantRole</code>: A tenant role</p>
         * </li>
         * <li><p><code>EmrAdministrator</code>: An Emr administrator</p>
         * </li>
         * <li><p><code>LindormAdministrator</code>: A Lindorm administrator</p>
         * </li>
         * <li><p><code>AliyunRamUser</code>: A RAM user</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataWorksProjectRole</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The specified approvers.</p>
         * <p>The contents of this parameter depend on the <code>AccountType</code> value:</p>
         * <ul>
         * <li><p>If <code>AccountType</code> is <code>DataWorksProjectMember</code>, this parameter contains the user IDs of workspace members.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>DataWorksProjectRole</code>, this parameter contains the codes of workspace roles.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>MaxComputeRole</code>, this parameter contains the MaxCompute roles.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>TenantRole</code>, this parameter contains the codes of tenant roles.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>AliyunRamUser</code>, this parameter contains the user IDs of RAM users.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Assignees")
        public java.util.List<String> assignees;

        /**
         * <p>The extended description of the approval node.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("ExtensionProperties")
        public String extensionProperties;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7a809b6a-2a62-4c6c-9c23-c2a145e3877d</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The node name.</p>
         * 
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
         * <p>The notification channel. Valid values:</p>
         * <ul>
         * <li><p><code>Mail</code></p>
         * </li>
         * <li><p><code>Sms</code></p>
         * </li>
         * <li><p><code>DingRobot</code></p>
         * </li>
         * <li><p><code>Weixin</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Mail</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>Additional information in JSON format. For example, <code>{&quot;atAll&quot;:&quot;true&quot;}</code> indicates whether to @all members.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>If <code>Channel</code> is set to <code>DingRobot</code> or <code>Weixin</code>, the value of this parameter must be the webhook URL.</p>
         * 
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
         * <p>The expression of the rule condition. Format: <code>((#type==\\&quot;typeValue\\&quot;))</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The rule scope. Valid values:</p>
         * <ul>
         * <li><p><code>Deployment</code>: Determines whether the policy applies when a request is submitted.</p>
         * </li>
         * <li><p><code>Running</code>: Determines whether to skip approval while the process instance runs. This value is supported only for MaxCompute approval policies.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deployment</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The type of the rule condition. Valid values:</p>
         * <ul>
         * <li><p><code>odpsProject</code>: Applies to a specific MaxCompute project.</p>
         * </li>
         * <li><p><code>hologresInstanceId</code>: Applies to a specific Hologres instance.</p>
         * </li>
         * <li><p><code>sensibleLevel</code>: Applies to a specific security level.</p>
         * </li>
         * <li><p><code>tableGuid</code>: Applies to a specific table.</p>
         * </li>
         * <li><p><code>projectId</code>: Applies to a specific workspace.</p>
         * </li>
         * </ul>
         * 
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
        /**
         * <p>The approval nodes.</p>
         */
        @NameInMap("ApprovalNodes")
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionApprovalNodes> approvalNodes;

        /**
         * <p>The description of the approval policy.</p>
         * 
         * <strong>example:</strong>
         * <p>流程定义描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the policy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The approval policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>323861511451222099</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the approval policy.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_GENERATE_DEFAULT</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The notification services.</p>
         */
        @NameInMap("NotificationServices")
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionNotificationServices> notificationServices;

        /**
         * <p>The rules that determine when the approval policy takes effect.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinitionRuleConditions> ruleConditions;

        /**
         * <p>The subtype of the approval policy. Valid values:</p>
         * <ul>
         * <li><p><code>Table</code></p>
         * </li>
         * <li><p><code>Column</code></p>
         * </li>
         * <li><p><code>Database</code></p>
         * </li>
         * <li><p><code>Schema</code></p>
         * </li>
         * <li><p><code>Default</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The type of the approval policy. Valid values:</p>
         * <ul>
         * <li><p><code>MaxCompute</code></p>
         * </li>
         * <li><p><code>DataService</code></p>
         * </li>
         * <li><p><code>DlfV1</code> (Custom creation is not supported)</p>
         * </li>
         * <li><p><code>Extension</code></p>
         * </li>
         * <li><p><code>Hologres</code></p>
         * </li>
         * <li><p><code>Emr</code> (Custom creation is not supported)</p>
         * </li>
         * <li><p><code>DataAssetGovernance</code> (Custom creation is not supported)</p>
         * </li>
         * <li><p><code>Lindorm</code> (Custom creation is not supported)</p>
         * </li>
         * <li><p><code>StarRocks</code> (Custom creation is not supported)</p>
         * </li>
         * <li><p><code>DlfNext</code> (Custom creation is not supported)</p>
         * </li>
         * <li><p><code>DataWorks</code> (Custom creation is not supported)</p>
         * </li>
         * </ul>
         * 
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
         * <p>The type of the approver for the node. Valid values:</p>
         * <ul>
         * <li><p><code>DataWorksProjectRole</code>: A workspace role</p>
         * </li>
         * <li><p><code>DataWorksProjectMember</code>: A workspace member</p>
         * </li>
         * <li><p><code>TableAdministrator</code>: A table administrator</p>
         * </li>
         * <li><p><code>TableOrProjectAdministrator</code>: A table or workspace administrator</p>
         * </li>
         * <li><p><code>AliyunResourceOwner</code>: An Alibaba Cloud account</p>
         * </li>
         * <li><p><code>MaxComputeRole</code>: A MaxCompute role</p>
         * </li>
         * <li><p><code>DLFAdmin</code>: A DlfLegacy administrator</p>
         * </li>
         * <li><p><code>DLFNextAdmin</code>: A DLFNext administrator</p>
         * </li>
         * <li><p><code>TenantRole</code>: A tenant role</p>
         * </li>
         * <li><p><code>EmrAdministrator</code>: An Emr administrator</p>
         * </li>
         * <li><p><code>LindormAdministrator</code>: A Lindorm administrator</p>
         * </li>
         * <li><p><code>AliyunRamUser</code>: A RAM user</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataWorksProjectRole</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The specified approvers.</p>
         * <p>The contents of this parameter depend on the <code>AccountType</code> value:</p>
         * <ul>
         * <li><p>If <code>AccountType</code> is <code>DataWorksProjectMember</code>, this parameter contains the user IDs of workspace members.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>DataWorksProjectRole</code>, this parameter contains the codes of workspace roles.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>MaxComputeRole</code>, this parameter contains the MaxCompute roles.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>TenantRole</code>, this parameter contains the codes of tenant roles.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>AliyunRamUser</code>, this parameter contains the user IDs of RAM users.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Assignees")
        public java.util.List<String> assignees;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7a809b6a-2a62-4c6c-9c23-c2a145e3877d</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The node name.</p>
         * 
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
        /**
         * <p>The name of the approver.</p>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("MemberName")
        public String memberName;

        /**
         * <p>The user ID of the approver.</p>
         * 
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
        /**
         * <p>The approval comment.</p>
         * 
         * <strong>example:</strong>
         * <p>同意</p>
         */
        @NameInMap("ApprovalComment")
        public String approvalComment;

        /**
         * <p>The approval decision. Valid values:</p>
         * <ul>
         * <li><p><code>Agree</code></p>
         * </li>
         * <li><p><code>Deny</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deny</p>
         */
        @NameInMap("ApprovalDecision")
        public String approvalDecision;

        /**
         * <p>The approval node from the corresponding approval policy.</p>
         */
        @NameInMap("ApprovalNode")
        public GetProcessInstanceResponseBodyProcessInstanceApprovalTasksApprovalNode approvalNode;

        /**
         * <p>The user ID of the actual approver.</p>
         * 
         * <strong>example:</strong>
         * <p>207947399706614297</p>
         */
        @NameInMap("Assignee")
        public String assignee;

        /**
         * <p>The name of the actual approver.</p>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("AssigneeName")
        public String assigneeName;

        /**
         * <p>The time when the task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>1715590800000</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1715587200000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The approval task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task_001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><p><code>Completed</code>: The task is complete.</p>
         * </li>
         * <li><p><code>Pending</code>: The task is pending.</p>
         * </li>
         * <li><p><code>Aborted</code>: The task is aborted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Aborted</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The candidate approvers for the task.</p>
         */
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
         * <p>The user ID of the applicant.</p>
         * 
         * <strong>example:</strong>
         * <p>1107558004253538</p>
         */
        @NameInMap("Applicator")
        public String applicator;

        /**
         * <p>The username of the applicant\&quot;s Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>test_account</p>
         */
        @NameInMap("ApplicatorName")
        public String applicatorName;

        /**
         * <p>The approval policy applied to this process instance.</p>
         */
        @NameInMap("ApprovalProcessDefinition")
        public GetProcessInstanceResponseBodyProcessInstanceApprovalProcessDefinition approvalProcessDefinition;

        /**
         * <p>The approval tasks.</p>
         */
        @NameInMap("ApprovalTasks")
        public java.util.List<GetProcessInstanceResponseBodyProcessInstanceApprovalTasks> approvalTasks;

        /**
         * <p>The authorization failure message.</p>
         * <p><strong>Note</strong>: This parameter is returned only if the authorization fails.</p>
         * 
         * <strong>example:</strong>
         * <p>S-400007:ODPS acl auth failed. odps table acl auth failed</p>
         */
        @NameInMap("AuthErrorMessage")
        public String authErrorMessage;

        /**
         * <p>The process instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>332066440109224007</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The reason for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>业务需要</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The time when the approval process started.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-25 10:20:18 CST</p>
         */
        @NameInMap("StartTime")
        public Object startTime;

        /**
         * <p>The status of the process instance. Valid values:</p>
         * <ul>
         * <li><p><code>Completed</code>: The request is approved.</p>
         * </li>
         * <li><p><code>Running</code>: The request is in the approval process.</p>
         * </li>
         * <li><p><code>Aborted</code>: The request is withdrawn.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the process instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute表权限申请</p>
         */
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
