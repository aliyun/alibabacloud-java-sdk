// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanSketchStyleRequest extends TeaModel {
    // A short description of struct
    @NameInMap("ImageURL")
    public String imageURL;

    public static GenerateHumanSketchStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanSketchStyleRequest self = new GenerateHumanSketchStyleRequest();
        return TeaModel.build(map, self);
    }

    public GenerateHumanSketchStyleRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
