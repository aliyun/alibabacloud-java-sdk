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

}
