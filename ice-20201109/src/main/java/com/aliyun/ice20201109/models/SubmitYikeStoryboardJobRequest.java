// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitYikeStoryboardJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4:3</p>
     */
    @NameInMap("AspectRatio")
    public String aspectRatio;

    /**
     * <strong>example:</strong>
     * <p><a href="http://test.oss-cn-shanghai.aliyuncs.com/test.mp4">http://test.oss-cn-shanghai.aliyuncs.com/test.mp4</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;AudioEnable&quot;: false
     * }</p>
     */
    @NameInMap("ModelParams")
    public String modelParams;

    /**
     * <strong>example:</strong>
     * <p>sys_YoungGracefulWoman</p>
     */
    @NameInMap("NarrationVoiceId")
    public String narrationVoiceId;

    /**
     * <strong>example:</strong>
     * <p>720P</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    /**
     * <strong>example:</strong>
     * <p>multi</p>
     */
    @NameInMap("ShotPromptMode")
    public String shotPromptMode;

    /**
     * <strong>example:</strong>
     * <p>firstPersonNarration</p>
     */
    @NameInMap("ShotSplitMode")
    public String shotSplitMode;

    /**
     * <strong>example:</strong>
     * <p>Novel</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>RealisticPhotography</p>
     */
    @NameInMap("StyleId")
    public String styleId;

    /**
     * <strong>example:</strong>
     * <p>test-title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;NotifyAddress&quot;: &quot;<a href="https://www.callback.com">https://www.callback.com</a>&quot;
     * }</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <strong>example:</strong>
     * <p>wan2.6-r2v-flash</p>
     */
    @NameInMap("VideoModel")
    public String videoModel;

    public static SubmitYikeStoryboardJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeStoryboardJobRequest self = new SubmitYikeStoryboardJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitYikeStoryboardJobRequest setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    public SubmitYikeStoryboardJobRequest setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public SubmitYikeStoryboardJobRequest setModelParams(String modelParams) {
        this.modelParams = modelParams;
        return this;
    }
    public String getModelParams() {
        return this.modelParams;
    }

    public SubmitYikeStoryboardJobRequest setNarrationVoiceId(String narrationVoiceId) {
        this.narrationVoiceId = narrationVoiceId;
        return this;
    }
    public String getNarrationVoiceId() {
        return this.narrationVoiceId;
    }

    public SubmitYikeStoryboardJobRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public SubmitYikeStoryboardJobRequest setShotPromptMode(String shotPromptMode) {
        this.shotPromptMode = shotPromptMode;
        return this;
    }
    public String getShotPromptMode() {
        return this.shotPromptMode;
    }

    public SubmitYikeStoryboardJobRequest setShotSplitMode(String shotSplitMode) {
        this.shotSplitMode = shotSplitMode;
        return this;
    }
    public String getShotSplitMode() {
        return this.shotSplitMode;
    }

    public SubmitYikeStoryboardJobRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public SubmitYikeStoryboardJobRequest setStyleId(String styleId) {
        this.styleId = styleId;
        return this;
    }
    public String getStyleId() {
        return this.styleId;
    }

    public SubmitYikeStoryboardJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitYikeStoryboardJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitYikeStoryboardJobRequest setVideoModel(String videoModel) {
        this.videoModel = videoModel;
        return this;
    }
    public String getVideoModel() {
        return this.videoModel;
    }

}
