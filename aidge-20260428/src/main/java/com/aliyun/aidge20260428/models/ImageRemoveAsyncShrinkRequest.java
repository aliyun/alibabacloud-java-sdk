// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveAsyncShrinkRequest extends TeaModel {
    /**
     * <p>The business order ID of the caller. This ID is recorded when the request is accepted and returned as-is when you query the result of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>order-20260928-001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The URL of the original image. The image must be in JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 and 3000 × 3000 pixels, and the file size cannot exceed 10 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;<a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a>&quot;</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The specific area to erase. This parameter must be used in conjunction with the editor. The input format is Run-Length Encoding (RLE).
     * If this parameter is specified, it takes precedence and the remove_non_product_area_elements and remove_product_area_elements parameters are ignored. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
     * If multiple parameters are specified, the priority is as follows: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;474556 160 475356 160 476156 160 476956 160 477756 160 478556 160 479356 160 480156 160 480956 160 481756 160 482556 160 483356 160 484156 160 484956 160 485756 160 486556 160 487356 160 488156 160 488956 160 489756 160 490556 160 491356 160 492156 160&quot;</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The list of element types to remove from the image background.</p>
     */
    @NameInMap("NonObjectRemoveElements")
    public String nonObjectRemoveElementsShrink;

    /**
     * <p>The types of elements to remove from the image subject. Valid values:</p>
     * <ul>
     * <li>1: Transparent text blocks.</li>
     * <li>2: Specific names.</li>
     * <li>3: Text.</li>
     * <li>4: Promotional stickers.
     * You can select multiple element types. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
     * If multiple parameters are specified, the priority is as follows: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.
     * For more information about each type, see the product documentation.
     * Image subject: the core product area in the image.</li>
     * </ul>
     */
    @NameInMap("ObjectRemoveElements")
    public String objectRemoveElementsShrink;

    /**
     * <p>The specific area to erase. This parameter must be used in conjunction with the editor. The input format is a four-point coordinate array, such as [xx,yy,zz,dd]. This parameter is optional, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage.
     * If multiple parameters are specified, the priority is as follows: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>[10,20,100,200]</p>
     */
    @NameInMap("Position")
    public String position;

    /**
     * <p>The list of URLs for user-specified image elements to erase.</p>
     */
    @NameInMap("UserImage")
    public String userImageShrink;

    /**
     * <p>The list of user-specified text strings to erase.</p>
     */
    @NameInMap("UserText")
    public String userTextShrink;

    public static ImageRemoveAsyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageRemoveAsyncShrinkRequest self = new ImageRemoveAsyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImageRemoveAsyncShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ImageRemoveAsyncShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageRemoveAsyncShrinkRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public ImageRemoveAsyncShrinkRequest setNonObjectRemoveElementsShrink(String nonObjectRemoveElementsShrink) {
        this.nonObjectRemoveElementsShrink = nonObjectRemoveElementsShrink;
        return this;
    }
    public String getNonObjectRemoveElementsShrink() {
        return this.nonObjectRemoveElementsShrink;
    }

    public ImageRemoveAsyncShrinkRequest setObjectRemoveElementsShrink(String objectRemoveElementsShrink) {
        this.objectRemoveElementsShrink = objectRemoveElementsShrink;
        return this;
    }
    public String getObjectRemoveElementsShrink() {
        return this.objectRemoveElementsShrink;
    }

    public ImageRemoveAsyncShrinkRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public ImageRemoveAsyncShrinkRequest setUserImageShrink(String userImageShrink) {
        this.userImageShrink = userImageShrink;
        return this;
    }
    public String getUserImageShrink() {
        return this.userImageShrink;
    }

    public ImageRemoveAsyncShrinkRequest setUserTextShrink(String userTextShrink) {
        this.userTextShrink = userTextShrink;
        return this;
    }
    public String getUserTextShrink() {
        return this.userTextShrink;
    }

}
