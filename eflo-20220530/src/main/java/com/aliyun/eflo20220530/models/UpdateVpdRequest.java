// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateVpdRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpdId")
    public String vpdId;

    @NameInMap("VpdName")
    public String vpdName;

    public static UpdateVpdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpdRequest self = new UpdateVpdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVpdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVpdRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public UpdateVpdRequest setVpdName(String vpdName) {
        this.vpdName = vpdName;
        return this;
    }
    public String getVpdName() {
        return this.vpdName;
    }

}
