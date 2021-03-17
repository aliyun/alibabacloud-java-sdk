// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageAdvanceRequest extends TeaModel {
    @NameInMap("UrlObject")
    @Validation(required = true)
    public java.io.InputStream urlObject;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("UpscaleFactor")
    public Long upscaleFactor;

    public static MakeSuperResolutionImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageAdvanceRequest self = new MakeSuperResolutionImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public MakeSuperResolutionImageAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

    public MakeSuperResolutionImageAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public MakeSuperResolutionImageAdvanceRequest setUpscaleFactor(Long upscaleFactor) {
        this.upscaleFactor = upscaleFactor;
        return this;
    }
    public Long getUpscaleFactor() {
        return this.upscaleFactor;
    }

}
