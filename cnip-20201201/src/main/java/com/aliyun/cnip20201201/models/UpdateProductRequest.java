// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    public static UpdateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductRequest self = new UpdateProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
