// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BodyPostureRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static BodyPostureRequest build(java.util.Map<String, ?> map) throws Exception {
        BodyPostureRequest self = new BodyPostureRequest();
        return TeaModel.build(map, self);
    }

    public BodyPostureRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
