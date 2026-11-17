// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseRetrievalGrantsRequest extends TeaModel {
    /**
     * <p>The knowledge base ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-4234-8234-123456789abc</p>
     */
    @NameInMap("KnowledgeBaseId")
    public String knowledgeBaseId;

    /**
     * <p>The number of entries per page. This parameter is optional. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The cursor returned from the previous page. Do not specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the principal that receives the share. This parameter is optional. Default value: USER. Only USER is supported in the initial release.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("PrincipalType")
    public String principalType;

    public static ListKnowledgeBaseRetrievalGrantsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseRetrievalGrantsRequest self = new ListKnowledgeBaseRetrievalGrantsRequest();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseRetrievalGrantsRequest setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
        return this;
    }
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    public ListKnowledgeBaseRetrievalGrantsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgeBaseRetrievalGrantsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListKnowledgeBaseRetrievalGrantsRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}
