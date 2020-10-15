// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePostPaidInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleasePostPaidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePostPaidInstanceResponse self = new ReleasePostPaidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePostPaidInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
