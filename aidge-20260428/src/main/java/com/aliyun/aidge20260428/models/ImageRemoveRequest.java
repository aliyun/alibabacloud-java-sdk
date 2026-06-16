// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRemoveRequest extends TeaModel {
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
    public java.util.List<Integer> nonObjectRemoveElements;

    /**
     * <p>Elements to remove from the image subject (1=transparent text blocks; 2=specific names; 3=text; 4=blemishes). Multiple selections allowed</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2]</p>
     */
    @NameInMap("ObjectRemoveElements")
    public java.util.List<Integer> objectRemoveElements;

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

}
