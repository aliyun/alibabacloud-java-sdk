// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeLabelRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Label")
    public String label;

    @NameInMap("SoundCode")
    public String soundCode;

    public static UpdateSoundCodeLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSoundCodeLabelRequest self = new UpdateSoundCodeLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSoundCodeLabelRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSoundCodeLabelRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public UpdateSoundCodeLabelRequest setSoundCode(String soundCode) {
        this.soundCode = soundCode;
        return this;
    }
    public String getSoundCode() {
        return this.soundCode;
    }

}
