// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitImageQualityJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageQualityJob")
    public SubmitImageQualityJobResponseBodyImageQualityJob imageQualityJob;

    public static SubmitImageQualityJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageQualityJobResponseBody self = new SubmitImageQualityJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitImageQualityJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitImageQualityJobResponseBody setImageQualityJob(SubmitImageQualityJobResponseBodyImageQualityJob imageQualityJob) {
        this.imageQualityJob = imageQualityJob;
        return this;
    }
    public SubmitImageQualityJobResponseBodyImageQualityJob getImageQualityJob() {
        return this.imageQualityJob;
    }

    public static class SubmitImageQualityJobResponseBodyImageQualityJobResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Score")
        public String score;

        public static SubmitImageQualityJobResponseBodyImageQualityJobResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageQualityJobResponseBodyImageQualityJobResult self = new SubmitImageQualityJobResponseBodyImageQualityJobResult();
            return TeaModel.build(map, self);
        }

        public SubmitImageQualityJobResponseBodyImageQualityJobResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJobResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJobResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

    public static class SubmitImageQualityJobResponseBodyImageQualityJobInput extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitImageQualityJobResponseBodyImageQualityJobInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageQualityJobResponseBodyImageQualityJobInput self = new SubmitImageQualityJobResponseBodyImageQualityJobInput();
            return TeaModel.build(map, self);
        }

        public SubmitImageQualityJobResponseBodyImageQualityJobInput setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitImageQualityJobResponseBodyImageQualityJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Result")
        public SubmitImageQualityJobResponseBodyImageQualityJobResult result;

        @NameInMap("State")
        public String state;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Input")
        public SubmitImageQualityJobResponseBodyImageQualityJobInput input;

        public static SubmitImageQualityJobResponseBodyImageQualityJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitImageQualityJobResponseBodyImageQualityJob self = new SubmitImageQualityJobResponseBodyImageQualityJob();
            return TeaModel.build(map, self);
        }

        public SubmitImageQualityJobResponseBodyImageQualityJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJob setResult(SubmitImageQualityJobResponseBodyImageQualityJobResult result) {
            this.result = result;
            return this;
        }
        public SubmitImageQualityJobResponseBodyImageQualityJobResult getResult() {
            return this.result;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitImageQualityJobResponseBodyImageQualityJob setInput(SubmitImageQualityJobResponseBodyImageQualityJobInput input) {
            this.input = input;
            return this;
        }
        public SubmitImageQualityJobResponseBodyImageQualityJobInput getInput() {
            return this.input;
        }

    }

}
