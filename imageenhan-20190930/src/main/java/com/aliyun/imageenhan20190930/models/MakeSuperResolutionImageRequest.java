// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("OutputFormat")
    public String outputFormat;

    @NameInMap("OutputQuality")
    public Long outputQuality;

    @NameInMap("UpscaleFactor")
    public Long upscaleFactor;

    @NameInMap("Url")
    public String url;

    public static MakeSuperResolutionImageRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageRequest self = new MakeSuperResolutionImageRequest();
        return TeaModel.build(map, self);
    }

    public MakeSuperResolutionImageRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public MakeSuperResolutionImageRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public MakeSuperResolutionImageRequest setOutputQuality(Long outputQuality) {
        this.outputQuality = outputQuality;
        return this;
    }
    public Long getOutputQuality() {
        return this.outputQuality;
    }

    public MakeSuperResolutionImageRequest setUpscaleFactor(Long upscaleFactor) {
        this.upscaleFactor = upscaleFactor;
        return this;
    }
    public Long getUpscaleFactor() {
        return this.upscaleFactor;
    }

    public MakeSuperResolutionImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
