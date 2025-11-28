// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllDeviceGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListAllDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllDeviceGroupRequest self = new ListAllDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListAllDeviceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
