// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class ServiceRouteTestResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ServiceRouteTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ServiceRouteTestResponseBody self = new ServiceRouteTestResponseBody();
        return TeaModel.build(map, self);
    }

    public ServiceRouteTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
