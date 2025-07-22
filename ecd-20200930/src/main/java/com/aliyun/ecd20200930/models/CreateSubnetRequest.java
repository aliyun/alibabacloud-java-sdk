// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSubnetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubnetRequest self = new CreateSubnetRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubnetRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateSubnetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSubnetRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateSubnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSubnetRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
