// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafRuleResponseBody extends TeaModel {
    /**
     * <p>The rule configuration.</p>
     */
    @NameInMap("Config")
    public WafRuleConfig config;

    /**
     * <p>The ID of the WAF rule. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2878257.html">ListWafRules</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>2000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The execution phase of the WAF rule.</p>
     * <ul>
     * <li><p><code>http_whitelist</code>: A whitelist rule</p>
     * </li>
     * <li><p><code>http_custom</code>: A custom rule</p>
     * </li>
     * <li><p><code>http_managed</code>: A managed rule</p>
     * </li>
     * <li><p><code>http_anti_scan</code>: A scan protection rule</p>
     * </li>
     * <li><p><code>http_ratelimit</code>: A rate limiting rule</p>
     * </li>
     * <li><p><code>ip_access_rule</code>: An IP access rule</p>
     * </li>
     * <li><p><code>http_bot</code>: A bot management rule</p>
     * </li>
     * <li><p><code>http_security_level_rule</code>: A security rule</p>
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
     * <p>The position of the rule in the ruleset.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Position")
    public Long position;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the WAF ruleset. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation.</p>
     */
    @NameInMap("RulesetId")
    public Long rulesetId;

    /**
     * <p>The status of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time the rule was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetWafRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWafRuleResponseBody self = new GetWafRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWafRuleResponseBody setConfig(WafRuleConfig config) {
        this.config = config;
        return this;
    }
    public WafRuleConfig getConfig() {
        return this.config;
    }

    public GetWafRuleResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetWafRuleResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetWafRuleResponseBody setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetWafRuleResponseBody setPosition(Long position) {
        this.position = position;
        return this;
    }
    public Long getPosition() {
        return this.position;
    }

    public GetWafRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWafRuleResponseBody setRulesetId(Long rulesetId) {
        this.rulesetId = rulesetId;
        return this;
    }
    public Long getRulesetId() {
        return this.rulesetId;
    }

    public GetWafRuleResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWafRuleResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
