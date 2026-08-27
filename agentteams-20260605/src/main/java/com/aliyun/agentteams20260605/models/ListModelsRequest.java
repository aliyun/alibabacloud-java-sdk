// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListModelsRequest extends TeaModel {
    /**
     * <p>The model ID used to query a specific model.</p>
     * 
     * <strong>example:</strong>
     * <p>m-xxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Optional. Fuzzy match by instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AgentTeams</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>worker-demo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>nt-xxx</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The model provider name used for filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>my-provider</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    public static ListModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelsRequest self = new ListModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListModelsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListModelsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListModelsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListModelsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListModelsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelsRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

}
