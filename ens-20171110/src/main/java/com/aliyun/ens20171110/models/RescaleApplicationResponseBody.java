// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RescaleApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationResponseBody self = new RescaleApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
