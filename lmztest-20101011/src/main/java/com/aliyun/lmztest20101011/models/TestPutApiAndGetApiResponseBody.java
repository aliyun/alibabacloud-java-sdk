// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class TestPutApiAndGetApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TestPutApiAndGetApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestPutApiAndGetApiResponseBody self = new TestPutApiAndGetApiResponseBody();
        return TeaModel.build(map, self);
    }

    public TestPutApiAndGetApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
