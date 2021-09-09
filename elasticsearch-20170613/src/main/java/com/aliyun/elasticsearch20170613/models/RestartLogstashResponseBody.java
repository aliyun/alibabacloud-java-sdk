// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartLogstashResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RestartLogstashResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartLogstashResponseBody self = new RestartLogstashResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartLogstashResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
