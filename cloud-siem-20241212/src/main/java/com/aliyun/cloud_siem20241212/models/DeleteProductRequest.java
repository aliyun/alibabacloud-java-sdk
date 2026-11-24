// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteProductRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static DeleteProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductRequest self = new DeleteProductRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DeleteProductRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteProductRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
