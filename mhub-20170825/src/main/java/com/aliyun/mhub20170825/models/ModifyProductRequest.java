// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ModifyProductRequest extends TeaModel {
    @NameInMap("ProductId")
    public String productId;

    @NameInMap("Name")
    public String name;

    public static ModifyProductRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProductRequest self = new ModifyProductRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProductRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ModifyProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
