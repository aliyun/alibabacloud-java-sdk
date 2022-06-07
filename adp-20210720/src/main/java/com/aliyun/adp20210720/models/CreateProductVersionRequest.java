// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateProductVersionRequest extends TeaModel {
    // 基于哪个版本克隆
    @NameInMap("baseProductVersionUID")
    public String baseProductVersionUID;

    public static CreateProductVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductVersionRequest self = new CreateProductVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductVersionRequest setBaseProductVersionUID(String baseProductVersionUID) {
        this.baseProductVersionUID = baseProductVersionUID;
        return this;
    }
    public String getBaseProductVersionUID() {
        return this.baseProductVersionUID;
    }

}
