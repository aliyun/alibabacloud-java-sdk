// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveEditingJobResponseBody extends TeaModel {
    @NameInMap("LiveEditingJob")
    public GetLiveEditingJobResponseBodyLiveEditingJob liveEditingJob;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLiveEditingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveEditingJobResponseBody self = new GetLiveEditingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveEditingJobResponseBody setLiveEditingJob(GetLiveEditingJobResponseBodyLiveEditingJob liveEditingJob) {
        this.liveEditingJob = liveEditingJob;
        return this;
    }
    public GetLiveEditingJobResponseBodyLiveEditingJob getLiveEditingJob() {
        return this.liveEditingJob;
    }

    public GetLiveEditingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>domain.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>streamName</p>
         */
        @NameInMap("StreamName")
        public String streamName;

        public static GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig self = new GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig();
            return TeaModel.build(map, self);
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig setStreamName(String streamName) {
            this.streamName = streamName;
            return this;
        }
        public String getStreamName() {
            return this.streamName;
        }

    }

    public static class GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Accurate</p>
         */
        @NameInMap("Mode")
        public String mode;

        public static GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig self = new GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig();
            return TeaModel.build(map, self);
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Bitrate")
        public Long bitrate;

        /**
         * <strong>example:</strong>
         * <p>test.mp4</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>480</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p><a href="https://testice-testbucket.oss-cn-shanghai.aliyuncs.com/test.mp4">https://testice-testbucket.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
         */
        @NameInMap("MediaURL")
        public String mediaURL;

        /**
         * <strong>example:</strong>
         * <p>outin-xxxxxx.oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("StorageLocation")
        public String storageLocation;

        /**
         * <strong>example:</strong>
         * <p>VOD_NO_TRANSCODE</p>
         */
        @NameInMap("VodTemplateGroupId")
        public String vodTemplateGroupId;

        /**
         * <strong>example:</strong>
         * <p>640</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig self = new GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig();
            return TeaModel.build(map, self);
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setBitrate(Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Long getBitrate() {
            return this.bitrate;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setMediaURL(String mediaURL) {
            this.mediaURL = mediaURL;
            return this;
        }
        public String getMediaURL() {
            return this.mediaURL;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setStorageLocation(String storageLocation) {
            this.storageLocation = storageLocation;
            return this;
        }
        public String getStorageLocation() {
            return this.storageLocation;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setVodTemplateGroupId(String vodTemplateGroupId) {
            this.vodTemplateGroupId = vodTemplateGroupId;
            return this;
        }
        public String getVodTemplateGroupId() {
            return this.vodTemplateGroupId;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetLiveEditingJobResponseBodyLiveEditingJob extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[{\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:01:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:03:00Z\&quot; }]</p>
         */
        @NameInMap("Clips")
        public String clips;

        /**
         * <strong>example:</strong>
         * <p>InvalidParameter</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:52Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:40Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("LiveStreamConfig")
        public GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig liveStreamConfig;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>0cc6ba49eab379332c5b</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaProduceConfig")
        public GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig mediaProduceConfig;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4</a></p>
         */
        @NameInMap("MediaURL")
        public String mediaURL;

        /**
         * <strong>example:</strong>
         * <p>The specific parameter LiveStreamConfig is not valid.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:49Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("OutputMediaConfig")
        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig outputMediaConfig;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value\&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetLiveEditingJobResponseBodyLiveEditingJob build(java.util.Map<String, ?> map) throws Exception {
            GetLiveEditingJobResponseBodyLiveEditingJob self = new GetLiveEditingJobResponseBodyLiveEditingJob();
            return TeaModel.build(map, self);
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setClips(String clips) {
            this.clips = clips;
            return this;
        }
        public String getClips() {
            return this.clips;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setLiveStreamConfig(GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig liveStreamConfig) {
            this.liveStreamConfig = liveStreamConfig;
            return this;
        }
        public GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig getLiveStreamConfig() {
            return this.liveStreamConfig;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setMediaProduceConfig(GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig mediaProduceConfig) {
            this.mediaProduceConfig = mediaProduceConfig;
            return this;
        }
        public GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig getMediaProduceConfig() {
            return this.mediaProduceConfig;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setMediaURL(String mediaURL) {
            this.mediaURL = mediaURL;
            return this;
        }
        public String getMediaURL() {
            return this.mediaURL;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setOutputMediaConfig(GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig outputMediaConfig) {
            this.outputMediaConfig = outputMediaConfig;
            return this;
        }
        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig getOutputMediaConfig() {
            return this.outputMediaConfig;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
