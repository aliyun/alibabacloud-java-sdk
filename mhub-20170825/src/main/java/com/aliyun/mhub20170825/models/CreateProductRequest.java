// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class CreateProductRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static CreateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductRequest self = new CreateProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
