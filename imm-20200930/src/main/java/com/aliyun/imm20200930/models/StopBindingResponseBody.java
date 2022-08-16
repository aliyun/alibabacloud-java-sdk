// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class StopBindingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopBindingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopBindingResponseBody self = new StopBindingResponseBody();
        return TeaModel.build(map, self);
    }

    public StopBindingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
