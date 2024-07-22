// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SelectResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("idempotentId")
    public String idempotentId;

    public static SelectResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectResourceRequest self = new SelectResourceRequest();
        return TeaModel.build(map, self);
    }

    public SelectResourceRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

}
