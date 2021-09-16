// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StartApmResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static StartApmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartApmResponseBody self = new StartApmResponseBody();
        return TeaModel.build(map, self);
    }

    public StartApmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
