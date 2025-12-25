// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUserWafRulesetShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>this is a test ruleset.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip.src == 1.1.1.1</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-ads11w</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Phase")
    public String phase;

    @NameInMap("Rules")
    public String rulesShrink;

    @NameInMap("Shared")
    public String sharedShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateUserWafRulesetShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWafRulesetShrinkRequest self = new CreateUserWafRulesetShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserWafRulesetShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserWafRulesetShrinkRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public CreateUserWafRulesetShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserWafRulesetShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUserWafRulesetShrinkRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateUserWafRulesetShrinkRequest setRulesShrink(String rulesShrink) {
        this.rulesShrink = rulesShrink;
        return this;
    }
    public String getRulesShrink() {
        return this.rulesShrink;
    }

    public CreateUserWafRulesetShrinkRequest setSharedShrink(String sharedShrink) {
        this.sharedShrink = sharedShrink;
        return this;
    }
    public String getSharedShrink() {
        return this.sharedShrink;
    }

    public CreateUserWafRulesetShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
