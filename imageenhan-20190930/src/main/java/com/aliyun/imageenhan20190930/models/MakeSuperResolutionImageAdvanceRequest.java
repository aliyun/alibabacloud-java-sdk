// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class MakeSuperResolutionImageAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>base</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p>png</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <strong>example:</strong>
     * <p>95</p>
     */
    @NameInMap("OutputQuality")
    public Long outputQuality;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("UpscaleFactor")
    public Long upscaleFactor;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/MakeSuperResolutionImage/MakeSuperResolutionImage5.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/MakeSuperResolutionImage/MakeSuperResolutionImage5.png</a></p>
     */
    @NameInMap("Url")
    public java.io.InputStream urlObject;

    public static MakeSuperResolutionImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeSuperResolutionImageAdvanceRequest self = new MakeSuperResolutionImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public MakeSuperResolutionImageAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public MakeSuperResolutionImageAdvanceRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public MakeSuperResolutionImageAdvanceRequest setOutputQuality(Long outputQuality) {
        this.outputQuality = outputQuality;
        return this;
    }
    public Long getOutputQuality() {
        return this.outputQuality;
    }

    public MakeSuperResolutionImageAdvanceRequest setUpscaleFactor(Long upscaleFactor) {
        this.upscaleFactor = upscaleFactor;
        return this;
    }
    public Long getUpscaleFactor() {
        return this.upscaleFactor;
    }

    public MakeSuperResolutionImageAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

}
