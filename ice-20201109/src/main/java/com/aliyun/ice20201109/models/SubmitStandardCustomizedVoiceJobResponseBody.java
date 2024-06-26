// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitStandardCustomizedVoiceJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitStandardCustomizedVoiceJobResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitStandardCustomizedVoiceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitStandardCustomizedVoiceJobResponseBody self = new SubmitStandardCustomizedVoiceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitStandardCustomizedVoiceJobResponseBody setData(SubmitStandardCustomizedVoiceJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitStandardCustomizedVoiceJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitStandardCustomizedVoiceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitStandardCustomizedVoiceJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitStandardCustomizedVoiceJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><strong><strong>d718e2ff4f018ccf419a7b71</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static SubmitStandardCustomizedVoiceJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitStandardCustomizedVoiceJobResponseBodyData self = new SubmitStandardCustomizedVoiceJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitStandardCustomizedVoiceJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
