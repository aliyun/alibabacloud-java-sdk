// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AsyncCreateClipsTimeLineRequest extends TeaModel {
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
    public AsyncCreateClipsTimeLineRequestHighLightConfig highLightConfig;

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

    public static AsyncCreateClipsTimeLineRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncCreateClipsTimeLineRequest self = new AsyncCreateClipsTimeLineRequest();
        return TeaModel.build(map, self);
    }

    public AsyncCreateClipsTimeLineRequest setAdditionalContent(String additionalContent) {
        this.additionalContent = additionalContent;
        return this;
    }
    public String getAdditionalContent() {
        return this.additionalContent;
    }

    public AsyncCreateClipsTimeLineRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public AsyncCreateClipsTimeLineRequest setHighLightConfig(AsyncCreateClipsTimeLineRequestHighLightConfig highLightConfig) {
        this.highLightConfig = highLightConfig;
        return this;
    }
    public AsyncCreateClipsTimeLineRequestHighLightConfig getHighLightConfig() {
        return this.highLightConfig;
    }

    public AsyncCreateClipsTimeLineRequest setNoRefVideo(Boolean noRefVideo) {
        this.noRefVideo = noRefVideo;
        return this;
    }
    public Boolean getNoRefVideo() {
        return this.noRefVideo;
    }

    public AsyncCreateClipsTimeLineRequest setProcessPrompt(String processPrompt) {
        this.processPrompt = processPrompt;
        return this;
    }
    public String getProcessPrompt() {
        return this.processPrompt;
    }

    public AsyncCreateClipsTimeLineRequest setRecommendAudio(Boolean recommendAudio) {
        this.recommendAudio = recommendAudio;
        return this;
    }
    public Boolean getRecommendAudio() {
        return this.recommendAudio;
    }

    public AsyncCreateClipsTimeLineRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AsyncCreateClipsTimeLineRequest setTimelineScene(Integer timelineScene) {
        this.timelineScene = timelineScene;
        return this;
    }
    public Integer getTimelineScene() {
        return this.timelineScene;
    }

    public AsyncCreateClipsTimeLineRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class AsyncCreateClipsTimeLineRequestHighLightConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HtAnalyzeRhythm")
        public Boolean htAnalyzeRhythm;

        /**
         * <strong>example:</strong>
         * <p>[
         *         &quot;高清演员近景特写镜头【高优】&quot;,
         *         &quot;演出高潮-沉浸表演【高优】&quot;,
         *         &quot;演出高潮-近景表情【高优】&quot;
         * ]</p>
         */
        @NameInMap("HtHighQualityLabel")
        public java.util.List<String> htHighQualityLabel;

        /**
         * <strong>example:</strong>
         * <p>[
         *         &quot;画面昏暗&quot;,
         *         &quot;采访画面&quot;,
         *         &quot;字幕画面&quot;
         * ]</p>
         */
        @NameInMap("HtLowQualityLabel")
        public java.util.List<String> htLowQualityLabel;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("HtMaxTimeLength")
        public Integer htMaxTimeLength;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HtMinTimeLength")
        public Integer htMinTimeLength;

        /**
         * <strong>example:</strong>
         * <p>请从输入的音乐演出视频中，自动识别并提取出「最具视觉冲击力、情感爆发力或独特吸引力」...</p>
         */
        @NameInMap("HtPrompt")
        public String htPrompt;

        /**
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        @NameInMap("HtSingleShotLen")
        public Integer htSingleShotLen;

        public static AsyncCreateClipsTimeLineRequestHighLightConfig build(java.util.Map<String, ?> map) throws Exception {
            AsyncCreateClipsTimeLineRequestHighLightConfig self = new AsyncCreateClipsTimeLineRequestHighLightConfig();
            return TeaModel.build(map, self);
        }

        public AsyncCreateClipsTimeLineRequestHighLightConfig setHtAnalyzeRhythm(Boolean htAnalyzeRhythm) {
            this.htAnalyzeRhythm = htAnalyzeRhythm;
            return this;
        }
        public Boolean getHtAnalyzeRhythm() {
            return this.htAnalyzeRhythm;
        }

        public AsyncCreateClipsTimeLineRequestHighLightConfig setHtHighQualityLabel(java.util.List<String> htHighQualityLabel) {
            this.htHighQualityLabel = htHighQualityLabel;
            return this;
        }
        public java.util.List<String> getHtHighQualityLabel() {
            return this.htHighQualityLabel;
        }

        public AsyncCreateClipsTimeLineRequestHighLightConfig setHtLowQualityLabel(java.util.List<String> htLowQualityLabel) {
            this.htLowQualityLabel = htLowQualityLabel;
            return this;
        }
        public java.util.List<String> getHtLowQualityLabel() {
            return this.htLowQualityLabel;
        }

        public AsyncCreateClipsTimeLineRequestHighLightConfig setHtMaxTimeLength(Integer htMaxTimeLength) {
            this.htMaxTimeLength = htMaxTimeLength;
            return this;
        }
        public Integer getHtMaxTimeLength() {
            return this.htMaxTimeLength;
        }

        public AsyncCreateClipsTimeLineRequestHighLightConfig setHtMinTimeLength(Integer htMinTimeLength) {
            this.htMinTimeLength = htMinTimeLength;
            return this;
        }
        public Integer getHtMinTimeLength() {
            return this.htMinTimeLength;
        }

        public AsyncCreateClipsTimeLineRequestHighLightConfig setHtPrompt(String htPrompt) {
            this.htPrompt = htPrompt;
            return this;
        }
        public String getHtPrompt() {
            return this.htPrompt;
        }

        public AsyncCreateClipsTimeLineRequestHighLightConfig setHtSingleShotLen(Integer htSingleShotLen) {
            this.htSingleShotLen = htSingleShotLen;
            return this;
        }
        public Integer getHtSingleShotLen() {
            return this.htSingleShotLen;
        }

    }

}
