// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ListServiceEndpointsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MATRIX</p>
     */
    @NameInMap("Component")
    public String component;

    /**
     * <strong>example:</strong>
     * <p>CUSTOM</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams-cn-xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>matrix-service</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

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
