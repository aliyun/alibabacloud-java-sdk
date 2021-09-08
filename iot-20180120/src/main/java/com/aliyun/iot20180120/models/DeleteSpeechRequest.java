// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSpeechRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

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
