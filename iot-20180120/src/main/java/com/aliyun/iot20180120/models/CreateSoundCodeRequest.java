// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateSoundCodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>TEST123</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>OPEN</p>
     */
    @NameInMap("OpenType")
    public String openType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
     */
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

    public CreateSoundCodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSoundCodeRequest setOpenType(String openType) {
        this.openType = openType;
        return this;
    }
    public String getOpenType() {
        return this.openType;
    }

    public CreateSoundCodeRequest setSoundCodeContent(String soundCodeContent) {
        this.soundCodeContent = soundCodeContent;
        return this;
    }
    public String getSoundCodeContent() {
        return this.soundCodeContent;
    }

}
