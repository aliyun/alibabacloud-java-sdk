// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSchedulePeriodRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ScheduleCode")
    public String scheduleCode;

    @NameInMap("SoundCodeContent")
    public String soundCodeContent;

    @NameInMap("StartTime")
    public String startTime;

    public static CreateSchedulePeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulePeriodRequest self = new CreateSchedulePeriodRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchedulePeriodRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSchedulePeriodRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateSchedulePeriodRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSchedulePeriodRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    public CreateSchedulePeriodRequest setSoundCodeContent(String soundCodeContent) {
        this.soundCodeContent = soundCodeContent;
        return this;
    }
    public String getSoundCodeContent() {
        return this.soundCodeContent;
    }

    public CreateSchedulePeriodRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
