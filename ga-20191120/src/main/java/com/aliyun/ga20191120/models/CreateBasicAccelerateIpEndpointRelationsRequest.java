// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicAccelerateIpEndpointRelationsRequest extends TeaModel {
    @NameInMap("AccelerateIpEndpointRelations")
    public java.util.List<CreateBasicAccelerateIpEndpointRelationsRequestAccelerateIpEndpointRelations> accelerateIpEndpointRelations;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

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
        @NameInMap("AccelerateIpId")
        public String accelerateIpId;

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
