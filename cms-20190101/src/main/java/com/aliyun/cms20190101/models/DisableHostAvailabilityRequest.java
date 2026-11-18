// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableHostAvailabilityRequest extends TeaModel {
    /**
     * <p>The ID of the availability monitoring task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public java.util.List<Long> id;

    @NameInMap("RegionId")
    public String regionId;

    public static DisableHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableHostAvailabilityRequest self = new DisableHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public DisableHostAvailabilityRequest setId(java.util.List<Long> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Long> getId() {
        return this.id;
    }

    public DisableHostAvailabilityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
