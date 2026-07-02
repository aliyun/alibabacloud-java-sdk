// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class InsightsConfig extends TeaModel {
    @NameInMap("Image")
    public ImageInsightsConfig image;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-Hans</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The video content-aware configuration.</p>
     */
    @NameInMap("Video")
    public VideoInsightsConfig video;

    public static InsightsConfig build(java.util.Map<String, ?> map) throws Exception {
        InsightsConfig self = new InsightsConfig();
        return TeaModel.build(map, self);
    }

    public InsightsConfig setImage(ImageInsightsConfig image) {
        this.image = image;
        return this;
    }
    public ImageInsightsConfig getImage() {
        return this.image;
    }

    public InsightsConfig setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public InsightsConfig setVideo(VideoInsightsConfig video) {
        this.video = video;
        return this;
    }
    public VideoInsightsConfig getVideo() {
        return this.video;
    }

}
