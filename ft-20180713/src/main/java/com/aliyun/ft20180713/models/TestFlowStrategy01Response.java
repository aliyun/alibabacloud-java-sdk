// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestFlowStrategy01Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestFlowStrategy01ResponseBody body;

    public static TestFlowStrategy01Response build(java.util.Map<String, ?> map) throws Exception {
        TestFlowStrategy01Response self = new TestFlowStrategy01Response();
        return TeaModel.build(map, self);
    }

    public TestFlowStrategy01Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestFlowStrategy01Response setBody(TestFlowStrategy01ResponseBody body) {
        this.body = body;
        return this;
    }
    public TestFlowStrategy01ResponseBody getBody() {
        return this.body;
    }

}
