// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateProductImageRequest extends TeaModel {
    @NameInMap("backgroundDescription")
    public String backgroundDescription;

    /**
     * <strong>example:</strong>
     * <p>75</p>
     */
    @NameInMap("backgroundPriority")
    public Integer backgroundPriority;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxx/background.png">http://xxx/background.png</a></p>
     */
    @NameInMap("backgroundUrl")
    public String backgroundUrl;

    @NameInMap("highlightText")
    public String highlightText;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("imageCount")
    public Integer imageCount;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxx/image.png">http://xxx/image.png</a></p>
     */
    @NameInMap("imageUrl")
    public String imageUrl;

    @NameInMap("subTitle")
    public String subTitle;

    @NameInMap("title")
    public String title;

    public static CreateProductImageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductImageRequest self = new CreateProductImageRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductImageRequest setBackgroundDescription(String backgroundDescription) {
        this.backgroundDescription = backgroundDescription;
        return this;
    }
    public String getBackgroundDescription() {
        return this.backgroundDescription;
    }

    public CreateProductImageRequest setBackgroundPriority(Integer backgroundPriority) {
        this.backgroundPriority = backgroundPriority;
        return this;
    }
    public Integer getBackgroundPriority() {
        return this.backgroundPriority;
    }

    public CreateProductImageRequest setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
        return this;
    }
    public String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public CreateProductImageRequest setHighlightText(String highlightText) {
        this.highlightText = highlightText;
        return this;
    }
    public String getHighlightText() {
        return this.highlightText;
    }

    public CreateProductImageRequest setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Integer getImageCount() {
        return this.imageCount;
    }

    public CreateProductImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateProductImageRequest setSubTitle(String subTitle) {
        this.subTitle = subTitle;
        return this;
    }
    public String getSubTitle() {
        return this.subTitle;
    }

    public CreateProductImageRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
