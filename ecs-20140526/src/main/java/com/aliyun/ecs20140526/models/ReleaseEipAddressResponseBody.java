// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleaseEipAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseEipAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseEipAddressResponseBody self = new ReleaseEipAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseEipAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
