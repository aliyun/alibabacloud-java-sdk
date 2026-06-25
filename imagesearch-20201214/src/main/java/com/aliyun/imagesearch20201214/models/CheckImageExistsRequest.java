// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class CheckImageExistsRequest extends TeaModel {
    /**
     * <p>Image Search instance name. Supports up to 20 characters.<br>If you have already purchased an Image Search instance, you can logon to the <a href="https://imagesearch.console.aliyun.com/">Image Search console</a> to view it.<br>If you have not purchased an Image Search instance, see <a href="https://help.aliyun.com/document_detail/179178.html">Activate the service</a> and <a href="https://help.aliyun.com/document_detail/66569.html">Create an instance</a>.  </p>
     * <blockquote>
     * <p>The instance name here is not the instance ID. Please distinguish between them when using.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>Image name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2092061_1</p>
     */
    @NameInMap("PicName")
    public String picName;

    /**
     * <p>Product ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2092061_1</p>
     */
    @NameInMap("ProductId")
    public String productId;

    public static CheckImageExistsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckImageExistsRequest self = new CheckImageExistsRequest();
        return TeaModel.build(map, self);
    }

    public CheckImageExistsRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CheckImageExistsRequest setPicName(String picName) {
        this.picName = picName;
        return this;
    }
    public String getPicName() {
        return this.picName;
    }

    public CheckImageExistsRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
