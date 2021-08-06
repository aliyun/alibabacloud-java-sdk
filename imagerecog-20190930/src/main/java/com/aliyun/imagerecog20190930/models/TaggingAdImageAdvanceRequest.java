// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class TaggingAdImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static TaggingAdImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TaggingAdImageAdvanceRequest self = new TaggingAdImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public TaggingAdImageAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
