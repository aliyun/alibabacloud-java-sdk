// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContextStoresRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test-context-store</p>
     */
    @NameInMap("contextStoreName")
    public String contextStoreName;

    /**
     * <strong>example:</strong>
     * <p>memory</p>
     */
    @NameInMap("contextType")
    public String contextType;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>OCAQV0pBqldexv7EidbIZw==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

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

}
