// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ErasePersonAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("UserMask")
    public String userMask;

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

    public ErasePersonAdvanceRequest setUserMask(String userMask) {
        this.userMask = userMask;
        return this;
    }
    public String getUserMask() {
        return this.userMask;
    }

}
