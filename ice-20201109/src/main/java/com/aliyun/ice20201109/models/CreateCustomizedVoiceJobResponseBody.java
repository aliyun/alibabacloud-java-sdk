// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateCustomizedVoiceJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateCustomizedVoiceJobResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateCustomizedVoiceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedVoiceJobResponseBody self = new CreateCustomizedVoiceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedVoiceJobResponseBody setData(CreateCustomizedVoiceJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCustomizedVoiceJobResponseBodyData getData() {
        return this.data;
    }

    public CreateCustomizedVoiceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomizedVoiceJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCustomizedVoiceJobResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("VoiceId")
        public String voiceId;

        public static CreateCustomizedVoiceJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCustomizedVoiceJobResponseBodyData self = new CreateCustomizedVoiceJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCustomizedVoiceJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreateCustomizedVoiceJobResponseBodyData setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

    }

}
