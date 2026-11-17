// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProcessDefinitionRequest extends TeaModel {
    /**
     * <p>The list of approval nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApprovalNodes")
    public java.util.List<CreateProcessDefinitionRequestApprovalNodes> approvalNodes;

    /**
     * <p>The client token that is used to ensure idempotence. We recommend using a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the flow definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a sample policy</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the flow definition.</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The name of the flow definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>My approval policy</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The notification service declarations.</p>
     */
    @NameInMap("NotificationServices")
    public java.util.List<CreateProcessDefinitionRequestNotificationServices> notificationServices;

    /**
     * <p>The list of condition rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleConditions")
    public java.util.List<CreateProcessDefinitionRequestRuleConditions> ruleConditions;

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
     * <p>The type of the flow definition. Valid values:</p>
     * <ol>
     * <li>MaxCompute</li>
     * <li>DataService</li>
     * <li>Extension</li>
     * <li>Hologres</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>Extension</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProcessDefinitionRequest self = new CreateProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public CreateProcessDefinitionRequest setApprovalNodes(java.util.List<CreateProcessDefinitionRequestApprovalNodes> approvalNodes) {
        this.approvalNodes = approvalNodes;
        return this;
    }
    public java.util.List<CreateProcessDefinitionRequestApprovalNodes> getApprovalNodes() {
        return this.approvalNodes;
    }

    public CreateProcessDefinitionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProcessDefinitionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProcessDefinitionRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateProcessDefinitionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProcessDefinitionRequest setNotificationServices(java.util.List<CreateProcessDefinitionRequestNotificationServices> notificationServices) {
        this.notificationServices = notificationServices;
        return this;
    }
    public java.util.List<CreateProcessDefinitionRequestNotificationServices> getNotificationServices() {
        return this.notificationServices;
    }

    public CreateProcessDefinitionRequest setRuleConditions(java.util.List<CreateProcessDefinitionRequestRuleConditions> ruleConditions) {
        this.ruleConditions = ruleConditions;
        return this;
    }
    public java.util.List<CreateProcessDefinitionRequestRuleConditions> getRuleConditions() {
        return this.ruleConditions;
    }

    public CreateProcessDefinitionRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public CreateProcessDefinitionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateProcessDefinitionRequestApprovalNodes extends TeaModel {
        /**
         * <p>The approver type for the node. Valid values:</p>
         * <ul>
         * <li>DataWorksProjectRole: workspace role</li>
         * <li>DataWorksProjectMember: workspace member</li>
         * <li>TableAdministrator: table owner</li>
         * <li>TableOrProjectAdministrator: table or workspace administrator</li>
         * <li>AliyunResourceOwner: Alibaba Cloud account</li>
         * <li>MaxComputeRole: MaxCompute administrator</li>
         * <li>DLFAdmin: DLF legacy administrator</li>
         * <li>DLFNextAdmin: DLFNext administrator</li>
         * <li>TenantRole: tenant role</li>
         * <li>EmrAdministrator: EMR administrator</li>
         * <li>LindormAdministrator: Lindorm administrator</li>
         * <li>AliyunRamUser: RAM user</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TableOrProjectAdministrator</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The assignees. The semantics vary based on the value of AccountType:</p>
         * <ul>
         * <li>DataWorksProjectMember: specifies the user ID of the workspace member.</li>
         * <li>DataWorksProjectRole: specifies the code of the workspace role. If a custom workspace role is required, set this parameter to &quot;custom-role&quot; and further configure it in ExtensionProperties.</li>
         * <li>MaxComputeRole: specifies the MaxCompute role.</li>
         * <li>TenantRole: specifies the code of the tenant role.</li>
         * <li>AliyunRamUser: specifies the RAM user ID.</li>
         * </ul>
         */
        @NameInMap("Assignees")
        public java.util.List<String> assignees;

        /**
         * <p>The extended properties. Different additional declarations are required based on the value of AccountType:</p>
         * <ul>
         * <li><p>DataWorksProjectMember: You must set the user IDs of different workspace members. The key is the workspace ID, and the value is the user ID of the workspace member. Separate multiple values with commas (,).</p>
         * </li>
         * <li><p>DataWorksProjectRole: You must set the codes of different custom workspace roles. The key is the workspace ID, and the value is the code of the custom workspace role. Separate multiple values with commas (,).</p>
         * </li>
         * <li><p>MaxComputeRole: You must set the roles under the MaxCompute project. The key is the MaxCompute project, and the value is the role name in MaxCompute. Separate multiple values with commas (,).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;449656&quot;: &quot;role_project_admin,role_project_pe&quot;}</p>
         */
        @NameInMap("ExtensionProperties")
        public java.util.Map<String, ?> extensionProperties;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>default-name</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateProcessDefinitionRequestApprovalNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateProcessDefinitionRequestApprovalNodes self = new CreateProcessDefinitionRequestApprovalNodes();
            return TeaModel.build(map, self);
        }

        public CreateProcessDefinitionRequestApprovalNodes setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public CreateProcessDefinitionRequestApprovalNodes setAssignees(java.util.List<String> assignees) {
            this.assignees = assignees;
            return this;
        }
        public java.util.List<String> getAssignees() {
            return this.assignees;
        }

        public CreateProcessDefinitionRequestApprovalNodes setExtensionProperties(java.util.Map<String, ?> extensionProperties) {
            this.extensionProperties = extensionProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtensionProperties() {
            return this.extensionProperties;
        }

        public CreateProcessDefinitionRequestApprovalNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateProcessDefinitionRequestNotificationServices extends TeaModel {
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
         * <p>The extended information in JSON format. For example, <code>{&quot;atAll&quot;:&quot;true&quot;}</code> specifies whether to mention all users.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The receiver. When Channel is set to DingRobot or Weixin, you must specify WebhookUrl.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dingtalk.com">https://dingtalk.com</a></p>
         */
        @NameInMap("Receiver")
        public String receiver;

        public static CreateProcessDefinitionRequestNotificationServices build(java.util.Map<String, ?> map) throws Exception {
            CreateProcessDefinitionRequestNotificationServices self = new CreateProcessDefinitionRequestNotificationServices();
            return TeaModel.build(map, self);
        }

        public CreateProcessDefinitionRequestNotificationServices setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreateProcessDefinitionRequestNotificationServices setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public CreateProcessDefinitionRequestNotificationServices setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

    }

    public static class CreateProcessDefinitionRequestRuleConditions extends TeaModel {
        /**
         * <p>The conditional expression, in the format of ((#type==\&quot;typeValue\&quot;)). Example: ((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;)).</p>
         * 
         * <strong>example:</strong>
         * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The stage where the rule takes effect. Valid values:</p>
         * <ul>
         * <li><code>Deployment</code>: Used to determine whether the approval policy is matched when the application is submitted.</li>
         * <li><code>Running</code>: Used to determine whether the approval process is exempt from approval during execution. This value is supported only for the MaxCompute type.</li>
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

        public static CreateProcessDefinitionRequestRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            CreateProcessDefinitionRequestRuleConditions self = new CreateProcessDefinitionRequestRuleConditions();
            return TeaModel.build(map, self);
        }

        public CreateProcessDefinitionRequestRuleConditions setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateProcessDefinitionRequestRuleConditions setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateProcessDefinitionRequestRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
