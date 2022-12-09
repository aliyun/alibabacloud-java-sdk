// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ErasePersonAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("UserMask")
    public java.io.InputStream userMaskObject;

    public static ErasePersonAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ErasePersonAdvanceRequest self = new ErasePersonAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ErasePersonAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public ErasePersonAdvanceRequest setUserMaskObject(java.io.InputStream userMaskObject) {
        this.userMaskObject = userMaskObject;
        return this;
    }
    public java.io.InputStream getUserMaskObject() {
        return this.userMaskObject;
    }

}
