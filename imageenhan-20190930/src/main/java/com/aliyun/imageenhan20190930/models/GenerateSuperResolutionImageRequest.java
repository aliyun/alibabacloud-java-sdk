// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateSuperResolutionImageRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("OutputFormat")
    public String outputFormat;

    @NameInMap("OutputQuality")
    public Integer outputQuality;

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
