// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointGroupDestinationsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The mapping configurations of the endpoint group.</p>
     * <p>Specify the service port ranges and protocol types of the backend services for the endpoint group. The specified information is mapped to the associated listener port ranges.</p>
     * <p>You can specify up to 20 port ranges and protocol types in a single invoke of this operation.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DestinationConfigurations")
    public java.util.List<CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations> destinationConfigurations;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business limitations without actually creating the mapping configurations create an endpoint group. If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the mapping configurations create an endpoint group are created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The endpoint group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epg-bp14sz7ftcwwjgrdm****</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The region ID of the Alibaba Cloud Global Accelerator (GA) instance. Set the value to <strong>ap-southeast-1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateCustomRoutingEndpointGroupDestinationsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoutingEndpointGroupDestinationsRequest self = new CreateCustomRoutingEndpointGroupDestinationsRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoutingEndpointGroupDestinationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCustomRoutingEndpointGroupDestinationsRequest setDestinationConfigurations(java.util.List<CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations> destinationConfigurations) {
        this.destinationConfigurations = destinationConfigurations;
        return this;
    }
    public java.util.List<CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations> getDestinationConfigurations() {
        return this.destinationConfigurations;
    }

    public CreateCustomRoutingEndpointGroupDestinationsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateCustomRoutingEndpointGroupDestinationsRequest setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    public CreateCustomRoutingEndpointGroupDestinationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations extends TeaModel {
        /**
         * <p>The start port of the backend service port range for the endpoint group.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be less than or equal to the value of <strong>ToPort</strong>.</p>
         * <p>You can specify up to 20 start ports in a single request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        /**
         * <p>The protocol types of the backend services for the endpoint group. Valid values:</p>
         * <ul>
         * <li><p><strong>TCP</strong>: TCP protocol.</p>
         * </li>
         * <li><p><strong>UDP</strong>: UDP protocol.</p>
         * </li>
         * <li><p><strong>TCP,UDP</strong>: TCP and UDP protocols.</p>
         * </li>
         * </ul>
         * <p>The Terms of Service apply to the selected protocols.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The end port of the backend service port range for the endpoint group.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65499</strong>. The value of <strong>FromPort</strong> must be less than or equal to the value of <strong>ToPort</strong>.</p>
         * <p>You can specify up to 20 end ports in a single request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ToPort")
        public Integer toPort;

        public static CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations self = new CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations();
            return TeaModel.build(map, self);
        }

        public CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations setFromPort(Integer fromPort) {
            this.fromPort = fromPort;
            return this;
        }
        public Integer getFromPort() {
            return this.fromPort;
        }

        public CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations setProtocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<String> getProtocols() {
            return this.protocols;
        }

        public CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations setToPort(Integer toPort) {
            this.toPort = toPort;
            return this;
        }
        public Integer getToPort() {
            return this.toPort;
        }

    }

}
