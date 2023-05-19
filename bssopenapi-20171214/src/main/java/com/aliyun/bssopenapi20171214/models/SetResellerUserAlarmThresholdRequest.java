// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserAlarmThresholdRequest extends TeaModel {
    @NameInMap("AlarmThresholds")
    public String alarmThresholds;

    @NameInMap("AlarmType")
    public String alarmType;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static SetResellerUserAlarmThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserAlarmThresholdRequest self = new SetResellerUserAlarmThresholdRequest();
        return TeaModel.build(map, self);
    }

    public SetResellerUserAlarmThresholdRequest setAlarmThresholds(String alarmThresholds) {
        this.alarmThresholds = alarmThresholds;
        return this;
    }
    public String getAlarmThresholds() {
        return this.alarmThresholds;
    }

    public SetResellerUserAlarmThresholdRequest setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public SetResellerUserAlarmThresholdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
