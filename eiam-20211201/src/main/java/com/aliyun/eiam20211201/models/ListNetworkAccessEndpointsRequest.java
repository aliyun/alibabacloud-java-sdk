// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListNetworkAccessEndpointsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The status of the network endpoint. Valid values:</p>
     * <ul>
     * <li><p>pending: The endpoint is pending initialization.</p>
     * </li>
     * <li><p>creating: The endpoint is being created.</p>
     * </li>
     * <li><p>running: The endpoint is running.</p>
     * </li>
     * <li><p>deleting: The endpoint is being deleted.</p>
     * </li>
     * </ul>
     * <p>This parameter does not take effect when NetworkAccessEndpointType is set to shared.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("NetworkAccessEndpointStatus")
    public String networkAccessEndpointStatus;

    /**
     * <p>The type of the network endpoint. Valid values:</p>
     * <ul>
     * <li><p>shared: a shared network endpoint.</p>
     * </li>
     * <li><p>private: a private network endpoint.</p>
     * </li>
     * </ul>
     * <p>The default value is private.</p>
     * 
     * <strong>example:</strong>
     * <p>private</p>
     */
    @NameInMap("NetworkAccessEndpointType")
    public String networkAccessEndpointType;

    /**
     * <p>The token used for the next query. Set this parameter to the NextToken value returned from the previous API call. Leave this parameter empty for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the VPC to which the private network endpoint is connected. This parameter does not take effect when NetworkAccessEndpointType is set to shared.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-examplexxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The region ID of the VPC to which the private network endpoint is connected. The value of this parameter must be a region returned by the ListNetworkAccessEndpointAvailableRegions operation. This parameter does not take effect when NetworkAccessEndpointType is set to shared.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
