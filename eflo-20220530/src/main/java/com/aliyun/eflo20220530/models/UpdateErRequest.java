// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateErRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ErId")
    public String erId;

    @NameInMap("ErName")
    public String erName;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateErRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateErRequest self = new UpdateErRequest();
        return TeaModel.build(map, self);
    }

    public UpdateErRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateErRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public UpdateErRequest setErName(String erName) {
        this.erName = erName;
        return this;
    }
    public String getErName() {
        return this.erName;
    }

    public UpdateErRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
