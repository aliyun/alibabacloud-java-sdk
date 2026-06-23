// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProcessDefinitionResponseBody extends TeaModel {
    /**
     * <p>Process definition</p>
     */
    @NameInMap("ProcessDefinition")
    public GetProcessDefinitionResponseBodyProcessDefinition processDefinition;

    /**
     * <p>API request ID</p>
     * 
     * <strong>example:</strong>
     * <p>0bc5df3a17***903790e8e8a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProcessDefinitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProcessDefinitionResponseBody self = new GetProcessDefinitionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProcessDefinitionResponseBody setProcessDefinition(GetProcessDefinitionResponseBodyProcessDefinition processDefinition) {
        this.processDefinition = processDefinition;
        return this;
    }
    public GetProcessDefinitionResponseBodyProcessDefinition getProcessDefinition() {
        return this.processDefinition;
    }

    public GetProcessDefinitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes extends TeaModel {
        /**
         * <p><strong>Node approver type</strong>:</p>
         * <ul>
         * <li><p>DataWorksProjectRole project role</p>
         * </li>
         * <li><p>DataWorksProjectMember project member</p>
         * </li>
         * <li><p>TableAdministrator table administrator</p>
         * </li>
         * <li><p>TableOrProjectAdministrator Table or project administrator</p>
         * </li>
         * <li><p>AliyunResourceOwner Alibaba Cloud account</p>
         * </li>
         * <li><p>MaxComputeRole MC Administrator</p>
         * </li>
         * <li><p>DLFAdmin and DlfLegacy administrator</p>
         * </li>
         * <li><p>DLFNext Administrator</p>
         * </li>
         * <li><p>TenantRole tenant role</p>
         * </li>
         * <li><p>EmrAdministrator Emr administrator</p>
         * </li>
         * <li><p>LindormAdministrator Lindorm Administrator</p>
         * </li>
         * <li><p>AliyunRamUser RAM user</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TableOrProjectAdministrator</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p><strong><code>AccountType</code> has different semantics for different types</strong>:</p>
         * <ul>
         * <li><p>DataWorksProjectMember specifies the project member\&quot;s UserId.</p>
         * </li>
         * <li><p>DataWorksProjectRole specifies the code of the project role.</p>
         * </li>
         * <li><p>MaxComputeRole specifies the MaxCompute role.</p>
         * </li>
         * <li><p>TenantRole specifies the tenant role code.</p>
         * </li>
         * <li><p>AliyunRamUser specifies the RAM user ID.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Assignees")
        public java.util.List<String> assignees;

        /**
         * <p>When <code>AccountType </code>is set to different types, you must provide different additional declarations:</p>
         * <ul>
         * <li><p>DataWorksProjectMember: The key is projectId, and the value is the UserIds of project members, separated by commas.</p>
         * </li>
         * <li><p>MaxComputeRole: The key is a MaxCompute project and the value is a role name in MaxCompute. Multiple role names are separated by a comma.</p>
         * </li>
         * </ul>
         */
        @NameInMap("ExtensionProperties")
        public java.util.Map<String, ?> extensionProperties;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>7a809b6a-2a62-4c6c-9c23-c2a145e3877d</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p><strong>Node Name</strong></p>
         * 
         * <strong>example:</strong>
         * <p>default-name</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes self = new GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes setAssignees(java.util.List<String> assignees) {
            this.assignees = assignees;
            return this;
        }
        public java.util.List<String> getAssignees() {
            return this.assignees;
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes setExtensionProperties(java.util.Map<String, ?> extensionProperties) {
            this.extensionProperties = extensionProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtensionProperties() {
            return this.extensionProperties;
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices extends TeaModel {
        /**
         * <p>Notification channel, an enumeration:</p>
         * <ul>
         * <li><p>Mail</p>
         * </li>
         * <li><p>Sms</p>
         * </li>
         * <li><p>DingRobot</p>
         * </li>
         * <li><p>Weixin</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DingRobot</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>Additional information in JSON format, such as <code>{&quot;atAll&quot;:&quot;true&quot;}</code> to specify whether to @all members.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>You must specify WebhookUrl when Channel is DingRobot or Weixin.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dingtalk.com">https://dingtalk.com</a></p>
         */
        @NameInMap("Receiver")
        public String receiver;

        public static GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices self = new GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

    }

    public static class GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions extends TeaModel {
        /**
         * <p>A conditional expression is in the format <code>((#type==\\&quot;typeValue\\&quot;))</code>, such as <code>((#odpsProject==\\&quot;PX_BEIJING_TEST\\&quot;))</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>rule effective stage:</p>
         * <ul>
         * <li><p><code>Deployment</code> determines whether an application matches this approval policy upon submission.</p>
         * </li>
         * <li><p><code>Running</code> is used to determine whether an approval process is approval-free. This feature is supported only for the MaxCompute type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deployment</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The condition type. This is an enumeration:</p>
         * <ul>
         * <li><p><code>odpsProject</code>,</p>
         * </li>
         * <li><p><code>hologresInstanceId</code></p>
         * </li>
         * <li><p><code>sensibleLevel</code>,</p>
         * </li>
         * <li><p><code>tableGuid</code>,</p>
         * </li>
         * <li><p><code>projectId</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>odpsProject</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions self = new GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetProcessDefinitionResponseBodyProcessDefinition extends TeaModel {
        /**
         * <p>Approval node list</p>
         */
        @NameInMap("ApprovalNodes")
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes> approvalNodes;

        /**
         * <p>The description of the business process.</p>
         * 
         * <strong>example:</strong>
         * <p>订单业务数据审批流程</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Enable</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Process definition ID</p>
         * 
         * <strong>example:</strong>
         * <p>210001039767</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>System Default Policy</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsSystem")
        public Boolean isSystem;

        /**
         * <p>Process definition name</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute 表审批</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Notification Service Statement</p>
         */
        @NameInMap("NotificationServices")
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices> notificationServices;

        /**
         * <p>List of rule conditions</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions> ruleConditions;

        /**
         * <p>Subtype:</p>
         * <ul>
         * <li><p>Table</p>
         * </li>
         * <li><p>Column</p>
         * </li>
         * <li><p>Database</p>
         * </li>
         * <li><p>Schema</p>
         * </li>
         * <li><p>Default</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>Process definition type. Valid values:</p>
         * <ul>
         * <li><p>MaxCompute</p>
         * </li>
         * <li><p>DataService</p>
         * </li>
         * <li><p>Extension</p>
         * </li>
         * <li><p>Hologres</p>
         * </li>
         * <li><p>DlfV1 (Custom creation not supported).</p>
         * </li>
         * <li><p>EMR (Custom creation not supported).</p>
         * </li>
         * <li><p>DataAssetGovernance (Custom creation not supported).</p>
         * </li>
         * <li><p>Lindorm (Custom creation not supported).</p>
         * </li>
         * <li><p>StarRocks (Custom creation not supported).</p>
         * </li>
         * <li><p>DlfNext (Custom creation not supported).</p>
         * </li>
         * <li><p>DataWorks (Custom creation not supported).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetProcessDefinitionResponseBodyProcessDefinition build(java.util.Map<String, ?> map) throws Exception {
            GetProcessDefinitionResponseBodyProcessDefinition self = new GetProcessDefinitionResponseBodyProcessDefinition();
            return TeaModel.build(map, self);
        }

        public GetProcessDefinitionResponseBodyProcessDefinition setApprovalNodes(java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes> approvalNodes) {
            this.approvalNodes = approvalNodes;
            return this;
        }
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes> getApprovalNodes() {
            return this.approvalNodes;
        }

        public GetProcessDefinitionResponseBodyProcessDefinition setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProcessDefinitionResponseBodyProcessDefinition setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetProcessDefinitionResponseBodyProcessDefinition setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProcessDefinitionResponseBodyProcessDefinition setIsSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            return this;
        }
        public Boolean getIsSystem() {
            return this.isSystem;
        }

        public GetProcessDefinitionResponseBodyProcessDefinition setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProcessDefinitionResponseBodyProcessDefinition setNotificationServices(java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices> notificationServices) {
            this.notificationServices = notificationServices;
            return this;
        }
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices> getNotificationServices() {
            return this.notificationServices;
        }

        public GetProcessDefinitionResponseBodyProcessDefinition setRuleConditions(java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions> ruleConditions) {
            this.ruleConditions = ruleConditions;
            return this;
        }
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        public GetProcessDefinitionResponseBodyProcessDefinition setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public GetProcessDefinitionResponseBodyProcessDefinition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
