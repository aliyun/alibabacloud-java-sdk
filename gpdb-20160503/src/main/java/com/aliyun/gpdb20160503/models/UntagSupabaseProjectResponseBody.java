// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UntagSupabaseProjectResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>34b32a0a-08ef-4a87-b6be-cdd9f56fc3ad</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UntagSupabaseProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UntagSupabaseProjectResponseBody self = new UntagSupabaseProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UntagSupabaseProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
