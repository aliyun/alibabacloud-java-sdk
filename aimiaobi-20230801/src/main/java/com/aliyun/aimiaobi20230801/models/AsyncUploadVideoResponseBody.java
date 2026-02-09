// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncUploadVideoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AsyncUploadVideoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>94512A33-8EC1-5452-A793-5C91F18ED2F0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AsyncUploadVideoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AsyncUploadVideoResponseBody self = new AsyncUploadVideoResponseBody();
        return TeaModel.build(map, self);
    }

    public AsyncUploadVideoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AsyncUploadVideoResponseBody setData(AsyncUploadVideoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AsyncUploadVideoResponseBodyData getData() {
        return this.data;
    }

    public AsyncUploadVideoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AsyncUploadVideoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AsyncUploadVideoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AsyncUploadVideoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AsyncUploadVideoResponseBodyDataVideoInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>视频中有一个房子</p>
         */
        @NameInMap("VideoExtraInfo")
        public String videoExtraInfo;

        /**
         * <strong>example:</strong>
         * <p>60616fad41b171f0bb4b4531948c0102</p>
         */
        @NameInMap("VideoId")
        public String videoId;

        /**
         * <strong>example:</strong>
         * <p>123.mp4</p>
         */
        @NameInMap("VideoName")
        public String videoName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://123.mp4">http://123.mp4</a></p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static AsyncUploadVideoResponseBodyDataVideoInfos build(java.util.Map<String, ?> map) throws Exception {
            AsyncUploadVideoResponseBodyDataVideoInfos self = new AsyncUploadVideoResponseBodyDataVideoInfos();
            return TeaModel.build(map, self);
        }

        public AsyncUploadVideoResponseBodyDataVideoInfos setVideoExtraInfo(String videoExtraInfo) {
            this.videoExtraInfo = videoExtraInfo;
            return this;
        }
        public String getVideoExtraInfo() {
            return this.videoExtraInfo;
        }

        public AsyncUploadVideoResponseBodyDataVideoInfos setVideoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public String getVideoId() {
            return this.videoId;
        }

        public AsyncUploadVideoResponseBodyDataVideoInfos setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

        public AsyncUploadVideoResponseBodyDataVideoInfos setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class AsyncUploadVideoResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("VideoInfos")
        public java.util.List<AsyncUploadVideoResponseBodyDataVideoInfos> videoInfos;

        public static AsyncUploadVideoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AsyncUploadVideoResponseBodyData self = new AsyncUploadVideoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AsyncUploadVideoResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public AsyncUploadVideoResponseBodyData setVideoInfos(java.util.List<AsyncUploadVideoResponseBodyDataVideoInfos> videoInfos) {
            this.videoInfos = videoInfos;
            return this;
        }
        public java.util.List<AsyncUploadVideoResponseBodyDataVideoInfos> getVideoInfos() {
            return this.videoInfos;
        }

    }

}
