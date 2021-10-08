// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class IgnoreAlarmsRequest extends TeaModel {
    @NameInMap("AlarmId")
    public String alarmId;

    public static IgnoreAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreAlarmsRequest self = new IgnoreAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreAlarmsRequest setAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public String getAlarmId() {
        return this.alarmId;
    }

}
