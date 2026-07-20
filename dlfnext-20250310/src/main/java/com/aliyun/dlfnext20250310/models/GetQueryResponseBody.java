// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetQueryResponseBody extends TeaModel {
    /**
     * <p>The completion time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("completedAt")
    public Long completedAt;

    /**
     * <p>The creation time of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <p>The query ID, used for subsequent polling of results.</p>
     * 
     * <strong>example:</strong>
     * <p>d7b21d1ec4f441e79d5ba917c3283200</p>
     */
    @NameInMap("queryId")
    public String queryId;

    /**
     * <p>The result list.</p>
     */
    @NameInMap("results")
    public java.util.List<StatementResult> results;

    /**
     * <p>The SQL text. Multiple statements separated by semicolons are supported and executed sequentially within the same session.</p>
     * 
     * <strong>example:</strong>
     * <p>select * from table_name;</p>
     */
    @NameInMap("sql")
    public String sql;

    /**
     * <p>The task running status.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The execution specifications. Default value: standard.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("tier")
    public String tier;

    public static GetQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryResponseBody self = new GetQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryResponseBody setCompletedAt(Long completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public Long getCompletedAt() {
        return this.completedAt;
    }

    public GetQueryResponseBody setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public GetQueryResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public GetQueryResponseBody setResults(java.util.List<StatementResult> results) {
        this.results = results;
        return this;
    }
    public java.util.List<StatementResult> getResults() {
        return this.results;
    }

    public GetQueryResponseBody setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public GetQueryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetQueryResponseBody setTier(String tier) {
        this.tier = tier;
        return this;
    }
    public String getTier() {
        return this.tier;
    }

}
