// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ListFollowerInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListFollowerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFollowerInstancesRequest self = new ListFollowerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListFollowerInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
