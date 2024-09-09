// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class TransferPortraitStyleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("height")
    public Integer height;

    /**
     * <strong>example:</strong>
     * <p>WWW</p>
     */
    @NameInMap("imageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("numbers")
    public Integer numbers;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("redrawAmplitude")
    public Integer redrawAmplitude;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("style")
    public Integer style;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("width")
    public Integer width;

    public static TransferPortraitStyleRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferPortraitStyleRequest self = new TransferPortraitStyleRequest();
        return TeaModel.build(map, self);
    }

    public TransferPortraitStyleRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public TransferPortraitStyleRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public TransferPortraitStyleRequest setNumbers(Integer numbers) {
        this.numbers = numbers;
        return this;
    }
    public Integer getNumbers() {
        return this.numbers;
    }

    public TransferPortraitStyleRequest setRedrawAmplitude(Integer redrawAmplitude) {
        this.redrawAmplitude = redrawAmplitude;
        return this;
    }
    public Integer getRedrawAmplitude() {
        return this.redrawAmplitude;
    }

    public TransferPortraitStyleRequest setStyle(Integer style) {
        this.style = style;
        return this;
    }
    public Integer getStyle() {
        return this.style;
    }

    public TransferPortraitStyleRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
