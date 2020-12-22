// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceBeautyRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("Sharp")
    public Float sharp;

    @NameInMap("Smooth")
    public Float smooth;

    @NameInMap("White")
    public Float white;

    public static FaceBeautyRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceBeautyRequest self = new FaceBeautyRequest();
        return TeaModel.build(map, self);
    }

    public FaceBeautyRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public FaceBeautyRequest setSharp(Float sharp) {
        this.sharp = sharp;
        return this;
    }
    public Float getSharp() {
        return this.sharp;
    }

    public FaceBeautyRequest setSmooth(Float smooth) {
        this.smooth = smooth;
        return this;
    }
    public Float getSmooth() {
        return this.smooth;
    }

    public FaceBeautyRequest setWhite(Float white) {
        this.white = white;
        return this;
    }
    public Float getWhite() {
        return this.white;
    }

}
