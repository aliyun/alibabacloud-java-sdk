// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    /**
     * <p>The filter condition. The operators supported for int_attr include greater than (&gt;), greater than or equal to (&gt;=), less than (&lt;), less than or equal to (&lt;=), and equal to (=). The operators supported for str_attr include equal to (=) and not equal to (!=). Multiple conditions can be connected by using AND and OR.
     * Examples:</p>
     * <ul>
     * <li>int_attr &gt;= 100.</li>
     * <li>str_attr != &quot;value1&quot;.</li>
     * <li>int_attr = 1000 AND str_attr = &quot;value1&quot;.<blockquote>
     * <p>A maximum of 4096 characters are supported.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>int_attr=1000 AND str_attr=&quot;value1&quot;</p>
     */
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.
     * If you have purchased an Image Search instance, log on to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view the instance name.
     * If you have not purchased an Image Search instance, refer to <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.</p>
     * <blockquote>
     * <p>The instance name is not the instance ID. The instance name must be unique within the same region. Make sure that you use the correct value.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Specifies whether to delete images based on the Filter parameter.</p>
     * <blockquote>
     * <ol>
     * <li>If this parameter is set to true, images are deleted based on the Filter parameter, and Filter is required.   </li>
     * <li>If this parameter is set to false, images are deleted based on ProductId or the combination of ProductId and PicName. ProductId is required.</li>
     * </ol>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsDeleteByFilter")
    public Boolean isDeleteByFilter;

    /**
     * <p>The image name.</p>
     * <ul>
     * <li>If you do not specify this parameter, all images under the specified ProductId are deleted.</li>
     * <li>If you specify this parameter, the image specified by the combination of ProductId and PicName is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2092061_1.jpg</p>
     */
    @NameInMap("PicName")
    public String picName;

    /**
     * <p>The product ID.</p>
     * <blockquote>
     * <ol>
     * <li>A product can have multiple images. 2. If IsDeleteByFilter is set to false, this parameter is required.</li>
     * </ol>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2092061_1</p>
     */
    @NameInMap("ProductId")
    public String productId;

    public static DeleteImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageRequest self = new DeleteImageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public DeleteImageRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DeleteImageRequest setIsDeleteByFilter(Boolean isDeleteByFilter) {
        this.isDeleteByFilter = isDeleteByFilter;
        return this;
    }
    public Boolean getIsDeleteByFilter() {
        return this.isDeleteByFilter;
    }

    public DeleteImageRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public DeleteImageRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
