// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCustomizedVoiceJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitCustomizedVoiceJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitCustomizedVoiceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomizedVoiceJobResponseBody self = new SubmitCustomizedVoiceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitCustomizedVoiceJobResponseBody setData(SubmitCustomizedVoiceJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitCustomizedVoiceJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitCustomizedVoiceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitCustomizedVoiceJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitCustomizedVoiceJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><strong><strong>d718e2ff4f018ccf419a7b71</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>xiaozhuan</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        public static SubmitCustomizedVoiceJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitCustomizedVoiceJobResponseBodyData self = new SubmitCustomizedVoiceJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitCustomizedVoiceJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitCustomizedVoiceJobResponseBodyData setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

    }

}
