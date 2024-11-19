// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetShareSpeechModelAudioRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-2w****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Md3ZiTL888K9llXDy7890***********</p>
     */
    @NameInMap("ShareTaskId")
    public String shareTaskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WSD****</p>
     */
    @NameInMap("SpeechModelCodeList")
    public java.util.List<String> speechModelCodeList;

    public static GetShareSpeechModelAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        GetShareSpeechModelAudioRequest self = new GetShareSpeechModelAudioRequest();
        return TeaModel.build(map, self);
    }

    public GetShareSpeechModelAudioRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetShareSpeechModelAudioRequest setShareTaskId(String shareTaskId) {
        this.shareTaskId = shareTaskId;
        return this;
    }
    public String getShareTaskId() {
        return this.shareTaskId;
    }

    public GetShareSpeechModelAudioRequest setSpeechModelCodeList(java.util.List<String> speechModelCodeList) {
        this.speechModelCodeList = speechModelCodeList;
        return this;
    }
    public java.util.List<String> getSpeechModelCodeList() {
        return this.speechModelCodeList;
    }

}
