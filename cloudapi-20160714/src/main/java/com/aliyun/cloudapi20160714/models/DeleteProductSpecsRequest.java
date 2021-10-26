// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteProductSpecsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("SpecCode")
    public java.util.List<String> specCode;

    public static DeleteProductSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductSpecsRequest self = new DeleteProductSpecsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProductSpecsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteProductSpecsRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DeleteProductSpecsRequest setSpecCode(java.util.List<String> specCode) {
        this.specCode = specCode;
        return this;
    }
    public java.util.List<String> getSpecCode() {
        return this.specCode;
    }

}
