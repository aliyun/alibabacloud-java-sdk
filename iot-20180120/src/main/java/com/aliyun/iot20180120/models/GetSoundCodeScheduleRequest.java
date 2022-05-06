// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSoundCodeScheduleRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ScheduleCode")
    public String scheduleCode;

    public static GetSoundCodeScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSoundCodeScheduleRequest self = new GetSoundCodeScheduleRequest();
        return TeaModel.build(map, self);
    }

    public GetSoundCodeScheduleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetSoundCodeScheduleRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

}
