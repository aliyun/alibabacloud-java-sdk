// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUserWafRulesetRequest extends TeaModel {
    /**
     * <p>The description of the WAF ruleset.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test ruleset.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The expression for the WAF ruleset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip.src == 1.1.1.1</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-ads11w</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the WAF ruleset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The execution phase of the WAF ruleset.</p>
     * <ul>
     * <li><p><code>http_whitelist</code>: whitelist rule</p>
     * </li>
     * <li><p><code>http_custom</code>: custom rule</p>
     * </li>
     * <li><p><code>http_managed</code>: managed rule</p>
     * </li>
     * <li><p><code>http_anti_scan</code>: scan protection rule</p>
     * </li>
     * <li><p><code>http_ratelimit</code>: rate limiting rule</p>
     * </li>
     * <li><p><code>ip_access_rule</code>: IP access rule</p>
     * </li>
     * <li><p><code>http_bot</code>: advanced bot</p>
     * </li>
     * <li><p><code>http_security_level_rule</code>: security rule</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>A list of rule configurations within the WAF ruleset.</p>
     */
    @NameInMap("Rules")
    public java.util.List<WafRuleConfig> rules;

    /**
     * <p>The shared configuration for WAF batch rules.</p>
     */
    @NameInMap("Shared")
    public WafBatchRuleShared shared;

    /**
     * <p>The status of the WAF ruleset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateUserWafRulesetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserWafRulesetRequest self = new CreateUserWafRulesetRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserWafRulesetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUserWafRulesetRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public CreateUserWafRulesetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateUserWafRulesetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUserWafRulesetRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public CreateUserWafRulesetRequest setRules(java.util.List<WafRuleConfig> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<WafRuleConfig> getRules() {
        return this.rules;
    }

    public CreateUserWafRulesetRequest setShared(WafBatchRuleShared shared) {
        this.shared = shared;
        return this;
    }
    public WafBatchRuleShared getShared() {
        return this.shared;
    }

    public CreateUserWafRulesetRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
