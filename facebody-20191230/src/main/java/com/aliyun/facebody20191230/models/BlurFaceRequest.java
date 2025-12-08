// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BlurFaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/BlurFace/BlurFace1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/BlurFace/BlurFace1.png</a></p>
     */
    @NameInMap("ImageURL")
    public String imageURL;

    public static BlurFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        BlurFaceRequest self = new BlurFaceRequest();
        return TeaModel.build(map, self);
    }

    public BlurFaceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
