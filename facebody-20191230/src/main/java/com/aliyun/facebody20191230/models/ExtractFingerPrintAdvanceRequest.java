// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractFingerPrintAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("ImageData")
    public byte[] imageData;

    public static ExtractFingerPrintAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractFingerPrintAdvanceRequest self = new ExtractFingerPrintAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ExtractFingerPrintAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public ExtractFingerPrintAdvanceRequest setImageData(byte[] imageData) {
        this.imageData = imageData;
        return this;
    }
    public byte[] getImageData() {
        return this.imageData;
    }

}
