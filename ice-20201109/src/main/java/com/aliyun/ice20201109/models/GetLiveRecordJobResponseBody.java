// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveRecordJobResponseBody extends TeaModel {
    /**
     * <p>录制任务</p>
     */
    @NameInMap("RecordJob")
    public GetLiveRecordJobResponseBodyRecordJob recordJob;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLiveRecordJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordJobResponseBody self = new GetLiveRecordJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordJobResponseBody setRecordJob(GetLiveRecordJobResponseBodyRecordJob recordJob) {
        this.recordJob = recordJob;
        return this;
    }
    public GetLiveRecordJobResponseBodyRecordJob getRecordJob() {
        return this.recordJob;
    }

    public GetLiveRecordJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLiveRecordJobResponseBodyRecordJobRecordOutput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Type")
        public String type;

        public static GetLiveRecordJobResponseBodyRecordJobRecordOutput build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordJobResponseBodyRecordJobRecordOutput self = new GetLiveRecordJobResponseBodyRecordJobRecordOutput();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordJobResponseBodyRecordJobRecordOutput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetLiveRecordJobResponseBodyRecordJobRecordOutput setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetLiveRecordJobResponseBodyRecordJobRecordOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetLiveRecordJobResponseBodyRecordJobStreamInput extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static GetLiveRecordJobResponseBodyRecordJobStreamInput build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordJobResponseBodyRecordJobStreamInput self = new GetLiveRecordJobResponseBodyRecordJobStreamInput();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordJobResponseBodyRecordJobStreamInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLiveRecordJobResponseBodyRecordJobStreamInput setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetLiveRecordJobResponseBodyRecordJob extends TeaModel {
        /**
         * <p>代表创建时间的资源属性字段</p>
         * <br>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>回调地址</p>
         */
        @NameInMap("NotifyUrl")
        public String notifyUrl;

        @NameInMap("RecordOutput")
        public GetLiveRecordJobResponseBodyRecordJobRecordOutput recordOutput;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StreamInput")
        public GetLiveRecordJobResponseBodyRecordJobStreamInput streamInput;

        /**
         * <p>录制模板ID</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>录制模板ID</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static GetLiveRecordJobResponseBodyRecordJob build(java.util.Map<String, ?> map) throws Exception {
            GetLiveRecordJobResponseBodyRecordJob self = new GetLiveRecordJobResponseBodyRecordJob();
            return TeaModel.build(map, self);
        }

        public GetLiveRecordJobResponseBodyRecordJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLiveRecordJobResponseBodyRecordJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetLiveRecordJobResponseBodyRecordJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLiveRecordJobResponseBodyRecordJob setNotifyUrl(String notifyUrl) {
            this.notifyUrl = notifyUrl;
            return this;
        }
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        public GetLiveRecordJobResponseBodyRecordJob setRecordOutput(GetLiveRecordJobResponseBodyRecordJobRecordOutput recordOutput) {
            this.recordOutput = recordOutput;
            return this;
        }
        public GetLiveRecordJobResponseBodyRecordJobRecordOutput getRecordOutput() {
            return this.recordOutput;
        }

        public GetLiveRecordJobResponseBodyRecordJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLiveRecordJobResponseBodyRecordJob setStreamInput(GetLiveRecordJobResponseBodyRecordJobStreamInput streamInput) {
            this.streamInput = streamInput;
            return this;
        }
        public GetLiveRecordJobResponseBodyRecordJobStreamInput getStreamInput() {
            return this.streamInput;
        }

        public GetLiveRecordJobResponseBodyRecordJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetLiveRecordJobResponseBodyRecordJob setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
