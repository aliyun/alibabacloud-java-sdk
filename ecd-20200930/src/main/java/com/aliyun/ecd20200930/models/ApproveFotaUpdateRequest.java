// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApproveFotaUpdateRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("RegionId")
    public String regionId;

    public static ApproveFotaUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveFotaUpdateRequest self = new ApproveFotaUpdateRequest();
        return TeaModel.build(map, self);
    }

    public ApproveFotaUpdateRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public ApproveFotaUpdateRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ApproveFotaUpdateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
