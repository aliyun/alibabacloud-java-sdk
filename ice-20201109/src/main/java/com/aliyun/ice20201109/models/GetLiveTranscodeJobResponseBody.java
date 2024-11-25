// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveTranscodeJobResponseBody extends TeaModel {
    /**
     * <p>The information about the transcoding job.</p>
     */
    @NameInMap("Job")
    public GetLiveTranscodeJobResponseBodyJob job;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLiveTranscodeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveTranscodeJobResponseBody self = new GetLiveTranscodeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveTranscodeJobResponseBody setJob(GetLiveTranscodeJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetLiveTranscodeJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetLiveTranscodeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLiveTranscodeJobResponseBodyJobOutputStreamStreamInfos extends TeaModel {
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

        public static GetLiveTranscodeJobResponseBodyJobOutputStreamStreamInfos build(java.util.Map<String, ?> map) throws Exception {
            GetLiveTranscodeJobResponseBodyJobOutputStreamStreamInfos self = new GetLiveTranscodeJobResponseBodyJobOutputStreamStreamInfos();
            return TeaModel.build(map, self);
        }

        public GetLiveTranscodeJobResponseBodyJobOutputStreamStreamInfos setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public GetLiveTranscodeJobResponseBodyJobOutputStreamStreamInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetLiveTranscodeJobResponseBodyJobOutputStream extends TeaModel {
        /**
         * <p>The information about the output stream.</p>
         */
        @NameInMap("StreamInfos")
        public java.util.List<GetLiveTranscodeJobResponseBodyJobOutputStreamStreamInfos> streamInfos;

        public static GetLiveTranscodeJobResponseBodyJobOutputStream build(java.util.Map<String, ?> map) throws Exception {
            GetLiveTranscodeJobResponseBodyJobOutputStream self = new GetLiveTranscodeJobResponseBodyJobOutputStream();
            return TeaModel.build(map, self);
        }

        public GetLiveTranscodeJobResponseBodyJobOutputStream setStreamInfos(java.util.List<GetLiveTranscodeJobResponseBodyJobOutputStreamStreamInfos> streamInfos) {
            this.streamInfos = streamInfos;
            return this;
        }
        public java.util.List<GetLiveTranscodeJobResponseBodyJobOutputStreamStreamInfos> getStreamInfos() {
            return this.streamInfos;
        }

    }

    public static class GetLiveTranscodeJobResponseBodyJobStreamInput extends TeaModel {
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

        public static GetLiveTranscodeJobResponseBodyJobStreamInput build(java.util.Map<String, ?> map) throws Exception {
            GetLiveTranscodeJobResponseBodyJobStreamInput self = new GetLiveTranscodeJobResponseBodyJobStreamInput();
            return TeaModel.build(map, self);
        }

        public GetLiveTranscodeJobResponseBodyJobStreamInput setInputUrl(String inputUrl) {
            this.inputUrl = inputUrl;
            return this;
        }
        public String getInputUrl() {
            return this.inputUrl;
        }

        public GetLiveTranscodeJobResponseBodyJobStreamInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetLiveTranscodeJobResponseBodyJob extends TeaModel {
        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-20T02:48:58Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the transcoding job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The name of the transcoding job.</p>
         * 
         * <strong>example:</strong>
         * <p>task1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The information about the output stream.</p>
         */
        @NameInMap("OutputStream")
        public GetLiveTranscodeJobResponseBodyJobOutputStream outputStream;

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
         * <ul>
         * <li>0: The job is not started.</li>
         * <li>1: The job is in progress.</li>
         * <li>2: The job is stopped.</li>
         * </ul>
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
        public GetLiveTranscodeJobResponseBodyJobStreamInput streamInput;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b6491d5b3e514b7d895d14b5453ea119</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static GetLiveTranscodeJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetLiveTranscodeJobResponseBodyJob self = new GetLiveTranscodeJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetLiveTranscodeJobResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLiveTranscodeJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetLiveTranscodeJobResponseBodyJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLiveTranscodeJobResponseBodyJob setOutputStream(GetLiveTranscodeJobResponseBodyJobOutputStream outputStream) {
            this.outputStream = outputStream;
            return this;
        }
        public GetLiveTranscodeJobResponseBodyJobOutputStream getOutputStream() {
            return this.outputStream;
        }

        public GetLiveTranscodeJobResponseBodyJob setStartMode(Integer startMode) {
            this.startMode = startMode;
            return this;
        }
        public Integer getStartMode() {
            return this.startMode;
        }

        public GetLiveTranscodeJobResponseBodyJob setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetLiveTranscodeJobResponseBodyJob setStreamInput(GetLiveTranscodeJobResponseBodyJobStreamInput streamInput) {
            this.streamInput = streamInput;
            return this;
        }
        public GetLiveTranscodeJobResponseBodyJobStreamInput getStreamInput() {
            return this.streamInput;
        }

        public GetLiveTranscodeJobResponseBodyJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetLiveTranscodeJobResponseBodyJob setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetLiveTranscodeJobResponseBodyJob setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
