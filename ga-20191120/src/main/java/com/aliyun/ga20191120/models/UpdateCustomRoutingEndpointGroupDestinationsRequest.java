// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointGroupDestinationsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must ensure that it is unique among all requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The value of <strong>RequestId</strong> for each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The mapping configurations of endpoint group.</p>
     * <p>You must specify the backend service port range and protocol of the endpoint group. The specified information is used to map the port range of the associated listener.</p>
     * <p>You can specify at most 20 mapping configurations, which include port ranges and protocol types.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationConfigurations")
    public java.util.List<UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations> destinationConfigurations;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the endpoint group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp1dmlohjjz4kqaun****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateCustomRoutingEndpointGroupDestinationsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomRoutingEndpointGroupDestinationsRequest self = new UpdateCustomRoutingEndpointGroupDestinationsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomRoutingEndpointGroupDestinationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCustomRoutingEndpointGroupDestinationsRequest setDestinationConfigurations(java.util.List<UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations> destinationConfigurations) {
        this.destinationConfigurations = destinationConfigurations;
        return this;
    }
    public java.util.List<UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations> getDestinationConfigurations() {
        return this.destinationConfigurations;
    }

    public UpdateCustomRoutingEndpointGroupDestinationsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateCustomRoutingEndpointGroupDestinationsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public UpdateCustomRoutingEndpointGroupDestinationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations extends TeaModel {
        /**
         * <p>The ID of the mapping configuration of the endpoint group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dst-abc123****</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <p>The start port of the backend service port range of the endpoint group.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The <strong>FromPort</strong> value must be smaller than or equal to the <strong>ToPort</strong> value.</p>
         * <p>You can specify up to 20 start ports in each request.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The backend service protocol of the endpoint group. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: TCP</li>
         * <li><strong>udp</strong>: UDP</li>
         * <li><strong>tcp,udp</strong>: TCP and UDP</li>
         * </ul>
         * <p>You can specify up to four backend service protocols in each configuration.</p>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The end port of the backend service port range of the endpoint group.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The <strong>FromPort</strong> value must be smaller than or equal to the <strong>ToPort</strong> value.</p>
         * <p>You can specify up to 20 end ports in each request.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations build(java.util.Map<String, ?> map) throws Exception {
            UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations self = new UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations();
            return TeaModel.build(map, self);
        }

        public UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations setDestinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public String getDestinationId() {
            return this.destinationId;
        }

        public UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

}
