// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class UpdateImageRequest extends TeaModel {
    /**
     * <p>The user-defined content. The value can be up to 4,096 characters in length.</p>
     * <blockquote>
     * <p> If you set this parameter, the response includes this parameter and its value. You can add text such as an image description.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zidingyi</p>
     */
    @NameInMap("CustomContent")
    public String customContent;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The attribute, which is an integer. The attribute can be used to filter images when you search for images. If you set this parameter, the response includes this parameter and its value.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("IntAttr")
    public Integer intAttr;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("IntAttr2")
    public Integer intAttr2;

    @NameInMap("IntAttr3")
    public Integer intAttr3;

    @NameInMap("IntAttr4")
    public Integer intAttr4;

    /**
     * <p>The name of the image. The name can be up to 512 characters in length.</p>
     * <blockquote>
     * <ul>
     * <li>An image is uniquely identified by the values of the ProductId and PicName parameters.</li>
     * <li>If you add an image whose product ID (ProductId) and image name (PicName) are the same as those of an existing image, the newly added image overwrites the existing image.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>namexxx.jpg</p>
     */
    @NameInMap("PicName")
    public String picName;

    /**
     * <p>The ID of the product. The ID can be up to 512 characters in length.</p>
     * <blockquote>
     * <p> A product may have multiple images.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2092061_1</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The attribute, which is a string. The value can be up to 128 characters in length. The attribute can be used to filter images. If you set this parameter, the response includes this parameter and its value.</p>
     * 
     * <strong>example:</strong>
     * <p>ss</p>
     */
    @NameInMap("StrAttr")
    public String strAttr;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("StrAttr2")
    public String strAttr2;

    @NameInMap("StrAttr3")
    public String strAttr3;

    @NameInMap("StrAttr4")
    public String strAttr4;

    public static UpdateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageRequest self = new UpdateImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateImageRequest setCustomContent(String customContent) {
        this.customContent = customContent;
        return this;
    }
    public String getCustomContent() {
        return this.customContent;
    }

    public UpdateImageRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateImageRequest setIntAttr(Integer intAttr) {
        this.intAttr = intAttr;
        return this;
    }
    public Integer getIntAttr() {
        return this.intAttr;
    }

    public UpdateImageRequest setIntAttr2(Integer intAttr2) {
        this.intAttr2 = intAttr2;
        return this;
    }
    public Integer getIntAttr2() {
        return this.intAttr2;
    }

    public UpdateImageRequest setIntAttr3(Integer intAttr3) {
        this.intAttr3 = intAttr3;
        return this;
    }
    public Integer getIntAttr3() {
        return this.intAttr3;
    }

    public UpdateImageRequest setIntAttr4(Integer intAttr4) {
        this.intAttr4 = intAttr4;
        return this;
    }
    public Integer getIntAttr4() {
        return this.intAttr4;
    }

    public UpdateImageRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public UpdateImageRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public UpdateImageRequest setStrAttr(String strAttr) {
        this.strAttr = strAttr;
        return this;
    }
    public String getStrAttr() {
        return this.strAttr;
    }

    public UpdateImageRequest setStrAttr2(String strAttr2) {
        this.strAttr2 = strAttr2;
        return this;
    }
    public String getStrAttr2() {
        return this.strAttr2;
    }

    public UpdateImageRequest setStrAttr3(String strAttr3) {
        this.strAttr3 = strAttr3;
        return this;
    }
    public String getStrAttr3() {
        return this.strAttr3;
    }

    public UpdateImageRequest setStrAttr4(String strAttr4) {
        this.strAttr4 = strAttr4;
        return this;
    }
    public String getStrAttr4() {
        return this.strAttr4;
    }

}
