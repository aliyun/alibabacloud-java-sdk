// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageWatermarkAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static RemoveImageWatermarkAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageWatermarkAdvanceRequest self = new RemoveImageWatermarkAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveImageWatermarkAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
