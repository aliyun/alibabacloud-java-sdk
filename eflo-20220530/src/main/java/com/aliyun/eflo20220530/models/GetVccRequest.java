// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VccId")
    public String vccId;

    public static GetVccRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVccRequest self = new GetVccRequest();
        return TeaModel.build(map, self);
    }

    public GetVccRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetVccRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

}
