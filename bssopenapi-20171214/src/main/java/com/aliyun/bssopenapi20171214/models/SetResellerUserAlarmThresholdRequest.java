// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserAlarmThresholdRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{\&quot;denominator\&quot;:100,\&quot;numerator\&quot;:30,\&quot;thresholdType\&quot;:1}]</p>
     */
    @NameInMap("AlarmThresholds")
    public String alarmThresholds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>quota_low_balance</p>
     */
    @NameInMap("AlarmType")
    public String alarmType;

    /**
     * <p>This parameter is required.</p>
     */
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
