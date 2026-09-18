// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateMmsTimerRequest extends TeaModel {
    /**
     * <p>The scheduling type of the scheduled task.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("scheduleType")
    public String scheduleType;

    /**
     * <p>Indicates whether the scheduled task is stopped.</p>
     */
    @NameInMap("stopped")
    public Boolean stopped;

    /**
     * <p>The tables to exclude when type is set to Database.</p>
     */
    @NameInMap("tableBlackList")
    public java.util.List<String> tableBlackList;

    /**
     * <p>The tables to migrate when type is set to Database.</p>
     */
    @NameInMap("tableWhiteList")
    public java.util.List<String> tableWhiteList;

    /**
     * <p>The scheduling time of the scheduled task. If scheduleType is set to Daily, the value is in the HH:MM format. If scheduleType is set to Hourly, the value is in the MM format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-20</p>
     */
    @NameInMap("value")
    public String value;

    public static UpdateMmsTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmsTimerRequest self = new UpdateMmsTimerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMmsTimerRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public UpdateMmsTimerRequest setStopped(Boolean stopped) {
        this.stopped = stopped;
        return this;
    }
    public Boolean getStopped() {
        return this.stopped;
    }

    public UpdateMmsTimerRequest setTableBlackList(java.util.List<String> tableBlackList) {
        this.tableBlackList = tableBlackList;
        return this;
    }
    public java.util.List<String> getTableBlackList() {
        return this.tableBlackList;
    }

    public UpdateMmsTimerRequest setTableWhiteList(java.util.List<String> tableWhiteList) {
        this.tableWhiteList = tableWhiteList;
        return this;
    }
    public java.util.List<String> getTableWhiteList() {
        return this.tableWhiteList;
    }

    public UpdateMmsTimerRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
