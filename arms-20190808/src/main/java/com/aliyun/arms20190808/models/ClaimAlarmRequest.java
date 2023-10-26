// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ClaimAlarmRequest extends TeaModel {
    @NameInMap("AlarmId")
    public Long alarmId;

    @NameInMap("HandlerId")
    public Long handlerId;

    @NameInMap("RegionId")
    public String regionId;

    public static ClaimAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        ClaimAlarmRequest self = new ClaimAlarmRequest();
        return TeaModel.build(map, self);
    }

    public ClaimAlarmRequest setAlarmId(Long alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public Long getAlarmId() {
        return this.alarmId;
    }

    public ClaimAlarmRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public ClaimAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
