// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class LiquifyFaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/LiquifyFace/LiquifyFace1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/LiquifyFace/LiquifyFace1.png</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
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
