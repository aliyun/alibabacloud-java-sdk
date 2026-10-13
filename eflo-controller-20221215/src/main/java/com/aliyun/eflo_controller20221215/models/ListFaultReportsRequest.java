// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFaultReportsRequest extends TeaModel {
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
    public java.util.List<String> nodes;

    /**
     * <p>The status of the fault report.</p>
     * 
     * <strong>example:</strong>
     * <p>Processing</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListFaultReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFaultReportsRequest self = new ListFaultReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListFaultReportsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListFaultReportsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListFaultReportsRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public ListFaultReportsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
