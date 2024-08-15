// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CloseAlarmRequest extends TeaModel {
    /**
     * <p>The ID of the alert.</p>
     * <p>For more information about how to obtain the ID of an alert, see <a href="https://help.aliyun.com/document_detail/2612346.html">ListAlertEvents</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>163</p>
     */
    @NameInMap("AlarmId")
    public Long alarmId;

    /**
     * <p>The ID of the alert handler.</p>
     * 
     * <strong>example:</strong>
     * <p>2048065</p>
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
     * <p>The alert solution.</p>
     */
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
