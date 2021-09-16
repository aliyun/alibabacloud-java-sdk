// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StopApmResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static StopApmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopApmResponseBody self = new StopApmResponseBody();
        return TeaModel.build(map, self);
    }

    public StopApmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
