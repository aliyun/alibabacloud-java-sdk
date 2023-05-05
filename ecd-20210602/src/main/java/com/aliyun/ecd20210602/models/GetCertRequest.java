// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetCertRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetCertRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCertRequest self = new GetCertRequest();
        return TeaModel.build(map, self);
    }

    public GetCertRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public GetCertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
