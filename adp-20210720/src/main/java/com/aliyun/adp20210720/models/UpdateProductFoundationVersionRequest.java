// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductFoundationVersionRequest extends TeaModel {
    // 底座版本uid
    @NameInMap("foundationVersionUID")
    public String foundationVersionUID;

    public static UpdateProductFoundationVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductFoundationVersionRequest self = new UpdateProductFoundationVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductFoundationVersionRequest setFoundationVersionUID(String foundationVersionUID) {
        this.foundationVersionUID = foundationVersionUID;
        return this;
    }
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

}
