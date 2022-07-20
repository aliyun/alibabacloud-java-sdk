// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetDynamicImageJobResponseBody extends TeaModel {
    // 截图任务信息
    @NameInMap("DynamicImageJob")
    public GetDynamicImageJobResponseBodyDynamicImageJob dynamicImageJob;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDynamicImageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDynamicImageJobResponseBody self = new GetDynamicImageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDynamicImageJobResponseBody setDynamicImageJob(GetDynamicImageJobResponseBodyDynamicImageJob dynamicImageJob) {
        this.dynamicImageJob = dynamicImageJob;
        return this;
    }
    public GetDynamicImageJobResponseBodyDynamicImageJob getDynamicImageJob() {
        return this.dynamicImageJob;
    }

    public GetDynamicImageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile self = new GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile();
            return TeaModel.build(map, self);
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class GetDynamicImageJobResponseBodyDynamicImageJobInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        // 输入类型为媒资ID时的OSS地址
        @NameInMap("OssFile")
        public GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile ossFile;

        @NameInMap("Type")
        public String type;

        public static GetDynamicImageJobResponseBodyDynamicImageJobInput build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicImageJobResponseBodyDynamicImageJobInput self = new GetDynamicImageJobResponseBodyDynamicImageJobInput();
            return TeaModel.build(map, self);
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInput setOssFile(GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile ossFile) {
            this.ossFile = ossFile;
            return this;
        }
        public GetDynamicImageJobResponseBodyDynamicImageJobInputOssFile getOssFile() {
            return this.ossFile;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile self = new GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile();
            return TeaModel.build(map, self);
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class GetDynamicImageJobResponseBodyDynamicImageJobOutput extends TeaModel {
        @NameInMap("Media")
        public String media;

        // 输出类型为媒资ID时的OSS地址
        @NameInMap("OssFile")
        public GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile ossFile;

        @NameInMap("Type")
        public String type;

        public static GetDynamicImageJobResponseBodyDynamicImageJobOutput build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicImageJobResponseBodyDynamicImageJobOutput self = new GetDynamicImageJobResponseBodyDynamicImageJobOutput();
            return TeaModel.build(map, self);
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutput setOssFile(GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile ossFile) {
            this.ossFile = ossFile;
            return this;
        }
        public GetDynamicImageJobResponseBodyDynamicImageJobOutputOssFile getOssFile() {
            return this.ossFile;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJobOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetDynamicImageJobResponseBodyDynamicImageJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Input")
        public GetDynamicImageJobResponseBodyDynamicImageJobInput input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Output")
        public GetDynamicImageJobResponseBodyDynamicImageJobOutput output;

        @NameInMap("OutputUrl")
        public String outputUrl;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("TemplateConfig")
        public String templateConfig;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TriggerSource")
        public String triggerSource;

        @NameInMap("UserData")
        public String userData;

        public static GetDynamicImageJobResponseBodyDynamicImageJob build(java.util.Map<String, ?> map) throws Exception {
            GetDynamicImageJobResponseBodyDynamicImageJob self = new GetDynamicImageJobResponseBodyDynamicImageJob();
            return TeaModel.build(map, self);
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setInput(GetDynamicImageJobResponseBodyDynamicImageJobInput input) {
            this.input = input;
            return this;
        }
        public GetDynamicImageJobResponseBodyDynamicImageJobInput getInput() {
            return this.input;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setOutput(GetDynamicImageJobResponseBodyDynamicImageJobOutput output) {
            this.output = output;
            return this;
        }
        public GetDynamicImageJobResponseBodyDynamicImageJobOutput getOutput() {
            return this.output;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setOutputUrl(String outputUrl) {
            this.outputUrl = outputUrl;
            return this;
        }
        public String getOutputUrl() {
            return this.outputUrl;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public GetDynamicImageJobResponseBodyDynamicImageJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
