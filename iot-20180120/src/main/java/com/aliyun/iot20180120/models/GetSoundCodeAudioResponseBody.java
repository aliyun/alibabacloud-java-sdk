// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetSoundCodeAudioResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSoundCodeAudioResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSoundCodeAudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSoundCodeAudioResponseBody self = new GetSoundCodeAudioResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSoundCodeAudioResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSoundCodeAudioResponseBody setData(GetSoundCodeAudioResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSoundCodeAudioResponseBodyData getData() {
        return this.data;
    }

    public GetSoundCodeAudioResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSoundCodeAudioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSoundCodeAudioResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSoundCodeAudioResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<String> items;

        public static GetSoundCodeAudioResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSoundCodeAudioResponseBodyData self = new GetSoundCodeAudioResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSoundCodeAudioResponseBodyData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

}
