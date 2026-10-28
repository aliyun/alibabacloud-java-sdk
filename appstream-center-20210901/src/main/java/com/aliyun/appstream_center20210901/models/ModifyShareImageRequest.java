// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyShareImageRequest extends TeaModel {
    @NameInMap("AddAccount")
    public java.util.List<Long> addAccount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <strong>example:</strong>
     * <p>img-bp13mu****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RemoveAccount")
    public java.util.List<Long> removeAccount;

    public static ModifyShareImageRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyShareImageRequest self = new ModifyShareImageRequest();
        return TeaModel.build(map, self);
    }

    public ModifyShareImageRequest setAddAccount(java.util.List<Long> addAccount) {
        this.addAccount = addAccount;
        return this;
    }
    public java.util.List<Long> getAddAccount() {
        return this.addAccount;
    }

    public ModifyShareImageRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ModifyShareImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ModifyShareImageRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyShareImageRequest setRemoveAccount(java.util.List<Long> removeAccount) {
        this.removeAccount = removeAccount;
        return this;
    }
    public java.util.List<Long> getRemoveAccount() {
        return this.removeAccount;
    }

}
