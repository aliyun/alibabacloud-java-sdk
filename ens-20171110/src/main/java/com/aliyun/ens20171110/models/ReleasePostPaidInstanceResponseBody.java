// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePostPaidInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleasePostPaidInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleasePostPaidInstanceResponseBody self = new ReleasePostPaidInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleasePostPaidInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
