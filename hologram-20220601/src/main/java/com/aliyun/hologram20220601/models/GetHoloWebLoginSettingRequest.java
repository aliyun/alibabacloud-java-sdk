// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetHoloWebLoginSettingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetHoloWebLoginSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoloWebLoginSettingRequest self = new GetHoloWebLoginSettingRequest();
        return TeaModel.build(map, self);
    }

    public GetHoloWebLoginSettingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
