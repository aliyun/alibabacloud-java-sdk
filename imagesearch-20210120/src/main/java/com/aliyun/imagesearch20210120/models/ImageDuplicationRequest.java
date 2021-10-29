// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageDuplicationRequest extends TeaModel {
    @NameInMap("ImageHeight")
    public Long imageHeight;

    @NameInMap("ImageWidth")
    public Long imageWidth;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("OutputImageNum")
    public Long outputImageNum;

    @NameInMap("PicNumList")
    public String picNumList;

    @NameInMap("PicUrlList")
    public String picUrlList;

    public static ImageDuplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageDuplicationRequest self = new ImageDuplicationRequest();
        return TeaModel.build(map, self);
    }

    public ImageDuplicationRequest setImageHeight(Long imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }
    public Long getImageHeight() {
        return this.imageHeight;
    }

    public ImageDuplicationRequest setImageWidth(Long imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }
    public Long getImageWidth() {
        return this.imageWidth;
    }

    public ImageDuplicationRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ImageDuplicationRequest setOutputImageNum(Long outputImageNum) {
        this.outputImageNum = outputImageNum;
        return this;
    }
    public Long getOutputImageNum() {
        return this.outputImageNum;
    }

    public ImageDuplicationRequest setPicNumList(String picNumList) {
        this.picNumList = picNumList;
        return this;
    }
    public String getPicNumList() {
        return this.picNumList;
    }

    public ImageDuplicationRequest setPicUrlList(String picUrlList) {
        this.picUrlList = picUrlList;
        return this;
    }
    public String getPicUrlList() {
        return this.picUrlList;
    }

}
