// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesNamespaceFilter extends TeaModel {
    /**
     * <p>The exact match.</p>
     */
    @NameInMap("eq")
    public String eq;

    public static QueryAlertRulesNamespaceFilter build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesNamespaceFilter self = new QueryAlertRulesNamespaceFilter();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesNamespaceFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

}
