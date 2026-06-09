// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TurnOnZoneRequest extends TeaModel {
    @NameInMap("hpAlbZoneDrained")
    public Boolean hpAlbZoneDrained;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("zone")
    public String zone;

    public static TurnOnZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        TurnOnZoneRequest self = new TurnOnZoneRequest();
        return TeaModel.build(map, self);
    }

    public TurnOnZoneRequest setHpAlbZoneDrained(Boolean hpAlbZoneDrained) {
        this.hpAlbZoneDrained = hpAlbZoneDrained;
        return this;
    }
    public Boolean getHpAlbZoneDrained() {
        return this.hpAlbZoneDrained;
    }

    public TurnOnZoneRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
