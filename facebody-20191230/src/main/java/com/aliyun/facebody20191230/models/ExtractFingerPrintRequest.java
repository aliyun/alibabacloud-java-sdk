// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractFingerPrintRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("ImageData")
    public byte[] imageData;

    public static ExtractFingerPrintRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractFingerPrintRequest self = new ExtractFingerPrintRequest();
        return TeaModel.build(map, self);
    }

    public ExtractFingerPrintRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public ExtractFingerPrintRequest setImageData(byte[] imageData) {
        this.imageData = imageData;
        return this;
    }
    public byte[] getImageData() {
        return this.imageData;
    }

}
