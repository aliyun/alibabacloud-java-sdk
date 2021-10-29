// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class ImageAmazonRequest extends TeaModel {
    @NameInMap("Gif")
    public Boolean gif;

    @NameInMap("ImgUrlList")
    public String imgUrlList;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("TemplateMode")
    public String templateMode;

    @NameInMap("TextList")
    public java.util.List<String> textList;

    public static ImageAmazonRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageAmazonRequest self = new ImageAmazonRequest();
        return TeaModel.build(map, self);
    }

    public ImageAmazonRequest setGif(Boolean gif) {
        this.gif = gif;
        return this;
    }
    public Boolean getGif() {
        return this.gif;
    }

    public ImageAmazonRequest setImgUrlList(String imgUrlList) {
        this.imgUrlList = imgUrlList;
        return this;
    }
    public String getImgUrlList() {
        return this.imgUrlList;
    }

    public ImageAmazonRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ImageAmazonRequest setTemplateMode(String templateMode) {
        this.templateMode = templateMode;
        return this;
    }
    public String getTemplateMode() {
        return this.templateMode;
    }

    public ImageAmazonRequest setTextList(java.util.List<String> textList) {
        this.textList = textList;
        return this;
    }
    public java.util.List<String> getTextList() {
        return this.textList;
    }

}
