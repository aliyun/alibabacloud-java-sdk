// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPackageJobsResponseBody extends TeaModel {
    @NameInMap("PackageJobList")
    public ListPackageJobsResponseBodyPackageJobList packageJobList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPackageJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPackageJobsResponseBody self = new ListPackageJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPackageJobsResponseBody setPackageJobList(ListPackageJobsResponseBodyPackageJobList packageJobList) {
        this.packageJobList = packageJobList;
        return this;
    }
    public ListPackageJobsResponseBodyPackageJobList getPackageJobList() {
        return this.packageJobList;
    }

    public ListPackageJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput build(java.util.Map<String, ?> map) throws Exception {
            ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput self = new ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput();
            return TeaModel.build(map, self);
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPackageJobsResponseBodyPackageJobListPackageJobsInputs extends TeaModel {
        @NameInMap("Input")
        public ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput input;

        public static ListPackageJobsResponseBodyPackageJobListPackageJobsInputs build(java.util.Map<String, ?> map) throws Exception {
            ListPackageJobsResponseBodyPackageJobListPackageJobsInputs self = new ListPackageJobsResponseBodyPackageJobListPackageJobsInputs();
            return TeaModel.build(map, self);
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobsInputs setInput(ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput input) {
            this.input = input;
            return this;
        }
        public ListPackageJobsResponseBodyPackageJobListPackageJobsInputsInput getInput() {
            return this.input;
        }

    }

    public static class ListPackageJobsResponseBodyPackageJobListPackageJobsOutput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static ListPackageJobsResponseBodyPackageJobListPackageJobsOutput build(java.util.Map<String, ?> map) throws Exception {
            ListPackageJobsResponseBodyPackageJobListPackageJobsOutput self = new ListPackageJobsResponseBodyPackageJobListPackageJobsOutput();
            return TeaModel.build(map, self);
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobsOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobsOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPackageJobsResponseBodyPackageJobListPackageJobs extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Inputs")
        public java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobsInputs> inputs;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Output")
        public ListPackageJobsResponseBodyPackageJobListPackageJobsOutput output;

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

        public static ListPackageJobsResponseBodyPackageJobListPackageJobs build(java.util.Map<String, ?> map) throws Exception {
            ListPackageJobsResponseBodyPackageJobListPackageJobs self = new ListPackageJobsResponseBodyPackageJobListPackageJobs();
            return TeaModel.build(map, self);
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setInputs(java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobsInputs> inputs) {
            this.inputs = inputs;
            return this;
        }
        public java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobsInputs> getInputs() {
            return this.inputs;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setOutput(ListPackageJobsResponseBodyPackageJobListPackageJobsOutput output) {
            this.output = output;
            return this;
        }
        public ListPackageJobsResponseBodyPackageJobListPackageJobsOutput getOutput() {
            return this.output;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public ListPackageJobsResponseBodyPackageJobListPackageJobs setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class ListPackageJobsResponseBodyPackageJobList extends TeaModel {
        @NameInMap("NextPageToken")
        public String nextPageToken;

        @NameInMap("PackageJobs")
        public java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobs> packageJobs;

        public static ListPackageJobsResponseBodyPackageJobList build(java.util.Map<String, ?> map) throws Exception {
            ListPackageJobsResponseBodyPackageJobList self = new ListPackageJobsResponseBodyPackageJobList();
            return TeaModel.build(map, self);
        }

        public ListPackageJobsResponseBodyPackageJobList setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public ListPackageJobsResponseBodyPackageJobList setPackageJobs(java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobs> packageJobs) {
            this.packageJobs = packageJobs;
            return this;
        }
        public java.util.List<ListPackageJobsResponseBodyPackageJobListPackageJobs> getPackageJobs() {
            return this.packageJobs;
        }

    }

}
