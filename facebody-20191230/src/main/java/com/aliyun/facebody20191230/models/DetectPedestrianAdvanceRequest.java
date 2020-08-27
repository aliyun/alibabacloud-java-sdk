// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectPedestrianAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static DetectPedestrianAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectPedestrianAdvanceRequest self = new DetectPedestrianAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectPedestrianAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
