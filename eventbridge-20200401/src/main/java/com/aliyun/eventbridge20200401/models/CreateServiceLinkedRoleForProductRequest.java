// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForProductRequest extends TeaModel {
    @NameInMap("ProductName")
    public String productName;

    public static CreateServiceLinkedRoleForProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleForProductRequest self = new CreateServiceLinkedRoleForProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleForProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
