// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesProductCategoryFilter extends TeaModel {
    @NameInMap("eq")
    public String eq;

    public static QueryAlertRulesProductCategoryFilter build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesProductCategoryFilter self = new QueryAlertRulesProductCategoryFilter();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesProductCategoryFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

}
