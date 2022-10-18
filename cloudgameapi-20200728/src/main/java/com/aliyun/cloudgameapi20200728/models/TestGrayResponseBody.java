// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class TestGrayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TestGrayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TestGrayResponseBody self = new TestGrayResponseBody();
        return TeaModel.build(map, self);
    }

    public TestGrayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
