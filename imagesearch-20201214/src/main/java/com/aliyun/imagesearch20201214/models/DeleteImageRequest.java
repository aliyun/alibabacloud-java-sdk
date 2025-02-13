// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class DeleteImageRequest extends TeaModel {
    @NameInMap("Filter")
    public String filter;

    /**
     * <p>The name of the Image Search instance. The name can be up to 20 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demoinstance1</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IsDeleteByFilter")
    public Boolean isDeleteByFilter;

    /**
     * <p>The name of the image.</p>
     * <ul>
     * <li>If this parameter is not set, the system deletes all the images that correspond to the specified ProductId parameter.</li>
     * <li>If this parameter is set, the system deletes only the image that is specified by the ProductId and PicName parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2092061_1.jpg</p>
     */
    @NameInMap("PicName")
    public String picName;

    /**
     * <p>The ID of the commodity.</p>
     * <blockquote>
     * <p> A commodity may have multiple images.</p>
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
