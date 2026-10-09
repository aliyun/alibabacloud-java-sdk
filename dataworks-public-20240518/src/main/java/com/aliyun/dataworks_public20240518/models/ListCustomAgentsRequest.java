// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCustomAgentsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Do not specify this parameter for the first query. For subsequent queries, specify the <code>NextToken</code> value returned from the previous query to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search keyword used to perform a fuzzy match on agent names.</p>
     * 
     * <strong>example:</strong>
     * <p>analysis</p>
     */
    @NameInMap("Q")
    public String q;

    /**
     * <p>The visibility levels used to filter results. You can specify multiple values.</p>
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
