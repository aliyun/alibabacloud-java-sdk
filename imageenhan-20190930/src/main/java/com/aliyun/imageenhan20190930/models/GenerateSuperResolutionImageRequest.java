// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateSuperResolutionImageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test/xxx/1025.jpg">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test/xxx/1025.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

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

    public static GenerateSuperResolutionImageRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateSuperResolutionImageRequest self = new GenerateSuperResolutionImageRequest();
        return TeaModel.build(map, self);
    }

    public GenerateSuperResolutionImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GenerateSuperResolutionImageRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public GenerateSuperResolutionImageRequest setOutputQuality(Integer outputQuality) {
        this.outputQuality = outputQuality;
        return this;
    }
    public Integer getOutputQuality() {
        return this.outputQuality;
    }

    public GenerateSuperResolutionImageRequest setScale(Integer scale) {
        this.scale = scale;
        return this;
    }
    public Integer getScale() {
        return this.scale;
    }

    public GenerateSuperResolutionImageRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
