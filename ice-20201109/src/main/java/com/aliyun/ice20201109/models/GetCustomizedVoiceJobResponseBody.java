// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetCustomizedVoiceJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetCustomizedVoiceJobResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCustomizedVoiceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizedVoiceJobResponseBody self = new GetCustomizedVoiceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomizedVoiceJobResponseBody setData(GetCustomizedVoiceJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCustomizedVoiceJobResponseBodyData getData() {
        return this.data;
    }

    public GetCustomizedVoiceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomizedVoiceJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        @NameInMap("VoiceId")
        public String voiceId;

        public static GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob self = new GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob();
            return TeaModel.build(map, self);
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

    }

    public static class GetCustomizedVoiceJobResponseBodyData extends TeaModel {
        @NameInMap("CustomizedVoiceJob")
        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob customizedVoiceJob;

        public static GetCustomizedVoiceJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizedVoiceJobResponseBodyData self = new GetCustomizedVoiceJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCustomizedVoiceJobResponseBodyData setCustomizedVoiceJob(GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob customizedVoiceJob) {
            this.customizedVoiceJob = customizedVoiceJob;
            return this;
        }
        public GetCustomizedVoiceJobResponseBodyDataCustomizedVoiceJob getCustomizedVoiceJob() {
            return this.customizedVoiceJob;
        }

    }

}
