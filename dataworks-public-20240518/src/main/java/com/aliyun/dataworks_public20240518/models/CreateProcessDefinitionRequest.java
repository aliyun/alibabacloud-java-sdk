// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProcessDefinitionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApprovalNodes")
    public java.util.List<CreateProcessDefinitionRequestApprovalNodes> approvalNodes;

    /**
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NotificationServices")
    public java.util.List<CreateProcessDefinitionRequestNotificationServices> notificationServices;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleConditions")
    public java.util.List<CreateProcessDefinitionRequestRuleConditions> ruleConditions;

    /**
     * <strong>example:</strong>
     * <p>Table</p>
     */
    @NameInMap("SubType")
    public String subType;

    /**
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
         * <strong>example:</strong>
         * <p>TableOrProjectAdministrator</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Assignees")
        public java.util.List<String> assignees;

        @NameInMap("ExtensionProperties")
        public java.util.Map<String, ?> extensionProperties;

        /**
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
         * <strong>example:</strong>
         * <p>DingRobot</p>
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
