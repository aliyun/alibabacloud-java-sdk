// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessExposureRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static AssessExposureRequest build(java.util.Map<String, ?> map) throws Exception {
        AssessExposureRequest self = new AssessExposureRequest();
        return TeaModel.build(map, self);
    }

    public AssessExposureRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
