// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeScheduleRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ScheduleCode")
    public String scheduleCode;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("StartTime")
    public String startTime;

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
