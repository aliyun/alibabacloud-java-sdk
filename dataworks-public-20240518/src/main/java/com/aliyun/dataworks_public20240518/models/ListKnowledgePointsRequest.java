// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgePointsRequest extends TeaModel {
    /**
     * <p>The stable ID of the target knowledge base. You can obtain the ID by calling the ListKnowledgeBases operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The maximum number of knowledge points to return per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination cursor. Do not specify this parameter for the first page. For subsequent pages, pass the NextToken value returned in the previous response as is, and keep the knowledge base, type, and page size unchanged. An empty cursor indicates that no more data is available. If the current page is empty but the cursor is not empty, continue querying.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the knowledge point. Valid values:</p>
     * <ul>
     * <li>GRAPH: local graph entry.</li>
     * <li>WIKI: Wiki page.</li>
     * <li>KNOWLEDGE_CONTENT: knowledge content.
     * If you do not specify this parameter, knowledge points of all types are listed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GRAPH</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListKnowledgePointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgePointsRequest self = new ListKnowledgePointsRequest();
        return TeaModel.build(map, self);
    }

    public ListKnowledgePointsRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public ListKnowledgePointsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgePointsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKnowledgePointsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
