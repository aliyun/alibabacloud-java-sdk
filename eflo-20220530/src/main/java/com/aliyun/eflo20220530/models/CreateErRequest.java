// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ErName")
    public String erName;

    @NameInMap("MasterZoneId")
    public String masterZoneId;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateErRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateErRequest self = new CreateErRequest();
        return TeaModel.build(map, self);
    }

    public CreateErRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateErRequest setErName(String erName) {
        this.erName = erName;
        return this;
    }
    public String getErName() {
        return this.erName;
    }

    public CreateErRequest setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public CreateErRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
