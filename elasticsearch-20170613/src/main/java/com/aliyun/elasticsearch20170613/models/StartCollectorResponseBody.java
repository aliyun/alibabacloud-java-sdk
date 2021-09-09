// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class StartCollectorResponseBody extends TeaModel {
    @NameInMap("Result")
    public Boolean result;

    @NameInMap("RequestId")
    public String requestId;

    public static StartCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCollectorResponseBody self = new StartCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCollectorResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public StartCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
