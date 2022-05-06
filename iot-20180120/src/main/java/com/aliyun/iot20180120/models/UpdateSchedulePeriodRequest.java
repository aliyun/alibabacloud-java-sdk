// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSchedulePeriodRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PeriodCode")
    public String periodCode;

    @NameInMap("SoundCodeContent")
    public String soundCodeContent;

    @NameInMap("StartTime")
    public String startTime;

    public static UpdateSchedulePeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchedulePeriodRequest self = new UpdateSchedulePeriodRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSchedulePeriodRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSchedulePeriodRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateSchedulePeriodRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSchedulePeriodRequest setPeriodCode(String periodCode) {
        this.periodCode = periodCode;
        return this;
    }
    public String getPeriodCode() {
        return this.periodCode;
    }

    public UpdateSchedulePeriodRequest setSoundCodeContent(String soundCodeContent) {
        this.soundCodeContent = soundCodeContent;
        return this;
    }
    public String getSoundCodeContent() {
        return this.soundCodeContent;
    }

    public UpdateSchedulePeriodRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
