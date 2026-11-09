// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListSandboxSessionsRequest extends TeaModel {
    /**
     * <p>The maximum number of entries to return per page. Default value: 20. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page. Omit this parameter in the first request. For subsequent requests, use the returned token as is, and keep the workspace, agent, instance, and maxResults unchanged. An empty value indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>next-token-1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The value must be consistent with the request parameters used in the ListSandboxes operation to obtain the sandboxId. If this parameter is omitted or left blank, the latest running unit of the agent is queried. If this parameter is specified, the service endpoint must belong to the agent and the target type must be AGENT_VERSION. Otherwise, Resource.NotFound is returned. If the target is not DEFAULT and is not running independently, ServiceEndpointTargetNotReady is returned. If the sandboxId does not belong to the specified running unit, Sandbox.NotFound is returned instead of an empty list.</p>
     * 
     * <strong>example:</strong>
     * <p>se-7f3a92c1</p>
     */
    @NameInMap("serviceEndpointId")
    public String serviceEndpointId;

    public static ListSandboxSessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSandboxSessionsRequest self = new ListSandboxSessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSandboxSessionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSandboxSessionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSandboxSessionsRequest setServiceEndpointId(String serviceEndpointId) {
        this.serviceEndpointId = serviceEndpointId;
        return this;
    }
    public String getServiceEndpointId() {
        return this.serviceEndpointId;
    }

}
