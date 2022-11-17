// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jeepproduct20211213.models;

import com.aliyun.tea.*;

public class TestByondResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TestByondResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestByondResponseBody self = new TestByondResponseBody();
        return TeaModel.build(map, self);
    }

    public TestByondResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
