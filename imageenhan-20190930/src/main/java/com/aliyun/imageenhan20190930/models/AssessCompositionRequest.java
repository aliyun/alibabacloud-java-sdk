// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessCompositionRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static AssessCompositionRequest build(java.util.Map<String, ?> map) throws Exception {
        AssessCompositionRequest self = new AssessCompositionRequest();
        return TeaModel.build(map, self);
    }

    public AssessCompositionRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
