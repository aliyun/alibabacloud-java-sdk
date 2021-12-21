// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTrafficMarkingPolicyResponseBody body;

    public static DeleteTrafficMarkingPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrafficMarkingPolicyResponse self = new DeleteTrafficMarkingPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrafficMarkingPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrafficMarkingPolicyResponse setBody(DeleteTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
