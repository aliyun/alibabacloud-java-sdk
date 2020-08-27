// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttributeRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static ExtractPedestrianFeatureAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractPedestrianFeatureAttributeRequest self = new ExtractPedestrianFeatureAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ExtractPedestrianFeatureAttributeRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
