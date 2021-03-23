// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateVersionTestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TestId")
    public String testId;

    public static CreateVersionTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionTestResponseBody self = new CreateVersionTestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVersionTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVersionTestResponseBody setTestId(String testId) {
        this.testId = testId;
        return this;
    }
    public String getTestId() {
        return this.testId;
    }

}
