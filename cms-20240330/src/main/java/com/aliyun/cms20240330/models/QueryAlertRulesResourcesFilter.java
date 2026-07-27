// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesResourcesFilter extends TeaModel {
    @NameInMap("contains")
    public java.util.List<String> contains;

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
