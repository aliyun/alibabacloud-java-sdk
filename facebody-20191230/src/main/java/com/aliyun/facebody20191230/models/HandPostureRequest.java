// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class HandPostureRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static HandPostureRequest build(java.util.Map<String, ?> map) throws Exception {
        HandPostureRequest self = new HandPostureRequest();
        return TeaModel.build(map, self);
    }

    public HandPostureRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
