// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchSkinRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("RetouchDegree")
    public Float retouchDegree;

    @NameInMap("WhiteningDegree")
    public Float whiteningDegree;

    public static RetouchSkinRequest build(java.util.Map<String, ?> map) throws Exception {
        RetouchSkinRequest self = new RetouchSkinRequest();
        return TeaModel.build(map, self);
    }

    public RetouchSkinRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RetouchSkinRequest setRetouchDegree(Float retouchDegree) {
        this.retouchDegree = retouchDegree;
        return this;
    }
    public Float getRetouchDegree() {
        return this.retouchDegree;
    }

    public RetouchSkinRequest setWhiteningDegree(Float whiteningDegree) {
        this.whiteningDegree = whiteningDegree;
        return this;
    }
    public Float getWhiteningDegree() {
        return this.whiteningDegree;
    }

}
