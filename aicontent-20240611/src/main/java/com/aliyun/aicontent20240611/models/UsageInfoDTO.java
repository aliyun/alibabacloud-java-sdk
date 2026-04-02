// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class UsageInfoDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("completionTokens")
    public Integer completionTokens;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("imageCount")
    public Integer imageCount;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("promptTokens")
    public Integer promptTokens;

    /**
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("totalTokens")
    public Integer totalTokens;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("videoCount")
    public Integer videoCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("videoDuration")
    public Integer videoDuration;

    public static UsageInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        UsageInfoDTO self = new UsageInfoDTO();
        return TeaModel.build(map, self);
    }

    public UsageInfoDTO setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
        return this;
    }
    public Integer getCompletionTokens() {
        return this.completionTokens;
    }

    public UsageInfoDTO setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Integer getImageCount() {
        return this.imageCount;
    }

    public UsageInfoDTO setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
        return this;
    }
    public Integer getPromptTokens() {
        return this.promptTokens;
    }

    public UsageInfoDTO setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
        return this;
    }
    public Integer getTotalTokens() {
        return this.totalTokens;
    }

    public UsageInfoDTO setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
        return this;
    }
    public Integer getVideoCount() {
        return this.videoCount;
    }

    public UsageInfoDTO setVideoDuration(Integer videoDuration) {
        this.videoDuration = videoDuration;
        return this;
    }
    public Integer getVideoDuration() {
        return this.videoDuration;
    }

}
