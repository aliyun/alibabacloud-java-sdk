// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceSpeechRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("DeviceSpeechList")
    @Validation(required = true)
    public java.util.List<DeleteDeviceSpeechRequestDeviceSpeechList> deviceSpeechList;

    public static DeleteDeviceSpeechRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceSpeechRequest self = new DeleteDeviceSpeechRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceSpeechRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeleteDeviceSpeechRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteDeviceSpeechRequest setDeviceSpeechList(java.util.List<DeleteDeviceSpeechRequestDeviceSpeechList> deviceSpeechList) {
        this.deviceSpeechList = deviceSpeechList;
        return this;
    }
    public java.util.List<DeleteDeviceSpeechRequestDeviceSpeechList> getDeviceSpeechList() {
        return this.deviceSpeechList;
    }

    public static class DeleteDeviceSpeechRequestDeviceSpeechList extends TeaModel {
        @NameInMap("BizCode")
        @Validation(required = true)
        public String bizCode;

        @NameInMap("AudioFormat")
        @Validation(required = true)
        public String audioFormat;

        public static DeleteDeviceSpeechRequestDeviceSpeechList build(java.util.Map<String, ?> map) throws Exception {
            DeleteDeviceSpeechRequestDeviceSpeechList self = new DeleteDeviceSpeechRequestDeviceSpeechList();
            return TeaModel.build(map, self);
        }

        public DeleteDeviceSpeechRequestDeviceSpeechList setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public DeleteDeviceSpeechRequestDeviceSpeechList setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }
        public String getAudioFormat() {
            return this.audioFormat;
        }

    }

}
