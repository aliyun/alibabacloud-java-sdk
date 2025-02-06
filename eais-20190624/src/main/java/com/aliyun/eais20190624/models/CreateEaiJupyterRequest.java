// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiJupyterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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

    @NameInMap("EnvironmentVar")
    public java.util.List<CreateEaiJupyterRequestEnvironmentVar> environmentVar;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
    public java.util.List<CreateEaiJupyterRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6h3rbwbm90urjwa****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateEaiJupyterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiJupyterRequest self = new CreateEaiJupyterRequest();
        return TeaModel.build(map, self);
    }

    public CreateEaiJupyterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEaiJupyterRequest setEaisName(String eaisName) {
        this.eaisName = eaisName;
        return this;
    }
    public String getEaisName() {
        return this.eaisName;
    }

    public CreateEaiJupyterRequest setEaisType(String eaisType) {
        this.eaisType = eaisType;
        return this;
    }
    public String getEaisType() {
        return this.eaisType;
    }

    public CreateEaiJupyterRequest setEnvironmentVar(java.util.List<CreateEaiJupyterRequestEnvironmentVar> environmentVar) {
        this.environmentVar = environmentVar;
        return this;
    }
    public java.util.List<CreateEaiJupyterRequestEnvironmentVar> getEnvironmentVar() {
        return this.environmentVar;
    }

    public CreateEaiJupyterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEaiJupyterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEaiJupyterRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateEaiJupyterRequest setTag(java.util.List<CreateEaiJupyterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEaiJupyterRequestTag> getTag() {
        return this.tag;
    }

    public CreateEaiJupyterRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateEaiJupyterRequestEnvironmentVar extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MY_USER_NAME</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEaiJupyterRequestEnvironmentVar build(java.util.Map<String, ?> map) throws Exception {
            CreateEaiJupyterRequestEnvironmentVar self = new CreateEaiJupyterRequestEnvironmentVar();
            return TeaModel.build(map, self);
        }

        public CreateEaiJupyterRequestEnvironmentVar setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEaiJupyterRequestEnvironmentVar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateEaiJupyterRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateEaiJupyterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEaiJupyterRequestTag self = new CreateEaiJupyterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEaiJupyterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEaiJupyterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
