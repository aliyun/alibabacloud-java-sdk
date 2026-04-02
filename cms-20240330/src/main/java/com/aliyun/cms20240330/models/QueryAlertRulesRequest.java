// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesRequest extends TeaModel {
    @NameInMap("body")
    public QueryAlertRulesInput body;

    /**
     * <strong>example:</strong>
     * <p>xxxxx-xxxx-xxxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
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
