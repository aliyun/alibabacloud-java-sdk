// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RollbackSuspEventQuaraFileRequest extends TeaModel {
    // The ID of the cloud desktop.
    @NameInMap("DesktopId")
    public String desktopId;

    // The ID of the quarantined file.
    // 
    // You can call the [DescribeSuspEventQuaraFiles](~~217947~~) operation to obtain the ID of the quarantined file.
    @NameInMap("QuaraFieldId")
    public Integer quaraFieldId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static RollbackSuspEventQuaraFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackSuspEventQuaraFileRequest self = new RollbackSuspEventQuaraFileRequest();
        return TeaModel.build(map, self);
    }

    public RollbackSuspEventQuaraFileRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public RollbackSuspEventQuaraFileRequest setQuaraFieldId(Integer quaraFieldId) {
        this.quaraFieldId = quaraFieldId;
        return this;
    }
    public Integer getQuaraFieldId() {
        return this.quaraFieldId;
    }

    public RollbackSuspEventQuaraFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
