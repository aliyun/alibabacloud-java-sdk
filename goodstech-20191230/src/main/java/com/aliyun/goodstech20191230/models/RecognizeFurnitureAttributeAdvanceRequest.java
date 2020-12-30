// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureAttributeAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeFurnitureAttributeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureAttributeAdvanceRequest self = new RecognizeFurnitureAttributeAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFurnitureAttributeAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
