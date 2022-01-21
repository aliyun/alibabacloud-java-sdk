// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHostAvailabilityRequest extends TeaModel {
    @NameInMap("Id")
    public java.util.List<Long> id;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostAvailabilityRequest self = new DeleteHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHostAvailabilityRequest setId(java.util.List<Long> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Long> getId() {
        return this.id;
    }

    public DeleteHostAvailabilityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
