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

    @NameInMap("PicNum")
    public Integer picNum;

    @NameInMap("PicUrl")
    public String picUrl;

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

    public AlivisionImgdupRequest setPicNum(Integer picNum) {
        this.picNum = picNum;
        return this;
    }
    public Integer getPicNum() {
        return this.picNum;
    }

    public AlivisionImgdupRequest setPicUrl(String picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public String getPicUrl() {
        return this.picUrl;
    }

}
