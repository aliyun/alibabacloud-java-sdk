// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetPackageJobResponseBody extends TeaModel {
    @NameInMap("PackageJob")
    public GetPackageJobResponseBodyPackageJob packageJob;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPackageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPackageJobResponseBody self = new GetPackageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPackageJobResponseBody setPackageJob(GetPackageJobResponseBodyPackageJob packageJob) {
        this.packageJob = packageJob;
        return this;
    }
    public GetPackageJobResponseBodyPackageJob getPackageJob() {
        return this.packageJob;
    }

    public GetPackageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPackageJobResponseBodyPackageJobInputsInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static GetPackageJobResponseBodyPackageJobInputsInput build(java.util.Map<String, ?> map) throws Exception {
            GetPackageJobResponseBodyPackageJobInputsInput self = new GetPackageJobResponseBodyPackageJobInputsInput();
            return TeaModel.build(map, self);
        }

        public GetPackageJobResponseBodyPackageJobInputsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetPackageJobResponseBodyPackageJobInputsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPackageJobResponseBodyPackageJobInputs extends TeaModel {
        @NameInMap("Input")
        public GetPackageJobResponseBodyPackageJobInputsInput input;

        public static GetPackageJobResponseBodyPackageJobInputs build(java.util.Map<String, ?> map) throws Exception {
            GetPackageJobResponseBodyPackageJobInputs self = new GetPackageJobResponseBodyPackageJobInputs();
            return TeaModel.build(map, self);
        }

        public GetPackageJobResponseBodyPackageJobInputs setInput(GetPackageJobResponseBodyPackageJobInputsInput input) {
            this.input = input;
            return this;
        }
        public GetPackageJobResponseBodyPackageJobInputsInput getInput() {
            return this.input;
        }

    }

    public static class GetPackageJobResponseBodyPackageJobOutput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static GetPackageJobResponseBodyPackageJobOutput build(java.util.Map<String, ?> map) throws Exception {
            GetPackageJobResponseBodyPackageJobOutput self = new GetPackageJobResponseBodyPackageJobOutput();
            return TeaModel.build(map, self);
        }

        public GetPackageJobResponseBodyPackageJobOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetPackageJobResponseBodyPackageJobOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetPackageJobResponseBodyPackageJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Inputs")
        public java.util.List<GetPackageJobResponseBodyPackageJobInputs> inputs;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Output")
        public GetPackageJobResponseBodyPackageJobOutput output;

        @NameInMap("OutputUrl")
        public String outputUrl;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("TriggerSource")
        public String triggerSource;

        @NameInMap("UserData")
        public String userData;

        public static GetPackageJobResponseBodyPackageJob build(java.util.Map<String, ?> map) throws Exception {
            GetPackageJobResponseBodyPackageJob self = new GetPackageJobResponseBodyPackageJob();
            return TeaModel.build(map, self);
        }

        public GetPackageJobResponseBodyPackageJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetPackageJobResponseBodyPackageJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPackageJobResponseBodyPackageJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetPackageJobResponseBodyPackageJob setInputs(java.util.List<GetPackageJobResponseBodyPackageJobInputs> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<GetPackageJobResponseBodyPackageJobInputs> getInputs() {
            return this.inputs;
        }

        public GetPackageJobResponseBodyPackageJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetPackageJobResponseBodyPackageJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetPackageJobResponseBodyPackageJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetPackageJobResponseBodyPackageJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPackageJobResponseBodyPackageJob setOutput(GetPackageJobResponseBodyPackageJobOutput output) {
            this.output = output;
            return this;
        }
        public GetPackageJobResponseBodyPackageJobOutput getOutput() {
            return this.output;
        }

        public GetPackageJobResponseBodyPackageJob setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public GetPackageJobResponseBodyPackageJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetPackageJobResponseBodyPackageJob setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetPackageJobResponseBodyPackageJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPackageJobResponseBodyPackageJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetPackageJobResponseBodyPackageJob setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public GetPackageJobResponseBodyPackageJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
