// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveSnapshotJobResponseBody extends TeaModel {
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("LastModified")
    public String lastModified;

    @NameInMap("OverwriteFormat")
    public String overwriteFormat;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SequenceFormat")
    public String sequenceFormat;

    @NameInMap("SnapshotOutput")
    public GetLiveSnapshotJobResponseBodySnapshotOutput snapshotOutput;

    @NameInMap("Status")
    public String status;

    @NameInMap("StreamInput")
    public GetLiveSnapshotJobResponseBodyStreamInput streamInput;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TimeInterval")
    public Integer timeInterval;

    public static GetLiveSnapshotJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveSnapshotJobResponseBody self = new GetLiveSnapshotJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveSnapshotJobResponseBody setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public GetLiveSnapshotJobResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetLiveSnapshotJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetLiveSnapshotJobResponseBody setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public GetLiveSnapshotJobResponseBody setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public GetLiveSnapshotJobResponseBody setOverwriteFormat(String overwriteFormat) {
        this.overwriteFormat = overwriteFormat;
        return this;
    }
    public String getOverwriteFormat() {
        return this.overwriteFormat;
    }

    public GetLiveSnapshotJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveSnapshotJobResponseBody setSequenceFormat(String sequenceFormat) {
        this.sequenceFormat = sequenceFormat;
        return this;
    }
    public String getSequenceFormat() {
        return this.sequenceFormat;
    }

    public GetLiveSnapshotJobResponseBody setSnapshotOutput(GetLiveSnapshotJobResponseBodySnapshotOutput snapshotOutput) {
        this.snapshotOutput = snapshotOutput;
        return this;
    }
    public GetLiveSnapshotJobResponseBodySnapshotOutput getSnapshotOutput() {
        return this.snapshotOutput;
    }

    public GetLiveSnapshotJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLiveSnapshotJobResponseBody setStreamInput(GetLiveSnapshotJobResponseBodyStreamInput streamInput) {
        this.streamInput = streamInput;
        return this;
    }
    public GetLiveSnapshotJobResponseBodyStreamInput getStreamInput() {
        return this.streamInput;
    }

    public GetLiveSnapshotJobResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetLiveSnapshotJobResponseBody setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetLiveSnapshotJobResponseBody setTimeInterval(Integer timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    public static class GetLiveSnapshotJobResponseBodySnapshotOutput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("StorageType")
        public String storageType;

        public static GetLiveSnapshotJobResponseBodySnapshotOutput build(java.util.Map<String, ?> map) throws Exception {
            GetLiveSnapshotJobResponseBodySnapshotOutput self = new GetLiveSnapshotJobResponseBodySnapshotOutput();
            return TeaModel.build(map, self);
        }

        public GetLiveSnapshotJobResponseBodySnapshotOutput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public GetLiveSnapshotJobResponseBodySnapshotOutput setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetLiveSnapshotJobResponseBodySnapshotOutput setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class GetLiveSnapshotJobResponseBodyStreamInput extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static GetLiveSnapshotJobResponseBodyStreamInput build(java.util.Map<String, ?> map) throws Exception {
            GetLiveSnapshotJobResponseBodyStreamInput self = new GetLiveSnapshotJobResponseBodyStreamInput();
            return TeaModel.build(map, self);
        }

        public GetLiveSnapshotJobResponseBodyStreamInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLiveSnapshotJobResponseBodyStreamInput setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
