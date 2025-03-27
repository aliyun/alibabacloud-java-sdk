// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWaitingRoomRuleRequest extends TeaModel {
    /**
     * <p>Rule content, using conditional expressions to match user requests. This parameter is not required when adding global configuration. There are two usage scenarios:</p>
     * <ul>
     * <li>Match all incoming requests: Set the value to true</li>
     * <li>Match specific requests: Set the value to a custom expression, for example: (http.host eq &quot;video.example.com&quot;)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>(http.request.uri.path.file_name eq \&quot;jpg\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Rule switch. This parameter is not required when adding global configuration. Value range:</p>
     * <ul>
     * <li>on: Enable.</li>
     * <li>off: Disable.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>Rule name. This parameter is not required when adding global configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The ID of the waiting room bypass rule to be updated, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRoomRules</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8987739839****</p>
     */
    @NameInMap("WaitingRoomRuleId")
    public Long waitingRoomRuleId;

    public static UpdateWaitingRoomRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWaitingRoomRuleRequest self = new UpdateWaitingRoomRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWaitingRoomRuleRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateWaitingRoomRuleRequest setRuleEnable(String ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }
    public String getRuleEnable() {
        return this.ruleEnable;
    }

    public UpdateWaitingRoomRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateWaitingRoomRuleRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public UpdateWaitingRoomRuleRequest setWaitingRoomRuleId(Long waitingRoomRuleId) {
        this.waitingRoomRuleId = waitingRoomRuleId;
        return this;
    }
    public Long getWaitingRoomRuleId() {
        return this.waitingRoomRuleId;
    }

}
