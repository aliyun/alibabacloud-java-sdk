// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class GetVideoTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetVideoTaskInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetVideoTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoTaskInfoResponseBody self = new GetVideoTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoTaskInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVideoTaskInfoResponseBody setData(GetVideoTaskInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVideoTaskInfoResponseBodyData getData() {
        return this.data;
    }

    public GetVideoTaskInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVideoTaskInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVideoTaskInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVideoTaskInfoResponseBodyDataTaskResult extends TeaModel {
        @NameInMap("FailCode")
        public String failCode;

        @NameInMap("FailReason")
        public String failReason;

        @NameInMap("SubtitlesUrl")
        public String subtitlesUrl;

        @NameInMap("VideoDuration")
        public Integer videoDuration;

        @NameInMap("VideoUrl")
        public String videoUrl;

        /**
         * <p>字粒度的时间戳文件，特定任务支持</p>
         */
        @NameInMap("WordSubtitlesUrl")
        public String wordSubtitlesUrl;

        public static GetVideoTaskInfoResponseBodyDataTaskResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoTaskInfoResponseBodyDataTaskResult self = new GetVideoTaskInfoResponseBodyDataTaskResult();
            return TeaModel.build(map, self);
        }

        public GetVideoTaskInfoResponseBodyDataTaskResult setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public GetVideoTaskInfoResponseBodyDataTaskResult setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public GetVideoTaskInfoResponseBodyDataTaskResult setSubtitlesUrl(String subtitlesUrl) {
            this.subtitlesUrl = subtitlesUrl;
            return this;
        }
        public String getSubtitlesUrl() {
            return this.subtitlesUrl;
        }

        public GetVideoTaskInfoResponseBodyDataTaskResult setVideoDuration(Integer videoDuration) {
            this.videoDuration = videoDuration;
            return this;
        }
        public Integer getVideoDuration() {
            return this.videoDuration;
        }

        public GetVideoTaskInfoResponseBodyDataTaskResult setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public GetVideoTaskInfoResponseBodyDataTaskResult setWordSubtitlesUrl(String wordSubtitlesUrl) {
            this.wordSubtitlesUrl = wordSubtitlesUrl;
            return this;
        }
        public String getWordSubtitlesUrl() {
            return this.wordSubtitlesUrl;
        }

    }

    public static class GetVideoTaskInfoResponseBodyData extends TeaModel {
        @NameInMap("Process")
        public String process;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskResult")
        public GetVideoTaskInfoResponseBodyDataTaskResult taskResult;

        @NameInMap("TaskUuid")
        public String taskUuid;

        @NameInMap("Type")
        public String type;

        public static GetVideoTaskInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVideoTaskInfoResponseBodyData self = new GetVideoTaskInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVideoTaskInfoResponseBodyData setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public GetVideoTaskInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVideoTaskInfoResponseBodyData setTaskResult(GetVideoTaskInfoResponseBodyDataTaskResult taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public GetVideoTaskInfoResponseBodyDataTaskResult getTaskResult() {
            return this.taskResult;
        }

        public GetVideoTaskInfoResponseBodyData setTaskUuid(String taskUuid) {
            this.taskUuid = taskUuid;
            return this;
        }
        public String getTaskUuid() {
            return this.taskUuid;
        }

        public GetVideoTaskInfoResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
