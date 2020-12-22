// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttrRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("Mode")
    public String mode;

    public static ExtractPedestrianFeatureAttrRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractPedestrianFeatureAttrRequest self = new ExtractPedestrianFeatureAttrRequest();
        return TeaModel.build(map, self);
    }

    public ExtractPedestrianFeatureAttrRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public ExtractPedestrianFeatureAttrRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
