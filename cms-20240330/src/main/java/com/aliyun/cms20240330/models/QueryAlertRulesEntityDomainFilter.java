// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesEntityDomainFilter extends TeaModel {
    /**
     * <p>The exact match.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_monitor</p>
     */
    @NameInMap("eq")
    public String eq;

    public static QueryAlertRulesEntityDomainFilter build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesEntityDomainFilter self = new QueryAlertRulesEntityDomainFilter();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesEntityDomainFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

}
