// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListDynamicImageJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<ListDynamicImageJobsResponseBodyJobs> jobs;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDynamicImageJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDynamicImageJobsResponseBody self = new ListDynamicImageJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDynamicImageJobsResponseBody setJobs(java.util.List<ListDynamicImageJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListDynamicImageJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListDynamicImageJobsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListDynamicImageJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDynamicImageJobsResponseBodyJobsInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static ListDynamicImageJobsResponseBodyJobsInput build(java.util.Map<String, ?> map) throws Exception {
            ListDynamicImageJobsResponseBodyJobsInput self = new ListDynamicImageJobsResponseBodyJobsInput();
            return TeaModel.build(map, self);
        }

        public ListDynamicImageJobsResponseBodyJobsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListDynamicImageJobsResponseBodyJobsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDynamicImageJobsResponseBodyJobsOutput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static ListDynamicImageJobsResponseBodyJobsOutput build(java.util.Map<String, ?> map) throws Exception {
            ListDynamicImageJobsResponseBodyJobsOutput self = new ListDynamicImageJobsResponseBodyJobsOutput();
            return TeaModel.build(map, self);
        }

        public ListDynamicImageJobsResponseBodyJobsOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListDynamicImageJobsResponseBodyJobsOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDynamicImageJobsResponseBodyJobs extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Input")
        public ListDynamicImageJobsResponseBodyJobsInput input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Output")
        public ListDynamicImageJobsResponseBodyJobsOutput output;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TriggerSource")
        public String triggerSource;

        public static ListDynamicImageJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListDynamicImageJobsResponseBodyJobs self = new ListDynamicImageJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListDynamicImageJobsResponseBodyJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDynamicImageJobsResponseBodyJobs setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListDynamicImageJobsResponseBodyJobs setInput(ListDynamicImageJobsResponseBodyJobsInput input) {
            this.input = input;
            return this;
        }
        public ListDynamicImageJobsResponseBodyJobsInput getInput() {
            return this.input;
        }

        public ListDynamicImageJobsResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListDynamicImageJobsResponseBodyJobs setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListDynamicImageJobsResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDynamicImageJobsResponseBodyJobs setOutput(ListDynamicImageJobsResponseBodyJobsOutput output) {
            this.output = output;
            return this;
        }
        public ListDynamicImageJobsResponseBodyJobsOutput getOutput() {
            return this.output;
        }

        public ListDynamicImageJobsResponseBodyJobs setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListDynamicImageJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDynamicImageJobsResponseBodyJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListDynamicImageJobsResponseBodyJobs setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListDynamicImageJobsResponseBodyJobs setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

    }

}
