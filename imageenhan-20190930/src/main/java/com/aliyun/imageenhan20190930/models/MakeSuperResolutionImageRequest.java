// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("UpscaleFactor")
    public Long upscaleFactor;

    public static MakeSuperResolutionImageRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageRequest self = new MakeSuperResolutionImageRequest();
        return TeaModel.build(map, self);
    }

    public MakeSuperResolutionImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public MakeSuperResolutionImageRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public MakeSuperResolutionImageRequest setUpscaleFactor(Long upscaleFactor) {
        this.upscaleFactor = upscaleFactor;
        return this;
    }
    public Long getUpscaleFactor() {
        return this.upscaleFactor;
    }

}
