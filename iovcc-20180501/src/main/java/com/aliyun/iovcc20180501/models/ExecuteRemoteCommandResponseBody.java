// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ExecuteRemoteCommandResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static ExecuteRemoteCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRemoteCommandResponseBody self = new ExecuteRemoteCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteRemoteCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteRemoteCommandResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
