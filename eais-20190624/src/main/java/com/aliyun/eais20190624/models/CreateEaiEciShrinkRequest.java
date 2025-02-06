// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiEciShrinkRequest extends TeaModel {
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
    public String eciShrink;

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
    public java.util.List<CreateEaiEciShrinkRequestTag> tag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6h3rbwbm90urjwa****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateEaiEciShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiEciShrinkRequest self = new CreateEaiEciShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEaiEciShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEaiEciShrinkRequest setEaisName(String eaisName) {
        this.eaisName = eaisName;
        return this;
    }
    public String getEaisName() {
        return this.eaisName;
    }

    public CreateEaiEciShrinkRequest setEaisType(String eaisType) {
        this.eaisType = eaisType;
        return this;
    }
    public String getEaisType() {
        return this.eaisType;
    }

    public CreateEaiEciShrinkRequest setEciShrink(String eciShrink) {
        this.eciShrink = eciShrink;
        return this;
    }
    public String getEciShrink() {
        return this.eciShrink;
    }

    public CreateEaiEciShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEaiEciShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEaiEciShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateEaiEciShrinkRequest setTag(java.util.List<CreateEaiEciShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateEaiEciShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateEaiEciShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateEaiEciShrinkRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateEaiEciShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateEaiEciShrinkRequestTag self = new CreateEaiEciShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateEaiEciShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEaiEciShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
