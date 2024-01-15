// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ApproveFotaUpdateResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApproveFotaUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApproveFotaUpdateResponseBody self = new ApproveFotaUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public ApproveFotaUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
