// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ImageInsightsConfig extends TeaModel {
    @NameInMap("Caption")
    public ImageInsightsCaptionConfig caption;

    public static ImageInsightsConfig build(java.util.Map<String, ?> map) throws Exception {
        ImageInsightsConfig self = new ImageInsightsConfig();
        return TeaModel.build(map, self);
    }

    public ImageInsightsConfig setCaption(ImageInsightsCaptionConfig caption) {
        this.caption = caption;
        return this;
    }
    public ImageInsightsCaptionConfig getCaption() {
        return this.caption;
    }

}
