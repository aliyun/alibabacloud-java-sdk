// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateUserWafRulesetRequest extends TeaModel {
    /**
     * <p>The description of the WAF ruleset.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expression of the WAF ruleset.</p>
     * 
     * <strong>example:</strong>
     * <p>ip.src == 1.1.1.1</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The WAF ruleset ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-xxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the WAF ruleset.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The position of the WAF ruleset.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Position")
    public Long position;

    /**
     * <p>A list of rule configurations in the WAF ruleset.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;Id&quot;: 20000001,
     *     &quot;Name&quot;: &quot;rule1&quot;,
     *     &quot;Expression&quot;: &quot;ip.src eq 1.1.1.1&quot;,
     *     &quot;Action&quot;: &quot;deny&quot;
     *   }</p>
     */
    @NameInMap("Rules")
    public java.util.List<WafRuleConfig> rules;

    /**
     * <p>The shared configuration of the WAF ruleset.</p>
     */
    @NameInMap("Shared")
    public WafBatchRuleShared shared;

    /**
     * <p>The status of the WAF ruleset.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateUserWafRulesetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserWafRulesetRequest self = new UpdateUserWafRulesetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserWafRulesetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserWafRulesetRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public UpdateUserWafRulesetRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateUserWafRulesetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateUserWafRulesetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateUserWafRulesetRequest setPosition(Long position) {
        this.position = position;
        return this;
    }
    public Long getPosition() {
        return this.position;
    }

    public UpdateUserWafRulesetRequest setRules(java.util.List<WafRuleConfig> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<WafRuleConfig> getRules() {
        return this.rules;
    }

    public UpdateUserWafRulesetRequest setShared(WafBatchRuleShared shared) {
        this.shared = shared;
        return this;
    }
    public WafBatchRuleShared getShared() {
        return this.shared;
    }

    public UpdateUserWafRulesetRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
