// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetReceiverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Receiver body;

    public static GetReceiverResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReceiverResponse self = new GetReceiverResponse();
        return TeaModel.build(map, self);
    }

    public GetReceiverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReceiverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetReceiverResponse setBody(Receiver body) {
        this.body = body;
        return this;
    }
    public Receiver getBody() {
        return this.body;
    }

}
