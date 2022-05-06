// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSoundCodeScheduleRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OpenType")
    public String openType;

    @NameInMap("StartDate")
    public String startDate;

    public static CreateSoundCodeScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSoundCodeScheduleRequest self = new CreateSoundCodeScheduleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSoundCodeScheduleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSoundCodeScheduleRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public CreateSoundCodeScheduleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSoundCodeScheduleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSoundCodeScheduleRequest setOpenType(String openType) {
        this.openType = openType;
        return this;
    }
    public String getOpenType() {
        return this.openType;
    }

    public CreateSoundCodeScheduleRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
