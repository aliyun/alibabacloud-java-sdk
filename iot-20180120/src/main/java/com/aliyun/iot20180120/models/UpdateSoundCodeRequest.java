// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeRequest extends TeaModel {
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("SoundCode")
    public String soundCode;

    @NameInMap("SoundCodeContent")
    public String soundCodeContent;

    public static UpdateSoundCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSoundCodeRequest self = new UpdateSoundCodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSoundCodeRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public UpdateSoundCodeRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateSoundCodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSoundCodeRequest setSoundCode(String soundCode) {
        this.soundCode = soundCode;
        return this;
    }
    public String getSoundCode() {
        return this.soundCode;
    }

    public UpdateSoundCodeRequest setSoundCodeContent(String soundCodeContent) {
        this.soundCodeContent = soundCodeContent;
        return this;
    }
    public String getSoundCodeContent() {
        return this.soundCodeContent;
    }

}
