// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveTranscodeJobsResponseBody extends TeaModel {
    /**
     * <p>The list of transcoding jobs.</p>
     */
    @NameInMap("JobList")
    public java.util.List<ListLiveTranscodeJobsResponseBodyJobList> jobList;

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
        /**
         * <p>The URL of the output stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://mydomain/app/mytranscode1</p>
         */
        @NameInMap("OutputUrl")
        public String outputUrl;

        /**
         * <p>The type of the output stream protocol. Only the RTMP protocol is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
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
        /**
         * <p>The list of stream URLs.</p>
         */
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
        /**
         * <p>The URL of the input stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://mydomain/app/stream1</p>
         */
        @NameInMap("InputUrl")
        public String inputUrl;

        /**
         * <p>The type of the input stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
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
        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T02:48:58Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the transcoding job.</p>
         * 
         * <strong>example:</strong>
         * <p>mytask</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The information about the output stream.</p>
         */
        @NameInMap("OutputStream")
        public ListLiveTranscodeJobsResponseBodyJobListOutputStream outputStream;

        /**
         * <p>The start mode of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StartMode")
        public Integer startMode;

        /**
         * <p>The state of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The information about the input stream.</p>
         */
        @NameInMap("StreamInput")
        public ListLiveTranscodeJobsResponseBodyJobListStreamInput streamInput;

        /**
         * <p>The ID of the transcoding template used by the transcoding job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287666</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template name.</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type of the transcoding template used by the transcoding job.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
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
