// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessSharpnessRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static AssessSharpnessRequest build(java.util.Map<String, ?> map) throws Exception {
        AssessSharpnessRequest self = new AssessSharpnessRequest();
        return TeaModel.build(map, self);
    }

    public AssessSharpnessRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
