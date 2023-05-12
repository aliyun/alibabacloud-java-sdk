// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class HibernateDesktopsRequest extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("RegionId")
    public String regionId;

    public static HibernateDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        HibernateDesktopsRequest self = new HibernateDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public HibernateDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public HibernateDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
