// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class CreateImageAmazonTaskRequest extends TeaModel {
    @NameInMap("Gif")
    public Boolean gif;

    @NameInMap("ImgUrlList")
    public java.util.List<String> imgUrlList;

    @NameInMap("TemplateMode")
    public String templateMode;

    @NameInMap("TextList")
    public java.util.List<String> textList;

    public static CreateImageAmazonTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageAmazonTaskRequest self = new CreateImageAmazonTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageAmazonTaskRequest setGif(Boolean gif) {
        this.gif = gif;
        return this;
    }
    public Boolean getGif() {
        return this.gif;
    }

    public CreateImageAmazonTaskRequest setImgUrlList(java.util.List<String> imgUrlList) {
        this.imgUrlList = imgUrlList;
        return this;
    }
    public java.util.List<String> getImgUrlList() {
        return this.imgUrlList;
    }

    public CreateImageAmazonTaskRequest setTemplateMode(String templateMode) {
        this.templateMode = templateMode;
        return this;
    }
    public String getTemplateMode() {
        return this.templateMode;
    }

    public CreateImageAmazonTaskRequest setTextList(java.util.List<String> textList) {
        this.textList = textList;
        return this;
    }
    public java.util.List<String> getTextList() {
        return this.textList;
    }

}
