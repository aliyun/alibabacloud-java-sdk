// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDesktopsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    public static DeleteDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopsRequest self = new DeleteDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

}
