// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateSoundCodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Md3ZiTL888K9llXDy7890***********</p>
     */
    @NameInMap("SoundCode")
    public String soundCode;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
     */
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
