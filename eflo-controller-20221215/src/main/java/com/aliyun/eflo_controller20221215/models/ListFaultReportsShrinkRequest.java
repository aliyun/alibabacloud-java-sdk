// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFaultReportsShrinkRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>DA4F08D4</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("Nodes")
    public String nodesShrink;

    /**
     * <p>The status of the fault report.</p>
     * 
     * <strong>example:</strong>
     * <p>Processing</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListFaultReportsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFaultReportsShrinkRequest self = new ListFaultReportsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFaultReportsShrinkRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListFaultReportsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFaultReportsShrinkRequest setNodesShrink(String nodesShrink) {
        this.nodesShrink = nodesShrink;
        return this;
    }
    public String getNodesShrink() {
        return this.nodesShrink;
    }

    public ListFaultReportsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
