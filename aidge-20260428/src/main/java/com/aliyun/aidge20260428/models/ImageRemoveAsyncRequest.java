// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveAsyncRequest extends TeaModel {
    /**
     * <p>The URL of the original image. The image must be in JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 and 3000 × 3000 pixels, and the file size must not exceed 10 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;<a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a>&quot;</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The specific area to erase. This parameter must be used in conjunction with the editor, and the input format is RLE. If this parameter is specified, it takes precedence and the remove_non_product_area_elements and remove_product_area_elements parameters are ignored. This parameter is not required, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage. If multiple parameters are specified, the priority is as follows: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;474556 160 475356 160 476156 160 476956 160 477756 160 478556 160 479356 160 480156 160 480956 160 481756 160 482556 160 483356 160 484156 160 484956 160 485756 160 486556 160 487356 160 488156 160 488956 160 489756 160 490556 160 491356 160 492156 160&quot;</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The list of element types to remove from the non-subject area of the image.</p>
     */
    @NameInMap("NonObjectRemoveElements")
    public java.util.List<Integer> nonObjectRemoveElements;

    /**
     * <p>The types of elements to remove from the image subject. Valid values: 1 (transparent text blocks), 2 (specific names), 3 (text), and 4 (watermarks). You can select multiple element types. This parameter is not required, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage. If multiple parameters are specified, the priority is as follows: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements. For more information about each type, see the product documentation. Image subject: the core product area in the image.</p>
     */
    @NameInMap("ObjectRemoveElements")
    public java.util.List<Integer> objectRemoveElements;

    /**
     * <p>The specific area to erase. This parameter must be used in conjunction with the editor, and the input format is four-point coordinates [xx,yy,zz,dd]. This parameter is not required, but you must specify at least one of the following parameters: ObjectRemoveElements, NonObjectRemoveElements, Mask, Position, UserText, and UserImage. If multiple parameters are specified, the priority is as follows: UserImage &gt; UserText &gt; Position &gt; Mask &gt; ObjectRemoveElements = NonObjectRemoveElements.</p>
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
    public java.util.List<String> userImage;

    /**
     * <p>The list of user-specified texts to erase.</p>
     */
    @NameInMap("UserText")
    public java.util.List<String> userText;

    public static ImageRemoveAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageRemoveAsyncRequest self = new ImageRemoveAsyncRequest();
        return TeaModel.build(map, self);
    }

    public ImageRemoveAsyncRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageRemoveAsyncRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public ImageRemoveAsyncRequest setNonObjectRemoveElements(java.util.List<Integer> nonObjectRemoveElements) {
        this.nonObjectRemoveElements = nonObjectRemoveElements;
        return this;
    }
    public java.util.List<Integer> getNonObjectRemoveElements() {
        return this.nonObjectRemoveElements;
    }

    public ImageRemoveAsyncRequest setObjectRemoveElements(java.util.List<Integer> objectRemoveElements) {
        this.objectRemoveElements = objectRemoveElements;
        return this;
    }
    public java.util.List<Integer> getObjectRemoveElements() {
        return this.objectRemoveElements;
    }

    public ImageRemoveAsyncRequest setPosition(String position) {
        this.position = position;
        return this;
    }
    public String getPosition() {
        return this.position;
    }

    public ImageRemoveAsyncRequest setUserImage(java.util.List<String> userImage) {
        this.userImage = userImage;
        return this;
    }
    public java.util.List<String> getUserImage() {
        return this.userImage;
    }

    public ImageRemoveAsyncRequest setUserText(java.util.List<String> userText) {
        this.userText = userText;
        return this;
    }
    public java.util.List<String> getUserText() {
        return this.userText;
    }

}
