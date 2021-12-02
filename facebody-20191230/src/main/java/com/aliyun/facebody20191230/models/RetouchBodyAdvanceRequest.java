// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchBodyAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("LengthenDegree")
    public Float lengthenDegree;

    @NameInMap("SlimDegree")
    public Float slimDegree;

    public static RetouchBodyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RetouchBodyAdvanceRequest self = new RetouchBodyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RetouchBodyAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RetouchBodyAdvanceRequest setLengthenDegree(Float lengthenDegree) {
        this.lengthenDegree = lengthenDegree;
        return this;
    }
    public Float getLengthenDegree() {
        return this.lengthenDegree;
    }

    public RetouchBodyAdvanceRequest setSlimDegree(Float slimDegree) {
        this.slimDegree = slimDegree;
        return this;
    }
    public Float getSlimDegree() {
        return this.slimDegree;
    }

}
