// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("foundationVersionUID")
    public String foundationVersionUID;

    @NameInMap("productName")
    public String productName;

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductRequest setFoundationVersionUID(String foundationVersionUID) {
        this.foundationVersionUID = foundationVersionUID;
        return this;
    }
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

    public CreateProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
