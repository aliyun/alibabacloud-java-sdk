// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetShareSpeechModelAudioResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetShareSpeechModelAudioResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetShareSpeechModelAudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShareSpeechModelAudioResponseBody self = new GetShareSpeechModelAudioResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShareSpeechModelAudioResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetShareSpeechModelAudioResponseBody setData(GetShareSpeechModelAudioResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetShareSpeechModelAudioResponseBodyData getData() {
        return this.data;
    }

    public GetShareSpeechModelAudioResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetShareSpeechModelAudioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetShareSpeechModelAudioResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetShareSpeechModelAudioResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static GetShareSpeechModelAudioResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetShareSpeechModelAudioResponseBodyData self = new GetShareSpeechModelAudioResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetShareSpeechModelAudioResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

}
