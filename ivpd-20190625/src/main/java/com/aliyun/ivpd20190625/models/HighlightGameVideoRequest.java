// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class HighlightGameVideoRequest extends TeaModel {
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("VideoUrl")
    public String videoUrl;

    public static HighlightGameVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        HighlightGameVideoRequest self = new HighlightGameVideoRequest();
        return TeaModel.build(map, self);
    }

    public HighlightGameVideoRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public HighlightGameVideoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
