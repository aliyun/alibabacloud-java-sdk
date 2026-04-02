// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesInput extends TeaModel {
    @NameInMap("filter")
    public QueryAlertRulesFilter filter;

    @NameInMap("pagination")
    public Pagination pagination;

    @NameInMap("workspace")
    public String workspace;

    public static QueryAlertRulesInput build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesInput self = new QueryAlertRulesInput();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesInput setFilter(QueryAlertRulesFilter filter) {
        this.filter = filter;
        return this;
    }
    public QueryAlertRulesFilter getFilter() {
        return this.filter;
    }

    public QueryAlertRulesInput setPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }
    public Pagination getPagination() {
        return this.pagination;
    }

    public QueryAlertRulesInput setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
