// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackRuleStatusRequest extends TeaModel {
    /**
     * <p>List of rule IDs to be operated on, separated by English commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeHttpDDoSAttackRules~~">DescribeHttpDDoSAttackRules</a> interface to get this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>87570</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

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
     * <p>Rule status</p>
     * <ul>
     * <li><strong>on</strong>: Enable.</li>
     * <li><strong>off</strong>: Disable.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    public static SetHttpDDoSAttackRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackRuleStatusRequest self = new SetHttpDDoSAttackRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackRuleStatusRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

    public SetHttpDDoSAttackRuleStatusRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public SetHttpDDoSAttackRuleStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
