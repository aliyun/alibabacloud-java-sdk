// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TestBoyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TestBoyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestBoyResponseBody self = new TestBoyResponseBody();
        return TeaModel.build(map, self);
    }

    public TestBoyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
