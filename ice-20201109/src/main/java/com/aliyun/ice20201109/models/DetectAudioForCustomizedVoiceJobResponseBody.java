// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DetectAudioForCustomizedVoiceJobResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
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
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: The operation was successful.</li>
     * <li>false: The operation failed.</li>
     * </ul>
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
         * <p>Indicates whether the audio passed the check. Valid values:</p>
         * <ul>
         * <li>true: The audio passed the check.</li>
         * <li>false: The audio failed the check.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Pass")
        public Boolean pass;

        /**
         * <p>The specific reason why the audio failed the check.</p>
         * 
         * <strong>example:</strong>
         * <p>Pronunciation error, please read the contents of the copy accurately</p>
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
