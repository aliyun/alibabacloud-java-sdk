// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesRequest extends TeaModel {
    /**
     * <p>The request body for querying alert rules.</p>
     */
    @NameInMap("body")
    public QueryAlertRulesInput body;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx-xxxx-xxxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The maximum number of data records to read in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token that marks the position from which you want to start reading data. If you leave this parameter empty, data is read from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static QueryAlertRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesRequest self = new QueryAlertRulesRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesRequest setBody(QueryAlertRulesInput body) {
        this.body = body;
        return this;
    }
    public QueryAlertRulesInput getBody() {
        return this.body;
    }

    public QueryAlertRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public QueryAlertRulesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryAlertRulesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
