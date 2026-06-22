// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Illustration extends TeaModel {
    /**
     * <p>The zero-based image index in a file that contains multiple images, such as a multi-page TIFF file.</p>
     */
    @NameInMap("ImageIndex")
    public Integer imageIndex;

    /**
     * <p>The path to the image file containing the illustration.</p>
     */
    @NameInMap("ImagePath")
    public String imagePath;

    /**
     * <p>An array of four floating-point numbers that defines the normalized box for the illustration in [x_min, y_min, x_max, y_max] format. The coordinates are normalized to a range of [0, 1] relative to the page dimensions.</p>
     */
    @NameInMap("NormalizedBox")
    public java.util.List<Float> normalizedBox;

    /**
     * <p>The one-based page number where the illustration is located.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The text associated with the illustration.</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>The type of the illustration, such as <code>figure</code> or <code>chart</code>.</p>
     */
    @NameInMap("Type")
    public String type;

    public static Illustration build(java.util.Map<String, ?> map) throws Exception {
        Illustration self = new Illustration();
        return TeaModel.build(map, self);
    }

    public Illustration setImageIndex(Integer imageIndex) {
        this.imageIndex = imageIndex;
        return this;
    }
    public Integer getImageIndex() {
        return this.imageIndex;
    }

    public Illustration setImagePath(String imagePath) {
        this.imagePath = imagePath;
        return this;
    }
    public String getImagePath() {
        return this.imagePath;
    }

    public Illustration setNormalizedBox(java.util.List<Float> normalizedBox) {
        this.normalizedBox = normalizedBox;
        return this;
    }
    public java.util.List<Float> getNormalizedBox() {
        return this.normalizedBox;
    }

    public Illustration setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public Illustration setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public Illustration setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
