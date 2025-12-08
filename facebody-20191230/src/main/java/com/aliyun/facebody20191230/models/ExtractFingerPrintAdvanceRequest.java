// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractFingerPrintAdvanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iVBORw0KGgoAAAANSUhEUgAAASUAA****</p>
     */
    @NameInMap("ImageData")
    public String imageData;

    /**
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xuhan/ExtractFingerPrint.png">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test-team/xuhan/ExtractFingerPrint.png</a></p>
     */
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static ExtractFingerPrintAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractFingerPrintAdvanceRequest self = new ExtractFingerPrintAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ExtractFingerPrintAdvanceRequest setImageData(String imageData) {
        this.imageData = imageData;
        return this;
    }
    public String getImageData() {
        return this.imageData;
    }

    public ExtractFingerPrintAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
