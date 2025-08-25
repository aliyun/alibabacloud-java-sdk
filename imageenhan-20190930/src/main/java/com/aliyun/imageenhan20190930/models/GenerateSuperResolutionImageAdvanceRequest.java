// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateSuperResolutionImageAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test/xxx/1025.jpg">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test/xxx/1025.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public java.io.InputStream imageUrlObject;

    /**
     * <strong>example:</strong>
     * <p>95</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("OutputQuality")
    public Integer outputQuality;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Scale")
    public Integer scale;

    @NameInMap("UserData")
    public String userData;

    public static GenerateSuperResolutionImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateSuperResolutionImageAdvanceRequest self = new GenerateSuperResolutionImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateSuperResolutionImageAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public GenerateSuperResolutionImageAdvanceRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public GenerateSuperResolutionImageAdvanceRequest setOutputQuality(Integer outputQuality) {
        this.outputQuality = outputQuality;
        return this;
    }
    public Integer getOutputQuality() {
        return this.outputQuality;
    }

    public GenerateSuperResolutionImageAdvanceRequest setScale(Integer scale) {
        this.scale = scale;
        return this;
    }
    public Integer getScale() {
        return this.scale;
    }

    public GenerateSuperResolutionImageAdvanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
