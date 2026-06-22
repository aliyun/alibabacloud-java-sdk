// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsightsConfig extends TeaModel {
    /**
     * <p>The video synopsis configuration.</p>
     */
    @NameInMap("Caption")
    public VideoInsightsCaptionConfig caption;

    @NameInMap("Label")
    public VideoInsightsLabelConfig label;

    @NameInMap("MultiStream")
    public VideoInsightsMultiStreamConfig multiStream;

    public static VideoInsightsConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoInsightsConfig self = new VideoInsightsConfig();
        return TeaModel.build(map, self);
    }

    public VideoInsightsConfig setCaption(VideoInsightsCaptionConfig caption) {
        this.caption = caption;
        return this;
    }
    public VideoInsightsCaptionConfig getCaption() {
        return this.caption;
    }

    public VideoInsightsConfig setLabel(VideoInsightsLabelConfig label) {
        this.label = label;
        return this;
    }
    public VideoInsightsLabelConfig getLabel() {
        return this.label;
    }

    public VideoInsightsConfig setMultiStream(VideoInsightsMultiStreamConfig multiStream) {
        this.multiStream = multiStream;
        return this;
    }
    public VideoInsightsMultiStreamConfig getMultiStream() {
        return this.multiStream;
    }

}
