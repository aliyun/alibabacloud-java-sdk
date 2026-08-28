// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveRequest extends TeaModel {
    /**
     * <p>The URL of the original image. The image must be in JPG, JPEG, PNG, BMP, or WEBP format, with a resolution between 256 × 256 and 3000 × 3000 pixels, and a file size no larger than 10 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/bao/uploaded/i2/xxx.jpg">https://img.alicdn.com/bao/uploaded/i2/xxx.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The specific removal area. This parameter must be used with the editor. The input format is RLE.
     * If provided, this takes priority and the remove_non_product_area_elements and remove_product_area_elements parameters are ignored. This parameter is not required, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
     * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;474556 160 475356 160 476156 160 476956 160 477756 160 478556 160 479356 160 480156 160 480956 160 481756 160 482556 160 483356 160 484156 160 484956 160 485756 160 486556 160 487356 160 488156 160 488956 160 489756 160 490556 160 491356 160 492156 160&quot;</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The elements to remove from the non-subject area of the image (1=transparent text blocks, 2=specific names, 3=text, 4=visual clutter). Multiple element types can be selected. This parameter is not required, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
     * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.
     * Refer to the product description for details on each type.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("NonObjectRemoveElements")
    public java.util.List<Integer> nonObjectRemoveElements;

    /**
     * <p>The elements to remove from the image subject (1=transparent text blocks, 2=specific names, 3=text, 4=visual clutter). Multiple element types can be selected. This parameter is not required, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
     * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.
     * Refer to the product description for details on each type.
     * Image subject: The core product area in the image.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("ObjectRemoveElements")
    public java.util.List<Integer> objectRemoveElements;

    /**
     * <p>The specific removal area. This parameter must be used with the editor. The input format is four-point coordinates [xx,yy,zz,dd]. This parameter is not required, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
     * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>[10,10,100,100]</p>
     */
    @NameInMap("Position")
    public String position;

    /**
     * <p>The user-specified image element links to remove. Multiple image links are supported. The input format is [&quot;<a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg%22,%22https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg%22%5D">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg&quot;,&quot;https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg&quot;]</a>. This parameter is not required, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
     * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://img.alicdn.com/bao/uploaded/i2/xxx.jpg%22%5D">https://img.alicdn.com/bao/uploaded/i2/xxx.jpg&quot;]</a></p>
     */
    @NameInMap("UserImage")
    public java.util.List<String> userImage;

    /**
     * <p>The user-specified text to remove. Multiple text inputs are supported. The input format is [&quot;xx&quot;,&quot;yy&quot;]. This parameter is not required, but at least one of the following parameters must be specified: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, or UserImage.
     * When multiple parameters are specified, the priority order is: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;xx&quot;,&quot;yy&quot;]</p>
     */
    @NameInMap("UserText")
    public java.util.List<String> userText;

    public static ImageRemoveRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageRemoveRequest self = new ImageRemoveRequest();
        return TeaModel.build(map, self);
    }

    public ImageRemoveRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageRemoveRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public ImageRemoveRequest setNonObjectRemoveElements(java.util.List<Integer> nonObjectRemoveElements) {
        this.nonObjectRemoveElements = nonObjectRemoveElements;
        return this;
    }
    public java.util.List<Integer> getNonObjectRemoveElements() {
        return this.nonObjectRemoveElements;
    }

    public ImageRemoveRequest setObjectRemoveElements(java.util.List<Integer> objectRemoveElements) {
        this.objectRemoveElements = objectRemoveElements;
        return this;
    }
    public java.util.List<Integer> getObjectRemoveElements() {
        return this.objectRemoveElements;
    }

    public ImageRemoveRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public ImageRemoveRequest setUserImage(java.util.List<String> userImage) {
        this.userImage = userImage;
        return this;
    }
    public java.util.List<String> getUserImage() {
        return this.userImage;
    }

    public ImageRemoveRequest setUserText(java.util.List<String> userText) {
        this.userText = userText;
        return this;
    }
    public java.util.List<String> getUserText() {
        return this.userText;
    }

}
