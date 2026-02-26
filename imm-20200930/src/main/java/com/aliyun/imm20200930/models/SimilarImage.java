// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SimilarImage extends TeaModel {
    /**
     * <p>The aesthetic score.</p>
     * 
     * <strong>example:</strong>
     * <p>0.709</p>
     */
    @NameInMap("ImageScore")
    public Double imageScore;

    /**
     * <p>The URI of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
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
