// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncUploadVideoRequest extends TeaModel {
    @NameInMap("AnlysisPrompt")
    public String anlysisPrompt;

    @NameInMap("ReferenceVideo")
    public AsyncUploadVideoRequestReferenceVideo referenceVideo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceVideos")
    public java.util.List<AsyncUploadVideoRequestSourceVideos> sourceVideos;

    @NameInMap("SplitInterval")
    public Integer splitInterval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AsyncUploadVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncUploadVideoRequest self = new AsyncUploadVideoRequest();
        return TeaModel.build(map, self);
    }

    public AsyncUploadVideoRequest setAnlysisPrompt(String anlysisPrompt) {
        this.anlysisPrompt = anlysisPrompt;
        return this;
    }
    public String getAnlysisPrompt() {
        return this.anlysisPrompt;
    }

    public AsyncUploadVideoRequest setReferenceVideo(AsyncUploadVideoRequestReferenceVideo referenceVideo) {
        this.referenceVideo = referenceVideo;
        return this;
    }
    public AsyncUploadVideoRequestReferenceVideo getReferenceVideo() {
        return this.referenceVideo;
    }

    public AsyncUploadVideoRequest setSourceVideos(java.util.List<AsyncUploadVideoRequestSourceVideos> sourceVideos) {
        this.sourceVideos = sourceVideos;
        return this;
    }
    public java.util.List<AsyncUploadVideoRequestSourceVideos> getSourceVideos() {
        return this.sourceVideos;
    }

    public AsyncUploadVideoRequest setSplitInterval(Integer splitInterval) {
        this.splitInterval = splitInterval;
        return this;
    }
    public Integer getSplitInterval() {
        return this.splitInterval;
    }

    public AsyncUploadVideoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AsyncUploadVideoRequestReferenceVideo extends TeaModel {
        @NameInMap("VideoExtraInfo")
        public String videoExtraInfo;

        @NameInMap("VideoName")
        public String videoName;

        @NameInMap("VideoUrl")
        public String videoUrl;

        public static AsyncUploadVideoRequestReferenceVideo build(java.util.Map<String, ?> map) throws Exception {
            AsyncUploadVideoRequestReferenceVideo self = new AsyncUploadVideoRequestReferenceVideo();
            return TeaModel.build(map, self);
        }

        public AsyncUploadVideoRequestReferenceVideo setVideoExtraInfo(String videoExtraInfo) {
            this.videoExtraInfo = videoExtraInfo;
            return this;
        }
        public String getVideoExtraInfo() {
            return this.videoExtraInfo;
        }

        public AsyncUploadVideoRequestReferenceVideo setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

        public AsyncUploadVideoRequestReferenceVideo setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

    public static class AsyncUploadVideoRequestSourceVideos extends TeaModel {
        @NameInMap("VideoExtraInfo")
        public String videoExtraInfo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123.mp4</p>
         */
        @NameInMap("VideoName")
        public String videoName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static AsyncUploadVideoRequestSourceVideos build(java.util.Map<String, ?> map) throws Exception {
            AsyncUploadVideoRequestSourceVideos self = new AsyncUploadVideoRequestSourceVideos();
            return TeaModel.build(map, self);
        }

        public AsyncUploadVideoRequestSourceVideos setVideoExtraInfo(String videoExtraInfo) {
            this.videoExtraInfo = videoExtraInfo;
            return this;
        }
        public String getVideoExtraInfo() {
            return this.videoExtraInfo;
        }

        public AsyncUploadVideoRequestSourceVideos setVideoName(String videoName) {
            this.videoName = videoName;
            return this;
        }
        public String getVideoName() {
            return this.videoName;
        }

        public AsyncUploadVideoRequestSourceVideos setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
