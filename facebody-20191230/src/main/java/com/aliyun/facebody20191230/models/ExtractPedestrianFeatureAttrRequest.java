// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttrRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

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

}
