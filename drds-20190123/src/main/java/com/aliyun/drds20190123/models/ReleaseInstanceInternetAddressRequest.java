// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ReleaseInstanceInternetAddressRequest extends TeaModel {
    /**
     * <p>The ID of the DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The region where the instance is located.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ReleaseInstanceInternetAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseInstanceInternetAddressRequest self = new ReleaseInstanceInternetAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseInstanceInternetAddressRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ReleaseInstanceInternetAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
