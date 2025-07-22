// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DissociateIpAddressRequest extends TeaModel {
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

    public static DissociateIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateIpAddressRequest self = new DissociateIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public DissociateIpAddressRequest setEipId(String eipId) {
        this.eipId = eipId;
        return this;
    }
    public String getEipId() {
        return this.eipId;
    }

    public DissociateIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
