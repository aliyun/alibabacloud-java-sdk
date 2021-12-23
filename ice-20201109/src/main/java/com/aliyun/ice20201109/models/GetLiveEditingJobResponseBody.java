// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveEditingJobResponseBody extends TeaModel {
    // 直播剪辑任务
    @NameInMap("LiveEditingJob")
    public GetLiveEditingJobResponseBodyLiveEditingJob liveEditingJob;

    // 请求ID
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
        // 播流所属应用名称
        @NameInMap("AppName")
        public String appName;

        // 播流所属域名
        @NameInMap("DomainName")
        public String domainName;

        // 播流所属流名
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
        // 剪辑模式，默认Accurate
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
        // 输出成品的码率，单位为Kbps。可以不填，默认值是多个素材的最高码率
        @NameInMap("Bitrate")
        public Long bitrate;

        // 当 OutputMediaTarget 的目标为 vod-media 时，指定 fileName(包含文件后缀，不含路径）作为输出文件名
        @NameInMap("FileName")
        public String fileName;

        // 输出成品的高。可以不填，默认值是多个素材的最大高
        @NameInMap("Height")
        public Integer height;

        // 输出成片的文件地址
        @NameInMap("MediaURL")
        public String mediaURL;

        // 当 OutputMediaTarget 的目标为 vod-media 时， 指定 storage location 来存储媒资到 VOD; storage location 是 VOD 中的文件存储位置， 不包含 http:// 的前缀， 如:  outin-xxxxxx.oss-cn-shanghai.aliyuncs.com
        @NameInMap("StorageLocation")
        public String storageLocation;

        // 合成成片输出到vod，指定vod转码模板组。如不需要VOD转码，请填写 "VOD_NO_TRANSCODE".
        @NameInMap("VodTemplateGroupId")
        public String vodTemplateGroupId;

        // 输出成品的宽。可以不填，默认值是多个素材的最大宽
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
        // 剪辑片段列表
        @NameInMap("Clips")
        public String clips;

        // 剪辑合成作业错误码  注：作业失败时关注该字段
        @NameInMap("Code")
        public String code;

        // 直播剪辑作业完成时间，格式为utc时间。  格式为："YYYY-MM-DD'T'hh:mm:ss'Z'"。
        @NameInMap("CompleteTime")
        public String completeTime;

        // 直播剪辑作业创建时间，格式为utc时间。  格式为："YYYY-MM-DD'T'hh:mm:ss'Z'"。
        @NameInMap("CreationTime")
        public String creationTime;

        // 直播剪辑任务ID
        @NameInMap("JobId")
        public String jobId;

        // 直播剪辑配置
        @NameInMap("LiveStreamConfig")
        public GetLiveEditingJobResponseBodyLiveEditingJobLiveStreamConfig liveStreamConfig;

        // 输出成品的资源Id
        @NameInMap("MediaId")
        public String mediaId;

        // 直播剪辑合成配置
        @NameInMap("MediaProduceConfig")
        public GetLiveEditingJobResponseBodyLiveEditingJobMediaProduceConfig mediaProduceConfig;

        // 输出成品的资源文件URL
        @NameInMap("MediaURL")
        public String mediaURL;

        // 剪辑合成作业错误信息  注：作业失败时关注该字段
        @NameInMap("Message")
        public String message;

        // 直播剪辑作业修改时间，格式为utc时间。  格式为："YYYY-MM-DD'T'hh:mm:ss'Z'"。
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 输出成片的存储配置
        @NameInMap("OutputMediaConfig")
        public GetLiveEditingJobResponseBodyLiveEditingJobOutputMediaConfig outputMediaConfig;

        // 直播剪辑工程ID
        @NameInMap("ProjectId")
        public String projectId;

        // 直播剪辑作业状态，取值可能为如下值：  -Init （初始状态）  -Queuing（排队中）  -Processing（处理中）  -Success（成功）  -Failed（失败）
        @NameInMap("Status")
        public String status;

        // 用户数据
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
