// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCosyVoiceCustomizedVoiceJobResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public SubmitCosyVoiceCustomizedVoiceJobResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C0C02296-113C-5838-8FE9-8F3A32998DDC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitCosyVoiceCustomizedVoiceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitCosyVoiceCustomizedVoiceJobResponseBody self = new SubmitCosyVoiceCustomizedVoiceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitCosyVoiceCustomizedVoiceJobResponseBody setData(SubmitCosyVoiceCustomizedVoiceJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitCosyVoiceCustomizedVoiceJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitCosyVoiceCustomizedVoiceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitCosyVoiceCustomizedVoiceJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitCosyVoiceCustomizedVoiceJobResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the voice cloning task.</p>
         * 
         * <strong>example:</strong>
         * <p>bfb786c639894f4d80648792021****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The voice ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Voice-l*****</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        public static SubmitCosyVoiceCustomizedVoiceJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitCosyVoiceCustomizedVoiceJobResponseBodyData self = new SubmitCosyVoiceCustomizedVoiceJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitCosyVoiceCustomizedVoiceJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitCosyVoiceCustomizedVoiceJobResponseBodyData setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

    }

}
