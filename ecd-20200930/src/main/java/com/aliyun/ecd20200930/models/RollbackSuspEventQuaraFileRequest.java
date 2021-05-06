// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RollbackSuspEventQuaraFileRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("QuaraFieldId")
    @Validation(required = true)
    public Integer quaraFieldId;

    @NameInMap("DesktopId")
    public String desktopId;

    public static RollbackSuspEventQuaraFileRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackSuspEventQuaraFileRequest self = new RollbackSuspEventQuaraFileRequest();
        return TeaModel.build(map, self);
    }

    public RollbackSuspEventQuaraFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RollbackSuspEventQuaraFileRequest setQuaraFieldId(Integer quaraFieldId) {
        this.quaraFieldId = quaraFieldId;
        return this;
    }
    public Integer getQuaraFieldId() {
        return this.quaraFieldId;
    }

    public RollbackSuspEventQuaraFileRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

}
