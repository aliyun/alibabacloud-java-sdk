// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDesktopUsersRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DesktopId")
    @Validation(required = true)
    public String desktopId;

    public static GetDesktopUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDesktopUsersRequest self = new GetDesktopUsersRequest();
        return TeaModel.build(map, self);
    }

    public GetDesktopUsersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDesktopUsersRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

}
