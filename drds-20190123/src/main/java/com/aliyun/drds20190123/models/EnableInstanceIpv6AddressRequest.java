// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableInstanceIpv6AddressRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static EnableInstanceIpv6AddressRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceIpv6AddressRequest self = new EnableInstanceIpv6AddressRequest();
        return TeaModel.build(map, self);
    }

    public EnableInstanceIpv6AddressRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public EnableInstanceIpv6AddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
