// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CreateRelationRequest extends TeaModel {
    @NameInMap("MallId")
    public String mallId;

    public static CreateRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRelationRequest self = new CreateRelationRequest();
        return TeaModel.build(map, self);
    }

    public CreateRelationRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

}
