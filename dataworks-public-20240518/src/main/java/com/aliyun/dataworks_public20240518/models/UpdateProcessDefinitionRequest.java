// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProcessDefinitionRequest extends TeaModel {
    /**
     * <p>The list of approval nodes. Note: System policies do not take effect.</p>
     */
    @NameInMap("ApprovalNodes")
    public java.util.List<UpdateProcessDefinitionRequestApprovalNodes> approvalNodes;

    /**
     * <p>The idempotency token. Used to prevent duplicate operations caused by multiple calls.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the approval process definition.</p>
     * 
     * <strong>example:</strong>
     * <p>Approval policy for MaxCompute tables in the lwt_ide_simple project</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the approval process definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>177554881536128</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the approval process definition.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute table approval</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The notification service declaration.</p>
     */
    @NameInMap("NotificationServices")
    public java.util.List<UpdateProcessDefinitionRequestNotificationServices> notificationServices;

    /**
     * <p>The list of conditional rules. Note: System policies do not take effect.</p>
     */
    @NameInMap("RuleConditions")
    public java.util.List<UpdateProcessDefinitionRequestRuleConditions> ruleConditions;

    public static UpdateProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProcessDefinitionRequest self = new UpdateProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProcessDefinitionRequest setApprovalNodes(java.util.List<UpdateProcessDefinitionRequestApprovalNodes> approvalNodes) {
        this.approvalNodes = approvalNodes;
        return this;
    }
    public java.util.List<UpdateProcessDefinitionRequestApprovalNodes> getApprovalNodes() {
        return this.approvalNodes;
    }

    public UpdateProcessDefinitionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateProcessDefinitionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProcessDefinitionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateProcessDefinitionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProcessDefinitionRequest setNotificationServices(java.util.List<UpdateProcessDefinitionRequestNotificationServices> notificationServices) {
        this.notificationServices = notificationServices;
        return this;
    }
    public java.util.List<UpdateProcessDefinitionRequestNotificationServices> getNotificationServices() {
        return this.notificationServices;
    }

    public UpdateProcessDefinitionRequest setRuleConditions(java.util.List<UpdateProcessDefinitionRequestRuleConditions> ruleConditions) {
        this.ruleConditions = ruleConditions;
        return this;
    }
    public java.util.List<UpdateProcessDefinitionRequestRuleConditions> getRuleConditions() {
        return this.ruleConditions;
    }

    public static class UpdateProcessDefinitionRequestApprovalNodes extends TeaModel {
        /**
         * <p>The type of approver for the node. Valid values:</p>
         * <ul>
         * <li>DataWorksProjectRole: Workspace role</li>
         * <li>DataWorksProjectMember: Workspace member</li>
         * <li>TableAdministrator: Table owner</li>
         * <li>TableOrProjectAdministrator: Table or workspace administrator</li>
         * <li>AliyunResourceOwner: Alibaba Cloud account</li>
         * <li>MaxComputeRole: MaxCompute administrator</li>
         * <li>DLFAdmin: DLF legacy administrator</li>
         * <li>DLFNextAdmin: DLFNext administrator</li>
         * <li>TenantRole: Tenant role</li>
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
         * <p>The assignees. The semantics vary based on the AccountType:</p>
         * <ul>
         * <li>DataWorksProjectMember: Specifies the user ID of the workspace member.</li>
         * <li>DataWorksProjectRole: Specifies the code of the workspace role.</li>
         * <li>MaxComputeRole: Specifies the MaxCompute role.</li>
         * <li>TenantRole: Specifies the code of the tenant role.</li>
         * <li>AliyunRamUser: Specifies the RAM user ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataWorksProjectMember</p>
         */
        @NameInMap("Assignees")
        public String assignees;

        /**
         * <p>The extension properties. Different additional declarations are required based on the AccountType:</p>
         * <ul>
         * <li><code>DataWorksProjectMember</code>: The key is projectId, and the value is the user ID of the workspace member. Separate multiple values with commas.</li>
         * <li><code>MaxComputeRole</code>: The key is the MaxCompute project, and the value is the role name in MaxCompute. Separate multiple values with commas.</li>
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

        public static UpdateProcessDefinitionRequestApprovalNodes build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionRequestApprovalNodes self = new UpdateProcessDefinitionRequestApprovalNodes();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionRequestApprovalNodes setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public UpdateProcessDefinitionRequestApprovalNodes setAssignees(String assignees) {
            this.assignees = assignees;
            return this;
        }
        public String getAssignees() {
            return this.assignees;
        }

        public UpdateProcessDefinitionRequestApprovalNodes setExtensionProperties(java.util.Map<String, ?> extensionProperties) {
            this.extensionProperties = extensionProperties;
            return this;
        }
        public java.util.Map<String, ?> getExtensionProperties() {
            return this.extensionProperties;
        }

        public UpdateProcessDefinitionRequestApprovalNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateProcessDefinitionRequestNotificationServices extends TeaModel {
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
         * <p>Mail</p>
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
         * <p>The Webhook URL. This parameter is required when the channel is DingRobot or Weixin.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dingtalk.com">https://dingtalk.com</a></p>
         */
        @NameInMap("Receiver")
        public String receiver;

        public static UpdateProcessDefinitionRequestNotificationServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionRequestNotificationServices self = new UpdateProcessDefinitionRequestNotificationServices();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionRequestNotificationServices setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public UpdateProcessDefinitionRequestNotificationServices setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public UpdateProcessDefinitionRequestNotificationServices setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

    }

    public static class UpdateProcessDefinitionRequestRuleConditions extends TeaModel {
        /**
         * <p>The conditional expression, such as <code>((#type==\\&quot;typeValue\\&quot;))</code> or <code>((#odpsProject==\\&quot;PX_BEIJING_TEST\\&quot;))</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The stage where the rule takes effect. Valid values:</p>
         * <ul>
         * <li><strong>Deployment</strong>: Used to determine whether the approval policy is matched when the application is submitted.</li>
         * <li><strong>Running</strong>: Used to determine whether to skip approval while the approval process runs. [Supported only for MaxCompute]</li>
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

        public static UpdateProcessDefinitionRequestRuleConditions build(java.util.Map<String, ?> map) throws Exception {
            UpdateProcessDefinitionRequestRuleConditions self = new UpdateProcessDefinitionRequestRuleConditions();
            return TeaModel.build(map, self);
        }

        public UpdateProcessDefinitionRequestRuleConditions setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public UpdateProcessDefinitionRequestRuleConditions setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public UpdateProcessDefinitionRequestRuleConditions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
