// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateWaitingRoomRuleRequest extends TeaModel {
    /**
     * <p>The rule content. A conditional expression is used to match user requests. This parameter is not required when you add a global configuration. Two scenarios are supported:</p>
     * <ul>
     * <li>Match all incoming requests: set the value to true.</li>
     * <li>Match specified requests: set the value to a custom expression, for example, (http.host eq \&quot;video.example.com\&quot;).</li>
     * </ul>
     * <p>For the complete syntax of rule expressions, refer to
     * &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/edge-security-acceleration/esa/user-guide/work-with-rules-engine/">https://www.alibabacloud.com/help/en/edge-security-acceleration/esa/user-guide/work-with-rules-engine/</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/edge-security-acceleration/esa/user-guide/work-with-rules-engine/">https://www.alibabacloud.com/help/edge-security-acceleration/esa/user-guide/work-with-rules-engine/</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>(http.request.uri.path.file_name eq \&quot;jpg\&quot;)</p>
     */
    @NameInMap("Rule")
    public String rule;

    /**
     * <p>Specifies whether to enable the rule. This parameter is not required when you add a global configuration. Valid values:</p>
     * <ul>
     * <li>on: enabled.</li>
     * <li>off: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("RuleEnable")
    public String ruleEnable;

    /**
     * <p>The rule name. This parameter is not required when you add a global configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The ID of the waiting room bypass rule to update. You can obtain this ID after creating a rule by calling CreateWaitingRoomRule, or by calling the <a href="https://help.aliyun.com/document_detail/2850279.html">ListWaitingRoomRules</a> operation.</p>
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
