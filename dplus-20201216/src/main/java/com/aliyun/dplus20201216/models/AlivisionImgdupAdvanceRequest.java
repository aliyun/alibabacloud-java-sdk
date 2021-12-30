// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class AlivisionImgdupAdvanceRequest extends TeaModel {
    @NameInMap("PicUrlObject")
    @Validation(required = true)
    public java.io.InputStream picUrlObject;

    @NameInMap("ImageHeight")
    public Integer imageHeight;

    @NameInMap("ImageWidth")
    public Integer imageWidth;

    @NameInMap("OutputImageNum")
    public Integer outputImageNum;

    @NameInMap("PicNum")
    public Integer picNum;

    public static AlivisionImgdupAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AlivisionImgdupAdvanceRequest self = new AlivisionImgdupAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AlivisionImgdupAdvanceRequest setPicUrlObject(java.io.InputStream picUrlObject) {
        this.picUrlObject = picUrlObject;
        return this;
    }
    public java.io.InputStream getPicUrlObject() {
        return this.picUrlObject;
    }

    public AlivisionImgdupAdvanceRequest setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }
    public Integer getImageHeight() {
        return this.imageHeight;
    }

    public AlivisionImgdupAdvanceRequest setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }
    public Integer getImageWidth() {
        return this.imageWidth;
    }

    public AlivisionImgdupAdvanceRequest setOutputImageNum(Integer outputImageNum) {
        this.outputImageNum = outputImageNum;
        return this;
    }
    public Integer getOutputImageNum() {
        return this.outputImageNum;
    }

    public AlivisionImgdupAdvanceRequest setPicNum(Integer picNum) {
        this.picNum = picNum;
        return this;
    }
    public Integer getPicNum() {
        return this.picNum;
    }

}
