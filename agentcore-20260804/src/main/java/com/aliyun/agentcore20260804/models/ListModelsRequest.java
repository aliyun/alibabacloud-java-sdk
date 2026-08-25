// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListModelsRequest extends TeaModel {
    /**
     * <p>The model connection ID used to filter models.</p>
     * 
     * <strong>example:</strong>
     * <p>mc-1</p>
     */
    @NameInMap("connectionId")
    public String connectionId;

    /**
     * <p>The number of results per page. Valid values: 0 to 100. If this parameter is not set or set to 0, the default value 10 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The upstream model name.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelName")
    public String modelName;

    /**
     * <p>The pagination token. Pass the token returned from the previous query. An empty response indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>bW9kZWwtbWFuYWdlbWVudC1vZmZzZXQ6bW9kZWw6MTA</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelsRequest self = new ListModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelsRequest setConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    public String getConnectionId() {
        return this.connectionId;
    }

    public ListModelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelsRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ListModelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
