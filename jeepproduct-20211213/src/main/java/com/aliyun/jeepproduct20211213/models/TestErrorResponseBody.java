// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TestErrorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TestErrorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestErrorResponseBody self = new TestErrorResponseBody();
        return TeaModel.build(map, self);
    }

    public TestErrorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
