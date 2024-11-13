// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWafTemplateRulesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>http_anti_scan</p>
     */
    @NameInMap("Phase")
    public String phase;

    @NameInMap("QueryArgs")
    public String queryArgsShrink;

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
