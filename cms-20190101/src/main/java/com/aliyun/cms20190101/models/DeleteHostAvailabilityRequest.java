// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteHostAvailabilityRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Id")
    public java.util.List<Integer> id;

    public static DeleteHostAvailabilityRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostAvailabilityRequest self = new DeleteHostAvailabilityRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHostAvailabilityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteHostAvailabilityRequest setId(java.util.List<Integer> id) {
        this.id = id;
        return this;
    }
    public java.util.List<Integer> getId() {
        return this.id;
    }

}
