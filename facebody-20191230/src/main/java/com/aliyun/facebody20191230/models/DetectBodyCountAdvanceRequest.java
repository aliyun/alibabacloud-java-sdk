// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectBodyCountAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static DetectBodyCountAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectBodyCountAdvanceRequest self = new DetectBodyCountAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectBodyCountAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
