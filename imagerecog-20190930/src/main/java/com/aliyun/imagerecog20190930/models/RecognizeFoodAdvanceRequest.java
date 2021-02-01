// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeFoodAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeFoodAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFoodAdvanceRequest self = new RecognizeFoodAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFoodAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
