// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DeleteDataCacheResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDataCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataCacheResponseBody self = new DeleteDataCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
