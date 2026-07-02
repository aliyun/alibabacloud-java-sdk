// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Illustration extends TeaModel {
    /**
     * <p>The index of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ImageIndex")
    public Integer imageIndex;

    /**
     * <p>The relative path of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;imgs/page_0_img_image_box_770_540_1367_860.png&quot;</p>
     */
    @NameInMap("ImagePath")
    public String imagePath;

    /**
     * <p>The normalized coordinate of the image on the page.</p>
     */
    @NameInMap("NormalizedBox")
    public java.util.List<Float> normalizedBox;

    /**
     * <p>The page number on which the image is located.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The text result recognized by optical character recognition (OCR) from the image.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;图片&quot;</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>The type of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>image、table、code</p>
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
