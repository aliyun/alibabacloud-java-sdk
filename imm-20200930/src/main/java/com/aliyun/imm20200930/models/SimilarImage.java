// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimilarImage extends TeaModel {
    @NameInMap("ImageScore")
    public Double imageScore;

    @NameInMap("URI")
    public String URI;

    public static SimilarImage build(java.util.Map<String, ?> map) throws Exception {
        SimilarImage self = new SimilarImage();
        return TeaModel.build(map, self);
    }

    public SimilarImage setImageScore(Double imageScore) {
        this.imageScore = imageScore;
        return this;
    }
    public Double getImageScore() {
        return this.imageScore;
    }

    public SimilarImage setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
    }

}
