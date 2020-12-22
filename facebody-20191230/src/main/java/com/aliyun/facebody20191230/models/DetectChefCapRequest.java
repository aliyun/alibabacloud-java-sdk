// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectChefCapRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectChefCapRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectChefCapRequest self = new DetectChefCapRequest();
        return TeaModel.build(map, self);
    }

    public DetectChefCapRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
