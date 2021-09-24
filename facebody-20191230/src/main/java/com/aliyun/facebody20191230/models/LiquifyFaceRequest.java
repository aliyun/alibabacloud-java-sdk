// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class LiquifyFaceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("SlimDegree")
    public Float slimDegree;

    public static LiquifyFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        LiquifyFaceRequest self = new LiquifyFaceRequest();
        return TeaModel.build(map, self);
    }

    public LiquifyFaceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public LiquifyFaceRequest setSlimDegree(Float slimDegree) {
        this.slimDegree = slimDegree;
        return this;
    }
    public Float getSlimDegree() {
        return this.slimDegree;
    }

}
