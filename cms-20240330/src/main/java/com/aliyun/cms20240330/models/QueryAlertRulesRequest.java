// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesRequest extends TeaModel {
    /**
     * <p>The request parameters for querying alert rules.</p>
     */
    @NameInMap("body")
    public QueryAlertRulesInput body;

    /**
     * <p>The client token used to ensure the idempotency of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx-xxxx-xxxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. If you do not specify this parameter, the query starts from the beginning.</p>
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
