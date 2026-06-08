// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetProcessDefinitionResponseBody extends TeaModel {
    @NameInMap("ProcessDefinition")
    public GetProcessDefinitionResponseBodyProcessDefinition processDefinition;

    /**
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
        @NameInMap("ApprovalNodes")
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionApprovalNodes> approvalNodes;

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
         * <p>210001039767</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsSystem")
        public Boolean isSystem;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotificationServices")
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionNotificationServices> notificationServices;

        @NameInMap("RuleConditions")
        public java.util.List<GetProcessDefinitionResponseBodyProcessDefinitionRuleConditions> ruleConditions;

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
