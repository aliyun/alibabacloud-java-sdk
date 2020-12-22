// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class EnhanceFaceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static EnhanceFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        EnhanceFaceRequest self = new EnhanceFaceRequest();
        return TeaModel.build(map, self);
    }

    public EnhanceFaceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
