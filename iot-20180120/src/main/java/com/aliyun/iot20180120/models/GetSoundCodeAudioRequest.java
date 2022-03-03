// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSoundCodeAudioRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SoundCodeList")
    public java.util.List<String> soundCodeList;

    public static GetSoundCodeAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSoundCodeAudioRequest self = new GetSoundCodeAudioRequest();
        return TeaModel.build(map, self);
    }

    public GetSoundCodeAudioRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetSoundCodeAudioRequest setSoundCodeList(java.util.List<String> soundCodeList) {
        this.soundCodeList = soundCodeList;
        return this;
    }
    public java.util.List<String> getSoundCodeList() {
        return this.soundCodeList;
    }

}
