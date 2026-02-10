// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEdgeTranscodeJobResponseBody extends TeaModel {
    @NameInMap("JobList")
    public ListEdgeTranscodeJobResponseBodyJobList jobList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEdgeTranscodeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeTranscodeJobResponseBody self = new ListEdgeTranscodeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeTranscodeJobResponseBody setJobList(ListEdgeTranscodeJobResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public ListEdgeTranscodeJobResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public ListEdgeTranscodeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeTranscodeJobResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEdgeTranscodeJobResponseBodyJobListJob extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("LastStartAt")
        public String lastStartAt;

        @NameInMap("LastStopAt")
        public String lastStopAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("StreamInput")
        public String streamInput;

        @NameInMap("StreamOutput")
        public String streamOutput;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Type")
        public String type;

        public static ListEdgeTranscodeJobResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeTranscodeJobResponseBodyJobListJob self = new ListEdgeTranscodeJobResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setLastStartAt(String lastStartAt) {
            this.lastStartAt = lastStartAt;
            return this;
        }
        public String getLastStartAt() {
            return this.lastStartAt;
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setLastStopAt(String lastStopAt) {
            this.lastStopAt = lastStopAt;
            return this;
        }
        public String getLastStopAt() {
            return this.lastStopAt;
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setStreamInput(String streamInput) {
            this.streamInput = streamInput;
            return this;
        }
        public String getStreamInput() {
            return this.streamInput;
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setStreamOutput(String streamOutput) {
            this.streamOutput = streamOutput;
            return this;
        }
        public String getStreamOutput() {
            return this.streamOutput;
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListEdgeTranscodeJobResponseBodyJobListJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListEdgeTranscodeJobResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<ListEdgeTranscodeJobResponseBodyJobListJob> job;

        public static ListEdgeTranscodeJobResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeTranscodeJobResponseBodyJobList self = new ListEdgeTranscodeJobResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public ListEdgeTranscodeJobResponseBodyJobList setJob(java.util.List<ListEdgeTranscodeJobResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<ListEdgeTranscodeJobResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

}
