// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProcessDefinitionResponseBody extends TeaModel {
    /**
     * <p>The process definition.</p>
     */
    @NameInMap("ProcessDefinition")
    public GetProcessDefinitionResponseBodyProcessDefinition processDefinition;

    /**
     * <p>The API request ID.</p>
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
         * <p><strong>The type of approver for the node</strong>. Valid values:</p>
         * <ul>
         * <li>DataWorksProjectRole: Workspace role.</li>
         * <li>DataWorksProjectMember: Workspace member.</li>
         * <li>TableAdministrator: Table owner.</li>
         * <li>TableOrProjectAdministrator: Table or workspace administrator.</li>
         * <li>AliyunResourceOwner: Alibaba Cloud account.</li>
         * <li>MaxComputeRole: MaxCompute administrator.</li>
         * <li>DLFAdmin: DLF legacy administrator.</li>
         * <li>DLFNextAdmin: DLFNext administrator.</li>
         * <li>TenantRole: Tenant role.</li>
         * <li>EmrAdministrator: EMR administrator.</li>
         * <li>LindormAdministrator: Lindorm administrator.</li>
         * <li>AliyunRamUser: RAM user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TableOrProjectAdministrator</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p><strong>The semantics vary based on the <code>AccountType</code> value</strong>:</p>
         * <ul>
         * <li>DataWorksProjectMember: Specifies the user ID of the workspace member.</li>
         * <li>DataWorksProjectRole: Specifies the code of the workspace role.</li>
         * <li>MaxComputeRole: Specifies the MaxCompute role.</li>
         * <li>TenantRole: Specifies the code of the tenant role.</li>
         * <li>AliyunRamUser: Specifies the RAM user ID.</li>
         * </ul>
         */
        @NameInMap("Assignees")
        public java.util.List<String> assignees;

        /**
         * <p>The additional declarations required for different <code>AccountType</code> values:</p>
         * <ul>
         * <li>DataWorksProjectMember: The key is <code>projectId</code>, and the value is the user ID of the workspace member. Separate multiple values with commas.</li>
         * <li>MaxComputeRole: The key is the MaxCompute project, and the value is the role name in MaxCompute. Separate multiple values with commas.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;449656&quot;: &quot;role_project_admin,role_project_pe&quot;}</p>
         */
        @NameInMap("ExtensionProperties")
        public java.util.Map<String, ?> extensionProperties;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7a809b6a-2a62-4c6c-9c23-c2a145e3877d</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p><strong>The node name.</strong></p>
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
         * <p>The notification channel. Valid values:</p>
         * <ul>
         * <li>Mail</li>
         * <li>Sms</li>
         * <li>DingRobot</li>
         * <li>Weixin</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DingRobot</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The extended information in JSON format, such as <code>{&quot;atAll&quot;:&quot;true&quot;}</code>, which specifies whether to mention all members.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The receiver. If <code>Channel</code> is set to <code>DingRobot</code> or <code>Weixin</code>, you must specify <code>WebhookUrl</code>.</p>
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
         * <p>The conditional expression in the <code>((#type==\\&quot;typeValue\\&quot;))</code> format, such as <code>((#odpsProject==\\&quot;PX_BEIJING_TEST\\&quot;))</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The effective stage of the rule. Valid values:</p>
         * <ul>
         * <li><code>Deployment</code>: Used to determine whether the approval policy is matched when an application is submitted.</li>
         * <li><code>Running</code>: Used to determine whether to skip approval while the approval process runs. This value is supported only for the MaxCompute type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deployment</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The condition type. Valid values:</p>
         * <ul>
         * <li><code>odpsProject</code> </li>
         * <li><code>hologresInstanceId</code></li>
         * <li><code>sensibleLevel</code> </li>
         * <li><code>tableGuid</code> </li>
         * <li><code>projectId</code></li>
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
         * <p>The list of approval nodes.</p>
         */
        @NameInMap("ApprovalNodes")
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes> approvalNodes;

        /**
         * <p>The description of the business process.</p>
         * 
         * <strong>example:</strong>
         * <p>Order business data approval process</p>
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
         * <p>The process definition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>210001039767</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Indicates whether the policy is the default system policy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsSystem")
        public Boolean isSystem;

        /**
         * <p>The name of the process definition.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute table approval</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The notification service configurations.</p>
         */
        @NameInMap("NotificationServices")
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices> notificationServices;

        /**
         * <p>The list of effective rules for the approval policy.</p>
         */
        @NameInMap("RuleConditions")
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions> ruleConditions;

        /**
         * <p>The subtype. Valid values:</p>
         * <ul>
         * <li>Table</li>
         * <li>Column</li>
         * <li>Database</li>
         * <li>Schema</li>
         * <li>Default</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Table</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The process definition type. Valid values:</p>
         * <ul>
         * <li>MaxCompute</li>
         * <li>DataService</li>
         * <li>Extension</li>
         * <li>Hologres</li>
         * <li>DlfV1: Custom creation is not supported.</li>
         * <li>Emr: Custom creation is not supported.</li>
         * <li>DataAssetGovernance: Custom creation is not supported.</li>
         * <li>Lindorm: Custom creation is not supported.</li>
         * <li>StarRocks: Custom creation is not supported.</li>
         * <li>DlfNext: Custom creation is not supported.</li>
         * <li>DataWorks: Custom creation is not supported.</li>
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
