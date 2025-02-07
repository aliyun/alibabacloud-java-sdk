// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateCacheTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCacheTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCacheTagResponseBody self = new UpdateCacheTagResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCacheTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
