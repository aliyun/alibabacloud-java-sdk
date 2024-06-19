// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class UpdateDataCacheResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BD8BBB43-8E05-5F46-89A9-2512D8A324A2</p>
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
