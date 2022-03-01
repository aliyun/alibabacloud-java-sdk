// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class HighlightGameVideoAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("Async")
    public Boolean async;

    public static HighlightGameVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        HighlightGameVideoAdvanceRequest self = new HighlightGameVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public HighlightGameVideoAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public HighlightGameVideoAdvanceRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

}
