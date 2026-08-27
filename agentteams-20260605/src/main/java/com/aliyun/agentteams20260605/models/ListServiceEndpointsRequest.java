// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListServiceEndpointsRequest extends TeaModel {
    /**
     * <p>The endpoint component. Valid values: ELEMENT, MATRIX, WORKER, and TUNNEL.</p>
     * 
     * <strong>example:</strong>
     * <p>MATRIX</p>
     */
    @NameInMap("Component")
    public String component;

    /**
     * <p>The domain name type. Valid values: BUILTIN and CUSTOM.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The AgentTeams instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams-cn-xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The maximum number of records to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The network type. Valid values: INTRANET and INTERNET.</p>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The pagination token used to retrieve the next page of data.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The service name. Exact match is used.</p>
     * 
     * <strong>example:</strong>
     * <p>matrix-service</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The number of records to skip.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Skip")
    public String skip;

    public static ListServiceEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceEndpointsRequest self = new ListServiceEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceEndpointsRequest setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

    public ListServiceEndpointsRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public ListServiceEndpointsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListServiceEndpointsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceEndpointsRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public ListServiceEndpointsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceEndpointsRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListServiceEndpointsRequest setSkip(String skip) {
        this.skip = skip;
        return this;
    }
    public String getSkip() {
        return this.skip;
    }

}
