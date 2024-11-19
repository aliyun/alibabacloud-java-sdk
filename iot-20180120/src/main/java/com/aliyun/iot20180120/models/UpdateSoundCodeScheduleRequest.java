// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeScheduleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2022-03-31</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <strong>example:</strong>
     * <p>23:59</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Md3ZiTL888K9llXDy7890***********</p>
     */
    @NameInMap("ScheduleCode")
    public String scheduleCode;

    /**
     * <strong>example:</strong>
     * <p>2022-03-31</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <strong>example:</strong>
     * <p>00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>WORKING</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateSoundCodeScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSoundCodeScheduleRequest self = new UpdateSoundCodeScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSoundCodeScheduleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSoundCodeScheduleRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateSoundCodeScheduleRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateSoundCodeScheduleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSoundCodeScheduleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSoundCodeScheduleRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    public UpdateSoundCodeScheduleRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateSoundCodeScheduleRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateSoundCodeScheduleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
