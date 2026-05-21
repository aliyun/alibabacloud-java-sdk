// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableSupportAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DisableSupportAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSupportAccountRequest self = new DisableSupportAccountRequest();
        return TeaModel.build(map, self);
    }

    public DisableSupportAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
