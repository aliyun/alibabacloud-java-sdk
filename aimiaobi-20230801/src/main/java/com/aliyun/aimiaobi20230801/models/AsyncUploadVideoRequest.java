// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncUploadVideoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AdaptiveThreshold")
    public Float adaptiveThreshold;

    /**
     * <strong>example:</strong>
     * <p>重点理解视频中的风景信息</p>
     */
    @NameInMap("AnlysisPrompt")
    public String anlysisPrompt;

    /**
     * <strong>example:</strong>
     * <p>0.7</p>
     */
    @NameInMap("FaceIdentitySimilarityMinScore")
    public Double faceIdentitySimilarityMinScore;

    @NameInMap("ReferenceVideo")
    public AsyncUploadVideoRequestReferenceVideo referenceVideo;

    @NameInMap("RemoveSubtitle")
    public Boolean removeSubtitle;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceVideos")
    public java.util.List<AsyncUploadVideoRequestSourceVideos> sourceVideos;

    /**
     * <strong>example:</strong>
     * <p>默认1</p>
     */
    @NameInMap("SplitInterval")
    public Integer splitInterval;

    /**
     * <strong>example:</strong>
     * <p>task001</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <strong>example:</strong>
     * <p>type001</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("VideoRoles")
    public java.util.List<AsyncUploadVideoRequestVideoRoles> videoRoles;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("VideoShotFaceIdentityCount")
    public Integer videoShotFaceIdentityCount;

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

    public AsyncUploadVideoRequest setAdaptiveThreshold(Float adaptiveThreshold) {
        this.adaptiveThreshold = adaptiveThreshold;
        return this;
    }
    public Float getAdaptiveThreshold() {
        return this.adaptiveThreshold;
    }

    public AsyncUploadVideoRequest setAnlysisPrompt(String anlysisPrompt) {
        this.anlysisPrompt = anlysisPrompt;
        return this;
    }
    public String getAnlysisPrompt() {
        return this.anlysisPrompt;
    }

    public AsyncUploadVideoRequest setFaceIdentitySimilarityMinScore(Double faceIdentitySimilarityMinScore) {
        this.faceIdentitySimilarityMinScore = faceIdentitySimilarityMinScore;
        return this;
    }
    public Double getFaceIdentitySimilarityMinScore() {
        return this.faceIdentitySimilarityMinScore;
    }

    public AsyncUploadVideoRequest setReferenceVideo(AsyncUploadVideoRequestReferenceVideo referenceVideo) {
        this.referenceVideo = referenceVideo;
        return this;
    }
    public AsyncUploadVideoRequestReferenceVideo getReferenceVideo() {
        return this.referenceVideo;
    }

    public AsyncUploadVideoRequest setRemoveSubtitle(Boolean removeSubtitle) {
        this.removeSubtitle = removeSubtitle;
        return this;
    }
    public Boolean getRemoveSubtitle() {
        return this.removeSubtitle;
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

    public AsyncUploadVideoRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public AsyncUploadVideoRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public AsyncUploadVideoRequest setVideoRoles(java.util.List<AsyncUploadVideoRequestVideoRoles> videoRoles) {
        this.videoRoles = videoRoles;
        return this;
    }
    public java.util.List<AsyncUploadVideoRequestVideoRoles> getVideoRoles() {
        return this.videoRoles;
    }

    public AsyncUploadVideoRequest setVideoShotFaceIdentityCount(Integer videoShotFaceIdentityCount) {
        this.videoShotFaceIdentityCount = videoShotFaceIdentityCount;
        return this;
    }
    public Integer getVideoShotFaceIdentityCount() {
        return this.videoShotFaceIdentityCount;
    }

    public AsyncUploadVideoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AsyncUploadVideoRequestReferenceVideo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>手机cpu采用3纳米技术</p>
         */
        @NameInMap("VideoExtraInfo")
        public String videoExtraInfo;

        /**
         * <strong>example:</strong>
         * <p>refvideo.mp4</p>
         */
        @NameInMap("VideoName")
        public String videoName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/d71e_208334498220521996_51298e0a909d457693166eb883768c7a">http://viapi-customer-pop.oss-cn-shanghai.aliyuncs.com/d71e_208334498220521996_51298e0a909d457693166eb883768c7a</a></p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>视频中有一个房子</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p><a href="http://123.mp4">http://123.mp4</a>
         * 目前该接口只进行视频理解额和分析，并没有对文件进行转存。请保证视频地址在任务执行期间有效。</p>
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

    public static class AsyncUploadVideoRequestVideoRolesRoleUrls extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>王小明.jpeg</p>
         */
        @NameInMap("RoleFileName")
        public String roleFileName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx/xxx.jpeg">http://xxx/xxx.jpeg</a></p>
         */
        @NameInMap("RoleFileUrl")
        public String roleFileUrl;

        public static AsyncUploadVideoRequestVideoRolesRoleUrls build(java.util.Map<String, ?> map) throws Exception {
            AsyncUploadVideoRequestVideoRolesRoleUrls self = new AsyncUploadVideoRequestVideoRolesRoleUrls();
            return TeaModel.build(map, self);
        }

        public AsyncUploadVideoRequestVideoRolesRoleUrls setRoleFileName(String roleFileName) {
            this.roleFileName = roleFileName;
            return this;
        }
        public String getRoleFileName() {
            return this.roleFileName;
        }

        public AsyncUploadVideoRequestVideoRolesRoleUrls setRoleFileUrl(String roleFileUrl) {
            this.roleFileUrl = roleFileUrl;
            return this;
        }
        public String getRoleFileUrl() {
            return this.roleFileUrl;
        }

    }

    public static class AsyncUploadVideoRequestVideoRoles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>李晓明是一位警察</p>
         */
        @NameInMap("RoleInfo")
        public String roleInfo;

        /**
         * <strong>example:</strong>
         * <p>李晓明</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RoleUrls")
        public java.util.List<AsyncUploadVideoRequestVideoRolesRoleUrls> roleUrls;

        public static AsyncUploadVideoRequestVideoRoles build(java.util.Map<String, ?> map) throws Exception {
            AsyncUploadVideoRequestVideoRoles self = new AsyncUploadVideoRequestVideoRoles();
            return TeaModel.build(map, self);
        }

        public AsyncUploadVideoRequestVideoRoles setRoleInfo(String roleInfo) {
            this.roleInfo = roleInfo;
            return this;
        }
        public String getRoleInfo() {
            return this.roleInfo;
        }

        public AsyncUploadVideoRequestVideoRoles setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public AsyncUploadVideoRequestVideoRoles setRoleUrls(java.util.List<AsyncUploadVideoRequestVideoRolesRoleUrls> roleUrls) {
            this.roleUrls = roleUrls;
            return this;
        }
        public java.util.List<AsyncUploadVideoRequestVideoRolesRoleUrls> getRoleUrls() {
            return this.roleUrls;
        }

    }

}
