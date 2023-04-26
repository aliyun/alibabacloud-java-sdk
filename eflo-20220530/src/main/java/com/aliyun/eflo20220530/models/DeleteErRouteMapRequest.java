// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteErRouteMapRequest extends TeaModel {
    @NameInMap("ErId")
    public String erId;

    @NameInMap("ErRouteMapIds")
    public java.util.List<String> erRouteMapIds;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteErRouteMapRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteErRouteMapRequest self = new DeleteErRouteMapRequest();
        return TeaModel.build(map, self);
    }

    public DeleteErRouteMapRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public DeleteErRouteMapRequest setErRouteMapIds(java.util.List<String> erRouteMapIds) {
        this.erRouteMapIds = erRouteMapIds;
        return this;
    }
    public java.util.List<String> getErRouteMapIds() {
        return this.erRouteMapIds;
    }

    public DeleteErRouteMapRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
