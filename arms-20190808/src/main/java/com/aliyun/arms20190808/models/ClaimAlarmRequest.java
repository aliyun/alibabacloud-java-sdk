// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ClaimAlarmRequest extends TeaModel {
    /**
     * <p>The ID of the alert.</p>
     * <p>For more information about how to obtain the ID of an alert, see <a href="https://help.aliyun.com/document_detail/2612346.html">ListAlertEvents</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("AlarmId")
    public Long alarmId;

    /**
     * <p>The ID of the handler.</p>
     * 
     * <strong>example:</strong>
     * <p>2046076</p>
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
