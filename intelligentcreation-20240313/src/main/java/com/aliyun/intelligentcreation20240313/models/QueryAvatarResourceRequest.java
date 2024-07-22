// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryAvatarResourceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11111</p>
     */
    @NameInMap("idempotentId")
    public String idempotentId;

    public static QueryAvatarResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAvatarResourceRequest self = new QueryAvatarResourceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAvatarResourceRequest setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

}
