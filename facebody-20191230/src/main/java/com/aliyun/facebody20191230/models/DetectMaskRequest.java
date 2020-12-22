// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectMaskRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectMaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectMaskRequest self = new DetectMaskRequest();
        return TeaModel.build(map, self);
    }

    public DetectMaskRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
