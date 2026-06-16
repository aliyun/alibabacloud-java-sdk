// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveShrinkRequest extends TeaModel {
    /**
     * <p>URL of the image to be processed (mutually exclusive with ImageBase64)</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/bao/uploaded/i2/xxx.jpg">https://img.alicdn.com/bao/uploaded/i2/xxx.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Specific removal area in RLE format. If provided, this takes priority and the remove parameters are ignored</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>Elements to remove from the non-subject area of the image (1=transparent text blocks; 2=specific names; 3=text; 4=blemishes). Multiple selections allowed</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("NonObjectRemoveElements")
    public String nonObjectRemoveElementsShrink;

    /**
     * <p>Elements to remove from the image subject (1=transparent text blocks; 2=specific names; 3=text; 4=blemishes). Multiple selections allowed</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("ObjectRemoveElements")
    public String objectRemoveElementsShrink;

    public static ImageRemoveShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageRemoveShrinkRequest self = new ImageRemoveShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImageRemoveShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageRemoveShrinkRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public ImageRemoveShrinkRequest setNonObjectRemoveElementsShrink(String nonObjectRemoveElementsShrink) {
        this.nonObjectRemoveElementsShrink = nonObjectRemoveElementsShrink;
        return this;
    }
    public String getNonObjectRemoveElementsShrink() {
        return this.nonObjectRemoveElementsShrink;
    }

    public ImageRemoveShrinkRequest setObjectRemoveElementsShrink(String objectRemoveElementsShrink) {
        this.objectRemoveElementsShrink = objectRemoveElementsShrink;
        return this;
    }
    public String getObjectRemoveElementsShrink() {
        return this.objectRemoveElementsShrink;
    }

}
