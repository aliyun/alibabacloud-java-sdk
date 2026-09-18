// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesEntityTypeFilter extends TeaModel {
    /**
     * <p>Matches any value in the set (OR semantics).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;UMODEL_ENTITY&quot;,&quot;CLOUD_INSTANCE&quot;]</p>
     */
    @NameInMap("in")
    public java.util.List<String> in;

    /**
     * <p>Excludes any value in the set (NOT IN semantics).</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;TAG&quot;]</p>
     */
    @NameInMap("notIn")
    public java.util.List<String> notIn;

    public static QueryAlertRulesEntityTypeFilter build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesEntityTypeFilter self = new QueryAlertRulesEntityTypeFilter();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesEntityTypeFilter setIn(java.util.List<String> in) {
        this.in = in;
        return this;
    }
    public java.util.List<String> getIn() {
        return this.in;
    }

    public QueryAlertRulesEntityTypeFilter setNotIn(java.util.List<String> notIn) {
        this.notIn = notIn;
        return this;
    }
    public java.util.List<String> getNotIn() {
        return this.notIn;
    }

}
