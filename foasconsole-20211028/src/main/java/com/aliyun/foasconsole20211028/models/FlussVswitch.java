// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class FlussVswitch extends TeaModel {
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    @NameInMap("ZoneId")
    public String zoneId;

    public static FlussVswitch build(java.util.Map<String, ?> map) throws Exception {
        FlussVswitch self = new FlussVswitch();
        return TeaModel.build(map, self);
    }

    public FlussVswitch setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public FlussVswitch setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
