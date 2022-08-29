// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveTranscodeJobsResponseBody extends TeaModel {
    @NameInMap("JobList")
    public java.util.List<ListLiveTranscodeJobsResponseBodyJobList> jobList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLiveTranscodeJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveTranscodeJobsResponseBody self = new ListLiveTranscodeJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveTranscodeJobsResponseBody setJobList(java.util.List<ListLiveTranscodeJobsResponseBodyJobList> jobList) {
        this.jobList = jobList;
        return this;
    }
    public java.util.List<ListLiveTranscodeJobsResponseBodyJobList> getJobList() {
        return this.jobList;
    }

    public ListLiveTranscodeJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveTranscodeJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLiveTranscodeJobsResponseBodyJobListOutputStreamStreamInfos extends TeaModel {
        @NameInMap("OutputUrl")
        public String outputUrl;

        @NameInMap("Type")
        public String type;

        public static ListLiveTranscodeJobsResponseBodyJobListOutputStreamStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTranscodeJobsResponseBodyJobListOutputStreamStreamInfos self = new ListLiveTranscodeJobsResponseBodyJobListOutputStreamStreamInfos();
            return TeaModel.build(map, self);
        }

        public ListLiveTranscodeJobsResponseBodyJobListOutputStreamStreamInfos setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public ListLiveTranscodeJobsResponseBodyJobListOutputStreamStreamInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListLiveTranscodeJobsResponseBodyJobListOutputStream extends TeaModel {
        @NameInMap("StreamInfos")
        public java.util.List<ListLiveTranscodeJobsResponseBodyJobListOutputStreamStreamInfos> streamInfos;

        public static ListLiveTranscodeJobsResponseBodyJobListOutputStream build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTranscodeJobsResponseBodyJobListOutputStream self = new ListLiveTranscodeJobsResponseBodyJobListOutputStream();
            return TeaModel.build(map, self);
        }

        public ListLiveTranscodeJobsResponseBodyJobListOutputStream setStreamInfos(java.util.List<ListLiveTranscodeJobsResponseBodyJobListOutputStreamStreamInfos> streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public java.util.List<ListLiveTranscodeJobsResponseBodyJobListOutputStreamStreamInfos> getStreamInfos() {
            return this.streamInfos;
        }

    }

    public static class ListLiveTranscodeJobsResponseBodyJobListStreamInput extends TeaModel {
        @NameInMap("InputUrl")
        public String inputUrl;

        @NameInMap("Type")
        public String type;

        public static ListLiveTranscodeJobsResponseBodyJobListStreamInput build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTranscodeJobsResponseBodyJobListStreamInput self = new ListLiveTranscodeJobsResponseBodyJobListStreamInput();
            return TeaModel.build(map, self);
        }

        public ListLiveTranscodeJobsResponseBodyJobListStreamInput setInputUrl(String inputUrl) {
            this.inputUrl = inputUrl;
            return this;
        }
        public String getInputUrl() {
            return this.inputUrl;
        }

        public ListLiveTranscodeJobsResponseBodyJobListStreamInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListLiveTranscodeJobsResponseBodyJobList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutputStream")
        public ListLiveTranscodeJobsResponseBodyJobListOutputStream outputStream;

        @NameInMap("StartMode")
        public Integer startMode;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StreamInput")
        public ListLiveTranscodeJobsResponseBodyJobListStreamInput streamInput;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateType")
        public String templateType;

        public static ListLiveTranscodeJobsResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            ListLiveTranscodeJobsResponseBodyJobList self = new ListLiveTranscodeJobsResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public ListLiveTranscodeJobsResponseBodyJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListLiveTranscodeJobsResponseBodyJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListLiveTranscodeJobsResponseBodyJobList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLiveTranscodeJobsResponseBodyJobList setOutputStream(ListLiveTranscodeJobsResponseBodyJobListOutputStream outputStream) {
            this.outputStream = outputStream;
            return this;
        }
        public ListLiveTranscodeJobsResponseBodyJobListOutputStream getOutputStream() {
            return this.outputStream;
        }

        public ListLiveTranscodeJobsResponseBodyJobList setStartMode(Integer startMode) {
            this.startMode = startMode;
            return this;
        }
        public Integer getStartMode() {
            return this.startMode;
        }

        public ListLiveTranscodeJobsResponseBodyJobList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListLiveTranscodeJobsResponseBodyJobList setStreamInput(ListLiveTranscodeJobsResponseBodyJobListStreamInput streamInput) {
            this.streamInput = streamInput;
            return this;
        }
        public ListLiveTranscodeJobsResponseBodyJobListStreamInput getStreamInput() {
            return this.streamInput;
        }

        public ListLiveTranscodeJobsResponseBodyJobList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListLiveTranscodeJobsResponseBodyJobList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListLiveTranscodeJobsResponseBodyJobList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
