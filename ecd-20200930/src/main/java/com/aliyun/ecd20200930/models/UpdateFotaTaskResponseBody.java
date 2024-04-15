// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UpdateFotaTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFotaTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFotaTaskResponseBody self = new UpdateFotaTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFotaTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
