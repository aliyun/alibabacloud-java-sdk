// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUserWafRulesetShrinkRequest extends TeaModel {
    /**
     * <p>The description of the WAF ruleset.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a test ruleset.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The match expression of the WAF ruleset. Rules in this ruleset are evaluated only when a request matches this expression.</p>
     * <p>Examples:</p>
     * <ul>
     * <li><code>http.host eq &quot;example.com&quot;</code> — Only requests with the host example.com enter this ruleset.</li>
     * <li><code>starts_with(http.uri.path, &quot;/api/&quot;)</code> — Only requests with the /api/ prefix enter this ruleset.</li>
     * </ul>
     * <blockquote>
     * <p>The complete expression syntax and available field set are subject to the server-side wirefilter dialect.</p>
     * </blockquote>
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
     * <p><strong>Naming suggestion</strong>: Use a combination of letters, digits, and underscores for easy reference. The specific character set, maximum length, and uniqueness constraints are subject to the WAF ruleset service naming conventions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The phase to which the WAF ruleset belongs. Valid values:</p>
     * <ul>
     * <li>http_whitelist: whitelist rules</li>
     * <li>http_custom: custom rules</li>
     * <li>http_managed: managed rules</li>
     * <li>http_anti_scan: scan protection rules</li>
     * <li>http_ratelimit: rate limiting rules</li>
     * </ul>
     * <blockquote>
     * <p>Note: The supported fields (Expression match fields, Action values, and others) vary by phase. For more information, refer to the rule configuration documentation for the corresponding phase.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http_custom</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The list of rule configurations in the WAF ruleset. Each element corresponds to a rule.</p>
     * <ul>
     * <li>The field structure of each rule is subject to the <code>WafRuleConfig</code> data structure, which includes Expression, Action, Name, and other fields.</li>
     * </ul>
     */
    @NameInMap("Rules")
    public String rulesShrink;

    /**
     * <p>The shared fields across multiple rules in this ruleset, such as a unified Action or Name prefix.</p>
     * <blockquote>
     * <p>The field structure is subject to the <code>WafBatchRuleShared</code> data structure. If you do not need to share properties, you can leave this parameter empty.</p>
     * </blockquote>
     */
    @NameInMap("Shared")
    public String sharedShrink;

    /**
     * <p>The status of the WAF ruleset. Valid values:</p>
     * <ul>
     * <li>on: Enabled. The rules in the ruleset participate in matching and blocking.</li>
     * <li>off: Disabled. The ruleset is retained but does not participate in matching.</li>
     * </ul>
     * <blockquote>
     * <p>The complete set of valid values is subject to the server-side enum.</p>
     * </blockquote>
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
