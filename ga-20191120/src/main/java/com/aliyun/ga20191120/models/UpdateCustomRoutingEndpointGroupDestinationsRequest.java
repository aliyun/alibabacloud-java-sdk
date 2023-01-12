// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateCustomRoutingEndpointGroupDestinationsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DestinationConfigurations")
    public java.util.List<UpdateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations> destinationConfigurations;

    /**
     * <p>Specifies whether to only precheck the request. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request without performing the operation. The system checks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the endpoint group.</p>
     */
    @NameInMap("EndpointGroupId")
    public String endpointGroupId;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
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
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <p>The start port of the backend service port range of the endpoint group.</p>
         * <br>
         * <p>Valid values: **1** to **65499**. The **FromPort** value must be smaller than or equal to the **ToPort** value.</p>
         * <br>
         * <p>You can specify up to 20 start ports of backend service port ranges in each request.</p>
         */
        @NameInMap("FromPort")
        public Integer fromPort;

        @NameInMap("Protocols")
        public java.util.List<String> protocols;

        /**
         * <p>The end port of the backend service port range of the endpoint group.</p>
         * <br>
         * <p>Valid values: **1** to **65499**. The **FromPort** value must be smaller than or equal to the **ToPort** value.</p>
         * <br>
         * <p>You can specify up to 20 end ports of backend service port ranges in each request.</p>
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
