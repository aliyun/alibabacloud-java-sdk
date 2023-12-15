// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class GetServicesRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("RegionId")
    public String regionId;

    public static GetServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServicesRequest self = new GetServicesRequest();
        return TeaModel.build(map, self);
    }

    public GetServicesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetServicesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
