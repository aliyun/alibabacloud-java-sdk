// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("StyleUrl")
    @Validation(required = true)
    public String styleUrl;

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

    public ImitatePhotoStyleAdvanceRequest setStyleUrl(String styleUrl) {
        this.styleUrl = styleUrl;
        return this;
    }
    public String getStyleUrl() {
        return this.styleUrl;
    }

}
