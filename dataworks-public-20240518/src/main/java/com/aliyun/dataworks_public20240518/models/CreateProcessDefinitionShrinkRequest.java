// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProcessDefinitionShrinkRequest extends TeaModel {
    /**
     * <p>The list of approval nodes.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApprovalNodes")
    public String approvalNodesShrink;

    /**
     * <p>The idempotency token. We recommend that you use a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the process definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个示例策略</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable the process definition.</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The name of the process definition.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>我的审批策略</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The notification service declarations.</p>
     */
    @NameInMap("NotificationServices")
    public String notificationServicesShrink;

    /**
     * <p>The list of condition rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleConditions")
    public String ruleConditionsShrink;

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
     * <p>The type of the process definition. Valid values:</p>
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

    public static CreateProcessDefinitionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProcessDefinitionShrinkRequest self = new CreateProcessDefinitionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProcessDefinitionShrinkRequest setApprovalNodesShrink(String approvalNodesShrink) {
        this.approvalNodesShrink = approvalNodesShrink;
        return this;
    }
    public String getApprovalNodesShrink() {
        return this.approvalNodesShrink;
    }

    public CreateProcessDefinitionShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateProcessDefinitionShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProcessDefinitionShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateProcessDefinitionShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateProcessDefinitionShrinkRequest setNotificationServicesShrink(String notificationServicesShrink) {
        this.notificationServicesShrink = notificationServicesShrink;
        return this;
    }
    public String getNotificationServicesShrink() {
        return this.notificationServicesShrink;
    }

    public CreateProcessDefinitionShrinkRequest setRuleConditionsShrink(String ruleConditionsShrink) {
        this.ruleConditionsShrink = ruleConditionsShrink;
        return this;
    }
    public String getRuleConditionsShrink() {
        return this.ruleConditionsShrink;
    }

    public CreateProcessDefinitionShrinkRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public CreateProcessDefinitionShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
