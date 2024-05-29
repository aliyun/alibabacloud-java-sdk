// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointsRequest extends TeaModel {
    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>分页查询时每页行数。默认值为20，最大值为100。</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>专属网络端点连接的状态。NetworkAccessEndpointType取值为shared时不生效。</p>
     */
    @NameInMap("NetworkAccessEndpointStatus")
    public String networkAccessEndpointStatus;

    /**
     * <p>专属网络端点连接的类型。取值可选范围：1. private - 专属网络端点；2. shared - 共享网络端点</p>
     */
    @NameInMap("NetworkAccessEndpointType")
    public String networkAccessEndpointType;

    /**
     * <p>查询凭证（Token），取值为上一次API调用返回的NextToken参数值。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>专属网络端点连接的Vpc ID。NetworkAccessEndpointType取值为shared时不生效。</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>专属网络端点连接的Vpc所属地域，该地域取值必须在ListNetworkAccessEndpointAvailableRegions接口中返回。NetworkAccessEndpointType取值为shared时不生效。</p>
     */
    @NameInMap("VpcRegionId")
    public String vpcRegionId;

    public static ListNetworkAccessEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkAccessEndpointsRequest self = new ListNetworkAccessEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListNetworkAccessEndpointsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNetworkAccessEndpointsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListNetworkAccessEndpointsRequest setNetworkAccessEndpointStatus(String networkAccessEndpointStatus) {
        this.networkAccessEndpointStatus = networkAccessEndpointStatus;
        return this;
    }
    public String getNetworkAccessEndpointStatus() {
        return this.networkAccessEndpointStatus;
    }

    public ListNetworkAccessEndpointsRequest setNetworkAccessEndpointType(String networkAccessEndpointType) {
        this.networkAccessEndpointType = networkAccessEndpointType;
        return this;
    }
    public String getNetworkAccessEndpointType() {
        return this.networkAccessEndpointType;
    }

    public ListNetworkAccessEndpointsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNetworkAccessEndpointsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListNetworkAccessEndpointsRequest setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

}
