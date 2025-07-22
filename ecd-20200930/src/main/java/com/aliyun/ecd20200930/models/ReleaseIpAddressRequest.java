// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ReleaseIpAddressRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EipId")
    public String eipId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ReleaseIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseIpAddressRequest self = new ReleaseIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseIpAddressRequest setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }
    public String getEipId() {
        return this.eipId;
    }

    public ReleaseIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
