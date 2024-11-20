// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DetectAudioForCustomizedVoiceJobResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DetectAudioForCustomizedVoiceJobResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true false</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Indicates whether the audio file passes the check. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Pass")
        public Boolean pass;

        /**
         * <p>The reason returned if the audio file failed to pass the check.</p>
         */
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
