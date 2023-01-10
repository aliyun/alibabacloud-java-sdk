// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiEciShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("EaisName")
    public String eaisName;

    @NameInMap("EaisType")
    public String eaisType;

    @NameInMap("Eci")
    public String eciShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

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

    public CreateEaiEciShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
