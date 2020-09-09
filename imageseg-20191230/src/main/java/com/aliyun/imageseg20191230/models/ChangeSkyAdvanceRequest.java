// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ChangeSkyAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("ReplaceImageURL")
    @Validation(required = true)
    public String replaceImageURL;

    public static ChangeSkyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeSkyAdvanceRequest self = new ChangeSkyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ChangeSkyAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public ChangeSkyAdvanceRequest setReplaceImageURL(String replaceImageURL) {
        this.replaceImageURL = replaceImageURL;
        return this;
    }
    public String getReplaceImageURL() {
        return this.replaceImageURL;
    }

}
