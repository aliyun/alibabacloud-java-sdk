// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitSubtitleJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubtitleJob")
    public SubmitSubtitleJobResponseBodySubtitleJob subtitleJob;

    public static SubmitSubtitleJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSubtitleJobResponseBody self = new SubmitSubtitleJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSubtitleJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSubtitleJobResponseBody setSubtitleJob(SubmitSubtitleJobResponseBodySubtitleJob subtitleJob) {
        this.subtitleJob = subtitleJob;
        return this;
    }
    public SubmitSubtitleJobResponseBodySubtitleJob getSubtitleJob() {
        return this.subtitleJob;
    }

    public static class SubmitSubtitleJobResponseBodySubtitleJob extends TeaModel {
        @NameInMap("OutputConfig")
        public String outputConfig;

        @NameInMap("State")
        public String state;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("InputConfig")
        public String inputConfig;

        public static SubmitSubtitleJobResponseBodySubtitleJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitSubtitleJobResponseBodySubtitleJob self = new SubmitSubtitleJobResponseBodySubtitleJob();
            return TeaModel.build(map, self);
        }

        public SubmitSubtitleJobResponseBodySubtitleJob setOutputConfig(String outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public String getOutputConfig() {
            return this.outputConfig;
        }

        public SubmitSubtitleJobResponseBodySubtitleJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitSubtitleJobResponseBodySubtitleJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitSubtitleJobResponseBodySubtitleJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public SubmitSubtitleJobResponseBodySubtitleJob setInputConfig(String inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public String getInputConfig() {
            return this.inputConfig;
        }

    }

}
