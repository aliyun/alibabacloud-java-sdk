// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProcessDefinitionRequest extends TeaModel {
    /**
     * <p>A list of approval nodes. This parameter does not apply to system policies.</p>
     */
    @NameInMap("ApprovalNodes")
    public java.util.List<UpdateProcessDefinitionRequestApprovalNodes> approvalNodes;

    /**
     * <p>An idempotent parameter. It ensures that retried requests do not result in duplicate operations.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the process definition.</p>
     * 
     * <strong>example:</strong>
     * <p>lwt_ide_simple 项目 MaxCompute 表审批策略</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the process definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>177554881536128</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the process definition.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute 表审批</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The notification service configurations.</p>
     */
    @NameInMap("NotificationServices")
    public java.util.List<UpdateProcessDefinitionRequestNotificationServices> notificationServices;

    /**
     * <p>A list of rule conditions. This parameter does not apply to system policies.</p>
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
         * <p>The approver type for the node. Valid values:</p>
         * <ul>
         * <li><p><code>DataWorksProjectRole</code>: A workspace role.</p>
         * </li>
         * <li><p><code>DataWorksProjectMember</code>: A workspace member.</p>
         * </li>
         * <li><p><code>TableAdministrator</code>: A table administrator.</p>
         * </li>
         * <li><p><code>TableOrProjectAdministrator</code>: The administrator of the table or project.</p>
         * </li>
         * <li><p><code>AliyunResourceOwner</code>: An Alibaba Cloud account.</p>
         * </li>
         * <li><p><code>MaxComputeRole</code>: A MaxCompute administrator.</p>
         * </li>
         * <li><p><code>DLFAdmin</code>: A DlfLegacy administrator.</p>
         * </li>
         * <li><p><code>DLFNextAdmin</code>: A DLFNext administrator.</p>
         * </li>
         * <li><p><code>TenantRole</code>: A tenant role.</p>
         * </li>
         * <li><p><code>EmrAdministrator</code>: An EMR administrator.</p>
         * </li>
         * <li><p><code>LindormAdministrator</code>: A Lindorm administrator.</p>
         * </li>
         * <li><p><code>AliyunRamUser</code>: A RAM user.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TableOrProjectAdministrator</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>Specifies the approvers. The required value depends on the <code>AccountType</code>:</p>
         * <ul>
         * <li><p>If <code>AccountType</code> is <code>DataWorksProjectMember</code>, this parameter specifies the user IDs of workspace members.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>DataWorksProjectRole</code>, this parameter specifies the codes of workspace roles.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>MaxComputeRole</code>, this parameter specifies the MaxCompute roles.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>TenantRole</code>, this parameter specifies the codes of tenant roles.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>AliyunRamUser</code>, this parameter specifies the user IDs of RAM users.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DataWorksProjectMember</p>
         */
        @NameInMap("Assignees")
        public String assignees;

        /**
         * <p>Additional properties that are required for specific <code>AccountType</code> values:</p>
         * <ul>
         * <li><p>If <code>AccountType</code> is <code>DataWorksProjectMember</code>: The key is <code>projectId</code> and the value is the user ID of a workspace member. Use commas (,) to separate multiple user IDs.</p>
         * </li>
         * <li><p>If <code>AccountType</code> is <code>MaxComputeRole</code>: The key is the MaxCompute project name and the value is the role name in MaxCompute. Use commas (,) to separate multiple role names.</p>
         * </li>
         * </ul>
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
         * <p>Mail</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>Additional information in JSON format. For example, use {&quot;atAll&quot;:&quot;true&quot;} to specify whether to notify all members.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;atAll&quot;:&quot;true&quot;}</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>The webhook URL. This parameter is required when <code>Channel</code> is set to <code>DingRobot</code> or <code>Weixin</code>.</p>
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
         * <p>The conditional expression. Format: ((#type==\&quot;typeValue\&quot;)). For example: ((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;)).</p>
         * 
         * <strong>example:</strong>
         * <p>((#odpsProject==\&quot;PX_BEIJING_TEST\&quot;))</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The phase in which the rule takes effect. Valid values:</p>
         * <ul>
         * <li><p><strong>Deployment</strong>: Determines whether the approval policy applies when an application is submitted.</p>
         * </li>
         * <li><p><strong>Running</strong>: Determines whether to skip the approval during the approval process. This phase is supported only for MaxCompute.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deployment</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>The type of the condition. Valid values:</p>
         * <ul>
         * <li><p><code>odpsProject</code></p>
         * </li>
         * <li><p><code>hologresInstanceId</code></p>
         * </li>
         * <li><p><code>sensibleLevel</code></p>
         * </li>
         * <li><p><code>tableGuid</code></p>
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
