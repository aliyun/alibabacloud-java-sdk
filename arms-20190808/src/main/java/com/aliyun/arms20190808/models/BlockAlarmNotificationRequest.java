// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class BlockAlarmNotificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>133</p>
     */
    @NameInMap("AlarmId")
    public Long alarmId;

    /**
     * <strong>example:</strong>
     * <p>2044049</p>
     */
    @NameInMap("HandlerId")
    public Long handlerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
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
