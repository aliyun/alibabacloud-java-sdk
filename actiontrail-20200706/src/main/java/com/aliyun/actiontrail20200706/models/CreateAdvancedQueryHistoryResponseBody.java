// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class CreateAdvancedQueryHistoryResponseBody extends TeaModel {
    @NameInMap("DryRunResult")
    public String dryRunResult;

    /**
     * <p>The ID of the advanced event query record.</p>
     * 
     * <strong>example:</strong>
     * <p>query-uIkIvLiVSuCKqg0yoa****</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <p>The advanced event query statement.</p>
     * 
     * <strong>example:</strong>
     * <p>event.userIdentity.accessKeyId: *</p>
     */
    @NameInMap("QuerySql")
    public String querySql;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D0227506-AA8C-5998-8A62-74769106****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether to enable the simple query mode.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SimpleQuery")
    public Boolean simpleQuery;

    public static CreateAdvancedQueryHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedQueryHistoryResponseBody self = new CreateAdvancedQueryHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedQueryHistoryResponseBody setDryRunResult(String dryRunResult) {
        this.dryRunResult = dryRunResult;
        return this;
    }
    public String getDryRunResult() {
        return this.dryRunResult;
    }

    public CreateAdvancedQueryHistoryResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public CreateAdvancedQueryHistoryResponseBody setQuerySql(String querySql) {
        this.querySql = querySql;
        return this;
    }
    public String getQuerySql() {
        return this.querySql;
    }

    public CreateAdvancedQueryHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAdvancedQueryHistoryResponseBody setSimpleQuery(Boolean simpleQuery) {
        this.simpleQuery = simpleQuery;
        return this;
    }
    public Boolean getSimpleQuery() {
        return this.simpleQuery;
    }

}
