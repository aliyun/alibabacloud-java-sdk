// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ApproveFotaUpdateResponseBody extends TeaModel {
    // Id of the request
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
