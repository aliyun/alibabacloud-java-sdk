// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsightsConfig extends TeaModel {
    @NameInMap("Caption")
    public VideoInsightsCaptionConfig caption;

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

}
