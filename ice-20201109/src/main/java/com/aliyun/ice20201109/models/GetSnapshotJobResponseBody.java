// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSnapshotJobResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 截图任务信息
    @NameInMap("SnapshotJob")
    public GetSnapshotJobResponseBodySnapshotJob snapshotJob;

    public static GetSnapshotJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotJobResponseBody self = new GetSnapshotJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSnapshotJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSnapshotJobResponseBody setSnapshotJob(GetSnapshotJobResponseBodySnapshotJob snapshotJob) {
        this.snapshotJob = snapshotJob;
        return this;
    }
    public GetSnapshotJobResponseBodySnapshotJob getSnapshotJob() {
        return this.snapshotJob;
    }

    public static class GetSnapshotJobResponseBodySnapshotJobInputOssFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static GetSnapshotJobResponseBodySnapshotJobInputOssFile build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotJobResponseBodySnapshotJobInputOssFile self = new GetSnapshotJobResponseBodySnapshotJobInputOssFile();
            return TeaModel.build(map, self);
        }

        public GetSnapshotJobResponseBodySnapshotJobInputOssFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetSnapshotJobResponseBodySnapshotJobInputOssFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetSnapshotJobResponseBodySnapshotJobInputOssFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class GetSnapshotJobResponseBodySnapshotJobInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        // 输入类型为媒资ID时的OSS地址
        @NameInMap("OssFile")
        public GetSnapshotJobResponseBodySnapshotJobInputOssFile ossFile;

        @NameInMap("Type")
        public String type;

        public static GetSnapshotJobResponseBodySnapshotJobInput build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotJobResponseBodySnapshotJobInput self = new GetSnapshotJobResponseBodySnapshotJobInput();
            return TeaModel.build(map, self);
        }

        public GetSnapshotJobResponseBodySnapshotJobInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetSnapshotJobResponseBodySnapshotJobInput setOssFile(GetSnapshotJobResponseBodySnapshotJobInputOssFile ossFile) {
            this.ossFile = ossFile;
            return this;
        }
        public GetSnapshotJobResponseBodySnapshotJobInputOssFile getOssFile() {
            return this.ossFile;
        }

        public GetSnapshotJobResponseBodySnapshotJobInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetSnapshotJobResponseBodySnapshotJobOutputOssFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static GetSnapshotJobResponseBodySnapshotJobOutputOssFile build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotJobResponseBodySnapshotJobOutputOssFile self = new GetSnapshotJobResponseBodySnapshotJobOutputOssFile();
            return TeaModel.build(map, self);
        }

        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class GetSnapshotJobResponseBodySnapshotJobOutput extends TeaModel {
        @NameInMap("Media")
        public String media;

        // 输出类型为媒资ID时的OSS地址
        @NameInMap("OssFile")
        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile ossFile;

        @NameInMap("Type")
        public String type;

        public static GetSnapshotJobResponseBodySnapshotJobOutput build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotJobResponseBodySnapshotJobOutput self = new GetSnapshotJobResponseBodySnapshotJobOutput();
            return TeaModel.build(map, self);
        }

        public GetSnapshotJobResponseBodySnapshotJobOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public GetSnapshotJobResponseBodySnapshotJobOutput setOssFile(GetSnapshotJobResponseBodySnapshotJobOutputOssFile ossFile) {
            this.ossFile = ossFile;
            return this;
        }
        public GetSnapshotJobResponseBodySnapshotJobOutputOssFile getOssFile() {
            return this.ossFile;
        }

        public GetSnapshotJobResponseBodySnapshotJobOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetSnapshotJobResponseBodySnapshotJob extends TeaModel {
        @NameInMap("Async")
        public Boolean async;

        @NameInMap("Code")
        public String code;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Input")
        public GetSnapshotJobResponseBodySnapshotJobInput input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Output")
        public GetSnapshotJobResponseBodySnapshotJobOutput output;

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

        @NameInMap("Type")
        public String type;

        @NameInMap("UserData")
        public String userData;

        public static GetSnapshotJobResponseBodySnapshotJob build(java.util.Map<String, ?> map) throws Exception {
            GetSnapshotJobResponseBodySnapshotJob self = new GetSnapshotJobResponseBodySnapshotJob();
            return TeaModel.build(map, self);
        }

        public GetSnapshotJobResponseBodySnapshotJob setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public GetSnapshotJobResponseBodySnapshotJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetSnapshotJobResponseBodySnapshotJob setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetSnapshotJobResponseBodySnapshotJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSnapshotJobResponseBodySnapshotJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public GetSnapshotJobResponseBodySnapshotJob setInput(GetSnapshotJobResponseBodySnapshotJobInput input) {
            this.input = input;
            return this;
        }
        public GetSnapshotJobResponseBodySnapshotJobInput getInput() {
            return this.input;
        }

        public GetSnapshotJobResponseBodySnapshotJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetSnapshotJobResponseBodySnapshotJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetSnapshotJobResponseBodySnapshotJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetSnapshotJobResponseBodySnapshotJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSnapshotJobResponseBodySnapshotJob setOutput(GetSnapshotJobResponseBodySnapshotJobOutput output) {
            this.output = output;
            return this;
        }
        public GetSnapshotJobResponseBodySnapshotJobOutput getOutput() {
            return this.output;
        }

        public GetSnapshotJobResponseBodySnapshotJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public GetSnapshotJobResponseBodySnapshotJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSnapshotJobResponseBodySnapshotJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetSnapshotJobResponseBodySnapshotJob setTemplateConfig(String templateConfig) {
            this.templateConfig = templateConfig;
            return this;
        }
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        public GetSnapshotJobResponseBodySnapshotJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetSnapshotJobResponseBodySnapshotJob setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public GetSnapshotJobResponseBodySnapshotJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSnapshotJobResponseBodySnapshotJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
