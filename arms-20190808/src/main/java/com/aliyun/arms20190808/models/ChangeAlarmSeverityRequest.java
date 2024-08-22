// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ChangeAlarmSeverityRequest extends TeaModel {
    /**
     * <p>The ID of the alert.</p>
     * <p>For more information about how to obtain the ID of an alert, see <a href="https://help.aliyun.com/document_detail/2612346.html">ListAlertEvents</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>155</p>
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

    /**
     * <p>The severity level of the alert. Valid values: P1, P2, P3, and P4. P4 indicates the lowest severity, whereas P1 indicates the highest severity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>P1</p>
     */
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
