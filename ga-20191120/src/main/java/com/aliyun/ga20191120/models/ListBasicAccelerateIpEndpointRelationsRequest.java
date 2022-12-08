// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBasicAccelerateIpEndpointRelationsRequest extends TeaModel {
    @NameInMap("AccelerateIpId")
    public String accelerateIpId;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    public static ListBasicAccelerateIpEndpointRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBasicAccelerateIpEndpointRelationsRequest self = new ListBasicAccelerateIpEndpointRelationsRequest();
        return TeaModel.build(map, self);
    }

    public ListBasicAccelerateIpEndpointRelationsRequest setAccelerateIpId(String accelerateIpId) {
        this.accelerateIpId = accelerateIpId;
        return this;
    }
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    public ListBasicAccelerateIpEndpointRelationsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public ListBasicAccelerateIpEndpointRelationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListBasicAccelerateIpEndpointRelationsRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public ListBasicAccelerateIpEndpointRelationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListBasicAccelerateIpEndpointRelationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListBasicAccelerateIpEndpointRelationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
