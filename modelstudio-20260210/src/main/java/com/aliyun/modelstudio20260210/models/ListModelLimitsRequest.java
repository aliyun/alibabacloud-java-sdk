// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListModelLimitsRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. Valid values: 0 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The model for exact match.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <p>The model name for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>lwytFRtLdNk=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-8af73c50f5596193</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListModelLimitsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelLimitsRequest self = new ListModelLimitsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelLimitsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListModelLimitsRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ListModelLimitsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelLimitsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelLimitsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
