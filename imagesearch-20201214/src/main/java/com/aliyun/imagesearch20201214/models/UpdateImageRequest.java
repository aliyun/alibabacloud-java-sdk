// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class UpdateImageRequest extends TeaModel {
    /**
     * <p>The custom content. The content can be up to 4,096 characters in length.</p>
     * <blockquote>
     * <p>This field is returned when you call the &quot;&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/202282.html">SearchImageByPic</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/image-search/latest/updateimage">SearchImageByPic</a>&quot; operation. For example, you can add text such as image descriptions.</p>
     * </blockquote>
     */
    @NameInMap("CustomContent")
    public String customContent;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.
     * If you have purchased an Image Search instance, go to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view the instance name.
     * If you have not purchased an Image Search instance, see <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID. Make sure to distinguish between them.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The integer attribute. This attribute can be used to filter query results. This field is returned in query results.</p>
     */
    @NameInMap("IntAttr")
    public Integer intAttr;

    /**
     * <p>The integer attribute. This attribute can be used to filter query results. This field is returned in query results.</p>
     */
    @NameInMap("IntAttr2")
    public Integer intAttr2;

    /**
     * <p>The integer attribute. This attribute can be used to filter query results. This field is returned in query results.</p>
     */
    @NameInMap("IntAttr3")
    public Integer intAttr3;

    /**
     * <p>The integer attribute. This attribute can be used to filter query results. This field is returned in query results.</p>
     */
    @NameInMap("IntAttr4")
    public Integer intAttr4;

    /**
     * <p>The image name. The name can be up to 256 characters in length.</p>
     * <blockquote>
     * <ul>
     * <li>The combination of ProductId and PicName uniquely identifies an image.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If you add an image multiple times with the same ProductId and PicName, the most recently added image takes effect and the previously added images are replaced.</li>
     * </ul>
     */
    @NameInMap("PicName")
    public String picName;

    /**
     * <p>The product ID. The ID can be up to 256 characters in length.</p>
     * <blockquote>
     * <p>A product can have multiple images. You can customize the value of this parameter based on your business requirements. For example: top001, pants002.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The string attribute. The attribute can be up to 128 characters in length. It can be used to filter query results. This field is returned in query results.</p>
     */
    @NameInMap("StrAttr")
    public String strAttr;

    /**
     * <p>The string attribute. The attribute can be up to 128 characters in length. It can be used to filter query results. This field is returned in query results.</p>
     */
    @NameInMap("StrAttr2")
    public String strAttr2;

    /**
     * <p>The string attribute. The attribute can be up to 128 characters in length. It can be used to filter query results. This field is returned in query results.</p>
     */
    @NameInMap("StrAttr3")
    public String strAttr3;

    /**
     * <p>The string attribute. The attribute can be up to 128 characters in length. It can be used to filter query results. This field is returned in query results.</p>
     */
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
