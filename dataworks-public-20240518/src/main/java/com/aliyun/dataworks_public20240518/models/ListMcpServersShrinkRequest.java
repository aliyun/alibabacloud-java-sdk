// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListMcpServersShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The next page token from a previous response. Use this token to retrieve the next page of results. Leave this parameter empty for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search keyword for a fuzzy search on MCP Server names.</p>
     * 
     * <strong>example:</strong>
     * <p>mcp</p>
     */
    @NameInMap("Q")
    public String q;

    /**
     * <p>The visibility level for filtering the results.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Visibility")
    public String visibilityShrink;

    public static ListMcpServersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcpServersShrinkRequest self = new ListMcpServersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMcpServersShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMcpServersShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMcpServersShrinkRequest setQ(String q) {
        this.q = q;
        return this;
    }
    public String getQ() {
        return this.q;
    }

    public ListMcpServersShrinkRequest setVisibilityShrink(String visibilityShrink) {
        this.visibilityShrink = visibilityShrink;
        return this;
    }
    public String getVisibilityShrink() {
        return this.visibilityShrink;
    }

}
