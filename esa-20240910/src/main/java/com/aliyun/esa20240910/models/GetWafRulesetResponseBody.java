// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetWafRulesetResponseBody extends TeaModel {
    /**
     * <p>Ruleset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Ruleset name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The WAF operation phase applicable to the ruleset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http_bot</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of rule configurations in the ruleset.</p>
     */
    @NameInMap("Rules")
    public java.util.List<WafRuleConfig> rules;

    /**
     * <p>Shared configurations for the rules in the ruleset.</p>
     */
    @NameInMap("Shared")
    public WafBatchRuleShared shared;

    /**
     * <p>Ruleset status.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The last modified time of the ruleset.</p>
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
