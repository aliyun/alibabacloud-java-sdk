// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesEntityTypeFilter extends TeaModel {
    @NameInMap("in")
    public java.util.List<String> in;

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
