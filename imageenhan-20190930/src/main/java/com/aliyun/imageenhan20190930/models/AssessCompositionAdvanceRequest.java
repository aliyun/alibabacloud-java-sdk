// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessCompositionAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static AssessCompositionAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AssessCompositionAdvanceRequest self = new AssessCompositionAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AssessCompositionAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
