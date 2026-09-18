// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesInput extends TeaModel {
    /**
     * <p>The comprehensive filter conditions for querying alert rules. Supports combined filtering by multiple dimensions such as name, status, severity level, tags, and notification channels.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;status&quot;:{&quot;eq&quot;:&quot;Alarm&quot;},&quot;severityLevels&quot;:{&quot;contains&quot;:[&quot;CRITICAL&quot;,&quot;ERROR&quot;]}}</p>
     */
    @NameInMap("filter")
    public QueryAlertRulesFilter filter;

    /**
     * <p>The pagination mode parameter. keyset indicates keyset-based pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;pageNumber&quot;:1,&quot;pageSize&quot;:20}</p>
     */
    @NameInMap("pagination")
    public Pagination pagination;

    /**
     * <p>The observable workspace name. If this parameter is not specified, all alert rules are returned based on the caller identity (callerUserId + callerRegionId). If this parameter is specified, only the rules under the specified workspace are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace-test</p>
     */
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
