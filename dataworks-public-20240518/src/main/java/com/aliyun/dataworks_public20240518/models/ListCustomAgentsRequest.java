// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCustomAgentsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return on a single page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Omit this parameter for the first request. For subsequent requests, use the <code>NextToken</code> value from the previous response to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search keyword for a fuzzy match by agent name.</p>
     * 
     * <strong>example:</strong>
     * <p>analysis</p>
     */
    @NameInMap("Q")
    public String q;

    /**
     * <p>Filters the results by visibility level. You can specify multiple levels.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Visibility")
    public java.util.List<String> visibility;

    public static ListCustomAgentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentsRequest self = new ListCustomAgentsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCustomAgentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCustomAgentsRequest setQ(String q) {
        this.q = q;
        return this;
    }
    public String getQ() {
        return this.q;
    }

    public ListCustomAgentsRequest setVisibility(java.util.List<String> visibility) {
        this.visibility = visibility;
        return this;
    }
    public java.util.List<String> getVisibility() {
        return this.visibility;
    }

}
