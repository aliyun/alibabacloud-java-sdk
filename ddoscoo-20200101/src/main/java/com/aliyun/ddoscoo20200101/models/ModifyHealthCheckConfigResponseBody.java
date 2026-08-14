// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHealthCheckConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckConfigResponseBody self = new ModifyHealthCheckConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
