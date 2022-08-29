// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSnapshotJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<ListSnapshotJobsResponseBodyJobs> jobs;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSnapshotJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotJobsResponseBody self = new ListSnapshotJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSnapshotJobsResponseBody setJobs(java.util.List<ListSnapshotJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListSnapshotJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListSnapshotJobsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListSnapshotJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSnapshotJobsResponseBodyJobsInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static ListSnapshotJobsResponseBodyJobsInput build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotJobsResponseBodyJobsInput self = new ListSnapshotJobsResponseBodyJobsInput();
            return TeaModel.build(map, self);
        }

        public ListSnapshotJobsResponseBodyJobsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListSnapshotJobsResponseBodyJobsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListSnapshotJobsResponseBodyJobsOutput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static ListSnapshotJobsResponseBodyJobsOutput build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotJobsResponseBodyJobsOutput self = new ListSnapshotJobsResponseBodyJobsOutput();
            return TeaModel.build(map, self);
        }

        public ListSnapshotJobsResponseBodyJobsOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListSnapshotJobsResponseBodyJobsOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListSnapshotJobsResponseBodyJobs extends TeaModel {
        @NameInMap("Async")
        public Boolean async;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Input")
        public ListSnapshotJobsResponseBodyJobsInput input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Output")
        public ListSnapshotJobsResponseBodyJobsOutput output;

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

        @NameInMap("Type")
        public String type;

        public static ListSnapshotJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListSnapshotJobsResponseBodyJobs self = new ListSnapshotJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListSnapshotJobsResponseBodyJobs setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public ListSnapshotJobsResponseBodyJobs setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListSnapshotJobsResponseBodyJobs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSnapshotJobsResponseBodyJobs setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListSnapshotJobsResponseBodyJobs setInput(ListSnapshotJobsResponseBodyJobsInput input) {
            this.input = input;
            return this;
        }
        public ListSnapshotJobsResponseBodyJobsInput getInput() {
            return this.input;
        }

        public ListSnapshotJobsResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListSnapshotJobsResponseBodyJobs setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListSnapshotJobsResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSnapshotJobsResponseBodyJobs setOutput(ListSnapshotJobsResponseBodyJobsOutput output) {
            this.output = output;
            return this;
        }
        public ListSnapshotJobsResponseBodyJobsOutput getOutput() {
            return this.output;
        }

        public ListSnapshotJobsResponseBodyJobs setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListSnapshotJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSnapshotJobsResponseBodyJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListSnapshotJobsResponseBodyJobs setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListSnapshotJobsResponseBodyJobs setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public ListSnapshotJobsResponseBodyJobs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
