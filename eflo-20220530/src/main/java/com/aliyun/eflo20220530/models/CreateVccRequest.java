// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccRequest extends TeaModel {
    @NameInMap("AccessCouldService")
    public Boolean accessCouldService;

    @NameInMap("BgpCidr")
    public String bgpCidr;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VccId")
    public String vccId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpdId")
    public String vpdId;

    public static CreateVccRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVccRequest self = new CreateVccRequest();
        return TeaModel.build(map, self);
    }

    public CreateVccRequest setAccessCouldService(Boolean accessCouldService) {
        this.accessCouldService = accessCouldService;
        return this;
    }
    public Boolean getAccessCouldService() {
        return this.accessCouldService;
    }

    public CreateVccRequest setBgpCidr(String bgpCidr) {
        this.bgpCidr = bgpCidr;
        return this;
    }
    public String getBgpCidr() {
        return this.bgpCidr;
    }

    public CreateVccRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateVccRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVccRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVccRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateVccRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

    public CreateVccRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVccRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

}
