// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveSnapshotJobResponseBody extends TeaModel {
    /**
     * <p>The snapshot callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/snapshot/callback">http://www.aliyun.com/snapshot/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The creation time. The time is in ISO 8601 format and in UTC (ending with Z).</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T22:22:22Z</p>
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
     * <p>The job name.</p>
     * 
     * <strong>example:</strong>
     * <p>Snapshot job 1</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The last modified time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-02-02T22:22:22Z</p>
     */
    @NameInMap("LastModified")
    public String lastModified;

    /**
     * <p>The overwrite snapshot format.</p>
     * 
     * <strong>example:</strong>
     * <p>snapshot/{JobId}.jpg</p>
     */
    @NameInMap("OverwriteFormat")
    public String overwriteFormat;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sequence snapshot format.</p>
     * 
     * <strong>example:</strong>
     * <p>snapshot/{JobId}/{UnixTimestamp}.jpg</p>
     */
    @NameInMap("SequenceFormat")
    public String sequenceFormat;

    /**
     * <p>The output information.</p>
     */
    @NameInMap("SnapshotOutput")
    public GetLiveSnapshotJobResponseBodySnapshotOutput snapshotOutput;

    /**
     * <p>The job status.</p>
     * 
     * <strong>example:</strong>
     * <p>started</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The input information.</p>
     */
    @NameInMap("StreamInput")
    public GetLiveSnapshotJobResponseBodyStreamInput streamInput;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287666</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>Template 1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The snapshot interval. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
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
        /**
         * <p>The bucket of the output endpoint. The OSS bucket is returned when the type is oss.</p>
         * 
         * <strong>example:</strong>
         * <p>testbucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The output endpoint. The OSS domain name is returned when the type is oss.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The storage type. Currently, only OSS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
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
        /**
         * <p>The input type. Currently, only RTMP is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The input URL.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://<a href="http://www.aliyun.com/stream">www.aliyun.com/stream</a></p>
         */
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
