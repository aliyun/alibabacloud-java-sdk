// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveShrinkRequest extends TeaModel {
    /**
     * <p>The URL of the original image. The image must be in JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 and 3000 × 3000 pixels, and the file size cannot exceed 10 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/bao/uploaded/i2/xxx.jpg">https://img.alicdn.com/bao/uploaded/i2/xxx.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The specific removal area. This parameter must be used in conjunction with the editor. The input format is RLE.
     * If this parameter is specified, it takes precedence and the remove_non_product_area_elements and remove_product_area_elements parameters are ignored. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
     * If multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;474556 160 475356 160 476156 160 476956 160 477756 160 478556 160 479356 160 480156 160 480956 160 481756 160 482556 160 483356 160 484156 160 484956 160 485756 160 486556 160 487356 160 488156 160 488956 160 489756 160 490556 160 491356 160 492156 160&quot;</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The elements to remove from the image background. Valid values: 1 (transparent text blocks), 2 (specific names), 3 (text), and 4 (promotional stickers). You can select multiple values. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
     * If multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.
     * For more information about each type, see the product documentation.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("NonObjectRemoveElements")
    public String nonObjectRemoveElementsShrink;

    /**
     * <p>The elements to remove from the image subject. Valid values: 1 (transparent text blocks), 2 (specific names), 3 (text), and 4 (promotional stickers). You can select multiple values. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
     * If multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.
     * For more information about each type, see the product documentation.
     * Image subject: the core product area in the image.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("ObjectRemoveElements")
    public String objectRemoveElementsShrink;

    /**
     * <p>The specific removal area. This parameter must be used in conjunction with the editor. The input format is four-point coordinates [xx,yy,zz,dd]. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
     * If multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>[10,10,100,100]</p>
     */
    @NameInMap("Position")
    public String position;

    /**
     * <p>The URLs of user-specified image elements to remove. Multiple image URLs are supported. The input format is [&quot;<a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg%22,%22https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg%22%5D">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg&quot;,&quot;https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg&quot;]</a>. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
     * If multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://img.alicdn.com/bao/uploaded/i2/xxx.jpg%22%5D">https://img.alicdn.com/bao/uploaded/i2/xxx.jpg&quot;]</a></p>
     */
    @NameInMap("UserImage")
    public String userImageShrink;

    /**
     * <p>The user-specified text to remove. Multiple text strings are supported. The input format is [&quot;xx&quot;,&quot;yy&quot;]. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
     * If multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;xx&quot;,&quot;yy&quot;]</p>
     */
    @NameInMap("UserText")
    public String userTextShrink;

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

    public ImageRemoveShrinkRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public ImageRemoveShrinkRequest setUserImageShrink(String userImageShrink) {
        this.userImageShrink = userImageShrink;
        return this;
    }
    public String getUserImageShrink() {
        return this.userImageShrink;
    }

    public ImageRemoveShrinkRequest setUserTextShrink(String userTextShrink) {
        this.userTextShrink = userTextShrink;
        return this;
    }
    public String getUserTextShrink() {
        return this.userTextShrink;
    }

}
