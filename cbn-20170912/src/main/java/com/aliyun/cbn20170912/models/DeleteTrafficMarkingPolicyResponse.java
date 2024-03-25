// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTrafficMarkingPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteTrafficMarkingPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTrafficMarkingPolicyResponse setBody(DeleteTrafficMarkingPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrafficMarkingPolicyResponseBody getBody() {
        return this.body;
    }

}
