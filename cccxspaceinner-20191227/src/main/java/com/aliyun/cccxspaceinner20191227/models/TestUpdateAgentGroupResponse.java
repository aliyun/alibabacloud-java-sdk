// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class TestUpdateAgentGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TestUpdateAgentGroupResponseBody body;

    public static TestUpdateAgentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        TestUpdateAgentGroupResponse self = new TestUpdateAgentGroupResponse();
        return TeaModel.build(map, self);
    }

    public TestUpdateAgentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestUpdateAgentGroupResponse setBody(TestUpdateAgentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public TestUpdateAgentGroupResponseBody getBody() {
        return this.body;
    }

}
