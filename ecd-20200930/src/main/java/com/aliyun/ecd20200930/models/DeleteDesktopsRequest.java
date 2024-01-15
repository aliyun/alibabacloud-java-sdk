// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDesktopsRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud desktops that you want to release. You can configure up to 100 desktop IDs.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the region where the cloud desktops to release are located.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopsRequest self = new DeleteDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public DeleteDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
