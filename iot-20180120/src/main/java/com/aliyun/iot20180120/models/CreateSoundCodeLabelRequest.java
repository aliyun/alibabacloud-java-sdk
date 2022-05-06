// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSoundCodeLabelRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Label")
    public String label;

    @NameInMap("ScheduleCode")
    public String scheduleCode;

    public static CreateSoundCodeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSoundCodeLabelRequest self = new CreateSoundCodeLabelRequest();
        return TeaModel.build(map, self);
    }

    public CreateSoundCodeLabelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSoundCodeLabelRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public CreateSoundCodeLabelRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

}
