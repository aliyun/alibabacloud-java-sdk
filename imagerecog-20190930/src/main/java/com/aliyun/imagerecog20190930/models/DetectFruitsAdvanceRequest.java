// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectFruitsAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static DetectFruitsAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFruitsAdvanceRequest self = new DetectFruitsAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectFruitsAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
