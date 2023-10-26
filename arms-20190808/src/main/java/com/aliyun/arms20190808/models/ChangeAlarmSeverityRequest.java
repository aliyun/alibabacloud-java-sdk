// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ChangeAlarmSeverityRequest extends TeaModel {
    @NameInMap("AlarmId")
    public Long alarmId;

    @NameInMap("HandlerId")
    public Long handlerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Severity")
    public String severity;

    public static ChangeAlarmSeverityRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAlarmSeverityRequest self = new ChangeAlarmSeverityRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAlarmSeverityRequest setAlarmId(Long alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public Long getAlarmId() {
        return this.alarmId;
    }

    public ChangeAlarmSeverityRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public ChangeAlarmSeverityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeAlarmSeverityRequest setSeverity(String severity) {
        this.severity = severity;
        return this;
    }
    public String getSeverity() {
        return this.severity;
    }

}
