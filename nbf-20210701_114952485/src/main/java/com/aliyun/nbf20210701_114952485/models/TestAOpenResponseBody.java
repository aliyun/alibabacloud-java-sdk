// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210701_114952485.models;

import com.aliyun.tea.*;

public class TestAOpenResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static TestAOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestAOpenResponseBody self = new TestAOpenResponseBody();
        return TeaModel.build(map, self);
    }

    public TestAOpenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
