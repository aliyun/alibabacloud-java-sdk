// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSoundCodeRequest extends TeaModel {
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SoundCodeContent")
    public String soundCodeContent;

    public static CreateSoundCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSoundCodeRequest self = new CreateSoundCodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateSoundCodeRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public CreateSoundCodeRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateSoundCodeRequest setSoundCodeContent(String soundCodeContent) {
        this.soundCodeContent = soundCodeContent;
        return this;
    }
    public String getSoundCodeContent() {
        return this.soundCodeContent;
    }

}
