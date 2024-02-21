// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateShrinkNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateShrinkNodesResponseBody body;

    public static ValidateShrinkNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateShrinkNodesResponse self = new ValidateShrinkNodesResponse();
        return TeaModel.build(map, self);
    }

    public ValidateShrinkNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateShrinkNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateShrinkNodesResponse setBody(ValidateShrinkNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateShrinkNodesResponseBody getBody() {
        return this.body;
    }

}
