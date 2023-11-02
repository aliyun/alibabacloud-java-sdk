// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListDeliveryRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryRequest self = new ListDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public ListDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
