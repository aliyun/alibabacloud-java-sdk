// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class AlivisionImgdupRequest extends TeaModel {
    @NameInMap("ImageHeight")
    public Integer imageHeight;

    @NameInMap("ImageWidth")
    public Integer imageWidth;

    @NameInMap("OutputImageNum")
    public Integer outputImageNum;

    @NameInMap("PicNumList")
    public String picNumList;

    @NameInMap("PicUrlList")
    public String picUrlList;

    public static AlivisionImgdupRequest build(java.util.Map<String, ?> map) throws Exception {
        AlivisionImgdupRequest self = new AlivisionImgdupRequest();
        return TeaModel.build(map, self);
    }

    public AlivisionImgdupRequest setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }
    public Integer getImageHeight() {
        return this.imageHeight;
    }

    public AlivisionImgdupRequest setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }
    public Integer getImageWidth() {
        return this.imageWidth;
    }

    public AlivisionImgdupRequest setOutputImageNum(Integer outputImageNum) {
        this.outputImageNum = outputImageNum;
        return this;
    }
    public Integer getOutputImageNum() {
        return this.outputImageNum;
    }

    public AlivisionImgdupRequest setPicNumList(String picNumList) {
        this.picNumList = picNumList;
        return this;
    }
    public String getPicNumList() {
        return this.picNumList;
    }

    public AlivisionImgdupRequest setPicUrlList(String picUrlList) {
        this.picUrlList = picUrlList;
        return this;
    }
    public String getPicUrlList() {
        return this.picUrlList;
    }

}
