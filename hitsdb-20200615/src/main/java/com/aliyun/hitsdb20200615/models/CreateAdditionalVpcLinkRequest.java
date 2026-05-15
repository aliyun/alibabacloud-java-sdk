// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class CreateAdditionalVpcLinkRequest extends TeaModel {
    @NameInMap("AdditionalAliBid")
    public String additionalAliBid;

    @NameInMap("AdditionalAliUid")
    public String additionalAliUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AdditionalVpcId")
    public String additionalVpcId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AdditionalVswitchId")
    public String additionalVswitchId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateAdditionalVpcLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAdditionalVpcLinkRequest self = new CreateAdditionalVpcLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAdditionalVpcLinkRequest setAdditionalAliBid(String additionalAliBid) {
        this.additionalAliBid = additionalAliBid;
        return this;
    }
    public String getAdditionalAliBid() {
        return this.additionalAliBid;
    }

    public CreateAdditionalVpcLinkRequest setAdditionalAliUid(String additionalAliUid) {
        this.additionalAliUid = additionalAliUid;
        return this;
    }
    public String getAdditionalAliUid() {
        return this.additionalAliUid;
    }

    public CreateAdditionalVpcLinkRequest setAdditionalVpcId(String additionalVpcId) {
        this.additionalVpcId = additionalVpcId;
        return this;
    }
    public String getAdditionalVpcId() {
        return this.additionalVpcId;
    }

    public CreateAdditionalVpcLinkRequest setAdditionalVswitchId(String additionalVswitchId) {
        this.additionalVswitchId = additionalVswitchId;
        return this;
    }
    public String getAdditionalVswitchId() {
        return this.additionalVswitchId;
    }

    public CreateAdditionalVpcLinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAdditionalVpcLinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAdditionalVpcLinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
