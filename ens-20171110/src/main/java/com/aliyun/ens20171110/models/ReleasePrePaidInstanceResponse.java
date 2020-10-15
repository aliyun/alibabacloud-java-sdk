// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleasePrePaidInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleasePrePaidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleasePrePaidInstanceResponse self = new ReleasePrePaidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleasePrePaidInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
