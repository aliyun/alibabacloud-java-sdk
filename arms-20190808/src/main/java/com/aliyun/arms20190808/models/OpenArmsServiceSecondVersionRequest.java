// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class OpenArmsServiceSecondVersionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    public static OpenArmsServiceSecondVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenArmsServiceSecondVersionRequest self = new OpenArmsServiceSecondVersionRequest();
        return TeaModel.build(map, self);
    }

    public OpenArmsServiceSecondVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public OpenArmsServiceSecondVersionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
