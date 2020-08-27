// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static DetectPedestrianRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianRequest self = new DetectPedestrianRequest();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
