// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateInstanceInternetAddressRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateInstanceInternetAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceInternetAddressRequest self = new CreateInstanceInternetAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceInternetAddressRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public CreateInstanceInternetAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
