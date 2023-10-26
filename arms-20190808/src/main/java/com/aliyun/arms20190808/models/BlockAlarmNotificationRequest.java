// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class BlockAlarmNotificationRequest extends TeaModel {
    @NameInMap("AlarmId")
    public Long alarmId;

    @NameInMap("HandlerId")
    public Long handlerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Timeout")
    public Long timeout;

    public static BlockAlarmNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        BlockAlarmNotificationRequest self = new BlockAlarmNotificationRequest();
        return TeaModel.build(map, self);
    }

    public BlockAlarmNotificationRequest setAlarmId(Long alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public Long getAlarmId() {
        return this.alarmId;
    }

    public BlockAlarmNotificationRequest setHandlerId(Long handlerId) {
        this.handlerId = handlerId;
        return this;
    }
    public Long getHandlerId() {
        return this.handlerId;
    }

    public BlockAlarmNotificationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BlockAlarmNotificationRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
