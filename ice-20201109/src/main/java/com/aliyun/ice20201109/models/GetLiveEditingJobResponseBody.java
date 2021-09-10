// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveEditingJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveEditingJob")
    public GetLiveEditingJobResponseBodyLiveEditingJob liveEditingJob;

    public static GetLiveEditingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveEditingJobResponseBody self = new GetLiveEditingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveEditingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveEditingJobResponseBody setLiveEditingJob(GetLiveEditingJobResponseBodyLiveEditingJob liveEditingJob) {
        this.liveEditingJob = liveEditingJob;
        return this;
    }
    public GetLiveEditingJobResponseBodyLiveEditingJob getLiveEditingJob() {
        return this.liveEditingJob;
    }

    public static class GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("DomainName")
        public String domainName;

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
        @NameInMap("MediaURL")
        public String mediaURL;

        @NameInMap("StorageLocation")
        public String storageLocation;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Bitrate")
        public Long bitrate;

        @NameInMap("VodTemplateGroupId")
        public String vodTemplateGroupId;

        public static GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig self = new GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig();
            return TeaModel.build(map, self);
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

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setBitrate(Long bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Long getBitrate() {
            return this.bitrate;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig setVodTemplateGroupId(String vodTemplateGroupId) {
            this.vodTemplateGroupId = vodTemplateGroupId;
            return this;
        }
        public String getVodTemplateGroupId() {
            return this.vodTemplateGroupId;
        }

    }

    public static class GetLiveEditingJobResponseBodyLiveEditingJob extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Clips")
        public String clips;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaURL")
        public String mediaURL;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("LiveStreamConfig")
        public GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig liveStreamConfig;

        @NameInMap("MediaProduceConfig")
        public GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig mediaProduceConfig;

        @NameInMap("OutputMediaConfig")
        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig outputMediaConfig;

        public static GetLiveEditingJobResponseBodyLiveEditingJob build(java.util.Map<String, ?> map) throws Exception {
            GetLiveEditingJobResponseBodyLiveEditingJob self = new GetLiveEditingJobResponseBodyLiveEditingJob();
            return TeaModel.build(map, self);
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
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

        public GetLiveEditingJobResponseBodyLiveEditingJob setClips(String clips) {
            this.clips = clips;
            return this;
        }
        public String getClips() {
            return this.clips;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setMediaURL(String mediaURL) {
            this.mediaURL = mediaURL;
            return this;
        }
        public String getMediaURL() {
            return this.mediaURL;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setLiveStreamConfig(GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig liveStreamConfig) {
            this.liveStreamConfig = liveStreamConfig;
            return this;
        }
        public GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig getLiveStreamConfig() {
            return this.liveStreamConfig;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setMediaProduceConfig(GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig mediaProduceConfig) {
            this.mediaProduceConfig = mediaProduceConfig;
            return this;
        }
        public GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig getMediaProduceConfig() {
            return this.mediaProduceConfig;
        }

        public GetLiveEditingJobResponseBodyLiveEditingJob setOutputMediaConfig(GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig outputMediaConfig) {
            this.outputMediaConfig = outputMediaConfig;
            return this;
        }
        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig getOutputMediaConfig() {
            return this.outputMediaConfig;
        }

    }

}
