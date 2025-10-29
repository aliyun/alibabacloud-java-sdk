// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TurnOffZoneRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("zone")
    public String zone;

    public static TurnOffZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        TurnOffZoneRequest self = new TurnOffZoneRequest();
        return TeaModel.build(map, self);
    }

    public TurnOffZoneRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
