// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ZoneInfo extends TeaModel {
    @NameInMap("status")
    public String status;

    @NameInMap("zoneId")
    public String zoneId;

    public static ZoneInfo build(java.util.Map<String, ?> map) throws Exception {
        ZoneInfo self = new ZoneInfo();
        return TeaModel.build(map, self);
    }

    public ZoneInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ZoneInfo setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
