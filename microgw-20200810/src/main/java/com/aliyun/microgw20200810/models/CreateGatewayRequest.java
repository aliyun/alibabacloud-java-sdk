// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreateGatewayRequest extends TeaModel {
    // GatewayCreationDTO
    @NameInMap("data")
    public CreateGatewayRequestData data;

    public static CreateGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayRequest self = new CreateGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayRequest setData(CreateGatewayRequestData data) {
        this.data = data;
        return this;
    }
    public CreateGatewayRequestData getData() {
        return this.data;
    }

    public static class CreateGatewayRequestData extends TeaModel {
        // autoCreateSlb
        @NameInMap("autoCreateSlb")
        public Boolean autoCreateSlb;

        // basePath
        @NameInMap("basePath")
        public String basePath;

        // edasNamespaceId
        @NameInMap("edasNamespaceId")
        public String edasNamespaceId;

        // gatewayType
        @NameInMap("gatewayType")
        public String gatewayType;

        // name
        @NameInMap("name")
        public String name;

        // podCidr
        @NameInMap("podCidr")
        public String podCidr;

        // region
        @NameInMap("region")
        public String region;

        // regionName
        @NameInMap("regionName")
        public String regionName;

        // replica
        @NameInMap("replica")
        public Long replica;

        // runtimeOn
        @NameInMap("runtimeOn")
        public String runtimeOn;

        // securityGroup
        @NameInMap("securityGroup")
        public String securityGroup;

        // slb
        @NameInMap("slb")
        public String slb;

        // slbSpec
        @NameInMap("slbSpec")
        public String slbSpec;

        // vpc
        @NameInMap("vpc")
        public String vpc;

        // vswitch
        @NameInMap("vswitch")
        public String vswitch;

        // zone
        @NameInMap("zone")
        public String zone;

        public static CreateGatewayRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayRequestData self = new CreateGatewayRequestData();
            return TeaModel.build(map, self);
        }

        public CreateGatewayRequestData setAutoCreateSlb(Boolean autoCreateSlb) {
            this.autoCreateSlb = autoCreateSlb;
            return this;
        }
        public Boolean getAutoCreateSlb() {
            return this.autoCreateSlb;
        }

        public CreateGatewayRequestData setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public CreateGatewayRequestData setEdasNamespaceId(String edasNamespaceId) {
            this.edasNamespaceId = edasNamespaceId;
            return this;
        }
        public String getEdasNamespaceId() {
            return this.edasNamespaceId;
        }

        public CreateGatewayRequestData setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public CreateGatewayRequestData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateGatewayRequestData setPodCidr(String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        public String getPodCidr() {
            return this.podCidr;
        }

        public CreateGatewayRequestData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateGatewayRequestData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public CreateGatewayRequestData setReplica(Long replica) {
            this.replica = replica;
            return this;
        }
        public Long getReplica() {
            return this.replica;
        }

        public CreateGatewayRequestData setRuntimeOn(String runtimeOn) {
            this.runtimeOn = runtimeOn;
            return this;
        }
        public String getRuntimeOn() {
            return this.runtimeOn;
        }

        public CreateGatewayRequestData setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public CreateGatewayRequestData setSlb(String slb) {
            this.slb = slb;
            return this;
        }
        public String getSlb() {
            return this.slb;
        }

        public CreateGatewayRequestData setSlbSpec(String slbSpec) {
            this.slbSpec = slbSpec;
            return this;
        }
        public String getSlbSpec() {
            return this.slbSpec;
        }

        public CreateGatewayRequestData setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public CreateGatewayRequestData setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

        public CreateGatewayRequestData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
