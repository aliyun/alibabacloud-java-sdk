// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceBeautyAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("Sharp")
    public Float sharp;

    @NameInMap("Smooth")
    public Float smooth;

    @NameInMap("White")
    public Float white;

    public static FaceBeautyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceBeautyAdvanceRequest self = new FaceBeautyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public FaceBeautyAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public FaceBeautyAdvanceRequest setSharp(Float sharp) {
        this.sharp = sharp;
        return this;
    }
    public Float getSharp() {
        return this.sharp;
    }

    public FaceBeautyAdvanceRequest setSmooth(Float smooth) {
        this.smooth = smooth;
        return this;
    }
    public Float getSmooth() {
        return this.smooth;
    }

    public FaceBeautyAdvanceRequest setWhite(Float white) {
        this.white = white;
        return this;
    }
    public Float getWhite() {
        return this.white;
    }

}
