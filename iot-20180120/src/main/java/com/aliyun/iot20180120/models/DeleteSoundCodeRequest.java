// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSoundCodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Md3ZiTL888K9llXDy7890***********</p>
     */
    @NameInMap("SoundCode")
    public String soundCode;

    public static DeleteSoundCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSoundCodeRequest self = new DeleteSoundCodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSoundCodeRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteSoundCodeRequest setSoundCode(String soundCode) {
        this.soundCode = soundCode;
        return this;
    }
    public String getSoundCode() {
        return this.soundCode;
    }

}
