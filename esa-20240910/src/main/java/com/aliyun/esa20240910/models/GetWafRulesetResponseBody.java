// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafRulesetResponseBody extends TeaModel {
    /**
     * <p>The ID of the WAF ruleset. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The ruleset name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The execution phase of the WAF ruleset. Valid values:</p>
     * <ul>
     * <li><p><code>http_whitelist</code>: A whitelist rule</p>
     * </li>
     * <li><p><code>http_custom</code>: A custom rule</p>
     * </li>
     * <li><p><code>http_managed</code>: A managed rule</p>
     * </li>
     * <li><p><code>http_anti_scan</code>: A scan protection rule</p>
     * </li>
     * <li><p><code>http_ratelimit</code>: A rate limit rule</p>
     * </li>
     * <li><p><code>ip_access_rule</code>: An IP access rule</p>
     * </li>
     * <li><p><code>http_bot</code>: A bot rule</p>
     * </li>
     * <li><p><code>http_security_level_rule</code>: A security rule</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of rule configurations in the ruleset.</p>
     */
    @NameInMap("Rules")
    public java.util.List<WafRuleConfig> rules;

    /**
     * <p>The shared configuration for rules within the ruleset.</p>
     */
    @NameInMap("Shared")
    public WafBatchRuleShared shared;

    /**
     * <p>The ruleset status.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the ruleset was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01T00:00:00Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetWafRulesetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWafRulesetResponseBody self = new GetWafRulesetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWafRulesetResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetWafRulesetResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetWafRulesetResponseBody setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetWafRulesetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWafRulesetResponseBody setRules(java.util.List<WafRuleConfig> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<WafRuleConfig> getRules() {
        return this.rules;
    }

    public GetWafRulesetResponseBody setShared(WafBatchRuleShared shared) {
        this.shared = shared;
        return this;
    }
    public WafBatchRuleShared getShared() {
        return this.shared;
    }

    public GetWafRulesetResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWafRulesetResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
