// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessSharpnessAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static AssessSharpnessAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AssessSharpnessAdvanceRequest self = new AssessSharpnessAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AssessSharpnessAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
