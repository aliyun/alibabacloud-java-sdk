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
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx-xxxx-xxxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The maximum number of data records to return in the current read operation.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token that specifies the starting position for the current read operation. If this parameter is left empty, the read operation starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The query filter conditions in JSON string format. The field semantics are the same as those in the request body. Supported fields include filter (such as uuid, displayName, labels, status, and enabled, where sibling fields use the AND logical operator), pagination (pageNumber and pageSize), and workspace. You must specify either this parameter or the body parameter. If both are specified, the body parameter takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;filter&quot;:{&quot;displayName&quot;:{&quot;contains&quot;:&quot;my-rule&quot;}},&quot;pagination&quot;:{&quot;pageNumber&quot;:1,&quot;pageSize&quot;:20}}</p>
     */
    @NameInMap("queryJson")
    public String queryJson;

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

    public QueryAlertRulesRequest setQueryJson(String queryJson) {
        this.queryJson = queryJson;
        return this;
    }
    public String getQueryJson() {
        return this.queryJson;
    }

}
