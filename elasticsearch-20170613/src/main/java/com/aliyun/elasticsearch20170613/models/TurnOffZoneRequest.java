// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TurnOffZoneRequest extends TeaModel {
    /**
     * <p>Specifies whether to drain traffic from the load balancer. Valid values:</p>
     * <ul>
     * <li>false: Uses the default policy.</li>
     * <li>true: Removes traffic from the load balancer.</li>
     * </ul>
     */
    @NameInMap("hpAlbZoneDrained")
    public Boolean hpAlbZoneDrained;

    /**
     * <p>The zone of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("zone")
    public String zone;

    public static TurnOffZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        TurnOffZoneRequest self = new TurnOffZoneRequest();
        return TeaModel.build(map, self);
    }

    public TurnOffZoneRequest setHpAlbZoneDrained(Boolean hpAlbZoneDrained) {
        this.hpAlbZoneDrained = hpAlbZoneDrained;
        return this;
    }
    public Boolean getHpAlbZoneDrained() {
        return this.hpAlbZoneDrained;
    }

    public TurnOffZoneRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
