// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CloseAlarmRequest extends TeaModel {
    @NameInMap("AlarmId")
    public Long alarmId;

    @NameInMap("HandlerId")
    public Long handlerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Solution")
    public String solution;

    public static CloseAlarmRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseAlarmRequest self = new CloseAlarmRequest();
        return TeaModel.build(map, self);
    }

    public CloseAlarmRequest setAlarmId(Long alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public Long getAlarmId() {
        return this.alarmId;
    }

    public CloseAlarmRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public CloseAlarmRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CloseAlarmRequest setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

}
