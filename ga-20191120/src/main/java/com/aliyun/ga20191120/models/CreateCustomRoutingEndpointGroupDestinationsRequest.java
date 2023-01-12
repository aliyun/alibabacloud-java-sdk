// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointGroupDestinationsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DestinationConfigurations")
    public java.util.List<CreateCustomRoutingEndpointGroupDestinationsRequestDestinationConfigurations> destinationConfigurations;

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
