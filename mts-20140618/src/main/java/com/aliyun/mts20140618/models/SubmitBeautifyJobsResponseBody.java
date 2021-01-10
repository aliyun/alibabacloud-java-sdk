// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitBeautifyJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobList")
    public SubmitBeautifyJobsResponseBodyJobList jobList;

    public static SubmitBeautifyJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitBeautifyJobsResponseBody self = new SubmitBeautifyJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitBeautifyJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitBeautifyJobsResponseBody setJobList(SubmitBeautifyJobsResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public SubmitBeautifyJobsResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public static class SubmitBeautifyJobsResponseBodyJobListJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitBeautifyJobsResponseBodyJobListJobInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitBeautifyJobsResponseBodyJobListJobInput self = new SubmitBeautifyJobsResponseBodyJobListJobInput();
            return TeaModel.build(map, self);
        }

        public SubmitBeautifyJobsResponseBodyJobListJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitBeautifyJobsResponseBodyJobListJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitBeautifyJobsResponseBodyJobListJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitBeautifyJobsResponseBodyJobListJobInput setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile self = new SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfig extends TeaModel {
        @NameInMap("OutputFile")
        public SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile outputFile;

        public static SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfig self = new SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfig();
            return TeaModel.build(map, self);
        }

        public SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfig setOutputFile(SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

    }

    public static class SubmitBeautifyJobsResponseBodyJobListJobMNSMessageResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static SubmitBeautifyJobsResponseBodyJobListJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitBeautifyJobsResponseBodyJobListJobMNSMessageResult self = new SubmitBeautifyJobsResponseBodyJobListJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitBeautifyJobsResponseBodyJobListJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SubmitBeautifyJobsResponseBodyJobListJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitBeautifyJobsResponseBodyJobListJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class SubmitBeautifyJobsResponseBodyJobListJob extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Input")
        public SubmitBeautifyJobsResponseBodyJobListJobInput input;

        @NameInMap("BeautifyConfig")
        public SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfig beautifyConfig;

        @NameInMap("MNSMessageResult")
        public SubmitBeautifyJobsResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        public static SubmitBeautifyJobsResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitBeautifyJobsResponseBodyJobListJob self = new SubmitBeautifyJobsResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public SubmitBeautifyJobsResponseBodyJobListJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitBeautifyJobsResponseBodyJobListJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public SubmitBeautifyJobsResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitBeautifyJobsResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitBeautifyJobsResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitBeautifyJobsResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitBeautifyJobsResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitBeautifyJobsResponseBodyJobListJob setInput(SubmitBeautifyJobsResponseBodyJobListJobInput input) {
            this.input = input;
            return this;
        }
        public SubmitBeautifyJobsResponseBodyJobListJobInput getInput() {
            return this.input;
        }

        public SubmitBeautifyJobsResponseBodyJobListJob setBeautifyConfig(SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfig beautifyConfig) {
            this.beautifyConfig = beautifyConfig;
            return this;
        }
        public SubmitBeautifyJobsResponseBodyJobListJobBeautifyConfig getBeautifyConfig() {
            return this.beautifyConfig;
        }

        public SubmitBeautifyJobsResponseBodyJobListJob setMNSMessageResult(SubmitBeautifyJobsResponseBodyJobListJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitBeautifyJobsResponseBodyJobListJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

    }

    public static class SubmitBeautifyJobsResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<SubmitBeautifyJobsResponseBodyJobListJob> job;

        public static SubmitBeautifyJobsResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            SubmitBeautifyJobsResponseBodyJobList self = new SubmitBeautifyJobsResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public SubmitBeautifyJobsResponseBodyJobList setJob(java.util.List<SubmitBeautifyJobsResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<SubmitBeautifyJobsResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

}
