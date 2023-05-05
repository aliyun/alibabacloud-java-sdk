// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DeleteTenantAppRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteTenantAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantAppRequest self = new DeleteTenantAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTenantAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteTenantAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
