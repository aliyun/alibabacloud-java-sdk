// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiJupyterShrinkRequest extends TeaModel {
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
    public String environmentVarShrink;

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
    public java.util.List<CreateEaiJupyterShrinkRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6h3rbwbm90urjwa****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateEaiJupyterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiJupyterShrinkRequest self = new CreateEaiJupyterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEaiJupyterShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEaiJupyterShrinkRequest setEaisName(String eaisName) {
        this.eaisName = eaisName;
        return this;
    }
    public String getEaisName() {
        return this.eaisName;
    }

    public CreateEaiJupyterShrinkRequest setEaisType(String eaisType) {
        this.eaisType = eaisType;
        return this;
    }
    public String getEaisType() {
        return this.eaisType;
    }

    public CreateEaiJupyterShrinkRequest setEnvironmentVarShrink(String environmentVarShrink) {
        this.environmentVarShrink = environmentVarShrink;
        return this;
    }
    public String getEnvironmentVarShrink() {
        return this.environmentVarShrink;
    }

    public CreateEaiJupyterShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEaiJupyterShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEaiJupyterShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateEaiJupyterShrinkRequest setTag(java.util.List<CreateEaiJupyterShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEaiJupyterShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateEaiJupyterShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateEaiJupyterShrinkRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateEaiJupyterShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEaiJupyterShrinkRequestTag self = new CreateEaiJupyterShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEaiJupyterShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEaiJupyterShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
