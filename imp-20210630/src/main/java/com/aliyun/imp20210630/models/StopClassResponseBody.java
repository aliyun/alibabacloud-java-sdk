// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class StopClassResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static StopClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopClassResponseBody self = new StopClassResponseBody();
        return TeaModel.build(map, self);
    }

    public StopClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
