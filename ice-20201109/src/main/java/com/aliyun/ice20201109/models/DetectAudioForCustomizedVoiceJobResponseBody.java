// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DetectAudioForCustomizedVoiceJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectAudioForCustomizedVoiceJobResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DetectAudioForCustomizedVoiceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectAudioForCustomizedVoiceJobResponseBody self = new DetectAudioForCustomizedVoiceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectAudioForCustomizedVoiceJobResponseBody setData(DetectAudioForCustomizedVoiceJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectAudioForCustomizedVoiceJobResponseBodyData getData() {
        return this.data;
    }

    public DetectAudioForCustomizedVoiceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectAudioForCustomizedVoiceJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DetectAudioForCustomizedVoiceJobResponseBodyData extends TeaModel {
        @NameInMap("Pass")
        public Boolean pass;

        @NameInMap("Reason")
        public String reason;

        public static DetectAudioForCustomizedVoiceJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectAudioForCustomizedVoiceJobResponseBodyData self = new DetectAudioForCustomizedVoiceJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectAudioForCustomizedVoiceJobResponseBodyData setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

        public DetectAudioForCustomizedVoiceJobResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
