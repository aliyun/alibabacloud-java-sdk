// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveRequest extends TeaModel {
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
    public java.util.List<Integer> nonObjectRemoveElements;

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
    public java.util.List<Integer> objectRemoveElements;

    /**
     * <strong>example:</strong>
     * <p>[10,10,100,100]</p>
     */
    @NameInMap("Position")
    public String position;

    /**
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://img.alicdn.com/bao/uploaded/i2/xxx.jpg%22%5D">https://img.alicdn.com/bao/uploaded/i2/xxx.jpg&quot;]</a></p>
     */
    @NameInMap("UserImage")
    public java.util.List<String> userImage;

    /**
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
