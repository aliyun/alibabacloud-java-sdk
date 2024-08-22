// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class BlockAlarmNotificationRequest extends TeaModel {
    /**
     * <p>The ID of the alert.</p>
     * <p>For more information about how to obtain the ID of an alert, see <a href="https://help.aliyun.com/document_detail/2612346.html">ListAlertEvents</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>133</p>
     */
    @NameInMap("AlarmId")
    public Long alarmId;

    /**
     * <p>The ID of the alert handler.</p>
     * 
     * <strong>example:</strong>
     * <p>2044049</p>
     */
    @NameInMap("HandlerId")
    public Long handlerId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of seconds that elapse before alert notifications are blocked. Unit: seconds.</p>
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
