// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateDataCacheResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDataCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataCacheResponseBody self = new UpdateDataCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
