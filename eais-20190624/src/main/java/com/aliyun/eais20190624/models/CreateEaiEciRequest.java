// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiEciRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>eais-test01</p>
     */
    @NameInMap("EaisName")
    public String eaisName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eais.ei-a6.2xlarge</p>
     */
    @NameInMap("EaisType")
    public String eaisType;

    @NameInMap("Eci")
    public CreateEaiEciRequestEci eci;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmvpuy4a5****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-uf66jeqopgqa9hdn****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("Tag")
    public java.util.List<CreateEaiEciRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6h3rbwbm90urjwa****</p>
     */
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

    public CreateEaiEciRequest setTag(java.util.List<CreateEaiEciRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEaiEciRequestTag> getTag() {
        return this.tag;
    }

    public CreateEaiEciRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateEaiEciRequestEciContainer extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Arg")
        public String arg;

        /**
         * <strong>example:</strong>
         * <p>sleep</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>/mnt/eais=eais,/models=eais/models</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>eip-uf66jeqopgqa9hdn****</p>
         */
        @NameInMap("EipId")
        public String eipId;

        /**
         * <strong>example:</strong>
         * <p>test-nginx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ecs.c5.xlarge</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>00c7****-rivj.cn-hangzhou.extreme.nas.aliyuncs.com:/share</p>
         */
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

    public static class CreateEaiEciRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateEaiEciRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEaiEciRequestTag self = new CreateEaiEciRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEaiEciRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEaiEciRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
