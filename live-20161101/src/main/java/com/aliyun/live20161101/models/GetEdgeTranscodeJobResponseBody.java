// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEdgeTranscodeJobResponseBody extends TeaModel {
    /**
     * <p>The details of the edge transcoding task.</p>
     */
    @NameInMap("Job")
    public GetEdgeTranscodeJobResponseBodyJob job;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEdgeTranscodeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeTranscodeJobResponseBody self = new GetEdgeTranscodeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeTranscodeJobResponseBody setJob(GetEdgeTranscodeJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetEdgeTranscodeJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetEdgeTranscodeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEdgeTranscodeJobResponseBodyJob extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-24T16:44:55Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The time when the task was last started.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-25T02:48:58Z</p>
         */
        @NameInMap("LastStartAt")
        public String lastStartAt;

        /**
         * <p>The time when the task was last stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-25T05:48:58Z</p>
         */
        @NameInMap("LastStopAt")
        public String lastStopAt;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>my_job</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li>0: not started</li>
         * <li>1: in progress</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The URL of the input stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://mydomain/app/stream1</p>
         */
        @NameInMap("StreamInput")
        public String streamInput;

        /**
         * <p>The URL of the output stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://testdomain/app/stream2</p>
         */
        @NameInMap("StreamOutput")
        public String streamOutput;

        /**
         * <p>The ID of the edge transcoding template used by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>9b1571b513cb44f7a1ba6ae561ff****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the edge transcoding template used by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>my_template</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type of edge transcoding. Valid values:</p>
         * <ul>
         * <li>common: standard transcoding and Narrowband HD™ 1.0 transcoding</li>
         * <li>nbhd-2: Narrowband HD™ 2.0 transcoding</li>
         * <li>ultra-hd: ultra-high definition transcoding</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetEdgeTranscodeJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeTranscodeJobResponseBodyJob self = new GetEdgeTranscodeJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetEdgeTranscodeJobResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEdgeTranscodeJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetEdgeTranscodeJobResponseBodyJob setLastStartAt(String lastStartAt) {
            this.lastStartAt = lastStartAt;
            return this;
        }
        public String getLastStartAt() {
            return this.lastStartAt;
        }

        public GetEdgeTranscodeJobResponseBodyJob setLastStopAt(String lastStopAt) {
            this.lastStopAt = lastStopAt;
            return this;
        }
        public String getLastStopAt() {
            return this.lastStopAt;
        }

        public GetEdgeTranscodeJobResponseBodyJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEdgeTranscodeJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEdgeTranscodeJobResponseBodyJob setStreamInput(String streamInput) {
            this.streamInput = streamInput;
            return this;
        }
        public String getStreamInput() {
            return this.streamInput;
        }

        public GetEdgeTranscodeJobResponseBodyJob setStreamOutput(String streamOutput) {
            this.streamOutput = streamOutput;
            return this;
        }
        public String getStreamOutput() {
            return this.streamOutput;
        }

        public GetEdgeTranscodeJobResponseBodyJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetEdgeTranscodeJobResponseBodyJob setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetEdgeTranscodeJobResponseBodyJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
