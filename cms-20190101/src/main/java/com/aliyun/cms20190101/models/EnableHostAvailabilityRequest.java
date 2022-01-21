// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableHostAvailabilityRequest extends TeaModel {
    @NameInMap("Id")
    public java.util.List<Long> id;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableHostAvailabilityRequest self = new EnableHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public EnableHostAvailabilityRequest setId(java.util.List<Long> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Long> getId() {
        return this.id;
    }

    public EnableHostAvailabilityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
