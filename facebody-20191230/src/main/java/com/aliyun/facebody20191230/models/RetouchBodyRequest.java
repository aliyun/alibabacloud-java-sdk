// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchBodyRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("SlimDegree")
    public Float slimDegree;

    @NameInMap("LengthenDegree")
    public Float lengthenDegree;

    public static RetouchBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        RetouchBodyRequest self = new RetouchBodyRequest();
        return TeaModel.build(map, self);
    }

    public RetouchBodyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RetouchBodyRequest setSlimDegree(Float slimDegree) {
        this.slimDegree = slimDegree;
        return this;
    }
    public Float getSlimDegree() {
        return this.slimDegree;
    }

    public RetouchBodyRequest setLengthenDegree(Float lengthenDegree) {
        this.lengthenDegree = lengthenDegree;
        return this;
    }
    public Float getLengthenDegree() {
        return this.lengthenDegree;
    }

}
