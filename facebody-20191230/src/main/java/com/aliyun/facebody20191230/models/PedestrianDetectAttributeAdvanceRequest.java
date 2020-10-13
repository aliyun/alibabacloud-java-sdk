// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class PedestrianDetectAttributeAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static PedestrianDetectAttributeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PedestrianDetectAttributeAdvanceRequest self = new PedestrianDetectAttributeAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public PedestrianDetectAttributeAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
