// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveShrinkRequest extends TeaModel {
    /**
     * <p>The URL of the image to process. This parameter is mutually exclusive with ImageBase64. You must specify one of them.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/bao/uploaded/i2/xxx.jpg">https://img.alicdn.com/bao/uploaded/i2/xxx.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The specific erasure region in RLE format. If this parameter is specified, it takes priority and the remove parameters are ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The elements to remove from the non-subject area of the image. Valid values:</p>
     * <ul>
     * <li>1: transparent text block</li>
     * <li>2: specific name</li>
     * <li>3: text</li>
     * <li>4: image blemish</li>
     * </ul>
     * <p>You can specify multiple values.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("NonObjectRemoveElements")
    public String nonObjectRemoveElementsShrink;

    /**
     * <p>The elements to remove from the image subject area. Valid values:</p>
     * <ul>
     * <li>1: transparent text block</li>
     * <li>2: specific name</li>
     * <li>3: text</li>
     * <li>4: image blemish</li>
     * </ul>
     * <p>You can specify multiple values.</p>
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
