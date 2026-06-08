// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProcessDefinitionRequest extends TeaModel {
    @NameInMap("ApprovalNodes")
    public java.util.List<UpdateProcessDefinitionRequestApprovalNodes> approvalNodes;

    /**
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>177554881536128</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("NotificationServices")
    public java.util.List<UpdateProcessDefinitionRequestNotificationServices> notificationServices;

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
         * <strong>example:</strong>
         * <p>TableOrProjectAdministrator</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <strong>example:</strong>
         * <p>DataWorksProjectMember</p>
         */
        @NameInMap("Assignees")
        public String assignees;

        @NameInMap("ExtensionProperties")
        public java.util.Map<String, ?> extensionProperties;

        /**
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
