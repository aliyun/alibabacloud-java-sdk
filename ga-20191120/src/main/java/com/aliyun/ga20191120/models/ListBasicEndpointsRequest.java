// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicEndpointsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among all requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the endpoint group that you want to query.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the endpoint that you want to query.</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The type of endpoint that you want to query. Valid values:</p>
     * <br>
     * <p>*   **ENI**: elastic network interface (ENI)</p>
     * <p>*   **SLB**: Classic Load Balancer (CLB)</p>
     * <p>*   **ECS**: Elastic Compute Service (ECS)</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **50**. Default value: **10**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Name")
    public String name;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no next query is to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the value to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListBasicEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBasicEndpointsRequest self = new ListBasicEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListBasicEndpointsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListBasicEndpointsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public ListBasicEndpointsRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListBasicEndpointsRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public ListBasicEndpointsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBasicEndpointsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListBasicEndpointsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBasicEndpointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
