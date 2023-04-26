// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetErRequest extends TeaModel {
    @NameInMap("ErId")
    public String erId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetErRequest build(java.util.Map<String, ?> map) throws Exception {
        GetErRequest self = new GetErRequest();
        return TeaModel.build(map, self);
    }

    public GetErRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public GetErRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
