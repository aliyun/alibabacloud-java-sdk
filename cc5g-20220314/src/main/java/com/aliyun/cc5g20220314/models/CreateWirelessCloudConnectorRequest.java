// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateWirelessCloudConnectorRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ISP")
    public String ISP;

    @NameInMap("Name")
    public String name;

    @NameInMap("NetLinks")
    public java.util.List<CreateWirelessCloudConnectorRequestNetLinks> netLinks;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UseCase")
    public String useCase;

    public static CreateWirelessCloudConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWirelessCloudConnectorRequest self = new CreateWirelessCloudConnectorRequest();
        return TeaModel.build(map, self);
    }

    public CreateWirelessCloudConnectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWirelessCloudConnectorRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWirelessCloudConnectorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateWirelessCloudConnectorRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public CreateWirelessCloudConnectorRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWirelessCloudConnectorRequest setNetLinks(java.util.List<CreateWirelessCloudConnectorRequestNetLinks> netLinks) {
        this.netLinks = netLinks;
        return this;
    }
    public java.util.List<CreateWirelessCloudConnectorRequestNetLinks> getNetLinks() {
        return this.netLinks;
    }

    public CreateWirelessCloudConnectorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWirelessCloudConnectorRequest setUseCase(String useCase) {
        this.useCase = useCase;
        return this;
    }
    public String getUseCase() {
        return this.useCase;
    }

    public static class CreateWirelessCloudConnectorRequestNetLinks extends TeaModel {
        @NameInMap("APN")
        public String APN;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VSwitchs")
        public java.util.List<String> vSwitchs;

        @NameInMap("VpcId")
        public String vpcId;

        public static CreateWirelessCloudConnectorRequestNetLinks build(java.util.Map<String, ?> map) throws Exception {
            CreateWirelessCloudConnectorRequestNetLinks self = new CreateWirelessCloudConnectorRequestNetLinks();
            return TeaModel.build(map, self);
        }

        public CreateWirelessCloudConnectorRequestNetLinks setAPN(String APN) {
            this.APN = APN;
            return this;
        }
        public String getAPN() {
            return this.APN;
        }

        public CreateWirelessCloudConnectorRequestNetLinks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateWirelessCloudConnectorRequestNetLinks setVSwitchs(java.util.List<String> vSwitchs) {
            this.vSwitchs = vSwitchs;
            return this;
        }
        public java.util.List<String> getVSwitchs() {
            return this.vSwitchs;
        }

        public CreateWirelessCloudConnectorRequestNetLinks setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
