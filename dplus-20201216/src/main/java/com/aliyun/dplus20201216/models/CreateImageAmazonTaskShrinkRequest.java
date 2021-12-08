// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dplus20201216.models;

import com.aliyun.tea.*;

public class CreateImageAmazonTaskShrinkRequest extends TeaModel {
    @NameInMap("Gif")
    public Boolean gif;

    @NameInMap("ImgUrlList")
    public String imgUrlListShrink;

    @NameInMap("TemplateMode")
    public String templateMode;

    @NameInMap("TextList")
    public String textListShrink;

    public static CreateImageAmazonTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageAmazonTaskShrinkRequest self = new CreateImageAmazonTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageAmazonTaskShrinkRequest setGif(Boolean gif) {
        this.gif = gif;
        return this;
    }
    public Boolean getGif() {
        return this.gif;
    }

    public CreateImageAmazonTaskShrinkRequest setImgUrlListShrink(String imgUrlListShrink) {
        this.imgUrlListShrink = imgUrlListShrink;
        return this;
    }
    public String getImgUrlListShrink() {
        return this.imgUrlListShrink;
    }

    public CreateImageAmazonTaskShrinkRequest setTemplateMode(String templateMode) {
        this.templateMode = templateMode;
        return this;
    }
    public String getTemplateMode() {
        return this.templateMode;
    }

    public CreateImageAmazonTaskShrinkRequest setTextListShrink(String textListShrink) {
        this.textListShrink = textListShrink;
        return this;
    }
    public String getTextListShrink() {
        return this.textListShrink;
    }

}
