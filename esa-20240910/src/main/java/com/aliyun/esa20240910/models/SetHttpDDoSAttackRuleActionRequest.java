// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackRuleActionRequest extends TeaModel {
    /**
     * <p>Rule action, with values:</p>
     * <ul>
     * <li><p><strong>deny</strong>: Block.</p>
     * </li>
     * <li><p><strong>js</strong>: JS Verification.</p>
     * </li>
     * <li><p><strong>observe</strong>: Observe.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>js</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>List of rule IDs to be operated on, separated by English commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeHttpDDoSAttackRules~~">DescribeHttpDDoSAttackRules</a> API to get this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static SetHttpDDoSAttackRuleActionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackRuleActionRequest self = new SetHttpDDoSAttackRuleActionRequest();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackRuleActionRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public SetHttpDDoSAttackRuleActionRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

    public SetHttpDDoSAttackRuleActionRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
