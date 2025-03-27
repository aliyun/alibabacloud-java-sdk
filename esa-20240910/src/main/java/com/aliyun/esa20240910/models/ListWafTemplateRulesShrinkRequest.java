// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafTemplateRulesShrinkRequest extends TeaModel {
    /**
     * <p>WAF operation phase, used to filter template rules for a specific phase.</p>
     * 
     * <strong>example:</strong>
     * <p>http_anti_scan</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <p>Query parameters, used to filter template rules based on conditions such as rule type.</p>
     * 
     * <strong>example:</strong>
     * <p>http_anti_scan</p>
     */
    @NameInMap("QueryArgs")
    public String queryArgsShrink;

    /**
     * <p>Site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static ListWafTemplateRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWafTemplateRulesShrinkRequest self = new ListWafTemplateRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListWafTemplateRulesShrinkRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ListWafTemplateRulesShrinkRequest setQueryArgsShrink(String queryArgsShrink) {
        this.queryArgsShrink = queryArgsShrink;
        return this;
    }
    public String getQueryArgsShrink() {
        return this.queryArgsShrink;
    }

    public ListWafTemplateRulesShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
