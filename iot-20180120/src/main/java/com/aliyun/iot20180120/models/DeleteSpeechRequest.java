// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSpeechRequest extends TeaModel {
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
     * <p>4de2c367**<strong>8c585e5992</strong></p>
     */
    @NameInMap("SpeechCodeList")
    public java.util.List<String> speechCodeList;

    public static DeleteSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpeechRequest self = new DeleteSpeechRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteSpeechRequest setSpeechCodeList(java.util.List<String> speechCodeList) {
        this.speechCodeList = speechCodeList;
        return this;
    }
    public java.util.List<String> getSpeechCodeList() {
        return this.speechCodeList;
    }

}
