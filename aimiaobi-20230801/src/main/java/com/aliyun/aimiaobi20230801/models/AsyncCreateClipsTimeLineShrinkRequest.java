// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTimeLineShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>素材附加信息</p>
     */
    @NameInMap("AdditionalContent")
    public String additionalContent;

    /**
     * <strong>example:</strong>
     * <p>自定义口播内容</p>
     */
    @NameInMap("CustomContent")
    public String customContent;

    @NameInMap("HighLightConfig")
    public String highLightConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>默认开启</p>
     */
    @NameInMap("NoRefVideo")
    public Boolean noRefVideo;

    /**
     * <strong>example:</strong>
     * <p>口播内容是乌镇旅游宣传广告，口播内容时长约为1分钟，开头要描述乌镇是千年文化传承的江南水乡，之后要体现乌镇的传统手工艺、美食和美景，最后要号召大家来乌镇旅游</p>
     */
    @NameInMap("ProcessPrompt")
    public String processPrompt;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RecommendAudio")
    public Boolean recommendAudio;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7AA2AE16-D873-5C5F-9708-15396C382EB1</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>null - 通用口播
     *  0-通用口播
     *  1- 高光</p>
     */
    @NameInMap("TimelineScene")
    public Integer timelineScene;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2setzb9x4ewsd</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AsyncCreateClipsTimeLineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateClipsTimeLineShrinkRequest self = new AsyncCreateClipsTimeLineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AsyncCreateClipsTimeLineShrinkRequest setAdditionalContent(String additionalContent) {
        this.additionalContent = additionalContent;
        return this;
    }
    public String getAdditionalContent() {
        return this.additionalContent;
    }

    public AsyncCreateClipsTimeLineShrinkRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public AsyncCreateClipsTimeLineShrinkRequest setHighLightConfigShrink(String highLightConfigShrink) {
        this.highLightConfigShrink = highLightConfigShrink;
        return this;
    }
    public String getHighLightConfigShrink() {
        return this.highLightConfigShrink;
    }

    public AsyncCreateClipsTimeLineShrinkRequest setNoRefVideo(Boolean noRefVideo) {
        this.noRefVideo = noRefVideo;
        return this;
    }
    public Boolean getNoRefVideo() {
        return this.noRefVideo;
    }

    public AsyncCreateClipsTimeLineShrinkRequest setProcessPrompt(String processPrompt) {
        this.processPrompt = processPrompt;
        return this;
    }
    public String getProcessPrompt() {
        return this.processPrompt;
    }

    public AsyncCreateClipsTimeLineShrinkRequest setRecommendAudio(Boolean recommendAudio) {
        this.recommendAudio = recommendAudio;
        return this;
    }
    public Boolean getRecommendAudio() {
        return this.recommendAudio;
    }

    public AsyncCreateClipsTimeLineShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AsyncCreateClipsTimeLineShrinkRequest setTimelineScene(Integer timelineScene) {
        this.timelineScene = timelineScene;
        return this;
    }
    public Integer getTimelineScene() {
        return this.timelineScene;
    }

    public AsyncCreateClipsTimeLineShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
