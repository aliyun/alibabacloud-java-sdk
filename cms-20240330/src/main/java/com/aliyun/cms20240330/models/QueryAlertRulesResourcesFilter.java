// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesResourcesFilter extends TeaModel {
    /**
     * <p>Matches any item in the list (OR semantics).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp1a2b3c4d5e6f7g8h9i&quot;,&quot;i-bp9h8g7f6e5d4c3b2a1&quot;]</p>
     */
    @NameInMap("contains")
    public java.util.List<String> contains;

    /**
     * <p>Filters out alert rules by resource instance ID blacklist. Alert rules whose associated resources contains any instance ID in the array are excluded.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;i-bp0z9y8x7w6v5u4t3s2&quot;]</p>
     */
    @NameInMap("notContains")
    public java.util.List<String> notContains;

    public static QueryAlertRulesResourcesFilter build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesResourcesFilter self = new QueryAlertRulesResourcesFilter();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesResourcesFilter setContains(java.util.List<String> contains) {
        this.contains = contains;
        return this;
    }
    public java.util.List<String> getContains() {
        return this.contains;
    }

    public QueryAlertRulesResourcesFilter setNotContains(java.util.List<String> notContains) {
        this.notContains = notContains;
        return this;
    }
    public java.util.List<String> getNotContains() {
        return this.notContains;
    }

}
