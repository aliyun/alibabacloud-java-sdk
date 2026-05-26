// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class InsightsConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh-Hans</p>
     */
    @NameInMap("Language")
    public String language;

    @NameInMap("Video")
    public VideoInsightsConfig video;

    public static InsightsConfig build(java.util.Map<String, ?> map) throws Exception {
        InsightsConfig self = new InsightsConfig();
        return TeaModel.build(map, self);
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
