// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSoundCodeScheduleRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ScheduleCode")
    public String scheduleCode;

    public static DeleteSoundCodeScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSoundCodeScheduleRequest self = new DeleteSoundCodeScheduleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSoundCodeScheduleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteSoundCodeScheduleRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

}
