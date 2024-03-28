// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAccelerateIpEndpointRelationsRequest extends TeaModel {
    /**
     * <p>A list of accelerated IP addresses and the endpoints with which the accelerated IP addresses are associated.</p>
     */
    @NameInMap("AccelerateIpEndpointRelations")
    public java.util.List<CreateBasicAccelerateIpEndpointRelationsRequestAccelerateIpEndpointRelations> accelerateIpEndpointRelations;

    /**
     * <p>The ID of the basic GA instance.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateBasicAccelerateIpEndpointRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicAccelerateIpEndpointRelationsRequest self = new CreateBasicAccelerateIpEndpointRelationsRequest();
        return TeaModel.build(map, self);
    }

    public CreateBasicAccelerateIpEndpointRelationsRequest setAccelerateIpEndpointRelations(java.util.List<CreateBasicAccelerateIpEndpointRelationsRequestAccelerateIpEndpointRelations> accelerateIpEndpointRelations) {
        this.accelerateIpEndpointRelations = accelerateIpEndpointRelations;
        return this;
    }
    public java.util.List<CreateBasicAccelerateIpEndpointRelationsRequestAccelerateIpEndpointRelations> getAccelerateIpEndpointRelations() {
        return this.accelerateIpEndpointRelations;
    }

    public CreateBasicAccelerateIpEndpointRelationsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateBasicAccelerateIpEndpointRelationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBasicAccelerateIpEndpointRelationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateBasicAccelerateIpEndpointRelationsRequestAccelerateIpEndpointRelations extends TeaModel {
        /**
         * <p>The IDs of the accelerated IP addresses.</p>
         * <br>
         * <p>You can call the [ListBasicAccelerateIps](~~2253393~~) operation to query the IDs of the accelerated IP addresses.</p>
         * <br>
         * <p>You can specify up to 20 IP address IDs.</p>
         */
        @NameInMap("AccelerateIpId")
        public String accelerateIpId;

        /**
         * <p>The IDs of the endpoints.</p>
         * <br>
         * <p>You can call the [ListBasicEndpoints](~~2253406~~) to query the IDs of the endpoints.</p>
         * <br>
         * <p>You can specify up to 20 endpoint IDs.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        public static CreateBasicAccelerateIpEndpointRelationsRequestAccelerateIpEndpointRelations build(java.util.Map<String, ?> map) throws Exception {
            CreateBasicAccelerateIpEndpointRelationsRequestAccelerateIpEndpointRelations self = new CreateBasicAccelerateIpEndpointRelationsRequestAccelerateIpEndpointRelations();
            return TeaModel.build(map, self);
        }

        public CreateBasicAccelerateIpEndpointRelationsRequestAccelerateIpEndpointRelations setAccelerateIpId(String accelerateIpId) {
            this.accelerateIpId = accelerateIpId;
            return this;
        }
        public String getAccelerateIpId() {
            return this.accelerateIpId;
        }

        public CreateBasicAccelerateIpEndpointRelationsRequestAccelerateIpEndpointRelations setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

    }

}
