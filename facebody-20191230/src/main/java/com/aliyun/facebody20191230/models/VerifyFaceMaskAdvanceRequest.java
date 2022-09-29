// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class VerifyFaceMaskAdvanceRequest extends TeaModel {
    @NameInMap("ImageData")
    public byte[] imageData;

    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("RefData")
    public byte[] refData;

    @NameInMap("RefUrl")
    public java.io.InputStream refUrlObject;

    public static VerifyFaceMaskAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceMaskAdvanceRequest self = new VerifyFaceMaskAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyFaceMaskAdvanceRequest setImageData(byte[] imageData) {
        this.imageData = imageData;
        return this;
    }
    public byte[] getImageData() {
        return this.imageData;
    }

    public VerifyFaceMaskAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public VerifyFaceMaskAdvanceRequest setRefData(byte[] refData) {
        this.refData = refData;
        return this;
    }
    public byte[] getRefData() {
        return this.refData;
    }

    public VerifyFaceMaskAdvanceRequest setRefUrlObject(java.io.InputStream refUrlObject) {
        this.refUrlObject = refUrlObject;
        return this;
    }
    public java.io.InputStream getRefUrlObject() {
        return this.refUrlObject;
    }

}
