// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateServiceManagedControlResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateServiceManagedControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceManagedControlResponseBody self = new UpdateServiceManagedControlResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceManagedControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
