// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListContextStoresRequest extends TeaModel {
    /**
     * <p>The name of the context store used for filtering. Exact match is supported. If this parameter is not specified, no filtering is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>my-context-store</p>
     */
    @NameInMap("contextStoreName")
    public String contextStoreName;

    /**
     * <p>The type of the context store used for filtering, such as experience or memory. If this parameter is not specified, no filtering is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>experience</p>
     */
    @NameInMap("contextType")
    public String contextType;

    /**
     * <p>The maximum number of context stores to return in the current request. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. To retrieve the next page, pass the nextToken value from the previous response. Do not specify this parameter for the first request.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The memory data source type used for filtering, such as manual, trajectory, or dataset. If this parameter is not specified, no filtering is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>trajectory</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    public static ListContextStoresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContextStoresRequest self = new ListContextStoresRequest();
        return TeaModel.build(map, self);
    }

    public ListContextStoresRequest setContextStoreName(String contextStoreName) {
        this.contextStoreName = contextStoreName;
        return this;
    }
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    public ListContextStoresRequest setContextType(String contextType) {
        this.contextType = contextType;
        return this;
    }
    public String getContextType() {
        return this.contextType;
    }

    public ListContextStoresRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListContextStoresRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListContextStoresRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
