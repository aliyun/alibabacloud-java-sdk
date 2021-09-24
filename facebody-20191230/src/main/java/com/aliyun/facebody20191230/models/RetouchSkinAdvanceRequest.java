// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchSkinAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("RetouchDegree")
    public Float retouchDegree;

    @NameInMap("WhiteningDegree")
    public Float whiteningDegree;

    public static RetouchSkinAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RetouchSkinAdvanceRequest self = new RetouchSkinAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RetouchSkinAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RetouchSkinAdvanceRequest setRetouchDegree(Float retouchDegree) {
        this.retouchDegree = retouchDegree;
        return this;
    }
    public Float getRetouchDegree() {
        return this.retouchDegree;
    }

    public RetouchSkinAdvanceRequest setWhiteningDegree(Float whiteningDegree) {
        this.whiteningDegree = whiteningDegree;
        return this;
    }
    public Float getWhiteningDegree() {
        return this.whiteningDegree;
    }

}
