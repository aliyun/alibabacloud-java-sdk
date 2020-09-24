// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserAlarmThresholdRequest extends TeaModel {
    @NameInMap("AlarmType")
    @Validation(required = true)
    public String alarmType;

    @NameInMap("AlarmThresholds")
    public String alarmThresholds;

    public static SetResellerUserAlarmThresholdRequest build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserAlarmThresholdRequest self = new SetResellerUserAlarmThresholdRequest();
        return TeaModel.build(map, self);
    }

    public SetResellerUserAlarmThresholdRequest setAlarmType(String alarmType) {
        this.alarmType = alarmType;
        return this;
    }
    public String getAlarmType() {
        return this.alarmType;
    }

    public SetResellerUserAlarmThresholdRequest setAlarmThresholds(String alarmThresholds) {
        this.alarmThresholds = alarmThresholds;
        return this;
    }
    public String getAlarmThresholds() {
        return this.alarmThresholds;
    }

}
