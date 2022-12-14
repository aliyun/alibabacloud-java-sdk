// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("StyleUrl")
    public java.io.InputStream styleUrlObject;

    public static ImitatePhotoStyleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImitatePhotoStyleAdvanceRequest self = new ImitatePhotoStyleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ImitatePhotoStyleAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public ImitatePhotoStyleAdvanceRequest setStyleUrlObject(java.io.InputStream styleUrlObject) {
        this.styleUrlObject = styleUrlObject;
        return this;
    }
    public java.io.InputStream getStyleUrlObject() {
        return this.styleUrlObject;
    }

}
