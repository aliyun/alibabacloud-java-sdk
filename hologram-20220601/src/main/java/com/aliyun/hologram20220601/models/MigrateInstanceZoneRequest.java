// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class MigrateInstanceZoneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("zoneId")
    public String zoneId;

    public static MigrateInstanceZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateInstanceZoneRequest self = new MigrateInstanceZoneRequest();
        return TeaModel.build(map, self);
    }

    public MigrateInstanceZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
