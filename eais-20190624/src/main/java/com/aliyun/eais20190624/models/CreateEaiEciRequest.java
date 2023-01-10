// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiEciRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EaisName")
    public String eaisName;

    @NameInMap("EaisType")
    public String eaisType;

    @NameInMap("Eci")
    public CreateEaiEciRequestEci eci;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateEaiEciRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiEciRequest self = new CreateEaiEciRequest();
        return TeaModel.build(map, self);
    }

    public CreateEaiEciRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEaiEciRequest setEaisName(String eaisName) {
        this.eaisName = eaisName;
        return this;
    }
    public String getEaisName() {
        return this.eaisName;
    }

    public CreateEaiEciRequest setEaisType(String eaisType) {
        this.eaisType = eaisType;
        return this;
    }
    public String getEaisType() {
        return this.eaisType;
    }

    public CreateEaiEciRequest setEci(CreateEaiEciRequestEci eci) {
        this.eci = eci;
        return this;
    }
    public CreateEaiEciRequestEci getEci() {
        return this.eci;
    }

    public CreateEaiEciRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEaiEciRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEaiEciRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateEaiEciRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateEaiEciRequestEciContainer extends TeaModel {
        @NameInMap("Arg")
        public String arg;

        @NameInMap("Command")
        public String command;

        @NameInMap("Image")
        public String image;

        @NameInMap("Name")
        public String name;

        @NameInMap("Volumes")
        public String volumes;

        public static CreateEaiEciRequestEciContainer build(java.util.Map<String, ?> map) throws Exception {
            CreateEaiEciRequestEciContainer self = new CreateEaiEciRequestEciContainer();
            return TeaModel.build(map, self);
        }

        public CreateEaiEciRequestEciContainer setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public CreateEaiEciRequestEciContainer setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public CreateEaiEciRequestEciContainer setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateEaiEciRequestEciContainer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEaiEciRequestEciContainer setVolumes(String volumes) {
            this.volumes = volumes;
            return this;
        }
        public String getVolumes() {
            return this.volumes;
        }

    }

    public static class CreateEaiEciRequestEci extends TeaModel {
        @NameInMap("Container")
        public CreateEaiEciRequestEciContainer container;

        @NameInMap("EipId")
        public String eipId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Volume")
        public String volume;

        public static CreateEaiEciRequestEci build(java.util.Map<String, ?> map) throws Exception {
            CreateEaiEciRequestEci self = new CreateEaiEciRequestEci();
            return TeaModel.build(map, self);
        }

        public CreateEaiEciRequestEci setContainer(CreateEaiEciRequestEciContainer container) {
            this.container = container;
            return this;
        }
        public CreateEaiEciRequestEciContainer getContainer() {
            return this.container;
        }

        public CreateEaiEciRequestEci setEipId(String eipId) {
            this.eipId = eipId;
            return this;
        }
        public String getEipId() {
            return this.eipId;
        }

        public CreateEaiEciRequestEci setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEaiEciRequestEci setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEaiEciRequestEci setVolume(String volume) {
            this.volume = volume;
            return this;
        }
        public String getVolume() {
            return this.volume;
        }

    }

}
